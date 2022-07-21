package lk.ijse.spring.service;

import lk.ijse.spring.dto.ResereDetailDto;

import java.util.List;

public interface ReserDetailService {
    void saveReserDetail(ResereDetailDto dto);

    void deleteReserDetail(String dto);

    void updateReserDetail(ResereDetailDto dto);

    ResereDetailDto searchReserDetail(String dto);

    List<ResereDetailDto> getAllReserDetail();
}
