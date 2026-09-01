package ma.app.football.match.domain.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public enum MatchStatus {
    PLANNED("PLANNED"),
    CONFIRMED("CONFIRMED"),
    PLAYING("PLAYING"),
    FINISHED("FINISHED"),
    CANCELLED("CANCELLED");

    private final String code;

    public static MatchStatus fromCode(String code) {
        for (MatchStatus matchStatus : MatchStatus.values()) {
            if (matchStatus.getCode().equals(code)) {
                return matchStatus;
            }
        }
        throw new IllegalArgumentException("Invalid MatchStatus code: " + code);
    }
}
