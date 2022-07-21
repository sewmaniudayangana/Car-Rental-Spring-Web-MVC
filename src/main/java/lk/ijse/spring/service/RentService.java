package lk.ijse.spring.service;

import lk.ijse.spring.dto.RentDto;

import java.util.List;

public interface RentService {
    void saveRent(RentDto dto);

    void deleteRent(String dto);

    void updateRent(RentDto dto);

    RentDto searchRent(String dto);

    List<RentDto> getAllRent();
}
