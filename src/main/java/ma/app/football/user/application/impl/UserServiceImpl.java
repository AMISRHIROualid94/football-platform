package ma.app.football.user.application.impl;

import lombok.AllArgsConstructor;
import ma.app.football.user.application.UserService;
import ma.app.football.user.domain.port.UserPort;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class UserServiceImpl implements UserService {

    private final UserPort userPort;
}
