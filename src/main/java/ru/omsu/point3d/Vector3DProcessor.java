package ru.omsu.point3d;

public class Vector3DProcessor {
    public static Vector3D vectorSumm(Vector3D vec1, Vector3D vec2){
        return new Vector3D(vec1.getX()+vec2.getX(), vec1.getY()+vec2.getY(), vec1.getZ()+vec2.getZ());
    }
    public static Vector3D vectorDiffirence(Vector3D vec, Vector3D vecMinus){
        return new Vector3D(vec.getX()-vecMinus.getX(), vec.getY()-vecMinus.getY() , vec.getZ()-vecMinus.getZ());
    }
    public static double scalar(Vector3D vec1, Vector3D vec2){
        return vec1.getX()*vec2.getX()+vec1.getY()*vec2.getY()+vec1.getZ()*vec2.getZ();
    }
    public static Vector3D crossProduct(Vector3D vec1, Vector3D vec2){
        return new Vector3D( vec1.getY()*vec2.getZ()-vec1.getZ()*vec2.getY() , -vec1.getX()*vec2.getZ()+vec1.getZ()*vec2.getX() , vec1.getX()*vec2.getY()-vec1.getY()*vec2.getX());
    }
    public static boolean colinear(Vector3D vec1, Vector3D vec2){
        return 0.00001d > Vector3DProcessor.crossProduct(vec1,vec2).getLength();
    }
}
