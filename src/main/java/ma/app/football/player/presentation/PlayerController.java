package ma.app.football.player.presentation;

import lombok.AllArgsConstructor;
import ma.app.football.player.application.PlayerService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/players")
@AllArgsConstructor
public class PlayerController {

    private final PlayerService playerService;
}
