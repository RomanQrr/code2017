package ru.omsu.point3d;

public class Vector3D {
    double x;
    double y;
    double z;

    public double getZ() {
        return z;
    }

    public double getY() {
        return y;
    }

    public double getX() {
        return x;
    }
    public Vector3D(){
        x=0;
        y=0;
        z=0;
    }
    public Vector3D(double x, double y, double z){
        this.x=x;
        this.y=y;
        this.z=z;
    }
    public Vector3D(Point3D start, Point3D stop){
        x=stop.getX()-start.getX();
        y=stop.getY()-start.getY();
        z=stop.getZ()-start.getZ();
    }
    public Vector3D(Vector3D vec){
        x=vec.x;
        y=vec.y;
        z=vec.z;
    }
    public double getLength(){
        return Math.sqrt(x*x+y*y+z*z);
    }

    public Vector3D scale(double scalar){
        return  new Vector3D(x*scalar, y*scalar, z * scalar);
    }

    @Override
    public boolean equals(Object obj) {
        if (this==obj){
            return true;
        }
        if (obj == null) {
            return false;
        }
        if(getClass() != obj.getClass()) {
            return false;
        }
        Vector3D o = (Vector3D) obj;
        return x == o.x && y == o.y && z == o.z;
    }
}
