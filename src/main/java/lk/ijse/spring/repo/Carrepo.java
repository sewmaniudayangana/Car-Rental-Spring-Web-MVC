package lk.ijse.spring.repo;

import lk.ijse.spring.entity.Car;
import org.springframework.data.jpa.repository.JpaRepository;

public interface Carrepo extends JpaRepository<Car, String> {
}
