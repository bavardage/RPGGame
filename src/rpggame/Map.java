/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package rpggame;

/**
 *
 * @author Jeffers
 */
public class Map {
/* private int mapH;
private int mapW; */
private int[][] map;
private int currentH = 0;
private int currentW = 0;
private boolean moved;

public Map (int h, int w) {
    map = new int[h][w];
    currentH = h;
}
public void changeDimensions(int h, int w) {
    map = new int[h][w];
}
public int getHeight() {
    return map.length;
}
public int getWidth() {
    return map[0].length;
}
public int getNorth() {
    return this.getHeight() - currentH;
}
public int getEast() {
    return currentW;
}
public void changeN(int h) {
    currentH -= h;
}
public void setN(int h) {
    currentH = h;
}
public void changeE(int e) {
    currentW += e;
}
public void setE(int e) {
    currentW = e;
}
public void moved(boolean a) {
    moved = a;
}
public boolean getMoved() {
return moved;
}
public void move(int n, int e) {
   boolean pass = true;
    if (n != 0) {
     if (this.getNorth() + n < this.getHeight() && this.getNorth() + n >= 0) {
        pass = false;
        if (map[this.getNorth() + n][this.getEast()] == 0) {
        this.changeN(n);
        this.moved(true);
        }
        else if(map[this.getNorth() + n][this.getEast()] == -1) {
            System.out.println("cannot move into that square");
            this.moved(false);
        }
     }
    }
    if (e != 0) {
     if (this.getEast() + e < this.getWidth() && this.getEast() + e >= 0) {
        pass = false;
          if (map[this.getNorth()][this.getEast() + e] == 0) {
          this.changeE(e);
          this.moved(true);
        }
        else if (map[this.getNorth()][this.getEast() + e] == -1) {
           System.out.println("cannot move into that square");
           this.moved(false);
        }
     }
    }
    if (pass) {
    System.out.println("\nCannot move outside Map");
    this.moved(false);
    }
    }

public void explore() throws java.io.IOException {
java.io.BufferedReader keyInput = new java.io.BufferedReader(new java.io.InputStreamReader(System.in));

while (true) {
System.out.println("Please type in move...");

 while (!this.getMoved()) {
  String move = keyInput.readLine();
    if (move.equals("N")) {
        this.move(1,0);
    }
    if (move.equals("S")) {
       this.move(-1,0);
     }
    if (move.equals("E")) {
       this.move(0,1);
     }
    if (move.equals("W")) {
       this.move(0,-1);
     }
     if (!move.equals("N") && !move.equals("S") && !move.equals("W") && !move.equals("E")) {
     System.out.println("Invalid Move!");
     this.moved(false);
   }
   System.out.println("\nCurrent location: \n" +this.getNorth() + " North, " +this.getEast() + " East\n");
 }
 this.moved(false);
}
}
}


