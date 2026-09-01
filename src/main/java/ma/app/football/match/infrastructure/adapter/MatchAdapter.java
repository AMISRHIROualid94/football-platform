package ma.app.football.match.infrastructure.adapter;

import org.springframework.stereotype.Component;

import lombok.AllArgsConstructor;
import ma.app.football.match.domain.port.MatchPort;
import ma.app.football.match.infrastructure.MatchRepository;

@Component
@AllArgsConstructor
public class MatchAdapter implements MatchPort {

    private final MatchRepository matchRepository;
    
}
