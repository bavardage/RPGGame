/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package rpggame;

/**
 *
 * @author Jeffers
 */
public class Map1 {

    private MapTile[][] map;

    public Map1(int h, int w) {
        map = new MapTile[h][w];
    }

    public void changeDimensions(int h, int w) {
        map = new MapTile[h][w];
    }

    public int getHeight() {
        return map.length;
    }

    public int getWidth() {
        return map[0].length;
    }

    public void addMapObject(MapObject mapObject, int row, int column) {
        if ((row < map.length) && (row >= 0)) {
            if ((column < map[0].length) && (column >= 0)) {
            map[row][column].addObject(mapObject);
            }
        }
    }
    public void deleteMapObject(MapObject mapObject) {
       int row = mapObject.getRow();
       int column = mapObject.getColumn();
       map[row][column].removeObject(mapObject);
    }

    public void moveMapObject(MapObject mapObject, String direction) {
        int currentposx = mapObject.getColumn();
        int currentposy = mapObject.getRow();

        //0 L, 1 R, 2 Up, 3 Down
        if (direction.equals("up")) {
            if (currentposy + 1 < map.length) {
                if (map[currentposy + 1][currentposx].moveInto() == true) {
                    map[currentposy + 1][currentposx].addObject(mapObject);
                    map[currentposy][currentposx].removeObject(mapObject);
                    mapObject.setRow(currentposy + 1);
                }
            }
        }
        if (direction.equals("down")) {
            if (currentposy - 1 >= 0) {
                if (map[currentposy - 1][currentposx].moveInto() == true) {
                    map[currentposy - 1][currentposx].addObject(mapObject);
                    map[currentposy][currentposx].removeObject(mapObject);
                    mapObject.setRow(currentposy - 1);
                }
            }
        }
        if (direction.equals("left")) {
            if (currentposx - 1 >= 0) {
                if (map[currentposy][currentposx - 1].moveInto() == true) {
                    map[currentposy][currentposx - 1].addObject(mapObject);
                    map[currentposy][currentposx].removeObject(mapObject);
                    mapObject.setColumn(currentposx - 1);
                }
            }
        }
        if (direction.equals("right")) {
            if (currentposx + 1 < map[0].length) {
                if (map[currentposy][currentposx + 1].moveInto() == true) {
                    map[currentposy][currentposx + 1].addObject(mapObject);
                    map[currentposy][currentposx].removeObject(mapObject);
                    mapObject.setColumn(currentposx + 1);
                }
            }
        }

    }
}
