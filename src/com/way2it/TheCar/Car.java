package com.way2it.TheCar;

public class Car {
    private int height;
    private String type;
    private int width;

    private Body body;
    private SteeringWheel steering_wheel;
    private Wheel wheel;

    public Car(int height, String type, int width, Body body, SteeringWheel steering_wheel, Wheel wheel) {
        this.height = height;
        this.type = type;
        this.width = width;
        this.body = body;
        this.steering_wheel = steering_wheel;
        this.wheel = wheel;
    }

    public void increaseHeightBy(double multiplier) {
        height *= multiplier;
    }

    public void increaseWidthBy(double multiplier) {
        width *= multiplier;
    }

    @Override
    public String toString() {
        return "Car{" +
                "height=" + height +
                ", type='" + type + '\'' +
                ", width=" + width +
                ", body=" + body +
                ", steeringWheel=" + steering_wheel +
                ", wheel=" + wheel +
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

    public Body getBody() {
        return body;
    }

    public void setBody(Body body) {
        this.body = body;
    }

    public SteeringWheel getSteering_wheel() {
        return steering_wheel;
    }

    public void setSteering_wheel(SteeringWheel steering_wheel) {
        this.steering_wheel = steering_wheel;
    }

    public Wheel getWheel() {
        return wheel;
    }

    public void setWheel(Wheel wheel) {
        this.wheel = wheel;
    }
}

