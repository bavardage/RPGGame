/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package rpggame;

/**
 *
 * @author Jeffers
 */
public class NPC extends MapObject {
private String name = "john";
private int health = 100;
private int level = 0;
private int maxHealth = 0;
private int mapx;
private int mapy;
private int map;

public NPC(String name) {
    super(false);
    this.name = name;   
}
public NPC(String name, int maxHealth, int level) {
    super(false);
    this.name = name;
    this.maxHealth = maxHealth;
    this.level = level;
    this.health = maxHealth;
}
public String getName() {
    return name;
}
public void setName(String name) {
    this.name = name;
}
public int getHealth(){
return health;
}
public int getMaxHealth(){
    return maxHealth;
}
public void setHealth(int h) {
    health = h;
}
public void setHealth(double h) {
    double temp = this.maxHealth*h;
    this.health = (int) temp;
}
public void setMaxHealth(int h) {
    this.maxHealth = h;
}
public int getLevel() {
    return level;
}
public void addLevel(int x) {
    this.level += x;
}
public void setLevel(int x) {
    this.level = x;
}
public int getMapx() {
    return this.mapx;
}
public int getMapy() {
    return this.mapy;
}
public void setMapx(int i) {
    this.mapx=i;
}
public void setMapy(int i) {
    this.mapy=i;
}
}
