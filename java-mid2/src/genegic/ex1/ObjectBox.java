package genegic.ex1;

import java.io.ObjectInputStream;

public class ObjectBox {
    private Object value;

    public void set(Object object) {
        this.value = object;
    }

    public Object get() {
        return value;
    }
}
