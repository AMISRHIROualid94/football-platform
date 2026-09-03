package ma.app.football.user.domain;

import java.time.LocalDateTime;
import java.util.List;

import jakarta.persistence.*;
import ma.app.football.invitation.domain.Invitation;
import ma.app.football.match.domain.Match;
import ma.app.football.participation.domain.Participation;
import ma.app.football.team.domain.Team;
import org.springframework.format.annotation.DateTimeFormat;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@Table(name = "users")
@NoArgsConstructor
@AllArgsConstructor
public class UserInfo {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "GEN_SEQ_USER")
    @SequenceGenerator(name = "GEN_SEQ_USER", sequenceName = "SEQ_USER", allocationSize = 1)
    private Long id;

    @Column(name = "username")
    private String username;

    @Column(name = "email")
    private String email;

    @Column(name = "password")
    private String password;

    @Column(name = "created_at")
    private LocalDateTime createdAt;

    @OneToMany(mappedBy = "sender", fetch = FetchType.LAZY)
    private List<Invitation> sentInvitations;

    @OneToMany(mappedBy = "receiver", fetch = FetchType.LAZY)
    private List<Invitation> receivedInvitations;

    @OneToMany(mappedBy = "creator", fetch = FetchType.LAZY)
    private List<Match> matches;

    @OneToMany(mappedBy = "participant", fetch = FetchType.LAZY)
    private List<Participation> participations;

    @OneToMany(mappedBy = "owner", fetch = FetchType.LAZY)
    private List<Team> teams;
}