package lk.ijse.spring.service.impl;

import lk.ijse.spring.dto.DriverDto;
import lk.ijse.spring.entity.Driver;
import lk.ijse.spring.repo.Driverrepo;
import lk.ijse.spring.service.DriverService;
import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class DriverServiceimpl implements DriverService {

    @Autowired
    private Driverrepo repo;

    @Autowired
    private ModelMapper mapper;

    @Override
    public void saveDriver(DriverDto dto) {
        if (!repo.existsById(dto.getDid())) {
            repo.save(mapper.map(dto, Driver.class));
        } else {
            throw new RuntimeException("Driver Already Exist...!");
        }
    }

    @Override
    public void deleteDriver(String id) {
        if (repo.existsById(id)) {
            repo.deleteById(id);
        } else {
            throw new RuntimeException("Please check the Driver Id., No Such");
        }
    }

    @Override
    public void updateDriver(DriverDto dto) {
        if (repo.existsById(dto.getDid())) {
            repo.save(mapper.map(dto, Driver.class));
        }
    }

    @Override
    public DriverDto searchDriver(String id) {

        if (repo.existsById(id)) {
            return mapper.map(repo.findById(id).get(), DriverDto.class);

        } else {
            throw new RuntimeException("No Driver For" + id + "...!");
        }
    }

    @Override
    public List<DriverDto> getAllDriver() {

        return mapper.map(repo.findAll(), new TypeToken<List<DriverDto>>() {

        }.getType());
    }
}
