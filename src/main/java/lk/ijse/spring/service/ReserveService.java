package lk.ijse.spring.service;

import lk.ijse.spring.dto.ReserveDto;

import java.util.List;

public interface ReserveService {
    void saveReserve(ReserveDto dto);

    void deleteReserve(String dto);

    void updateReserve(ReserveDto dto);

    ReserveDto searchReserve(String dto);

    List<ReserveDto> getAllReserve();
}
