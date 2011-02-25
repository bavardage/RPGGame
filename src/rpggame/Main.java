/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package rpggame;

/**
 *
 * @author Jeffers
 */
public class Main {
    public static void main(String[] args) throws java.io.IOException  {
System.out.println("Welcome to the game");
System.out.println("Game steup... \n");
java.io.BufferedReader keyInput = new java.io.BufferedReader(new java.io.InputStreamReader(System.in));
System.out.println("name?");

Character player = new Character(keyInput.readLine());
System.out.println("welcome " + player.getName() + "\n");

System.out.println("map Height?");
int tempH = Integer.parseInt(keyInput.readLine());
System.out.println("\nmap width?");
Map map1 = new Map(tempH, Integer.parseInt(keyInput.readLine()));
System.out.println("\nmap Dimensions: " + map1.getHeight() + "x");

System.out.println("\nEntering World... \n \n");

System.out.println("Type N for north, W for west, S for south and E for east \n");
Battle battle1 = new Battle();
battle1.Battle(player);

while (!battle1.state()) {
map1.explore();
    }
battle1.fight();
    }

}
