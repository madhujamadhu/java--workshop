package com.java.workshop.temdata.basic.bean;
public class Zone {
     private String name;
    private int zoneid;
    private String type;
    private String area;
    public void Name(String aName){
        name=aName;
    }
    public String getName(){
        return name;
    }
    public void Zoneid(int aZoneid){
        zoneid=aZoneid;
    }
    public int getZoneid(){
        return zoneid;
    }
    public void type(String atype){
        type=atype;
    }
    public String gettype(){
        return type;
    }
    public void setarea(String aarea){
        area=aarea;
    }
    public String area(){
        return area;
    }
    
}
