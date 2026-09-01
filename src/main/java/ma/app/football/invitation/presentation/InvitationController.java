package ma.app.football.invitation.presentation;

import lombok.AllArgsConstructor;
import ma.app.football.invitation.application.InvitationService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/invitations")
@AllArgsConstructor
public class InvitationController {

    private final InvitationService invitationService;
}
