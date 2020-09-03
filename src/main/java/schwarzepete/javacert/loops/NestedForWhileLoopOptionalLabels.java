package schwarzepete.javacert.loops;

public class NestedForWhileLoopOptionalLabels {

    public static void main(String[] args){
        String[][] treasureTroves = {{"Piece of Eight", "Ancient Bust", "Dirt", "Bones"},
                {"Skull", "Another Treasure Map", "Booty!", "The MotherLode"}};
        int numberOfDigs = 0;
        DIGSITES: for(int site = 0; site < treasureTroves.length; site++){
            System.out.println("Reached digsite number " + site);
            System.out.println(numberOfDigs);
            treasures: do{
                if("Piece of Eight".equals(treasureTroves[site][numberOfDigs])
                        || "Booty!".equals(treasureTroves[site][numberOfDigs])){
                    System.out.println("Dug up " + treasureTroves[site][numberOfDigs]);
                    numberOfDigs +=2;
                    break treasures;
                }
                else if("Dirt".equals(treasureTroves[site][numberOfDigs])
                        || "Skull".equals(treasureTroves[site][numberOfDigs])){
                    System.out.println("Tired of Digging!  -_-");
                    numberOfDigs++;
                    continue DIGSITES;
                }
                else if("The MotherLode".equals(treasureTroves[site][numberOfDigs])){
                    System.out.println("Dug up " + treasureTroves[site][numberOfDigs] + " ^_^");
                    numberOfDigs++;
                    break DIGSITES;
                }
                numberOfDigs++;
            } while(numberOfDigs < 3);
            numberOfDigs--;
            site--;
        }
    }
}
