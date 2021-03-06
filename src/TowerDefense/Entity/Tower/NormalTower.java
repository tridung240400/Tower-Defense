package TowerDefense.Entity.Tower;

import TowerDefense.Config;
import TowerDefense.Entity.Bullet.Bullet;
import TowerDefense.Entity.Enemy.Enemy;
import TowerDefense.Main;
import javafx.scene.image.Image;

public class NormalTower extends Tower {
    public static final int PRICE = 10;
    public static final int RANGE = (int)Config.TILE_SIZE * 2;
    public static final String BASE_IMAGE_URL = "file:img/Retina/towerDefense_tile180.png";
    public static final String IMAGE_URL = "file:img/Retina/towerDefense_tile249.png";

    public NormalTower(int x, int y) {
        super(x, y);
        baseImg = new Image(BASE_IMAGE_URL);
        img = new Image(IMAGE_URL);
        range = RANGE;
        damage = 2;
        shotSpeed = 100;
    }

    @Override
    public Bullet fire(Enemy e) {
        lastShotTime = Main.CURRENT_GAME_TICK;
        lastEnemy = e;

        double dy = Config.TILE_SIZE * .3 * Math.sin(Math.toRadians(rotationAngle - 90));
        double dx = Config.TILE_SIZE * .3 * Math.cos(Math.toRadians(rotationAngle - 90));

        return new Bullet(getX() + dx, getY() + dy, e,this.damage);
    }
}
