package lk.ijse.spring.service.impl;

import lk.ijse.spring.dto.AdminDto;
import lk.ijse.spring.entity.Admin;
import lk.ijse.spring.repo.Adminrepo;
import lk.ijse.spring.service.AdminService;
import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class AdminServiceimpl implements AdminService {

    @Autowired
    private Adminrepo repo;

    @Autowired
    private ModelMapper mapper;



    @Override
    public void saveAdmin(AdminDto dto) {
        if (!repo.existsById(dto.getId())){
            repo.save(mapper.map(dto, Admin.class));
        } else{
            throw new RuntimeException("Admin is Already Exist..!");
        }

    }

    @Override
    public void deleteAdmin(String id) {
        if(repo.existsById(id)){
            repo.deleteById(id);

        } else {
            throw new RuntimeException("Please check the Admin Id... No Such Admin...!");
        }
    }

    @Override
    public void updateAdmin(AdminDto dto) {
       if (repo.existsById(dto.getId())) {
           repo.save(mapper.map(dto,Admin.class));
       } else {
           throw new RuntimeException("No Such Admin to update...! Please check the Id...!");
       }
    }

    @Override
    public AdminDto searchAdmin(String id) {
        if (repo.existsById(id)){
            return mapper.map(repo.findById(id).get(),AdminDto.class);
        } else {
            throw new RuntimeException("No Admin For" + id + "..!");
        }
    }

    @Override
    public List<AdminDto> getAllAdmin() {
        return mapper.map(repo.findAll(),new TypeToken<List<AdminDto>>(){

        }.getType());
    }
}
