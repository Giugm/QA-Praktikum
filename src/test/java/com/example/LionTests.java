package com.example; //

import org.junit.jupiter.api.Test; //
import java.util.List; //
import static org.junit.jupiter.api.Assertions.*; //
import static org.mockito.Mockito.*; //

public class LionTests { //

    @Test //
    void testInvalidSexThrowsException() { //
        Feline feline = mock(Feline.class); //
        Exception exception = assertThrows(Exception.class, () -> new Lion("Другой", feline)); //
        assertEquals("Используйте допустимые значения пола животного - самец или самка", exception.getMessage()); //
    } //

    @Test //
    void testGetKittensDelegatesToFeline() throws Exception { //
        Feline feline = new Feline(); //
        Lion lion = new Lion("Самец", feline);
        assertEquals(1, lion.getKittens()); //
    }

    @Test //
    void testGetFoodDelegatesToFeline() throws Exception { //
        Feline feline = mock(Feline.class); //
        List<String> food = List.of("Животные", "Птицы", "Рыба"); //
        when(feline.getFood("Хищник")).thenReturn(food); //

        Lion lion = new Lion("Самец", feline); //
        assertEquals(food, lion.getFood()); //
        verify(feline).getFood("Хищник"); //
    } //
}

