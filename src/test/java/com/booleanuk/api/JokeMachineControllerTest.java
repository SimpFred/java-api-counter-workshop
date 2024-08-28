package com.booleanuk.api;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class JokeMachineControllerTest {

    @Test
    public void testGetJoke() {
        JokeMachineController controller = new JokeMachineController();
        String joke = controller.getJoke();
        Assertions.assertTrue(controller.getJokes().contains(joke));
    }

    @Test
    public void testGetSpecificJoke() {
        JokeMachineController controller = new JokeMachineController();
        String joke = controller.getJokes().get(0);
        Assertions.assertEquals("What sort of car does an egg drive? ---- A yolkswagen!", controller.getJokes().get(0));
        Assertions.assertEquals("Why did the tomato turn red? ---- Because it saw the salad dressing!", controller.getJokes().get(1));
        Assertions.assertEquals("What do you call a bear with no teeth? ---- A gummy bear!", controller.getJokes().get(2));
        Assertions.assertEquals("What do you call a pile of cats? ---- A meowtain!", controller.getJokes().get(3));
        Assertions.assertEquals("Why did the scarecrow win an award? ---- Because he was outstanding in his field!", controller.getJokes().get(4));
        Assertions.assertEquals("What do you call a fish wearing a crown? ---- A kingfish!", controller.getJokes().get(5));
    }
}
