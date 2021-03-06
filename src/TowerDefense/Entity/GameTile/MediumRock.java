package TowerDefense.Entity.GameTile;

import javafx.scene.image.Image;

public class MediumRock extends GameTile {
    public static final String IMAGE_URL = "file:img/Retina/towerDefense_tile137.png";

    public MediumRock(double x, double y, double rotationAngle) {
        super(x, y);
        img = new Image(IMAGE_URL);
        this.rotationAngle=rotationAngle;
    }
}
