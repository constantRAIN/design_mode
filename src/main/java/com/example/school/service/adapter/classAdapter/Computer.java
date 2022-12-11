package com.example.school.service.adapter.classAdapter;

//客户端类：想上网，插不上网线
public class Computer {
    //电脑需要连接上转接器才可以上网
    public void net(NetToUsb adapter){
        //上网的具体实现：找一个转接头
        adapter.handleRequest();
    }

    public static void main(String[] args) {
        //电脑，适配器，网线
        Computer computer = new Computer();//电脑
        Adapter adapter = new Adapter();//转接器
        computer.net(adapter);//电脑直接连接转接器就可以
    }
}