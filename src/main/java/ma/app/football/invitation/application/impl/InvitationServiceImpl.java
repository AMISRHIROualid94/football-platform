package ma.app.football.invitation.application.impl;

import lombok.AllArgsConstructor;
import ma.app.football.invitation.application.InvitationService;
import ma.app.football.invitation.domain.port.InvitationPort;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class InvitationServiceImpl implements InvitationService {

    private final InvitationPort invitationPort;
}
