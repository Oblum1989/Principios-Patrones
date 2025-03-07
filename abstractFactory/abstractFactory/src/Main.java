import factory.AuthFactory;
import factory.CustomAuthFactory;
import registry.AuthFactoryRegistry;
import services.AuthService;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        AuthFactory factory = AuthFactoryRegistry.getAuthFactory("oauth");
        AuthService authService = factory.createAuthService();

        // Attempt authentication
        boolean isAuthenticated = authService.authenticate("Google", "valid-token");
        System.out.println("Authentication successful: " + isAuthenticated);

        // Dynamically register a new authentication method
        AuthFactoryRegistry.registerFactory("custom", CustomAuthFactory::new);

        // Use the new method without modifying previous code
        AuthFactory customFactory = AuthFactoryRegistry.getAuthFactory("custom");
        AuthService customAuthService = customFactory.createAuthService();
        boolean customAuth = customAuthService.authenticate("Custom", "valid-custom");
        System.out.println("Custom Auth: " + customAuth);
    }
}