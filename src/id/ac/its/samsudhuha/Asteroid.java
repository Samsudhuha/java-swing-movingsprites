package id.ac.its.samsudhuha;

public class Asteroid extends Sprite {

    private final int INITIAL_X = 400;

    public Asteroid(int x, int y) {
        super(x, y);

        initAlien();
    }

    private void initAlien() {

        loadImage("src/resources/asteroid.png");
        getImageDimensions();
    }

    public void move() {

        if (x < 0) {
            x = INITIAL_X;
        }

        x -= 1;
    }
}