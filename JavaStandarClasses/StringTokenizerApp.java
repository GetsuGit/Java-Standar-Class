package JavaStandarClasses;
import java.util.StringTokenizer;

public class StringTokenizerApp {
    public static void main(String[] args){

       String value = "Getsu Code User";

       StringTokenizer tokenizer = new StringTokenizer(value, " ");

       while(tokenizer.hasMoreTokens()){
           String result = tokenizer.nextToken();
           System.out.println("Result : " + result);
       }
    }
}
