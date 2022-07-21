package lk.ijse.spring.service;

import lk.ijse.spring.dto.AdminDto;

import java.util.List;

public interface AdminService {
    void saveAdmin(AdminDto dto);

    void deleteAdmin(String dto);

    void updateAdmin(AdminDto dto);

    AdminDto searchAdmin(String dto);

    List<AdminDto> getAllAdmin();
}
