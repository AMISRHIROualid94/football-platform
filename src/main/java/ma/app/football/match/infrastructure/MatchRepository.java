package ma.app.football.match.infrastructure;

import org.springframework.data.jpa.repository.JpaRepository;

import ma.app.football.match.domain.Match;

public interface MatchRepository extends JpaRepository<Match, Long> {
    
}
