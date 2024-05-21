package session9_tdd;

public class TriangleClassifier {
        public static String getTriangleType(double side1, double side2, double side3) {
//            throw new UnsupportedOperationException();
            if (side1 + side2 <= side3 || side2 + side3 <= side1 || side3 + side1 <= side2 || side1 < 0 || side2 < 0 || side3 < 0) {
                return "Khong phai tam giac";
            } else {
                if (side1 == side2 && side2 == side3) {
                    return "Tam giac deu";
                } else if (side1 == side2 || side2 == side3 || side3 == side1) {
                    return "Tam giac can";
                } else {
                    return "Tam giac thuong";
                }
            }
        }
}
