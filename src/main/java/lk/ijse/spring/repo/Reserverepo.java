package lk.ijse.spring.repo;

import lk.ijse.spring.entity.Reserve;
import org.springframework.data.jpa.repository.JpaRepository;

public interface Reserverepo extends JpaRepository<Reserve, String> {
}
