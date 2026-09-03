package ma.app.football.invitation.domain;

import jakarta.persistence.*;
import lombok.*;
import ma.app.football.invitation.domain.enums.InvitationStatus;

import ma.app.football.match.domain.Match;
import ma.app.football.user.domain.UserInfo;

import java.time.LocalDateTime;

@Entity
@Getter
@Setter
@Table(name = "invitations")
@NoArgsConstructor
@AllArgsConstructor
public class Invitation {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "GEN_SEQ_INVITATION")
    @SequenceGenerator(name = "GEN_SEQ_INVITATION", sequenceName = "SEQ_INVITATION", allocationSize = 1)
    private Long invitationId;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "match_id", nullable = false)
    private Match match;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "sender_id", nullable = false)
    private UserInfo sender;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "receiver_id", nullable = false)
    private UserInfo receiver;

    @Enumerated(EnumType.STRING)
    @Column(name = "status")
    private InvitationStatus status;

    @Column(name = "created_at")
    private LocalDateTime createdAt;

    @Column(name = "updated_at")
    private LocalDateTime updatedAt;
}
