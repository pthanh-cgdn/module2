package hospital.controllers;

import hospital.models.PatientRecord;
import hospital.services.PatientService;
import hospital.views.View;

import java.util.ArrayList;

public class MainController {
    public static void main(String[] args) {
        View view = new View();
        PatientRecord record;
        PatientService service = new PatientService();
        String recordNumber;
        int choice = 0;
        boolean result = false;
        boolean contain = false;
        boolean confirm = false;
        ArrayList<PatientRecord> records;
        while (true) {
            choice = view.menuView();
            switch (choice) {
                case 1:
                    record = view.addView();
                    result = service.add(record);
                    view.showMessage(result);
                    break;
                case 2:
                    recordNumber = view.deleteView();
                    contain = service.contain(recordNumber);
                    if (!contain) {
                        view.notContainMessage(recordNumber);
                    } else {
                        confirm = view.confirmDelete(recordNumber);
                        if (confirm) {
                            service.delete(recordNumber);
                        }
                    }
                    break;
                case 3:
                    records = service.viewAll();
                    view.viewAll(records);
                    break;
                case 4:
                    return;
            }
        }
    }
}
