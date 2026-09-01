package ma.app.football.team.infrastructure;

import ma.app.football.team.domain.Team;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TeamRepository extends JpaRepository<Team, Long> {

}
