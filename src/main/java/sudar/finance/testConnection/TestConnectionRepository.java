package sudar.finance.testConnection;

import org.springframework.data.jpa.repository.JpaRepository;

public interface TestConnectionRepository
        extends JpaRepository<TestConnection, String> {
}