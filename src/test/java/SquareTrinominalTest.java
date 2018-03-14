import org.junit.Test;
import ru.omsu.maventasks.SolutionException;
import ru.omsu.maventasks.SquareTrinomial;
import ru.omsu.maventasks.SquareTrinominalShell;

import static org.junit.Assert.assertEquals;

public class SquareTrinominalTest {

    @Test
    public void solutionTest1(){
        SquareTrinomial tester = new SquareTrinomial(1,0,0);
        try {
            double[] solutions = tester.solve();
            assertEquals(solutions[0],0.0,0.00000001);
            assertEquals(solutions[1], 0.0, 0.00000001);
        }
        catch (SolutionException e){

        }

    }
    @Test
    public void solutionTest2(){
        SquareTrinomial tester = new SquareTrinomial(1,-2,0);
        try {
            double[] solutions = tester.solve();
            assertEquals(solutions[0],2.0,0.00000001);
            assertEquals(solutions[1], 0.0, 0.00000001);
        }
        catch (SolutionException e){

        }

    }

    @Test
    public void solutionTest3(){
        SquareTrinominalShell tester = new SquareTrinominalShell(1,0,0);
        try {
            assertEquals(tester.bigRoot(),0.0,0.00000001);
        }
        catch (SolutionException e){

        }

    }
    @Test
    public void solutionTest4(){
        SquareTrinominalShell tester = new SquareTrinominalShell(1,-2,0);
        try {
            assertEquals(tester.bigRoot(),2.0,0.00000001);
        }
        catch (SolutionException e){

        }

    }
}
