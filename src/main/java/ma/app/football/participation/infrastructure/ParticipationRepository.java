package ma.app.football.participation.infrastructure;

import ma.app.football.participation.domain.Participation;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ParticipationRepository extends JpaRepository<Participation, Long> {

}
