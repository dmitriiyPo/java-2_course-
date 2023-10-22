package org.example;
public class FirstAndLastChar implements Filter {
    private final char first;
    private final char last;
    public FirstAndLastChar(char a, char z) {
        this.first = a;
        this.last = z;
    }
    @Override
    public Boolean apply(String str) // строка начинается с first и заканчивается last
    {
        return (str.charAt(0) == first) && (str.charAt(str.length() - 1) == last);
    }

    public char getLast() {
        return last;
    }

    public char getFirst() {
        return first;
    }
}
