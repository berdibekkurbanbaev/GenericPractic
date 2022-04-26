package com.company;

public class GenericNum <T,V> {
    private T value;
    private V value2;

    public GenericNum(T value, V value2) {
        this.value = value;
        this.value2 = value2;
    }

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }

    public V getValue2() {
        return value2;
    }

    public void setValue2(V value2) {
        this.value2 = value2;
    }

    @Override
    public String toString() {
        return "" +
                " " + value +
                ",  " + value2 ;
    }

    public <Z> int maxMethod(Z[]array){
        int max = 0;
        for (int i = 0; i < array.length; i++) {
            max = Math.max(max,(int)array[i]);
    }
        return max;
    }

}
