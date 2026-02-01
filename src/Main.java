import java.util.*;
public class Main {
    public static void main(String[] args) {
        ///////merge Unique Elements (Books)
        ArrayList<String> b1 = new ArrayList<>(Arrays.asList("do", "re", "me"));
        ArrayList<String> b2 = new ArrayList<>(Arrays.asList("fa", "sol", "do"));

        Set<String> uniqueb = new HashSet<>();
        uniqueb.addAll(b1);
        uniqueb.addAll(b2);

        System.out.println(uniqueb);
    }
}