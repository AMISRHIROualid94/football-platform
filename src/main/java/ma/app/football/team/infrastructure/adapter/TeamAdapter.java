package ma.app.football.team.infrastructure.adapter;

import lombok.AllArgsConstructor;
import ma.app.football.team.domain.port.TeamPort;
import ma.app.football.team.infrastructure.TeamRepository;
import org.springframework.stereotype.Component;

@Component
@AllArgsConstructor
public class TeamAdapter implements TeamPort {

    private final TeamRepository teamRepository;
}
