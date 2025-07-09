public class Location {
    private String name;
    private String country;
    private double latitude;
    private double longitude;
    private String dcescription;
    private String city;
    private String address;
    private String postcode;

    public void setName(String aName){
        name=aName;
    }
    public String getName(){
        return name;
    }
    public void setcountry(String acountry){
        country=acountry;
    }
    public String getcountry(){
        return country;
    }
    public void setlatitude(Double alatitude){
        latitude=alatitude;
    }
    public Double getlatitude(){
        return latitude;
    }
    public void setlongitude(Double alongitude){
        longitude=alongitude;
    }
    public Double getlongitude(){
        return longitude;
    }
    public void setdcescription(String adcescription){
        dcescription=adcescription;
    }
    public String getdcescription(){
        return dcescription;
    }
     public void setcity(String acity){
        city=acity;
    }
    public String getcity(){
        return city;
    }
     public void setaddress(String aaddress){
        address=aaddress;
    }
    public String getaddress(){
        return address;
    }
     public void setpostcode(String apostcode){
        postcode=apostcode;
    }
    public String getpostcode(){
        return postcode;
    }
    @Override
    public String toString(){
        return"Location{name:"+name+",Latiaude:"+latitude+",Longitude:"+longitude+",Country:"+country+
        ",City:"+city+"dcescription:"+dcescription+",Adderss:"+address+",Postcode:"+postcode+"}";
    }

    
}
