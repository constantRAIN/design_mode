package com.example.school.service.easyFactory;

public interface Operation {
    double numberA = 0;
    double numberB = 0;

    public default double GetResult() throws Exception {
        double result = 0 ;
        return result;
    }
}
