package JavaStandarClasses;

public class StringClass {
    public static void main(String[] args){

        String name = "Getsu Code";
        String nameLowercase = name.toLowerCase();
        String namesUppercase = name.toUpperCase();

        System.out.println(name);
        System.out.println(nameLowercase);
        System.out.println(namesUppercase);

        System.out.println(name.startsWith("User"));
        System.out.println(name.endsWith("Data"));

        /*String[] names = name.split("");
        for(var value :  names){
            System.out.println(value);
        } */
    }
}
