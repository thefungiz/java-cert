package schwarzepete.javacert.scope;

public class ScopeRunner {

    public static void main(String[] args) {
        ScopeDefinitions allBoutThatScope = new ScopeDefinitions(ScopeDefinitions.HELLO);
        ScopeDefinitions allBoutThatScope2 = new ScopeDefinitions("Second Object");

        System.out.println(allBoutThatScope.localScopes("First Object"));
        System.out.println(allBoutThatScope2.localScopes(ScopeDefinitions.HELLO));
    }
}
