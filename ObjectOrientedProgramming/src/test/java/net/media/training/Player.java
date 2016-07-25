package net.media.training;

import java.util.Arrays;
import java.util.List;

/**
 * Created by autoopt/mayank.k
 */
public class Player {
    public static void main(String[] args) {
        System.out.println("playGame(wall, tank) = "
                + new Player().playGame(Arrays.asList(
                new Wall(1),
                new Tank(10, 2),
                new Car(10)
        ), 10));
    }

    List<Target> playGame(List<Target> targetList, int hits) {
        int i = 0;
        while (i < hits) {
            for (Target target : targetList) {
                if (!target.isDead()) {
                    target.hit();
                    i++;
                }
                if (i == hits) {
                    break;
                }
            }
        }
        return targetList;
    }
}




