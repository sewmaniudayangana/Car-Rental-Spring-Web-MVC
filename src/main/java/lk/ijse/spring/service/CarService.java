package lk.ijse.spring.service;


import lk.ijse.spring.dto.CarDto;

import java.util.List;

public interface CarService {
    void saveCar(CarDto dto);

    void deleteCar(String dto);

    void updateCar(CarDto dto);

    CarDto searchCar(String dto);

    List<CarDto> getAllCar();
}
