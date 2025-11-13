package HeartDonar.Heartdonar.service;

import HeartDonar.Heartdonar.model.Admin;

public interface AdminService {
    Admin login(String username, String password);
}
