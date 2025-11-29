public class Class_5_1 {

    // Метод для сложения числовых значений
    public static double sum(Number... numbers) {
        double result = 0.0;
        for (Number num : numbers) {
            result += num.doubleValue();
        }
        return result;
    }

    // Демонстрационные вычисления
    public static void demonstrateCalculations() {
        System.out.println("2 + 3/5 + 2.3 = " + sum(2, 3.0/5, 2.3));
        System.out.println("3.6 + 49/12 + 3 + 3/2 = " + sum(3.6, 49.0/12, 3, 3.0/2));
        System.out.println("1/3 + 1 = " + sum(1.0/3, 1));
    }

    @Override
    public String toString() {
        return "Класс для сложения числовых значений";
    }
}

//Сложение.
//Разработайте метод, который принимает набор числовых значенийи возвращает их сумму в
//вещественной форме. С использованием данного метода выполните следующие сложения:
// • 2 + 3/5 +2.3
// • 3.6 + 49/12 +3 + 3/2
// • 1/3+ 1