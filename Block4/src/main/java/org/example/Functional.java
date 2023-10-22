package org.example;

public interface Functional <T extends IOneRealArgumentFunction>

{
    double calculate(T func); // функционал
}
