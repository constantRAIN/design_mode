package com.example.school.service.factoryMethod.leifengModule;

public class SimpleFactory {
    public static LeiFeng creatLeiFeng(String type){
        LeiFeng result = null;
        switch (type){
            case "大学生" :
                result = new Undergraduate();
                break;
            case "社区志愿者" :
                result = new Volunteer();
                break;
        }
        return result;
    }
}
