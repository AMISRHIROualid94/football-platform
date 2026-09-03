package ma.app.football.team.domain;

import java.time.LocalDateTime;

import org.springframework.format.annotation.DateTimeFormat;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;
import lombok.*;
import ma.app.football.user.domain.UserInfo;

@Entity
@Getter
@Setter
@Table(name = "teams")
@NoArgsConstructor
@AllArgsConstructor
public class Team {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "GEN_SEQ_TEAM")
    @SequenceGenerator(name = "GEN_SEQ_TEAM", sequenceName = "SEQ_TEAM", allocationSize = 1)
    private Long id;
    
    @Column(name = "name")
    private String name;

    @Column(name = "created_at")
    private LocalDateTime createdAt;

    @Column(name = "updated_at")
    private LocalDateTime updatedAt;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "owner_id", nullable = false)
    private UserInfo owner;
}
