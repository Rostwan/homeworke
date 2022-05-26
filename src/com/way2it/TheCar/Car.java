package com.way2it.TheCar;

public class Car {
    private int height;
    private String type;
    private int width;
    body body1 = new body();

    steering_wheel steering_wheel1 = new steering_wheel();
    wheel wheel1 = new wheel();


    public void newHeight(){
        height *= 0.2;
    }
    public void newWidth(){
        width *= 0.12;
    }

    @Override
    public String toString() {
        return "Car{" +
                "height=" + height +
                ", type='" + type + '\'' +
                ", width=" + width +
                ", body1=" + body1 +
                ", steering_wheel1=" + steering_wheel1 +
                ", wheel1=" + wheel1 +
                '}';
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public body getBody1() {
        return body1;
    }

    public void setBody1(body body1) {
        this.body1 = body1;
    }

    public steering_wheel getSteering_wheel1() {
        return steering_wheel1;
    }

    public void setSteering_wheel1(steering_wheel steering_wheel1) {
        this.steering_wheel1 = steering_wheel1;
    }

    public wheel getWheel1() {
        return wheel1;
    }

    public void setWheel1(wheel wheel1) {
        this.wheel1 = wheel1;
    }
}
