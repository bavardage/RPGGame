/*
 * To change this template, choose Tools | Templates
 * and in the editor.
 */

package rpggame;

/**
 *
 * @author Jeffers
 */
import java.util.Random;
public class Battle {
    private Random roll = new Random();
    Character charPlayer;

    public void Battle(Character chara) {
        charPlayer = chara;
    }

    public boolean state() {
        int mapRoll = roll.nextInt(2);
        if (mapRoll<2) {
          return false;  
        } else {
        return true;
        }
    }
    public void fight(){
        int playerHealth = charPlayer.getHealth();
        int npcHealth = 100;
        String npcName = "greg";
        String name = charPlayer.getName();
        System.out.println(name + " has entered battle with" + npcName);
       while (playerHealth > 0 && npcHealth > 0) {

           System.out.println(name + " attacks!");
           npcHealth -= roll.nextInt(25);
           if (npcHealth < 0) npcHealth = 0;
           System.out.println(npcName + " has " + npcHealth + " health remaining.\n");

           System.out.println(npcName + " attacks back!");
           playerHealth -= roll.nextInt(17);
           if (playerHealth < 0) playerHealth = 0;
           System.out.println("You have " + playerHealth + " health remaining.\n");
       }
        if (playerHealth == 0) {
            System.out.println(name + " has died");
        }
        if (npcHealth == 0) {
            System.out.println(npcName + " has died");
        }
charPlayer.setHealth(playerHealth);
    }

}
