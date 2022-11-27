package com.example.school.service.factoryMethod;

import com.example.school.service.easyFactory.Operation;
import com.example.school.service.easyFactory.OperationDiv;

public class DivFactory implements IFactory{
    public Operation creatOperation(){
        return new OperationDiv();
    }
}
