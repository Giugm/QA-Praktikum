package com.example; //

import org.junit.jupiter.api.Test; //
import java.util.List; //
import static org.junit.jupiter.api.Assertions.*; //
import static org.mockito.Mockito.*; //

public class CatTests { //
    @Test //
    void testGetSoundReturnsMeow() { //
        Cat cat = new Cat(mock(Feline.class)); //
        assertEquals("Мяу", cat.getSound(), "Ожидался звук 'Мяу', но получился другой."); //
    } //

    @Test //
    void testGetFoodReturnsExpectedList() throws Exception { //
        Feline mockFeline = mock(Feline.class); //
        List<String> expectedFood = List.of("Животные", "Птицы", "Рыба"); //
        when(mockFeline.eatMeat()).thenReturn(expectedFood); //

        Cat cat = new Cat(mockFeline); //
        List<String> actualFood = cat.getFood(); //

        assertEquals(expectedFood, actualFood, "Метод getFood() должен возвращать список хищной еды."); //
    } //

    @Test //
    void testGetFoodCallsEatMeatMethod() throws Exception { //
        Feline mockFeline = mock(Feline.class); //
        when(mockFeline.eatMeat()).thenReturn(List.of()); //

        Cat cat = new Cat(mockFeline); //
        cat.getFood(); //

        verify(mockFeline).eatMeat(); //
    } ////
}