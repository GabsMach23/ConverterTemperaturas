package convertertemperaturas;


public class Temperatura {
    private double tempFahrenheit;

    public Temperatura(double tempFahrenheit) {
        this.tempFahrenheit = tempFahrenheit;
    }

    public void setTempFahrenheit(double tempFahrenheit1) {
        tempFahrenheit = tempFahrenheit1;
    }

    public double getTempFahrenheit() {
        return tempFahrenheit;
    }


    public double converterParaKelvin() {
        //return (tempFahrenheit - 32) * (5 / 9) + 273;
        return (tempFahrenheit + 459.67) * (5 / 9.0);
    }

    public double converterParaCelsius() {
        //return (tempFahrenheit - 32) * (5 / 9);
        return (tempFahrenheit - 32) / (1.8);
    }

}
