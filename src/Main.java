public class Main {
    public static void main(String[] args) {
        BmiService bmiService = new BmiService();

        System.out.println("1. Индекс массы тела: " + bmiService.calculate(98.0, 1.87));
        System.out.println("2. Индекс массы тела: " + bmiService.calculate(58, 1.53));
        System.out.println("3. Индекс массы тела: " + bmiService.calculate(100, 2.0));
    }
}