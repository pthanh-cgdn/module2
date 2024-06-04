package hospital.models;

import java.util.Date;

public abstract class PatientRecord {
    private String recordNumber;
    private String patientNumber;
    private String name;
    private String inDate;
    private String outDate;
    private String reason;

    public PatientRecord() {
    }

    public PatientRecord(String recordNumber,String patientNumber, String name, String inDate, String outDate, String reason) {
        this.recordNumber = recordNumber;
        this.patientNumber = patientNumber;
        this.name = name;
        this.inDate = inDate;
        this.outDate = outDate;
        this.reason = reason;
    }

    public String getRecordNumber() {
        return recordNumber;
    }

    public String getName() {
        return name;
    }

    public String getInDate() {
        return inDate;
    }

    public String getOutDate() {
        return outDate;
    }


    public void setRecordNumber(String recordNumber) {
        this.recordNumber = recordNumber;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setInDate(String inDate) {
        this.inDate = inDate;
    }

    public void setOutDate(String outDate) {
        this.outDate = outDate;
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    public String getPatientNumber() {
        return patientNumber;
    }

    public void setPatientNumber(String patientNumber) {
        this.patientNumber = patientNumber;
    }

    public String toString() {
        return recordNumber + "," + patientNumber + "," + name + "," + inDate + "," + outDate + "," + reason;
    }
}
