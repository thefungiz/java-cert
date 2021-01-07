package gayer.javacert.pokemon.pokemon;

import java.util.Random;

public class Move {

    int modifer = 12;

    private int calculateDamage(){
        return 10;
    };

    private int calculateDamage(int modifier, int level, int power){
        boolean isCritical = determineCrit();
        //TODO: Fomula not complete.
        int damage = (((2 * level)/5 + 2) * power);

        if(isCritical){ damage = damage * 2;}

        return damage;
    }

    private boolean determineCrit() {
        Random rand = new Random();
        int d20 = rand.nextInt(20);
        //d&d conversion
        d20 = d20+1;
        System.out.println("d20:" + d20);

        if(d20 == 20){
            return true;
        } else {
            return false;
        }
    }

    ;

    public void  VinewhipBasic(){
        System.out.println("Vine Whip does: " + calculateDamage() + " damage!");
    }

    public void  Vinewhip(int level, int power){
        System.out.println("Vine Whip does: " + calculateDamage(modifer, level, power) + " damage!");
    }


}
