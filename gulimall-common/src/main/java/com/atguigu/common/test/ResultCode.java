package com.atguigu.common.test;



public enum ResultCode{
    SUCCESS(20000,"success"),
    ERROR(20001,"error");

    private int index;
    private String name;
    ResultCode( int index,String name) {
        this.index = index;
        this.name = name;
    }
    public String getName() {
        return name;
    }
    public int getIndex() {
        return index;
    }
}
