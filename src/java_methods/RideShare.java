package java_methods;

public class RideShare {
    public static void main(String[] args) {
        double distanceInMiles = 12.0;
        int timeOfDay = 22; 
        String weatherCondition = "Rain";

        double baseFare;
        switch (weatherCondition) {
            case "Clear":
                baseFare = 5.00;
                break;
            case "Rain":
                baseFare = 7.50;
                break;
            case "Snow":
                baseFare = 10.00;
                break;
            default:
                baseFare = 5.00;
        }

        baseFare += distanceInMiles * 1.50;

        if ((timeOfDay >= 17 && timeOfDay <= 19) || distanceInMiles > 15) {
            baseFare += 3.00;
        }

        if (timeOfDay >= 0 && timeOfDay <= 5) {
            baseFare -= baseFare * 0.20;
        }

        System.out.println("Final Fare: $" + baseFare);
    }
}
