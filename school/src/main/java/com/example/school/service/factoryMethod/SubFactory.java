package com.example.school.service.factoryMethod;

import com.example.school.service.easyFactory.Operation;
import com.example.school.service.easyFactory.OperationSub;

public class SubFactory implements IFactory{
    public Operation creatOperation(){
        return new OperationSub();
    }
}
