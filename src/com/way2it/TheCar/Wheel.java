package com.way2it.TheCar;

public class Wheel {
    private String type;
    private String sensitivity;
    private int size;

    public Wheel(String type, String sensitivity, int size) {
        this.type = type;
        this.sensitivity = sensitivity;
        this.size = size;
    }

    @Override
    public String toString() {
        return "wheel{" +
                "type='" + type + '\'' +
                ", sensitivity='" + sensitivity + '\'' +
                ", size=" + size +
                '}';
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getSensitivity() {
        return sensitivity;
    }

    public void setSensitivity(String sensitivity) {
        this.sensitivity = sensitivity;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }
}
