package migration.java12;

public class SwitchExpression {
    public static void main(String[] args) {
        // Switch expression before JDK 12.
        demonstrateTraditionalSwitchStatement(2);

        //Switch expression from jdk 12.

       // getValueViaArrow("b");

        //Switch expression from jdk 13.
       // getValueViaYield("c");
    }

    public static void demonstrateTraditionalSwitchStatement(int choice) {
        System.out.println("Traditional Switch Statement:");
        String numericString;
        switch (choice) {
            case 1:
                numericString = "one";
                break;
            case 2:
                numericString = "two";
                break;
            case 3:
                numericString = "three";
                break;
            default:
                numericString = "N/A";
        }
        System.out.println("\t" + choice + " ==> " + numericString);
    }

    // Java 12, switch expression returning value via label rules (arrow)
//    private static int getValueViaArrow(String mode) {
//        int result = switch (mode) {
//            case "a","b" ->1;
//            case "c" ->2;
//            case "d","e", "f" ->3;
//            default ->-1;
//        } ;
//        return result;
//    }

    // Java 13, switch expression returning value via yield
//    private static int getValueViaYield(String mode) {
//        int result = switch (mode) {
//            case "a","b":
//                yield 1;
//            case "c":
//                yield 2;
//            case "d","e", "f":
//                yield 3;
//            default:
//                yield - 1;
//        } ;
//        return result;
//    }
}