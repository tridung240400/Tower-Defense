package TowerDefense.Entity.Enemy;

import javafx.scene.image.Image;

import java.io.FileInputStream;

public class TankerEnemy extends Enemy {
    public static final String IMAGE_URL = "file:img/Retina/towerDefense_tile248.png";

    public TankerEnemy(double x, double y) {
        super(x, y, 25, .5);
        img = new Image(IMAGE_URL);
        setDir('E');
        reward = 8;
    }
}
