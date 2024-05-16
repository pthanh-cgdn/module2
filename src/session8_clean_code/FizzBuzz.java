package session8_clean_code;

public class FizzBuzz {
    public static String fizzBuzz(int number){
        boolean isDivideBy3 = number % 3 == 0;
        boolean isDivideBy5 = number % 5 == 0;

        if(isDivideBy3 && isDivideBy5)
            return "FizzBuzz";

        if(isDivideBy3)
            return "Fizz";

        if(isDivideBy5)
            return "Buzz";

        return number + "";
    }

}
