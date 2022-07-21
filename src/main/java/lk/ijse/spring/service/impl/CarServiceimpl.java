package lk.ijse.spring.service.impl;

import lk.ijse.spring.dto.CarDto;
import lk.ijse.spring.entity.Car;
import lk.ijse.spring.repo.Carrepo;
import lk.ijse.spring.service.CarService;
import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class CarServiceimpl implements CarService {


    @Autowired
    private Carrepo repo;

    @Autowired
    private ModelMapper mapper;


    @Override
    public void saveCar(CarDto dto) {
        if (!repo.existsById(dto.getCid())){
            repo.save(mapper.map(dto, Car.class));
        } else {
            throw new RuntimeException("Admin is Already Exist...!");
        }

    }

    @Override
    public void deleteCar(String id) {
      if (repo.existsById(id)){
          repo.deleteById(id);
      } else {
          throw new RuntimeException("Please check the Car ID.. No Such Car...!");
      }
    }

    @Override
    public void updateCar(CarDto dto) {
        if (repo.existsById(dto.getCid())) {
            repo.save(mapper.map(dto,Car.class));
        } else {
            throw new RuntimeException("No Such Car to update..! Please check the Id..!");
        }
    }

    @Override
    public CarDto searchCar(String id) {
        if(repo.existsById(id)){
            return mapper.map(repo.findById(id).get(),CarDto.class);
        } else {
            throw new RuntimeException("No Car For" + id + "..!");
        }
    }

    @Override
    public List<CarDto> getAllCar() {
       return mapper.map(repo.findAll(),new TypeToken<List<CarDto>>(){

       }.getType());
    }
}
