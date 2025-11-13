package HeartDonar.Heartdonar.repository;

import HeartDonar.Heartdonar.model.Donor;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DonorRepository extends JpaRepository<Donor, Integer> {
}
