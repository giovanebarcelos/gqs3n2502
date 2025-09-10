package authentication;

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;

public class LoginManagerTest {
    @Test
    public void shouldLogin(){
        // Arrange
        AuthService mockAuthService = mock(AuthService.class);

        when(mockAuthService.authenticate("dickvigarista", "12345")).
                thenReturn(true);

        LoginManager loginManager = new LoginManager(mockAuthService);

        // Action
        String result = loginManager.login("dickvigarista", "12345");

        // Assert
        verify(mockAuthService).authenticate("dickvigarista", "12345");
        assertEquals("Login sucessful", result);
    }
}
