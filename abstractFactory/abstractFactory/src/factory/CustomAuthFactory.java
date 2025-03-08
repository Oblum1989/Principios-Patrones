package factory;

import services.AuthService;
import services.CustomAuthService;

// Concrete factory for personalized authentication
public class CustomAuthFactory implements AuthFactory {

    @Override
    public AuthService createAuthService() {
        return new CustomAuthService();
    }
}
