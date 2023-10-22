package org.example;
public class LineSize implements Filter {
    private int size;
    public LineSize(int n) {
        this.size = n;
    }
    @Override
    public Boolean apply(String str) { // строка имеет размер size
        return str.length() == size;
    }
}
