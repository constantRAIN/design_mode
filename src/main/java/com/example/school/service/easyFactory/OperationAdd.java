package com.example.school.service.easyFactory;

public class OperationAdd implements Operation {
    public double GetResult(){
        double result = 0;
        result = numberA + numberB;
        return result;
    }
}
