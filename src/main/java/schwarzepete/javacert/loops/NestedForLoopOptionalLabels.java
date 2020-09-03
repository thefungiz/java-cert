package schwarzepete.javacert.loops;

public class NestedForLoopOptionalLabels {

    public static void main(String[] args){
        String[][] treasureTroves = {{"Ancient Bust", "Piece of Eight", "Dirt", "Bones"},
                {"Skull", "Another Treasure Map", "Booty!", "The MotherLode"}};

        DIGSITES: for(int site = 0; site < treasureTroves.length; site++){
            System.out.println("Reached digsite number " + site);
            treasures: for(int treasure = 0; treasure < treasureTroves[site].length; treasure++){
                if("Piece of Eight".equals(treasureTroves[site][treasure])
                        || "Booty!".equals(treasureTroves[site][treasure])){
                    System.out.println("Dug up " + treasureTroves[site][treasure]);
                    break treasures;
                }
                else if("Dirt".equals(treasureTroves[site][treasure])
                        || "Skull!".equals(treasureTroves[site][treasure])){
                    System.out.println("Tired of Digging!  -_-");
                    continue DIGSITES;
                }
                else if("The MotherLode".equals(treasureTroves[site][treasure])){
                    System.out.println("Dug up " + treasureTroves[site][treasure] + " -_-");
                    break DIGSITES;
                }
            }
        }
    }
}
