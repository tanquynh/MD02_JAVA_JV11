package BTtongHop.service;

import BTtongHop.constant.Contant;
import BTtongHop.model.Student;
import BTtongHop.repository.FileRepo;

import java.util.List;
import java.util.Scanner;

public class StudentService implements IService<Student>{
    FileRepo<Student, Integer> studentFileRepo;
    public StudentService() {
        this.studentFileRepo = new FileRepo<>(Contant.FilePath.STUDENT_FILE);
    }


    @Override
    public List<Student> findAll() {
        return this.studentFileRepo.findAll();
    }

    @Override
    public void save(Student student) {
        this.studentFileRepo.save(student);
    }

    @Override
    public Student findById(int id) {
        return this.studentFileRepo.findByid(id);
    }


    @Override
    public int findIndexById(int id) {
        return this.studentFileRepo.findIndexById(id);
    }

    @Override
    public int autoInc() {
        return this.studentFileRepo.autoInc();
    }


}
