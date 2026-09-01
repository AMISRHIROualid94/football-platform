package ma.app.football.match.application.impl;

import ma.app.football.match.application.MatchService;
import ma.app.football.match.domain.port.MatchPort;

import org.springframework.stereotype.Service;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class MatchServiceImpl implements MatchService {
    
    private final MatchPort matchPort;
}
