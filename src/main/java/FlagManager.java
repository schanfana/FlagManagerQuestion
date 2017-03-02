import sun.reflect.generics.reflectiveObjects.NotImplementedException;

public class FlagManager {
    private boolean a;
    private boolean b;
    private boolean c;
    private boolean d;

    public FlagManager(boolean a, boolean b, boolean c, boolean d) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
    }

    public boolean areAllFlagsOff() {
        return !(this.a || this.b || this.c || this.d);
    }

}
