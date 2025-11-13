package HeartDonar.Heartdonar.service.impl;

import HeartDonar.Heartdonar.model.Recipient;
import HeartDonar.Heartdonar.repository.RecipientRepository;
import HeartDonar.Heartdonar.service.RecipientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RecipientServiceImpl implements RecipientService {

    @Autowired
    private RecipientRepository recipientRepository;

    @Override
    public Recipient addRecipient(Recipient recipient) {
        return recipientRepository.save(recipient);
    }

    @Override
    public Recipient updateRecipient(int id, Recipient recipient) {
        Recipient existing = recipientRepository.findById(id)
            .orElseThrow(() -> new RuntimeException("Recipient not found"));

        existing.setName(recipient.getName());
        existing.setAge(recipient.getAge());
        existing.setBloodGroup(recipient.getBloodGroup());
        existing.setHeartCondition(recipient.getHeartCondition());
        existing.setContact(recipient.getContact());

        return recipientRepository.save(existing);
    }

    @Override
    public void deleteRecipient(int id) {
        recipientRepository.deleteById(id);
    }

    @Override
    public Recipient getRecipientById(int id) {
        return recipientRepository.findById(id)
            .orElseThrow(() -> new RuntimeException("Recipient not found"));
    }

    @Override
    public List<Recipient> getAllRecipients() {
        return recipientRepository.findAll();
    }
}
