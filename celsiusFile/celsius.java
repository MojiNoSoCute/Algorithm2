package celsiusFile;

    public class celsius {

        public static void main(String arg[]) {
            float fahrenheit = 80.0f;
            float celsius = (5.0f / 9.0f) * (fahrenheit - 32);
            double roundedcelsius = Math.round(celsius * 100.0) / 100.0;
            System.out.println(roundedcelsius);

        }
    }


