package HeartDonar.Heartdonar.controller;

import org.springframework.web.bind.annotation.*;

import HeartDonar.Heartdonar.model.Admin;
import HeartDonar.Heartdonar.service.AdminService;

@RestController
@RequestMapping("/admin")
public class AdminController {

    private final AdminService adminService;

    public AdminController(AdminService adminService) {
        this.adminService = adminService;
    }

    @PostMapping("/login")
    public Admin login(@RequestBody Admin admin) {
        return adminService.login(admin.getUsername(), admin.getPassword());
    }
}
