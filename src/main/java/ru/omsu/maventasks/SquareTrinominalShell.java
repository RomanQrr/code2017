package ru.omsu.maventasks;

public class SquareTrinominalShell {
    SquareTrinomial trinominal;
    public SquareTrinominalShell(double a, double b, double c){
        trinominal = new SquareTrinomial(a,b,c);
    }
    public double bigRoot() throws SolutionException{
        return trinominal.solve()[0];
    }
}
