package repertoire;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import model.Employer;

@Repository
public interface EmployerRepertoire extends JpaRepository<Employer,Long>{
	
}
