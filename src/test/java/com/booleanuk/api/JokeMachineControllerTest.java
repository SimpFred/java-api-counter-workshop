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
}
