package services;

// Abstract factory for authentication
public interface AuthService {
    boolean authenticate(String username, String password);
}
