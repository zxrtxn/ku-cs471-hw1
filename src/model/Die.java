/*
 * Name:    Supakrit Pamakama
 * ID:      6510450968
 */

package model;

import java.util.Random;

public class Die {
    private static final int[] FACES = {1, 2, 3, 4, 5, 6};

    private int faceValue;

    public Die() {
        this.faceValue = FACES[0];
    }

    public void roll() {
        int randomIndex = new Random().nextInt(FACES.length);

        this.faceValue = FACES[randomIndex];
    }

    public int getFaceValue() {
        return this.faceValue;
    }
}