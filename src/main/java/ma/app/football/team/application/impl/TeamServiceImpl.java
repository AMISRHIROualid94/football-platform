package ma.app.football.team.application.impl;

import lombok.AllArgsConstructor;
import ma.app.football.team.application.TeamService;
import ma.app.football.team.domain.port.TeamPort;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class TeamServiceImpl implements TeamService {

    private final TeamPort teamPort;
}
