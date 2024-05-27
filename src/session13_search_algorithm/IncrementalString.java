package session13_search_algorithm;

public class IncrementalString {
    private String str = null;

    public IncrementalString() {
    }

    public IncrementalString(String str) {
        this.str = str;
    }
    public String getString() {
        return str;
    }
    public void setString(String str) {
        this.str = str;
    }
    public String getIncrementalString() {
        String result = "";
        result += str.charAt(0);
        for (int i = 1; i < str.length(); i++) {
            if ((int) str.charAt(i) > str.charAt(i - 1)) {
                result += str.charAt(i);
            }
        }
        return result;
    }
    public String getIncrementalContinuosString() {
        String[] stringList = new String[str.length()];
        for (int i = 0; i < str.length(); i++) {
            stringList[i] = "";
        }
        int index = 0;
        int indexMax = 0;
        stringList[0] += str.charAt(0);
        for (int i = 1; i < str.length(); i++) {
            if ((int) str.charAt(i) > str.charAt(i - 1)) {
                stringList[index] += str.charAt(i);
            } else {
                index++;
                stringList[index] += str.charAt(i);
            }
        }
        int max = stringList[0].length();
        for (int i = 1; i <= index; i++) {
            if (max < stringList[i].length()) {
                max = stringList[i].length();
                indexMax = i;
            }
        }
        return stringList[indexMax];
    }

    public static void main(String[] args) {
        IncrementalString incrementalString = new IncrementalString("abcabcdgabxy");
        System.out.println(incrementalString.getIncrementalContinuosString());
        System.out.println(incrementalString.getIncrementalString());
    }
}
