package in.sai.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import in.sai.entity.Student;

public interface StudentRepository extends JpaRepository<Student, Integer> {
	
	@Query("select distinct(branch) from Student")
	public List<String> getBranchName();
	
	@Query("select distinct(section) from Student")
	public List<String> getSection();
	

}
