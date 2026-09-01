package ma.app.football.team.presentation;

import lombok.AllArgsConstructor;
import ma.app.football.team.application.TeamService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/teams")
@AllArgsConstructor
public class TeamController {

    private final TeamService teamService;
}
