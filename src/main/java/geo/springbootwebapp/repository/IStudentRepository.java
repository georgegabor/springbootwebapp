package geo.springbootwebapp.repository;

import java.util.List;

import geo.springbootwebapp.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface IStudentRepository extends JpaRepository<Student, Long> {

}
