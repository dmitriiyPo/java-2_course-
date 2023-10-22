package org.example;
public class BeginStringFilter implements Filter
{
    private final String pattern;
    public BeginStringFilter(String str) {
        this.pattern = str;
    }
    @Override
    public Boolean apply(String str) { // начинается ли строка с pattern
        return str.startsWith(pattern);
    }

    public String getPattern() {
        return pattern;
    }
}
