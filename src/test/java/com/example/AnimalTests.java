package com.example; //

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test; //
import java.util.List; //
import static org.junit.jupiter.api.Assertions.*; //

public class AnimalTests { //

    private Animal animal; //

    @BeforeEach
        //
    void setUp() { //
        animal = new Animal(); //
    } //

    @Test //
    void testGetFoodForHerbivoreReturnsCorrectList() throws Exception { //
        List<String> food = animal.getFood("Травоядное"); //
        assertEquals(List.of("Трава", "Различные растения"), food); //
    } //

    @Test //
    void testGetFoodForPredatorReturnsCorrectList() throws Exception { //

        List<String> food = animal.getFood("Хищник"); //
        assertEquals(List.of("Животные", "Птицы", "Рыба"), food); //
    }

    @Test //
    void testGetFoodThrowsExceptionForUnknownKind() { //

        Exception exception = assertThrows(Exception.class, () -> animal.getFood("Всеядное")); //
        assertEquals("Неизвестный вид животного, используйте значение Травоядное или Хищник", exception.getMessage()); //
    }

    @Test //
    void testGetFamilyReturnsExpectedString() { //

        String result = animal.getFamily(); //
        assertTrue(result.contains("семейств")); //
    }
}
