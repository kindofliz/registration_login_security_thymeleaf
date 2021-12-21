package lv.liza.registration_login_security_thymeleaf.service;

import lv.liza.registration_login_security_thymeleaf.model.User;
import lv.liza.registration_login_security_thymeleaf.web.dto.UserRegistrationDto;
import org.springframework.security.core.userdetails.UserDetailsService;

public interface UserService extends UserDetailsService {

    User save(UserRegistrationDto registrationDto);


}
