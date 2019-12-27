package migration.java11;

import java.util.stream.Collectors;

public class LibraryImprovements {
    public static void main(String[] args)
    {
        System.out.println(" ".isBlank()); //true

        String s = "TestVagrant";
        System.out.println(s.isBlank()); //false
        String s1 = "";
        System.out.println(s1.isBlank()); //true

        // lines(): This method returns a string array which is a collection of all substrings split by lines.
        String str = "JD\nJD\nJD";
        System.out.println(str);

        System.out.println(str.lines().collect(Collectors.toList()));

        // strip() – Removes the white space from both, beginning and the end of string.

        String strip = " JD ";
        System.out.print("Start");
        System.out.print(strip.strip());
        System.out.println("End");

        System.out.print("Start");
        System.out.print(strip.stripLeading());
        System.out.println("End");

        System.out.print("Start");
        System.out.print(strip.stripTrailing());
        System.out.println("End");

        // repeat(int): The repeat method simply repeats the string that many numbers of times as mentioned
        // in the method in the form of an int.

        String repeat = "=".repeat(2);
        System.out.println(repeat); //prints ==
    }
}