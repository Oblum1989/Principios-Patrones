import factory.AuthFactory;
import factory.CustomAuthFactory;
import registry.AuthFactoryRegistry;
import services.AuthService;

/**
 * Identity Management System for a company that handles different types of authentication for different users:
1. OAuth for employees accessing with Google or Facebook.
2. LDAP for internal administrators authenticated in an active directory.
3. Biometrics for physical access devices with fingerprints or facial recognition.

This system allows new authentication methods to be easily added in the future.
 */
public class Main {
    public static void main(String[] args) {

        // Get the factory from the registry without modifying the code
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