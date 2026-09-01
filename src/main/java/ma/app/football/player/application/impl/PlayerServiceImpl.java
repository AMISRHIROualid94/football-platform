package ma.app.football.player.application.impl;

import lombok.AllArgsConstructor;
import ma.app.football.player.application.PlayerService;
import ma.app.football.player.domain.port.PlayerPort;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class PlayerServiceImpl implements PlayerService {

    private final PlayerPort playerPort;
}
