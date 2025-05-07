public class Fahrenheit extends Temperatura {
    //CONSTRUTOR
    public Fahrenheit(double grausTemp) {
        super(grausTemp);
    }
    //CONVERTER PARA CELCIUS
    public double paraCelsius(){
        return (getGraus ()-32)*5/9;
    }
    
    //CONVERTER PARA KELVIN
    public double paraKelvin(){
        return (getGraus () -32) *9/5 + 273.15;
    }
}