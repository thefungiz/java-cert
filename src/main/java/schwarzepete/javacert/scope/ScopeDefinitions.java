package schwarzepete.javacert.scope;

public class ScopeDefinitions {

  private String instanceVariable;  //field/instance variable available access throughout each instance of the class

  public static String HELLO = "HELLO THERE"; //class variable accessible across all instances of the class   requires static keyword

  public ScopeDefinitions(String constructorParameter){
    this.instanceVariable = constructorParameter; //constructorParameter is a preinitialized local variable
  }

  public String localScopes(String methodParameter){ //methodParameter is a preinitialized local variable
    int i;
    methodParameter += " Hello!";
    if(!methodParameter.isEmpty()) {
      boolean canTouchThis = true;
      methodParameter += " Add More";
    }
    //canTouchThis = false;
    for(i = 0; i < 2; i++){
      boolean canTouchThis = true;
      methodParameter += " Add More";
    }
    //canTouchThis = false;
    return methodParameter;
  }
}
