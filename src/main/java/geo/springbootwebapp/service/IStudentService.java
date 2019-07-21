package geo.springbootwebapp.service;

import geo.springbootwebapp.entity.Student;

import java.util.List;
import java.util.Optional;

public interface IStudentService {

     List<Student> findAll();
     void create(Student student);
     Optional<Student> read(Long id);
     void update(Student student);
     void delete(Long id);

}
