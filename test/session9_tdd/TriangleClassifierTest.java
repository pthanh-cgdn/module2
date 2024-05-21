package session9_tdd;

import org.junit.Test;
import org.junit.jupiter.api.DisplayName;

import static org.junit.jupiter.api.Assertions.*;

public class TriangleClassifierTest {
    @Test
    @DisplayName("Test1")
    public void test1TamGiacDeu() {
        double side1 = 5;
        double side2 = 5;
        double side3 = 5;
        String expected = "Tam giac deu";
        String result = TriangleClassifier.getTriangleType(side1,side2,side3);
        assertEquals(expected, result);
    }
    @Test
    @DisplayName("Test2")
    public void test1TamGiacCan() {
        double side1 = 5;
        double side2 = 5;
        double side3 = 4;
        String expected = "Tam giac can";
        String result = TriangleClassifier.getTriangleType(side1,side2,side3);
        assertEquals(expected, result);
    }
    @Test
    @DisplayName("Test3")
    public void test1TamGiacThuong() {
        double side1 = 3;
        double side2 = 5;
        double side3 = 4;
        String expected = "Tam giac thuong";
        String result = TriangleClassifier.getTriangleType(side1,side2,side3);
        assertEquals(expected, result);
    }
    @Test
    @DisplayName("Test4")
    public void testKhongTamGiac() {
        double side1 = 1;
        double side2 = 5;
        double side3 = 4;
        String expected = "Khong phai tam giac";
        String result = TriangleClassifier.getTriangleType(side1,side2,side3);
        assertEquals(expected, result);
    }
}