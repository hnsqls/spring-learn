package com.ls.pojo;

import java.util.Map;

public class SMap {
    private Map<Integer,String> names;

    public void setNames(Map<Integer, String> names) {
        this.names = names;
    }

    @Override
    public String toString() {
        return "SMap{" +
                "names=" + names +
                '}';
    }
}
