package pl.sternik.kk.zadania.zadmockito;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.*; 

import org.junit.Test;

public class ZadMockito {
    
        UserService userService = mock(UserService.class); 
//        UserService userService = new UserService();
        AuthService authService = new AuthService(userService);
     
        @Test 
        public void testBadLogin() { 
            when(userService.findByName("xyz")).thenReturn("null");
            when(userService.findByName("root")).thenReturn("lipa");
       
            boolean authOk = authService.checkCredentials("xyz", "password"); 
     
            assertThat(authOk).isFalse();     
            verify(userService,atLeastOnce()).findByName("xyz");
            verify(userService,never()).findByName("root");
            verify(userService).findByName("xyz"); 
        } 
        
        @Test(expected=NullPointerException.class)
        public void testBadLoginException() { 
            when(userService.findByName(anyString())).thenThrow(NullPointerException.class);
      
            authService.checkCredentials("ZSW", "password"); 
     
        } 
}
