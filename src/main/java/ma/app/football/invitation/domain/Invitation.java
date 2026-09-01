package ma.app.football.invitation.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Invitation {
    private Long invitationId;
    private Long matchId;
    private Long senderId;
    private Long receiverId;
    private String status;
    private java.time.LocalDateTime createdAt;
    private java.time.LocalDateTime updatedAt;
}
