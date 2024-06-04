package hospital.views;

import hospital.models.NormalPatientRecord;
import hospital.models.PatientRecord;
import hospital.models.VipPatientRecord;

import java.util.ArrayList;
import java.util.Scanner;

public class View {
    public int menuView(){
        System.out.println("Chọn chức năng theo (để tiếp tục):");
        System.out.println("1. Thêm mới");
        System.out.println("2. Xoá");
        System.out.println("3. Xem danh sách bệnh án");
        System.out.println("4. Thoát");
        Scanner scanner = new Scanner(System.in);
        int choice = Integer.parseInt(scanner.nextLine());
        return choice;
    }

    public PatientRecord addView() {
        Scanner scanner = new Scanner(System.in);
        String recordNumber;
        String patientNumber;
        String name;
        String inDate;
        String outDate;
        String vipType;
        String vipEnd;
        String reason;
        do {
            System.out.println("Vui lòng nhập mã bệnh án: ");
            recordNumber = scanner.nextLine();
        } while(!recordNumber.matches("BA-\\d{3}"));
        do {
            System.out.println("Vui lòng nhập mã bệnh nhân: ");
            patientNumber = scanner.nextLine();
        } while(!patientNumber.matches("BN-\\d{3}"));
        System.out.println("Vui lòng nhập tên bệnh nhân: ");
         name = scanner.nextLine();
        do {
            System.out.println("Vui lòng nhập ngày nhập viện (định dạng DD/MM/YYYY");
            inDate = scanner.nextLine();
        }while(!inDate.matches("[0-3][0-9]/[0-1][0-2]/20[0-2][0-9]"));
        do {
            System.out.println("Vui lòng nhập ngày xuất viện");
            outDate = scanner.nextLine();
        } while(!outDate.matches("[0-3][0-9]/[0-1][0-2]/20[0-2][0-9]") || !compare(outDate,inDate));
        System.out.println("Vui lòng nhập lý do nhập viện");
        reason = scanner.nextLine();
        System.out.println("Có phải là bệnh nhân VIP không (ấn Y để chọn Yes)?");
        boolean isVip = scanner.nextLine().equals("Y");
        if (isVip){
            do {
                System.out.println("Vui lòng nhập loại Vip (VIP1,VIP2,VIP3)");
                vipType = scanner.nextLine();
            } while(!vipType.matches("VIP\\d{1,3}"));
            do {
                System.out.println("Vui lòng nhập thời hạn gói Vip");
                vipEnd = scanner.nextLine();
            } while(!vipEnd.matches("[0-3][0-9]/[0-1][0-2]/20[0-2][0-9]"));
            return new VipPatientRecord(recordNumber, patientNumber, name, inDate, outDate, reason, vipType, vipEnd);
        } else {
            System.out.println("Vui lòng nhập chi phí chữa bệnh");
            int cost = Integer.parseInt(scanner.nextLine());
            return new NormalPatientRecord(recordNumber,patientNumber, name, inDate, outDate,reason, cost);
        }
    }

    public void showMessage(boolean result) {
        if (result){
            System.out.println("Tác vụ thành công");
        } else {
            System.out.println("Tác vụ thất bại");
        }
    }

    public void viewAll(ArrayList<PatientRecord> records) {
       int index = 1;
        for (PatientRecord record : records) {
            System.out.println(index+","+record.toString());
            index++;
        }
    }

    public String deleteView() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Vui lòng nhập danh sách bệnh án");
        String recordNumber = scanner.nextLine();
        return recordNumber;
    }

    public void notContainMessage(String recordNumber) {
        System.out.println("Không tồn tại bệnh án "+recordNumber);
    }

    public boolean confirmDelete(String recordNumber) {
        System.out.println("Bạn có muốn xoá bệnh án "+recordNumber+" (chọn Y nếu đồng ý, N nếu không đồng ý)");
        Scanner scanner = new Scanner(System.in);
        boolean confirm = scanner.nextLine().equals("Y");
        return confirm;
    }
    public boolean compare(String date1, String date2) {
        int day1 = Integer.parseInt(date1.substring(0,2));
        int month1 = Integer.parseInt(date1.substring(3,5));
        int year1 = Integer.parseInt(date1.substring(6));
        int num1 = year1*400 + month1*31 + day1;
        int day2 = Integer.parseInt(date2.substring(0,2));
        int month2 = Integer.parseInt(date2.substring(3,5));
        int year2 = Integer.parseInt(date2.substring(6,10));
        int num2 = year2*400 + month2*31 + day2;
        return num1-num2>0;
    }
}
