package com.way2it.TheCar;


class Body  {
    private String type;
    private int size;
    private String sensitivity;

    public Body( String type, int size, String sensitivity) {
        this.type = type;
        this.size = size;
        this.sensitivity = sensitivity;
    }

    public void printing() {
        System.out.println("the  type is " + type + " size is" + size + " and sensitivity is " + sensitivity);
    }

    public void doubleSize() {
        size *= 2;
    }

    public void setTypeToRacing() {
        type = "Race";
    }

    public void setSensitivity() {
        sensitivity = "high";
    }

    @Override
    public String toString() {
        return "body{" +
                "type='" + type + '\'' +
                ", size=" + size +
                ", sensitivity='" + sensitivity + '\'' +
                '}';
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public String getSensitivity() {
        return sensitivity;
    }

    public void setSensitivity(String sensitivity) {
        this.sensitivity = sensitivity;
    }
}
