package ma.app.football.match.application.impl;

import ma.app.football.match.application.MatchService;
import ma.app.football.match.domain.port.MatchPort;

import org.springframework.stereotype.Service;

import jakarta.transaction.Transactional;
import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
@Transactional
public class MatchServiceImpl implements MatchService {
    
    private final MatchPort matchPort;
}
