package ru.omsu.point3d;

public class Point3D {
    double x;
    double y;
    double z;

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public double getZ() {
        return z;
    }

    public void setX(double x) {
        this.x = x;
    }

    public void setY(double y) {
        this.y = y;
    }

    public void setZ(double z) {
        this.z = z;
    }
    public Point3D(){
        x=0;
        y=0;
        z=0;
    }
    public Point3D(double x, double y, double z){
        this.x=x;
        this.y=y;
        this.z=z;
    }

    public Point3D movePoint(Vector3D vec){
        return new Point3D(x+vec.getX(),y+vec.getY(),z+vec.getZ());
    }

    @Override
    public String toString() {
        return "Point ("+x+";"+y+";"+z+")";
    }

}
