public class Temperatura {
  //Atributos privados para aemazenar Temp - Celcius
    private double tempCelcius;
    
    //construtor - criar o objeto com uma Temp inicial
    public Temperatura(double tempInicialCelcius){
        this.tempCelcius = tempInicialCelcius;
     }
        
        //getter - para ler a temperatura
    public double getTemperaturaCelcius(){
    return tempCelcius;
    }
    
    //setter - para mudar a temperatura
    public void setTemperaturaCelcius(double mudarTempCelcius){
    this.tempCelcius = mudarTempCelcius;
    }
    
    //método para converte celcius para fahrenheit
    public double converteParaFahrenheit(){
    return (tempCelcius*9/5)+32;
    }
    
    //método para converter Celcius para Kelvin
    public double converterParaKelvin(){
    return tempCelcius+273.15;
    }
}                                                                                                                                                                                                                                     