package org.example;

public class Sum <T extends IOneRealArgumentFunction> implements Functional<T> {
    //клас кот ростет от интерфейса функции
    public Sum() {
    }
    @Override
    public double calculate(T func) {
        return func.getValue(func.getRight()) + func.getValue(func.getLeft()) +
                func.getValue((func.getRight() + func.getLeft()) / 2);
    }
}

