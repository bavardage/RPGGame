/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.aaaa
 */

package rpggame;

/**
 *
 * @author Jeffers
 */
public class Character extends NPC {
private int experience = 0;
private int[] levels = {100,300,600,1000,1500,2100,2800,3600,4500,5500};

public Character(String name) {
super(name);
}
public Character(String name, int maxHealth, int level) {
    super(name, maxHealth, level);
}
public int getExperience() {
    return experience;
}
public void addExperience(int x) {
    experience += x;
    if (experience >= levels[this.getLevel()]) {
        this.addLevel(1);
        System.out.println("Level up!");
        System.out.println("Now level " + this.getLevel());
    }
}

}
