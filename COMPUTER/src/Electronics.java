public class Electronics {
}

public abstract class Electronics {
    boolean onOrOff = false;

    boolean on();

    boolean off() {
        return false;
    }

    default void electronic() {
        if (onOrOff) {
            System.out.println("Default");

        }
    }
}
