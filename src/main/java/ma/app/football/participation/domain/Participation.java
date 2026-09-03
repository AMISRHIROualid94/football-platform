package ma.app.football.participation.domain;

import java.time.LocalDateTime;

import jakarta.persistence.*;
import org.springframework.format.annotation.DateTimeFormat;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import ma.app.football.match.domain.Match;
import ma.app.football.participation.domain.enums.ParticipationStatus;
import ma.app.football.user.domain.UserInfo;

@Entity
@Getter
@Setter
@Table(name = "participations")
@NoArgsConstructor
@AllArgsConstructor
public class Participation {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "GEN_SEQ_PARTICIPATION")
    @SequenceGenerator(name = "GEN_SEQ_PARTICIPATION", sequenceName = "SEQ_PARTICIPATION", allocationSize = 1)
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "participant_id", nullable = false)
    private UserInfo participant;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "match_id", nullable = false)
    private Match match;

    @Enumerated(EnumType.STRING)
    @Column(name = "status")
    private ParticipationStatus status;

    @Column(name = "joined_at")
    private LocalDateTime joinedAt;
}
