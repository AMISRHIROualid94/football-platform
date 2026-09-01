package ma.app.football.participation.domain.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public enum ParticipationStatus {
    INVITED("INVITED"),
    ACCEPTED("ACCEPTED"),
    DECLINED("DECLINED");

    private final String code;

    public static ParticipationStatus fromCode(String code) {
        for (ParticipationStatus status : ParticipationStatus.values()) {
            if (status.code.equals(code)) {
                return status;
            }
        }
        throw new IllegalArgumentException("Invalid ParticipationStatus code: " + code);
    }
}
