package gayer.javacert.idontliketobelabeled;

public class LabelMaker {
    public static void main(String[] args){

        System.out.println("Labeled break statement is used to terminate the outer loop, " +
                "whereas Unlabeled break is to used to exit the loop after satisfy. ");

       // breakExample();
        //labelBreakExample();

        //continueExample();
        //labelContinueExample();

        //mutiLoopExample();

        stackOverFlow();


    }

    protected static void breakExample(){
        for(int i=0; i < 10; i++){
            if (i==5) {
                System.out.println("Break..."  + i);
                break;

            }
            System.out.println("Break Example i: " + i);
        }
    }

    protected static void continueExample(){
        for(int i=0; i < 10; i++){
            if (i==5) {
                System.out.println("Continue..." + i);
                continue;
            }
            System.out.println("Continue Example i: " + i);
        }
    }

    protected static void labelBreakExample(){
        Test:
        for(int i=0; i < 10; i++){
            if (i==5) {
                System.out.println("Breaking Test..."  + i);
                break Test;

            }
            System.out.println("Label Break Example i: " + i);
        }
    }

    protected static void labelContinueExample(){
        Test:
        for(int i=0; i < 10; i++){
            if (i==5) {
                System.out.println("Continuing Test..."  + i);
                continue Test;
            }
            System.out.println("Label Continue Example i: " + i);
        }
    }

    protected static void mutiLoopExample(){
        Test:
        for(int i=0; i < 3; i++){
            Inner:
            for(int j=0; j < 3; j++){
                if(i==1 && j==1) {
                    break; //Multi - i: 2, j: 2
                    //break; //Multi - i: 2, j: 2
                    //break Test;//Multi - i: 1, j: 0
                    //break Inner;//Multi - i: 2, j: 2
                }
                System.out.println("Multi - i: " + i + ", j: " + j);
            }
        }
    }

    protected static void stackOverFlow(){
        int num = 0;
        Test:
        for(int i = 0; i < 10; i++){
            for(int j = 0; j < 10; j++){
                if(i==5 && j==5){
                    //break; //95
                    break Test; //55
                }
                num++;
            }
        }
        System.out.println(num);
    }
}
