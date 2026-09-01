package ma.app.football.user.domain;

import java.time.LocalDateTime;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class UserInfo {
    private Long id;
    private String username;
    private String email;
    private String password;
    private LocalDateTime createdAt;
}