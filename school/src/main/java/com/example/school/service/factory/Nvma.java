package com.example.school.service.factory;

public class Nvma {

    public static Person getPerson(String personType) throws Exception {
        if (personType.equals("M")){
            return new Man();
        }else if (personType.equals("W")){
            return new Women();
        }else {
            throw new Exception("异常了");
        }
    }
}
