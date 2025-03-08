package factory;

import services.AuthService;
import services.BiometricAuthService;

// Concrete factory for biometric authentication
public class BiometricFactory implements AuthFactory {

    @Override
    public AuthService createAuthService() {
        return new BiometricAuthService();
    }
}
