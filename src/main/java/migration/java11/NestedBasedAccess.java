package migration.java11;

import java.lang.reflect.Field;

/*
    In previous versions of Java the the lack of JVM support for private access within a nest,
     also denies reflective access.
 */
public class NestedBasedAccess {
    private static int x = 5;

    public static class NestedTest {
        public static void doSomething() throws Exception {
            Field x = NestedBasedAccess.class.getDeclaredField("x");
            //x.setAccessible(true);
            x.setInt(null, 10);
        }
    }

    public static void main(String[] args) throws Exception {
        NestedTest.doSomething();
        System.out.println(NestedBasedAccess.x);
    }
}
