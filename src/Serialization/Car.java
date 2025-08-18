package Serialization;

import java.io.Serializable;

public class Car implements Serializable {
    public String name;
    public String color;

    public Car(String name , String color){
        this.name=name;
        this.color=color;

    }

}


