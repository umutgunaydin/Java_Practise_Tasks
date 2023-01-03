package day34_OOP_AbstarctionContinue;

import day34_OOP_AbstarctionContinue.animalTask.Playable;
import day34_OOP_AbstarctionContinue.animalTask.Swimmable;

public class Person implements Playable, Swimmable { // this can also implement Playable, Swimmable interfaces
    @Override
    public void play() {

    }

    @Override
    public void swim() {

    }
}
