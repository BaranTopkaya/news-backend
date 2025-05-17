package se_3355.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import se_3355.entity.History;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api/history")
@CrossOrigin(origins = "*")
public class HistoryController {
    List<History> historyList = new ArrayList<>();

    @GetMapping
    public List<History> getLastHistory() {
        List<History> recent = new ArrayList<>();
        int size = historyList.size();

        int count = Math.min(10, size);
        for (int i = size - 1; i >= size - count; i--) {
            recent.add(historyList.get(i));
        }

        return recent;
    }

    @PostMapping("/add")
    public void addHistory(@RequestParam String title) {
        History history = new History(title);
        historyList.add(history);
    }
}
