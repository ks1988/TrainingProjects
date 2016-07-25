package net.media.training.designpattern_refactored.observer;

import java.util.ArrayList;
import java.util.List;

public class GameTestClient {
    public Person person;
    public Sun sun;
    public Dog dog;
    public Cat cat;
    public Robot robot;
    public Game game;

    public void setup() {
        sun = new Sun();

        person = new Person(sun);
        dog = new Dog(sun);
        cat = new Cat(sun);
        robot = new Robot(sun);

        game = new Game(sun);

        for (Character character : characters()) {
            game.add(character);
        }
    }

    public void everyoneGoesOut() {
        for (Character character : characters()) {
            character.goOutdoors();
        }
    }

    public void everyoneOutdoorsComesIn() {
        for (Character character : characters()) {
            if (character.isOutdoors())
                character.goIndoors();
        }
    }

    public void tickOnce() {
        game.tick();
    }

    public void tickTwice() {
        game.tick();
        game.tick();
    }

    public boolean outdoorsCharactersFeelWarm() {
        for (Character character : characters()) {
            if (isOutdoorsAndFeelsCold(character) ||
                    isIndoorsAndFeelsWarm(character))
                return false;
        }
        return true;
    }

    private boolean isIndoorsAndFeelsWarm(Character character) {
        return !character.isOutdoors() && character.isFeelingWarm();

    }

    private boolean isOutdoorsAndFeelsCold(Character character) {
        return character.isOutdoors() && !character.isFeelingWarm();

    }

    public boolean allFeelCold() {
        return !person.isFeelingWarm() && !cat.isFeelingWarm() && !dog.isFeelingWarm() && !robot.isFeelingWarm();
    }

    private List<Character> characters() {
        return new ArrayList<Character>() {{
            add(person);
            add(dog);
            add(cat);
            add(robot);
        }};
    }
}