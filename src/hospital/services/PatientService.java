package hospital.services;

import hospital.models.DuplicateMedicalRecordException;
import hospital.models.PatientRecord;
import hospital.repositories.RecordRepositories;

import java.util.ArrayList;

public class PatientService implements IService{
    RecordRepositories repo = new RecordRepositories();
    @Override
    public boolean add(PatientRecord record) {
        try{
            repo.add(record);
        } catch(DuplicateMedicalRecordException e){
            System.out.println("Mã bệnh án đã tồn tại");
            return false;
        }
        return true;
    }

    @Override
    public void delete(String recordNumber) {
        repo.delete(recordNumber);
    }

    @Override
    public ArrayList<PatientRecord> viewAll() {
        return repo.getAll();
    }

    @Override
    public boolean contain(String recordNumber) {
        ArrayList<PatientRecord> records = repo.getAll();
        for (PatientRecord record : records) {
            if (record.getRecordNumber().equals(recordNumber)) {
                return true;
            }
        }
        return false;
    }
}
