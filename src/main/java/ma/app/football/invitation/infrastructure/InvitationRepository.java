package ma.app.football.invitation.infrastructure;

import ma.app.football.invitation.domain.Invitation;
import org.springframework.data.jpa.repository.JpaRepository;

public interface InvitationRepository extends JpaRepository<Invitation, Long> {

}
