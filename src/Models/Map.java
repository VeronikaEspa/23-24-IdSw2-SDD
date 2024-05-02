package Models;

import java.util.Random;

public class Map {
    private Tile[][] tiles;

    public Map() {
        this.tiles = new Tile[64][64];
    }

    public void updateTile(Point point, Tile newTile) {
        Tile oldTile = getTile(point);
        for (int i = 0; i < tiles.length; i++) {
            for (int j = 0; j < tiles.length; j++) {
                if (tiles[i][j] == oldTile) {
                    tiles[i][j] = newTile;
                }
            }
        }

    }
    public Tile getTile(Point point) {
        int[] tileLocation = point.getLocation();
        int xCoord = tileLocation[0];
        int yCoord = tileLocation[1];

        return tiles [xCoord][yCoord];
    }

    public Tile getRandomTile() {
        Random randomNumber = new Random();
        int randomXCoord = rand.nextInt(64);
        int randomYCoord = rand.nextInt(64);

        Tile randomTile = getTile(new Point(randomXCoord, randomYCoord));
        return randomTile;
    }

    public int getHeight() {
        return tiles.length;
    }

    public int getWidth() {
        return tiles[0].length;
    }
}
