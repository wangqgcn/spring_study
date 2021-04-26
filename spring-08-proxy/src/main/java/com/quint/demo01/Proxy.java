package com.quint.demo01;

public class Proxy implements Rent{

    private Host host;

    public Proxy() {
    }

    public Proxy(Host host) {
        this.host = host;
    }

    @Override
    public void rent() {
        seeHouse();
        host.rent();
        contrast();
        free();
    }

    public void seeHouse(){
        System.out.println("中介带你看房");
    }

    public void free(){
        System.out.println("收中介费");
    }

    public void contrast(){
        System.out.println("签署租赁合同");
    }
}
