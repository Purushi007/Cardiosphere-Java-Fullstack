package HeartDonar.Heartdonar.service;

import java.util.List;
import HeartDonar.Heartdonar.model.Recipient;

public interface RecipientService {

    Recipient addRecipient(Recipient recipient);

    Recipient updateRecipient(int id, Recipient recipient);

    void deleteRecipient(int id);

    Recipient getRecipientById(int id);

    List<Recipient> getAllRecipients();
}
