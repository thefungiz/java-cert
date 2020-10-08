package gayer.javacert.justmytype;

import static gayer.javacert.JamesPrints.hollerBack;

public class StringBuilderDebauchery {

    //making global so methods can access wi
    // thout having to be passed in.
    StringBuilder flipit = new StringBuilder();
    //StringBuilder flipit = new StringBuilder("aaronsucks"); //great things happen
    //StringBuilder flipit = new StringBuilder(10); //automatically expands capacity

    public StringBuilderDebauchery(String input) {

        flipit.append(input);
        letMeGetThemDigits(flipit);
        reverseIt(flipit);
        messWithIt();
        unMessWithIt();
        insertD();
        sexChange();
    }

    private void letMeGetThemDigits(StringBuilder input){
       hollerBack("First Letter: " + input.charAt(0));
        //System.out.println("Last Letter: " + input.charAt(input.length()));
       hollerBack("Last Letter: " + input.charAt(input.length()-1));
       hollerBack("Total Letters: " + input.length());
        //checking for an A
        if(input.indexOf("A") >= 0 ) {
           hollerBack("Is there an A? : " + "Yes at " + input.indexOf("A"));
        } else {
           hollerBack("Is there an A? : Nope");
        }

    }
    private void reverseIt(StringBuilder flipInput){
        System.out.print("Reversing it: ");
        flipInput.reverse();
       hollerBack(flipit.toString());
       hollerBack("Put it back now");
        flipInput.reverse();
    }

    private void messWithIt(){
        //2003 myspace name
        flipit.append("XxX");
        flipit.insert(0,"XxX");
       hollerBack("Myspace: " + flipit);
    }

    private  void unMessWithIt(){
        flipit.delete(0,3);
        flipit.delete(flipit.length()-3, flipit.length());
       hollerBack("Un-Myspace: " + flipit);
    }

    private void insertD(){
        flipit.insert(0, "Dick ");
        hollerBack("oops: " + flipit);
    }

    private void sexChange(){


        flipit.replace(0,4, "vagina");

        while(flipit.indexOf("Dick") > -1) {

            int dSpot = flipit.indexOf("Dick");

            for (int i = 0; i < "Dick".length();i++) {
                flipit.deleteCharAt(dSpot);
            }

            flipit.insert(dSpot, "Vagina");

        }

        hollerBack(flipit.toString());
    }


}
