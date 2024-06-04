package hospital.repositories;

import hospital.models.NormalPatientRecord;
import hospital.models.PatientRecord;
import hospital.models.VipPatientRecord;
import hospital.models.DuplicateMedicalRecordException;

import java.io.*;
import java.util.ArrayList;

public class RecordRepositories {
    public void add(PatientRecord record) throws DuplicateMedicalRecordException {
        File file = new File("src/hospital/repositories/data/medicals_records.csv");
        BufferedWriter bufferedWriter = null;
        ArrayList<PatientRecord> patientRecords = getAll();
        for (PatientRecord patientRecord : patientRecords) {
            if (patientRecord.getRecordNumber().equals(record.getRecordNumber())) {
                throw new DuplicateMedicalRecordException();
            }
        }
        int max_index = patientRecords.size();
        try {
            FileWriter fileWriter = new FileWriter(file, true);
            bufferedWriter = new BufferedWriter(fileWriter);
            max_index = max_index + 1;
            if (record instanceof NormalPatientRecord) {
                bufferedWriter.write((max_index + 1) + "," + record.getRecordNumber() + "," + record.getPatientNumber() + "," + record.getName() + "," + record.getInDate() + "," + record.getOutDate() + "," + record.getReason() + "," + ((NormalPatientRecord) record).getCost());
            } else if (record instanceof VipPatientRecord) {
                bufferedWriter.write((max_index + 1) + "," + record.getRecordNumber() + "," + record.getPatientNumber() + "," + record.getName() + "," + record.getInDate() + "," + record.getOutDate() + "," + record.getReason()  + "," + ((VipPatientRecord) record).getVipType() + "," + ((VipPatientRecord) record).getVipEnd());
            }
            bufferedWriter.newLine();
        } catch (IOException e) {
            System.out.println("Lỗi nhập liệu");
        } finally {
            try {
                if(bufferedWriter != null) {
                    bufferedWriter.close();
                }
            } catch (IOException e) {
                System.out.println("Không thể đóng file");
            }
        }
    }

    public ArrayList<PatientRecord> getAll() {
        File file = new File("src/hospital/repositories/data/medicals_records.csv");
        ArrayList<PatientRecord> patientRecords = new ArrayList<>();
        try {
            FileReader fileReader = new FileReader(file);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String line;
            String[] arr;
            PatientRecord record;
            while ((line = bufferedReader.readLine()) != null) {
                arr = line.split(",");
                if (arr.length == 8) {
                    record = new NormalPatientRecord(arr[1], arr[2], arr[3], arr[4],arr[5],arr[6], Integer.parseInt(arr[7]));
                } else {
                    record = new VipPatientRecord(arr[1], arr[2], arr[3], arr[4], arr[5], arr[6], arr[7], arr[8]);
                }
                patientRecords.add(record);
            }
        } catch (FileNotFoundException e) {
            System.out.println("Không tìm thấy file");
        } catch (IOException e) {
            System.out.println("Lỗi đọc file");
        }
        return patientRecords;
    }

    public void delete(String recordNumber) {
        ArrayList<PatientRecord> records = getAll();
        for (PatientRecord record : records) {
            if (record.getRecordNumber().equals(recordNumber)) {
                records.remove(record);
                break;
            }
        }
        File file = new File("src/hospital/repositories/data/medicals_records.csv");
        FileWriter fileWriter;
        BufferedWriter bufferedWriter = null;
        int index = 1;

        try {
            fileWriter = new FileWriter(file);
            bufferedWriter = new BufferedWriter(fileWriter);
            for (PatientRecord record : records) {
                if (record instanceof NormalPatientRecord) {
                    bufferedWriter.write(index + "," + record.getRecordNumber() + "," + record.getPatientNumber() + "," + record.getName() + "," + record.getInDate() + "," + record.getOutDate() + "," + record.getReason() + "," + ((NormalPatientRecord) record).getCost());
                } else if (record instanceof VipPatientRecord) {
                    bufferedWriter.write(index + "," + record.getRecordNumber() + "," + record.getPatientNumber() + "," + record.getName() + "," + record.getInDate() + "," + record.getOutDate() + "," + record.getReason()  + "," + ((VipPatientRecord) record).getVipType() + "," + ((VipPatientRecord) record).getVipEnd());
                }
                bufferedWriter.newLine();
                index = index + 1;
            }
        } catch (IOException e) {
            System.out.println("Lỗi nhập liệu");
        } finally {
            try {
                if (bufferedWriter!=null){
                    bufferedWriter.close();
                }
            } catch (IOException e) {
                System.out.println("Không thể đóng file");
            }
        }
    }
}