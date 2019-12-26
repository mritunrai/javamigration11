package migration.java11;

import java.util.ArrayList;
import java.util.List;

public class LambdaParameter {

    public static void main(String[] args)
    {
        // Before JDK 11
        List<String> list = new ArrayList<String>();

        list.add("Test1");

        list.forEach(n-> System.out.println(n));

        // From JDK 11 onwards

        var list1 = new ArrayList<String>();

        list1.add("Test2");

        list1.forEach(n-> System.out.println(n));

    }
}
