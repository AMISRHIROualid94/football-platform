package ma.app.football.invitation.domain.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public enum InvitationStatus {
    PENDING("PENDING"),
    ACCEPTED("ACCEPTED"),
    DECLINED("DECLINED"),
    CANCELLED("CANCELLED");

    private String code;
    
    public static InvitationStatus fromStatus(String code){
        for (InvitationStatus invitationStatus : InvitationStatus.values()) {
            if (invitationStatus.getCode().equals(code)) {
                return invitationStatus;
            }
        }
        throw new IllegalArgumentException("Invalid InvitationStatus code: " + code);
    }
}
