package ru.neoflex.practice;

import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface СalculatorRepository extends JpaRepository<Сalculator, Long> {
    List<Сalculator> findById(int id);
}
