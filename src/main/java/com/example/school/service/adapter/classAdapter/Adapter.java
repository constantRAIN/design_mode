package com.example.school.service.adapter.classAdapter;

//真正的适配器，余姚链接usb,连接网线
public class Adapter extends Adaptee implements NetToUsb {

    @Override
    public void handleRequest() {
        super.request();//可以上网了
    }
}