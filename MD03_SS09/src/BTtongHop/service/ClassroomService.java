package BTtongHop.service;

import BTtongHop.model.Classroom;
import BTtongHop.repository.FileRepo;

import java.util.List;

public class ClassroomService implements IService<Classroom>{
    FileRepo<Classroom,Integer> classesFileRepo ;
    @Override
    public List<Classroom> findAll() {
        return this.classesFileRepo.findAll();
    }

    @Override
    public void save(Classroom classroom) {
        this.classesFileRepo.save(classroom);
    }

    @Override
    public Classroom findById(int id) {
        return this.classesFileRepo.findByid(id);
    }

    @Override
    public int findIndexById(int id) {
        return this.classesFileRepo.findIndexById(id);
    }

    @Override
    public int autoInc() {
        return this.classesFileRepo.autoInc();
    }
}
