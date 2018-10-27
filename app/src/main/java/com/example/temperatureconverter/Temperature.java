package com.example.temperatureconverter;

public class Temperature {
    private int temp;

    public Temperature(int temp) {
        this.temp = temp;
    }
    public float CtoF(){
        float f= ((this.temp*9)/5f)+32;
        return f;
    }
    public float Ftoc(){
        float c = ((this.temp-32)*5)/9f;
        return c;
    }
}
