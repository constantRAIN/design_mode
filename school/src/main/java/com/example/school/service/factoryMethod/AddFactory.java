package com.example.school.service.factoryMethod;

import com.example.school.service.easyFactory.Operation;
import com.example.school.service.easyFactory.OperationAdd;

public class AddFactory implements IFactory{
    @Override
    public Operation creatOperation() {
        return new OperationAdd();
    }
}
