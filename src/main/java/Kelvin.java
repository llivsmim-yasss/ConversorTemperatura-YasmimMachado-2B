public class Kelvin extends Temperatura{
    //CONSTRUTOR
    public Kelvin(double grausTemp) {
        super(grausTemp);
    }
    
     //CONVERTER PARA CELSIUS
    public double paraCelsius(){
        return getGraus ()-273.15;
    }
    
    //CONVERTER PARA FAHRENHEIT
    public double paraFahrenheit(){
        return ((getGraus ()-273.15)*9/5)+32;
    }
}