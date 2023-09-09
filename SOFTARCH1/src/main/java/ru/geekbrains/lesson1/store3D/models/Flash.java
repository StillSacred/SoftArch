package ru.geekbrains.lesson1.store3D.models;

import java.awt.*;

public class Flash {
    private Point3D location;
    private Angle3D angle;
    private Color color;
    private float power;
     public void rotate(Angle3D angle) {
         this.angle = angle;
     }

     public void move(Point3D destination) {
         this.location = destination;
     }

    public void setColor(Color color) {
        this.color = color;
    }

    public void setPower(float power) {
        this.power = power;
    }
}