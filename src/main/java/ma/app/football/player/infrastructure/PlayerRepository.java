package ma.app.football.player.infrastructure;

import ma.app.football.player.domain.Player;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PlayerRepository extends JpaRepository<Player, Long> {

}
