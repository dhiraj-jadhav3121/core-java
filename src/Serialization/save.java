package Serialization;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class save {
    public static void main(String[] args) throws Exception {

        FileOutputStream fe = new FileOutputStream("C:\\Users\\jadha\\Downloads\\car.ser.txt");
        ObjectOutputStream os = new ObjectOutputStream(fe);

        Car c = new Car("suzuki","red");
        os.writeObject(c);
        System.out.println("Object serialized...");


    }
}
