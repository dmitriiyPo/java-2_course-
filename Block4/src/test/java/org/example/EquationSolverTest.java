package org.example;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

class EquationSolverTest
{
    @Test
    void sortingRoots()
    {
        EquationSolver a = new EquationSolver(new SquareTrinomial(1, -4, 4));
        EquationSolver b = new EquationSolver(new SquareTrinomial(1, -6, 5));
        EquationSolver c = new EquationSolver(new SquareTrinomial(0, -6, 3));
        assertEquals(2, a.SortingRoots());
        assertEquals(5, b.SortingRoots());
        assertEquals( 0.5, c.SortingRoots());
    }
}