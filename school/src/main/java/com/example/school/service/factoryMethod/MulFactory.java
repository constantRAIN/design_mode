package com.example.school.service.factoryMethod;

import com.example.school.service.easyFactory.Operation;
import com.example.school.service.easyFactory.OperationMul;

public class MulFactory implements IFactory{
    public Operation creatOperation(){
        return new OperationMul();
    }
}
