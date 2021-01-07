package gayer.javacert.pokemon;

import gayer.javacert.pokemon.pokemon.Bulbasaur;

public class MainGame {

    public static void main(String[] args){

        Bulbasaur bulba = new Bulbasaur(45,5, "male", 50);

        bulba.VinewhipBasic();
        bulba.Vinewhip(bulba.getLevel(), bulba.getPower());


    }
}
