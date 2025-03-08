package factory;

import services.AuthService;

// Base interface for authentication services
public interface AuthFactory {
    AuthService createAuthService();
}
