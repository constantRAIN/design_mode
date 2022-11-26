package com.example.school.service.factory;

public class OperationDiv extends Operation{
    public double GetResult() throws Exception {
        double result = 0;
        if (numberB == 0) throw new Exception("除数不能为0");
        result = numberA/numberB;
        return result;
    }
}
