public class Temperaturesensor {
    private float temperature;
    public Temperaturesensor(float aTemperature){
        temperature=aTemperature;
    }
    @Override
    public float getReading(){
        return temperature;
    }
    
}
