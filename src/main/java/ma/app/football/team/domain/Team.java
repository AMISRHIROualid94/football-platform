package ma.app.football.team.domain;

import java.time.LocalDateTime;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import ma.app.football.user.domain.UserInfo;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Team {
    private Long id;
    private String name;
    private LocalDateTime createdAt;
    private UserInfo owner;
}
