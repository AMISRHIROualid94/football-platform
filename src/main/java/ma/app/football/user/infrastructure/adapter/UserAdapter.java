package ma.app.football.user.infrastructure.adapter;

import ma.app.football.user.domain.port.UserPort;
import lombok.AllArgsConstructor;
import ma.app.football.user.infrastructure.UserRepository;
import org.springframework.stereotype.Component;

@AllArgsConstructor
@Component
public class UserAdapter implements UserPort {

    private final UserRepository userInfoRepository;
}
