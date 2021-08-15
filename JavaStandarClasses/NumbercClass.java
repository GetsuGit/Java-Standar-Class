package JavaStandarClasses;

public class NumbercClass {
    public static void main(String[] args){

       Integer intValue = 10;

       Long longValue = intValue.longValue();
       Double doubleValue = intValue.doubleValue();
       Short shorValue = doubleValue.shortValue();

       String contoh = "10000";

       Integer contohint = Integer.valueOf(contoh);
       System.out.println(contohint);

    }
}
