package JavaStandarClasses;

import java.util.StringJoiner;

public class StringJoinerApp {
    public static void main(String[] args){

        StringJoiner joiner = new StringJoiner(",","[","]");

        joiner.add("Getsu");
        joiner.add("Code");
        joiner.add("User");

        String value = joiner.toString();
        System.out.println(value);

    }
}
