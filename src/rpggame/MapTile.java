/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package rpggame;

/**
 *
 * @author Jeffers
 */
import java.util.ArrayList;

public class MapTile {

    private ArrayList tileObjects = new ArrayList();

    public boolean moveInto() {
        boolean canMoveInto = true;

        for (Object a : tileObjects) {
            MapObject x = (MapObject) a;
            if (x.getPassable() == false) {
                canMoveInto = false;
                break;
            }
        }
        return canMoveInto;
    }

    public void addObject(MapObject mapObject) {
        tileObjects.add(mapObject);
    }

    public void removeObject(MapObject mapObject) {
        tileObjects.remove(mapObject);
    }

    public boolean isIn(MapObject mapObject) {
        boolean isIn = false;
        Object x = (Object) mapObject;
        if (tileObjects.contains(x)) {
            isIn = true;
        }
        return isIn;
    }
}

