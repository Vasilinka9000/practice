package ru.neoflex.practice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
public class СalculatorController {
    @Autowired
    СalculatorRepository сalculatorRepository;

    @GetMapping("/sum/{id}")
    public ResponseEntity<Сalculator> getCalcById(@PathVariable("id") long id) {
        Optional<Сalculator> calculatorData = сalculatorRepository.findById(id);

        if (calculatorData.isPresent()) {
            return new ResponseEntity<>(calculatorData.get(), HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @GetMapping("/plus/{a}/{b}")
    public long Addition(@PathVariable() int a, @PathVariable int b) {
        long result = a + b;
        Сalculator сalculator = сalculatorRepository.save(new Сalculator(a, b, result, СalculatorOperator.Addition));
        return result;
    }

    @GetMapping("/minus/{a}/{b}")
    public long Subtraction(@PathVariable() int a, @PathVariable() int b) {
        long result = a - b;
        Сalculator сalculator = сalculatorRepository.save(new Сalculator(a, b, result, СalculatorOperator.Subtraction));
        return result;
    }
}