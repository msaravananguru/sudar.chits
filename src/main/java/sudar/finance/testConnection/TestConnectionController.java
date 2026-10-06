package sudar.finance.testConnection;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestConnectionController {

    private final TestConnectionRepository repository;

    public TestConnectionController(TestConnectionRepository repository) {
        this.repository = repository;
    }

    @GetMapping("/test-data")
    public List<TestConnection> getTestData() {
        return repository.findAll();
    }
}