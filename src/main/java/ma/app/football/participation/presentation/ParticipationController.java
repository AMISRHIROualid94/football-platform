package ma.app.football.participation.presentation;

import lombok.AllArgsConstructor;
import ma.app.football.participation.application.ParticipationService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/participations")
@AllArgsConstructor
public class ParticipationController {

    private final ParticipationService participationService;
}
