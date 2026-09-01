package ma.app.football.participation.infrastructure.adapter;

import lombok.AllArgsConstructor;
import ma.app.football.participation.domain.port.ParticipationPort;
import ma.app.football.participation.infrastructure.ParticipationRepository;
import org.springframework.stereotype.Component;

@Component
@AllArgsConstructor
public class ParticipationAdapter implements ParticipationPort {

    private final ParticipationRepository participationRepository;
}
