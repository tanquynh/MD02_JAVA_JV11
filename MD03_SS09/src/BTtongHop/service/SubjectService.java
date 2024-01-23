package BTtongHop.service;

import BTtongHop.constant.Contant;
import BTtongHop.model.Subject;
import BTtongHop.repository.FileRepo;

import java.util.List;

public class SubjectService implements IService<Subject>{
    FileRepo<Subject, Integer> subjectFileRepo;
    public SubjectService() {
        this.subjectFileRepo = new FileRepo<>(Contant.FilePath.SUBJECT_FILE);
    }
    @Override
    public List<Subject> findAll() {
       return this.subjectFileRepo.findAll();
    }

    @Override
    public void save(Subject subject) {
       this.subjectFileRepo.save(subject);
    }

    @Override
    public Subject findById(int id) {
        return this.subjectFileRepo.findByid(id);
    }

    @Override
    public int findIndexById(int id) {
        return this.subjectFileRepo.findIndexById(id);
    }

    @Override
    public int autoInc() {
        return this.subjectFileRepo.autoInc();
    }
}
