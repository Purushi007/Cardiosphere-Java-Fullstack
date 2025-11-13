package HeartDonar.Heartdonar.service.impl;

import HeartDonar.Heartdonar.model.Donor;
import HeartDonar.Heartdonar.repository.DonorRepository;
import HeartDonar.Heartdonar.service.DonorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DonorServiceImpl implements DonorService {

    @Autowired
    private DonorRepository donorRepository;

    @Override
    public Donor addDonor(Donor donor) {
        return donorRepository.save(donor);
    }

    @Override
    public Donor updateDonor(int id, Donor donor) {
        Donor existing = donorRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Donor not found with id: " + id));

        existing.setName(donor.getName());
        existing.setAge(donor.getAge());
        existing.setBloodGroup(donor.getBloodGroup());
        existing.setHeartCondition(donor.getHeartCondition());
        existing.setContact(donor.getContact());

        return donorRepository.save(existing);
    }

    @Override
    public void deleteDonor(int id) {
        if (!donorRepository.existsById(id)) {
            throw new RuntimeException("Donor not found with id: " + id);
        }
        donorRepository.deleteById(id);
    }

    @Override
    public Donor getDonorById(int id) {
        return donorRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Donor not found with id: " + id));
    }

    @Override
    public List<Donor> getAllDonors() {
        return donorRepository.findAll();
    }
}
