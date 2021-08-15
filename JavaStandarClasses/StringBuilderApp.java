package JavaStandarClasses;

public class StringBuilderApp {
    public static void main(String[] args){

        StringBuilder builder = new StringBuilder();
        builder.append("User");
        builder.append(" ");
        builder.append("Getsu");
        builder.append(" ");
        builder.append("Code");

        String name = builder.toString();
        System.out.println(name);

    }
}
