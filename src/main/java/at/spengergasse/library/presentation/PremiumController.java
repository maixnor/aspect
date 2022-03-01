package at.spengergasse.library.presentation;

import at.spengergasse.library.service.PremiumService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PremiumController {

    final PremiumService premiumService;

    public PremiumController(PremiumService premiumService) {
        this.premiumService = premiumService;
    }

    @GetMapping("/premium")
    public int premium() {
        return premiumService.someFeature(69, 420);
    }

}
