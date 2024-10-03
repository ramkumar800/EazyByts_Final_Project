package carrentalsystem.services.auth;

import carrentalsystem.dto.SignupRequest;
import carrentalsystem.dto.UserDto;

public interface AuthService {
    UserDto createCustomer(SignupRequest signupRequest);

    boolean hasCustomerWithEmail(String email);
}
