import java.util.*;
import java.lang.*;

public class JavaPractice {
    public static void main(String[] args) {
        //Scanner sc = new Scanner(System.in);
        System.out.println("Hello there");
        List<String> names = new ArrayList<>();
        names.add("Pranav");
        names.add("Kiran");

        List<String> editedNames= names.stream().map(name->name+"1").toList();
        System.out.println(editedNames);
        JavaPractice.printYourName(names);
    }

    public static void printYourName(List<String> names){
        System.out.println(names);
    }
}
