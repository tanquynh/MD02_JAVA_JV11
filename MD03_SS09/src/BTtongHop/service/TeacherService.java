package BTtongHop.service;

import BTtongHop.constant.Contant;
import BTtongHop.model.Teacher;
import BTtongHop.repository.FileRepo;

import java.util.List;

public class TeacherService implements IService<Teacher> {
    FileRepo<Teacher, Integer> teacherFileRepo;
    public  TeacherService() {
        this.teacherFileRepo = new FileRepo<>(Contant.FilePath.TEACHER_FILE);
    }
    @Override
    public List<Teacher> findAll() {
        return this.teacherFileRepo.findAll();
    }

    @Override
    public void save(Teacher teacher) {
        this.teacherFileRepo.save(teacher);
    }

    @Override
    public Teacher findById(int id) {
        return this.teacherFileRepo.findByid(id);
    }

    @Override
    public int findIndexById(int id) {
        return this.teacherFileRepo.findIndexById(id);
    }

    @Override
    public int autoInc() {
        return this.teacherFileRepo.autoInc();
    }
}
