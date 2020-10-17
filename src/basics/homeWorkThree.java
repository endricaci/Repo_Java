package basics;

public class homeWorkThree {

    public static void main(String[] args) {

        double celcius = 32;
        double fahrenheit = 73;
        double kelvin = 253;


        double celciusToKelvin = (celcius + 273.15);
        double celciusToFahrenheit = (celcius * 9/5) + 32;
        double kelvinToCelcius = (kelvin - 273.15);
        double kelvinToFahrenheit = (kelvin - 273.15) * 9/5 + 32;

        System.out.println("Celcius to Kelvin:" + " " + celciusToKelvin);
        System.out.println("Celcius to Fahrenheit:" + celciusToFahrenheit);
        System.out.println("Kelvin to Celcius:" + kelvinToCelcius);
        System.out.println("Kelvin to Fahrenheit:" + kelvinToFahrenheit);

    }
}
