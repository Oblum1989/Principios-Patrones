package factory;

import services.AuthService;
import services.OAuthAuthService;

// Concrete factory for OAuth authentication
public class OAuthFactory implements AuthFactory {
    @Override
    public AuthService createAuthService() {
        return new OAuthAuthService();
    }
}
