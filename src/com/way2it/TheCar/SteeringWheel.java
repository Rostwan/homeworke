package com.way2it.TheCar;

public class SteeringWheel {
    private String type;
    private int diameter;
    private String sensitivity;

    public SteeringWheel(String type, int diameter, String sensitivity) {
        this.type = type;
        this.diameter = diameter;
        this.sensitivity = sensitivity;
    }

    @Override
    public String toString() {
        return "SteeringWheel{" +
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

    public int getDiameter() {
        return diameter;
    }

    public void setDiameter(int diameter) {
        this.diameter = diameter;
    }

    public String getSensitivity() {
        return sensitivity;
    }

    public void setSensitivity(String sensitivity) {
        this.sensitivity = sensitivity;
    }
}
