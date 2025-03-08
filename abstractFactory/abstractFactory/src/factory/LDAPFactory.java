package factory;

import services.AuthService;
import services.LDAPAuthService;

// Concrete factory for LDAP authentication
public class LDAPFactory implements AuthFactory {
    @Override
    public AuthService createAuthService() {
        return new LDAPAuthService();
    }
}
