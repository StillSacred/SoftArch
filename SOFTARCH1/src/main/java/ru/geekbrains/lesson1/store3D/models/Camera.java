package ru.geekbrains.lesson1.store3D.models;

public class Camera {
    private Point3D location;
    private Angle3D angle;

    public void move(Point3D destination) {
        this.location = destination;
    }

    public void rotate(Angle3D angle) {
        this.angle = angle;
    }
}