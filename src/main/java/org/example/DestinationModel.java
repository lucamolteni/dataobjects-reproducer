package org.example;

public class DestinationModel {
    private String someValue;
    private String destinationString;
    private String destinationStringFromMap01;

    public DestinationModel(String someValue) {
        this.someValue = someValue;
    }

    public String getSomeValue() {
        return someValue;
    }

    public void setSomeValue(String someValue) {
        this.someValue = someValue;
    }

    public String getDestinationString() {
        return destinationString;
    }

    public void setDestinationString(String destinationString) {
        this.destinationString = destinationString;
    }

    public String getDestinationStringFromMap01() {
        return destinationStringFromMap01;
    }

    public void setDestinationStringFromMap01(String destinationStringFromMap01) {
        this.destinationStringFromMap01 = destinationStringFromMap01;
    }
}
