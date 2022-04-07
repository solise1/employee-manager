package sol.springular.employeemanager.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import sol.springular.employeemanager.model.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {
}
