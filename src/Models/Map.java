package Models;

public class Map {
    private static int maxHeight = 64;
    private static int maxLong = 64;

    private Tile[][] tiles;

    public Map() {
        tiles = new Tile[maxHeight][maxLong];
    }

    public Tile[][] getMap() {
        return tiles;
    }

    public void setMap(Tile[][] tiles) {
        this.tiles = tiles;
    }

    public void setMapOneDimensional(Tile[] tileArray) {
        int count = 0;

        for (int i = 0; i < tiles.length; i++ ) {
            for (int j = 0; j < tiles.length; j++) {
                this.tiles[i][j] = tileArray[count];
                count++;
            }
        }
    }

    

}
