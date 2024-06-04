package hospital.models;

import java.util.Date;

public class VipPatientRecord extends PatientRecord {
    private String vipType;
    private String vipEnd;


    public VipPatientRecord(String recordNumber, String patientNumber, String name, String inDate, String outDate, String reason, String vipType, String vipEnd) {
        super(recordNumber, patientNumber, name, inDate, outDate, reason);
        this.vipType = vipType;
        this.vipEnd = vipEnd;
    }

    public String getVipType() {
        return vipType;
    }

    public void setVipType(String vipType) {
        this.vipType = vipType;
    }

    public String getVipEnd() {
        return vipEnd;
    }

    public void setVipEnd(String vipEnd) {
        this.vipEnd = vipEnd;
    }

    public String toString() {
        return super.toString() + "," + vipType + "," + vipEnd;
    }
}
