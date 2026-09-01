package ma.app.football.match.presentation;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.AllArgsConstructor;
import ma.app.football.match.application.MatchService;

@RestController
@RequestMapping("/matches")
@AllArgsConstructor
public class MatchController {
    
    private final MatchService matchService;
}
