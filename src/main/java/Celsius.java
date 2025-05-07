public class Celsius  extends Temperatura{
      
    public Celsius(double graus){
        super(graus);
    }
    
    //CONVERTER PARA KELVIN
    public double paraKelvin(){
        return getGraus ()+273.15;
    }
    
    //CONVERTER PARA FAHRENHEIT
    public double paraFahrenheit(){
        return (getGraus () *9/5)+32;
    }
}
