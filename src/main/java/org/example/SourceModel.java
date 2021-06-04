package org.example;

import java.util.Map;

public class SourceModel {

    private String sourceString;
    private Map sourceMap;

    public SourceModel(String sourceString, Map sourceMap) {
        this.sourceString = sourceString;
        this.sourceMap = sourceMap;
    }

    public String getSourceString() {
        return sourceString;
    }

    public void setSourceString(String sourceString) {
        this.sourceString = sourceString;
    }

    public Map getSourceMap() {
        return sourceMap;
    }

    public void setSourceMap(Map sourceMap) {
        this.sourceMap = sourceMap;
    }
}
