package Controllers;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import Factories.TileFactory;
import Models.Tile;

public class MapController {
    private Models.Map map;
    private List<String[]> mapData;
    private FileReaderController fileReaderController;
    private TileFactory tileCreation;
    private Tile[] tiles;

    public MapController(Models.Map map2) {
        this.map = map2;
        mapData = new ArrayList<>();
        fileReaderController = new FileReaderController("path");
    }

    public void loadMapData() throws FileNotFoundException {
        mapData = fileReaderController.readCSV();
    }

    public void createMap() throws FileNotFoundException {

        loadMapData();
        String[] mapDataArray = new String[mapData.size()];
        mapDataArray =  (String[]) mapData.toArray();
        int[] integerMapData = new int[0];

        for (int i = 0; i < mapData.size(); i++) {
            integerMapData[i] = Integer.parseInt(mapDataArray[i]);
            tiles[i] = tileCreation.createTile(i);
        }

        map.setMapOneDimensional(tiles);


    }

    public Models.Map getMap() {
        return map;
    }
}
