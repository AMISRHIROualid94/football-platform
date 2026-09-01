package ma.app.football.player.infrastructure.adapter;

import lombok.AllArgsConstructor;
import ma.app.football.player.domain.port.PlayerPort;
import ma.app.football.player.infrastructure.PlayerRepository;
import org.springframework.stereotype.Component;

@Component
@AllArgsConstructor
public class PlayerAdapter implements PlayerPort {

    private final PlayerRepository playerRepository;
}
