package ma.app.football.user.infrastructure;

import ma.app.football.user.domain.UserInfo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<UserInfo, Long> {
}
