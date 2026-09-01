package ma.app.football.player.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Player {
    private Long playerId;
    private Long userId;
    private Long teamId;
    private String position;
    private java.time.LocalDateTime createdAt;
    private java.time.LocalDateTime updatedAt;
}
