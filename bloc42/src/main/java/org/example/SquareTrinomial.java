package org.example;

public class SquareTrinomial //1.1 квадртный трехчлен
{
    private double a;
    private double b;
    private double c;
    public SquareTrinomial(double a, double b, double c)
    {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    public double[] Solution()
    {
        if (a == 0)
        {
            if (b == 0)
            {
                if (c == 0)
                {
                    throw new IllegalArgumentException("Корень любой");
                }
                throw new IllegalArgumentException("Нет  корней");
            }
            return new double[] { -c / b };
        }
        double D = b * b - 4 * a * c;
        if (D < 0) {
            throw new IllegalArgumentException("Нет действительных корней");
        }
        if (D == 0) {
            return new double[] { -b / (a * 2.) };
        }
        return new double[] { (-b - Math.sqrt(D))/ (a * 2.), (-b + Math.sqrt(D))/ (a * 2.) };
    }
    public double getA() {
        return a;
    }
    public double getB() {
        return b;
    }
    public double getC() {
        return c;
    }
}
