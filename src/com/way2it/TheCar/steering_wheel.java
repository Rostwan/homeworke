package com.way2it.TheCar;

public class steering_wheel extends Car{
    private String type;
    private int diameter;
    private String sensitivity;

    public steering_wheel(){
        System.out.println("the body type is "+type+" diameter is"+diameter+" and sensitivity is "+sensitivity);
    }

    @Override
    public String toString() {
        return "body{" +
                "type='" + type + '\'' +
                ", diameter=" + diameter +
                ", sensitivity='" + sensitivity + '\'' +
                '}';
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getdiameter() {
        return diameter;
    }

    public void setdiameter(int diameter) {
        this.diameter = diameter;
    }

    public String getSensitivity() {
        return sensitivity;
    }

    public void setSensitivity(String sensitivity) {
        this.sensitivity = sensitivity;
    }
}
