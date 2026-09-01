package ma.app.football.match.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import ma.app.football.match.domain.enums.MatchStatus;
import ma.app.football.user.domain.UserInfo;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Match {
    private Long id;
    private String title;
    private String location;
    private java.time.LocalDateTime dateTime;
    private MatchStatus status;
    private UserInfo creator;
}


