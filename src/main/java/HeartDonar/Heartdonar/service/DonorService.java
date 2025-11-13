package HeartDonar.Heartdonar.service;

import java.util.List;
import HeartDonar.Heartdonar.model.Donor;

public interface DonorService {

    Donor addDonor(Donor donor);

    Donor updateDonor(int id, Donor donor);

    void deleteDonor(int id);

    Donor getDonorById(int id);

    List<Donor> getAllDonors();
}
