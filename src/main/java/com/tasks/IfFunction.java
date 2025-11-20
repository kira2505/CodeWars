package tasks;

public class IfFunction {

    public static void _if(Boolean bool, Runnable func1, Runnable func2) {
        if (bool == null) {
            func2.run();
        }
        if (Boolean.TRUE.equals(bool) && func1 != null) {
            func1.run();
        } else if (func2 != null) {
            func2.run();
        }
    }
}
