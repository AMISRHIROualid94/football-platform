package ma.app.football.participation.domain;

import java.time.LocalDateTime;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import ma.app.football.match.domain.Match;
import ma.app.football.participation.domain.enums.ParticipationStatus;
import ma.app.football.user.domain.UserInfo;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Participation {
    private Long id;
    private UserInfo player;
    private Match match;
    private ParticipationStatus status;
    private LocalDateTime joinedAt;
}
