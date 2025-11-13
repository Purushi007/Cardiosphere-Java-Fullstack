package HeartDonar.Heartdonar.repository;

import HeartDonar.Heartdonar.model.Recipient;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RecipientRepository extends JpaRepository<Recipient, Integer> {
    // No custom methods needed unless field exists in the entity
}
