package ma.app.football.invitation.infrastructure.adapter;

import lombok.AllArgsConstructor;
import ma.app.football.invitation.domain.port.InvitationPort;
import ma.app.football.invitation.infrastructure.InvitationRepository;
import org.springframework.stereotype.Component;

@Component
@AllArgsConstructor
public class InvitationAdapter implements InvitationPort {

    private final InvitationRepository invitationRepository;
}
