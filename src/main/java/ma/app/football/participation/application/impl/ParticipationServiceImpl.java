package ma.app.football.participation.application.impl;

import lombok.AllArgsConstructor;
import ma.app.football.participation.application.ParticipationService;
import ma.app.football.participation.domain.port.ParticipationPort;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class ParticipationServiceImpl implements ParticipationService {

    private final ParticipationPort participationPort;
}
