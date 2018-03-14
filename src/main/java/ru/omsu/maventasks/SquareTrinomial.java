package ru.omsu.maventasks;

public class SquareTrinomial {
    double a, b, c;
    public SquareTrinomial(double a, double b, double c){
        this.a=a;
        this.b=b;
        this.c=c;
    }
    public double[] solve() throws SolutionException {
        double[] solutions = new double[2];
        if(a==0) throw new SolutionException();
        double d = b*b-4*a*c;
        if (d<0) throw new SolutionException();
        solutions[0] = (-b + Math.sqrt(d))/(2*a);
        solutions[1] = (-b - Math.sqrt(d))/(2*a);
        return solutions;
    }
}
