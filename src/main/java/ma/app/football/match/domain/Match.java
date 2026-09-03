package ma.app.football.match.domain;

import java.time.LocalDateTime;
import java.util.List;

import jakarta.persistence.*;
import ma.app.football.invitation.domain.Invitation;
import ma.app.football.participation.domain.Participation;
import org.springframework.format.annotation.DateTimeFormat;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import ma.app.football.match.domain.enums.MatchStatus;
import ma.app.football.user.domain.UserInfo;

@Entity
@Setter
@Getter
@Table(name = "matches")
@NoArgsConstructor
@AllArgsConstructor
public class Match {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "GEN_SEQ_MATCH")
    @SequenceGenerator(name = "GEN_SEQ_MATCH", sequenceName = "SEQ_MATCH", allocationSize = 1)
    private Long id;

    @Column(name = "title")
    private String title;

    @Column(name = "location")
    private String location;

    @Column(name = "date_time")
    private LocalDateTime dateTime;

    @Enumerated(EnumType.STRING)
    @Column(name = "status")
    private MatchStatus status;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "creator_id", nullable = false)
    private UserInfo creator;

    @OneToMany(mappedBy = "match", fetch = FetchType.LAZY)
    private List<Invitation> invitations;

    @OneToMany(mappedBy = "match", fetch = FetchType.LAZY)
    private List<Participation> participations;
}
