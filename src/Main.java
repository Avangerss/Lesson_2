public class Main {
    public static void main(String[] args) {
        System.out.println(getAgeAndTemperature(-11,46));
        System.out.println(getAgeAndTemperature(-10,45));
        System.out.println(getAgeAndTemperature(-5,20));
        System.out.println(getAgeAndTemperature(-15,46));
        System.out.println(getAgeAndTemperature(-13,49));
    }

    public static String getAgeAndTemperature(int age, int temperature) {
        if (age >= 20 && age <= 40 && temperature >= -20 && temperature <= 30) {
            return "Можно идти гулять";
        } else if (age <= 20 && temperature >= 0 && temperature <= 28) {
            return "Можно идти гулять";
        } else if (age >= 40 && temperature >= -10 && temperature <= 25) {
            return "Можно идти гулять";
        } else {
            return "Оставайтесь дома";
        }
    }
}