package lk.ijse.spring.repo;

import lk.ijse.spring.entity.ResereDetail;
import org.springframework.data.jpa.repository.JpaRepository;

public interface Rentrepo extends JpaRepository<ResereDetail, String> {
}
