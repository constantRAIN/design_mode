package com.example.school.service.easyFactory;

public class OperationSub implements Operation{
    public double GetResult(){
        double result = 0;
        result = numberA - numberB;
        return result;
    }
}
