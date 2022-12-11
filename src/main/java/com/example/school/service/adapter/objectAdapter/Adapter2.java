package com.example.school.service.adapter.objectAdapter;

import com.example.school.service.adapter.classAdapter.Adaptee;
import com.example.school.service.adapter.classAdapter.NetToUsb;

public class Adapter2 implements NetToUsb {
    private Adaptee adaptee;
    public Adapter2(Adaptee adaptee){
        this.adaptee = adaptee;
    }
    @Override
    public void handleRequest() {
     adaptee.request();;//可以上网了
    }
}