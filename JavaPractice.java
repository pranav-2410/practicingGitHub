import java.util.*;
import java.lang.*;
import java.util.stream.Collectors;

public class JavaPractice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Hello there");
        List<String> names = new ArrayList<>();
        names.add("Pranav");
        names.add("Kiran");

        List<String> editednames= names.stream().map(name->name+"1").toList();
        System.out.println(editednames);
    }
}
