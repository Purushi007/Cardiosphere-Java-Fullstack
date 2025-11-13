package HeartDonar.Heartdonar.service.impl;

import HeartDonar.Heartdonar.model.Admin;
import HeartDonar.Heartdonar.repository.AdminRepository;
import HeartDonar.Heartdonar.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AdminServiceImpl implements AdminService {

    @Autowired
    private AdminRepository adminRepository;

    @Override
    public Admin login(String username, String password) {
        return adminRepository.findByUsernameAndPassword(username, password);
    }
}
