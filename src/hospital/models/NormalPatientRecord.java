package hospital.models;

public class NormalPatientRecord extends PatientRecord {
    private int cost;

    public NormalPatientRecord(String recordNumber, String patientNumber, String name, String inDate, String outDate, String reason, int cost) {
        super(recordNumber, patientNumber, name, inDate, outDate,reason);
        this.cost = cost;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    public String toString() {
        return super.toString() + "," + cost;
    }
}
