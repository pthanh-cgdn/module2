package hospital.services;

import hospital.models.PatientRecord;

import java.util.ArrayList;

public interface IService {
    public boolean add(PatientRecord record);
    public void delete(String recordNumber);
    public ArrayList<PatientRecord> viewAll();
    boolean contain(String recordNumber);
}
