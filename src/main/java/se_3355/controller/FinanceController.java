package se_3355.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import se_3355.entity.Finance;
import se_3355.repository.FinanceRepository;

import java.util.List;

@RestController
@RequestMapping("/api/finance")
@CrossOrigin(origins = "*")
public class FinanceController {

    @Autowired
    private FinanceRepository financeRepository;

    @GetMapping
    public List<Finance> getAllFinance() {
        return financeRepository.findAll();
    }
}
