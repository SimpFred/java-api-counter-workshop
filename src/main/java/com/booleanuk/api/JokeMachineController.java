package com.booleanuk.api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController("jokes")
// @RequestMapping("/jokes")
public class JokeMachineController {
    private final ArrayList<String> jokes;

    public JokeMachineController() {
        this.jokes = new ArrayList<>();
        jokes.add("What sort of car does an egg drive? ---- A yolkswagen!");
        jokes.add("Why did the tomato turn red? ---- Because it saw the salad dressing!");
        jokes.add("What do you call a bear with no teeth? ---- A gummy bear!");
        jokes.add("What do you call a pile of cats? ---- A meowtain!");
        jokes.add("Why did the scarecrow win an award? ---- Because he was outstanding in his field!");
        jokes.add("What do you call a fish wearing a crown? ---- A kingfish!");
    }

    @GetMapping
    public String getJoke() {
        return jokes.get((int) (Math.random() * jokes.size()));
    }

    public ArrayList<String> getJokes() {
        return jokes;
    }
}
