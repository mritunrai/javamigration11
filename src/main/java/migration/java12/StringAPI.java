package migration.java12;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class StringAPI {

    public static void mismatchMethod(String[] arguments) throws IOException {
        if (arguments.length < 2) {
            System.out.println("USAGE: FilesDemo <file1Name> <file2Name>");
            return;
        }
        final String file1Name = arguments[0];
        final Path file1Path = Path.of(file1Name);
        final String file2Name = arguments[1];
        final Path file2Path = Path.of(file2Name);
        System.out.println("\nFiles '" + file1Name + "' and '" + file2Name + "' are "
                + (Files.isSameFile(file1Path, file2Path) ? "the" : "NOT the")
                + " same.\n\n");
        System.out.println("\nFiles '" + file1Name + "' and '" + file2Name + "' are "
                + (Files.mismatch(file1Path, file2Path) == -1 ? "the" : "NOT the")
                + " same content.\n\n");
    }

    public static void main(String[] args) throws IOException {
        // Method allows us to adjust the indentations of String instances.
        String result = "foo\nbar\nbar2".indent(4);

        System.out.println(result);

        // A little method introduced by JDK-8203442 that feeds the provided function with a particular
        // String instance as input and returns output returned by that function.

        var result1 = "foo".transform(input -> input + " bar");
        System.out.println(result1); // foo bar

        // Mismatch method.
        mismatchMethod(args);
    }
}