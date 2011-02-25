/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package rpggame;

/**
 *
 * @author Jeffers
 */
public class MapObject {

    private boolean passable = true;
    private int row = 0;
    private int column = 0;

    public MapObject(boolean i) {
        this.passable = i;
    }

    public void setPassable(boolean i) {
        this.passable = i;
    }

    public boolean getPassable() {
        return this.passable;
    }

    public int getRow() {
        return this.row;
    }
    public void setRow(int x) {
        this.row = x;
    }

    public int getColumn() {
        return this.column;
    }
    public void setColumn(int x) {
        this.column = x;
    }
}
