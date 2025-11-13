package HeartDonar.Heartdonar.controller;

import java.util.List;
import org.springframework.web.bind.annotation.*;

import HeartDonar.Heartdonar.model.Donor;
import HeartDonar.Heartdonar.service.DonorService;

@RestController
@RequestMapping("/donors")
public class DonorController {

    private final DonorService donorService;

    public DonorController(DonorService donorService) {
        this.donorService = donorService;
    }

    @PostMapping("/add")
    public Donor addDonor(@RequestBody Donor donor) {
        return donorService.addDonor(donor);
    }

    @GetMapping("/all")
    public List<Donor> getAllDonors() {
        return donorService.getAllDonors();
    }
}
