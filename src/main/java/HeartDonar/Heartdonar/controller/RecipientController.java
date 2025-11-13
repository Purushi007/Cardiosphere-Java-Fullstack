package HeartDonar.Heartdonar.controller;

import java.util.List;
import org.springframework.web.bind.annotation.*;

import HeartDonar.Heartdonar.model.Recipient;
import HeartDonar.Heartdonar.service.RecipientService;

@RestController
@RequestMapping("/recipients")
public class RecipientController {

    private final RecipientService recipientService;

    public RecipientController(RecipientService recipientService) {
        this.recipientService = recipientService;
    }

    @PostMapping("/add")
    public Recipient addRecipient(@RequestBody Recipient recipient) {
        return recipientService.addRecipient(recipient);
    }

    @GetMapping("/all")
    public List<Recipient> getAllRecipients() {
        return recipientService.getAllRecipients();
    }
}
