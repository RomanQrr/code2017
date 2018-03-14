package ru.omsu.point3d;

public class Vector3DArray {
    Vector3D[] array;
    public Vector3DArray(int size){
        array = new Vector3D[size];
        for(int i=0; i<size; i++){
            array[i] = new Vector3D();
        }
    }
    public int length(){
        return array.length;
    }
    public void setVector(int index, Vector3D vec){
        array[index] = new Vector3D(vec);
    }
    public double maxVectorLength(){
        double max = 0;
        for(int i=0; i<array.length;i++){
            double current = array[i].getLength();
            if(current>max){
                max = current;
            }
        }
        return max;
    }
    public int findVector(Vector3D vec){
        for(int i = 0; i<array.length;i++){
            if (array[i].equals(vec)){
                return i;
            }
        }
        return -1;
    }
    public Vector3D arraySum(){
        Vector3D sum = new Vector3D();
        for(Vector3D vec:array){
           sum = Vector3DProcessor.vectorSumm(sum, vec);
        }
        return sum;
    }
    public Vector3D arrayWeightedSum(double[] weightArr) throws ArraysOfDifferentSizeException {
            if (weightArr.length != array.length) {
                throw new ArraysOfDifferentSizeException();
            }

        Vector3D sum = new Vector3D();
        for(int i = 0; i<array.length; i++){
            sum = Vector3DProcessor.vectorSumm(array[i].scale(weightArr[i]), sum);
        }
        return sum;
    }
    public Point3D[] movePoints(Point3D point){
        Point3D[] out = new Point3D[array.length];
        for(int i=0;i<array.length;i++){
            out[i]= point.movePoint(array[i]);
        }
        return out;
    }
}
