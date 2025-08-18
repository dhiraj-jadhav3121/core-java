package Encapsulation;

public class SingleTonClassObject {

    private static SingleTonClassObject OBJECT = null;

    private SingleTonClassObject() {

    }

    public SingleTonClassObject getInstance() {

        if (OBJECT == null) {
            OBJECT = new SingleTonClassObject();
        }

        return OBJECT;
    }

}
