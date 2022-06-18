package com.bramesh.linkedLearning;

public class CustomObject {

    private Double customProperty;
    private String customProperty2;

    public CustomObject(Double property, String property2)
    {
        this.customProperty = property;
        this.customProperty2 = property2;
    }

    public Double getCustomProperty()
    {
        return this.customProperty;
    }

    public String getCustomProperty2()
    {
        return this.customProperty2;
    }

}
