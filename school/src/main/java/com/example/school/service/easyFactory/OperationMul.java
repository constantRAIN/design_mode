package com.example.school.service.easyFactory;

public class OperationMul implements Operation{
    public double GetResult(){
        double result = 0;
        result = numberA * numberB;
        return result;
    }
}
