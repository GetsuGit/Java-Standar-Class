package JavaStandarClasses;
import java.util.Scanner;

public class ScannerClass {
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        System.out.println("Nama : ");
        String name = input.nextLine();

        System.out.println("ID : ");
        int ID = input.nextInt();

        System.out.println("Hello : " + name);
        System.out.println("ID : " + ID);




    }
}
