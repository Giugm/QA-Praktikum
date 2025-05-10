package com.example; //

import org.junit.jupiter.api.Test; //
import java.util.List; //
import static org.junit.jupiter.api.Assertions.*; //

public class FelineTests { //
    @Test
    void testEatMeatReturnsNonNullList() throws Exception {
        Feline feline = new Feline();
        List<String> food = feline.eatMeat();
        assertNotNull(food);
    }

    @Test
    void testEatMeatReturnsExpectedFood() throws Exception {
        Feline feline = new Feline();
        List<String> food = feline.eatMeat();
        assertTrue(food.contains("Животные") || food.contains("Птицы") || food.contains("Рыба"));
    }

    @Test //
    void testGetFamilyReturnsCats() { //
        Feline feline = new Feline(); //
        assertEquals("Кошачьи", feline.getFamily()); //
    } //

    @Test //
    void testGetKittensReturnsDefault() { //
        Feline feline = new Feline(); //
        assertEquals(1, feline.getKittens()); //
    } //

    @Test //
    void testGetKittensWithParamReturnsCorrectValue() { //
        Feline feline = new Feline(); //
        assertEquals(5, feline.getKittens(5)); //
    } //
}

