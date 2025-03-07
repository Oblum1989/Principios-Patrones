package registry;

import factory.AuthFactory;
import factory.BiometricFactory;
import factory.LDAPFactory;
import factory.OAuthFactory;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Supplier;

public class AuthFactoryRegistry {
    private static final Map<String, Supplier<AuthFactory>> registry = new HashMap<>();
    static {
        registerFactory("oauth", OAuthFactory::new);
        registerFactory("ldap", LDAPFactory::new);
        registerFactory("biometric", BiometricFactory::new);
    }

    // Method for registering new factories dynamically
    public static void registerFactory(String type, Supplier<AuthFactory> factorySupplier) {
        registry.put(type.toLowerCase(), factorySupplier);
    }

    public static AuthFactory getAuthFactory(String type) {
        Supplier<AuthFactory> factory = registry.get(type.toLowerCase());
        if (factory == null) {
            throw new IllegalArgumentException("Authentication method not supported: " + type);
        }
        return factory.get();
    }
}
