import static java.lang.Integer.parseInt;
import static java.lang.Math.pow;

public class Class_7_3 {

    // Метод для возведения в степень
    public static double power(String xStr, String yStr) {
        try {
            int x = parseInt(xStr);
            int y = parseInt(yStr);
            return pow(x, y);
        } catch (NumberFormatException e) {
            throw new IllegalArgumentException("Ошибка преобразования строк в числа: " + e.getMessage());
        }
    }

    @Override
    public String toString() {
        return "Класс для возведения в степень";
    }
}

//Возведение в степень.
//Создайте метод принимающий две строки, в которых будут записаны числа X и Y. Возвращает
//метод результат возведения X в степень Y. Для преобразования строки в число следует
//использовать метод Integer.parseInt, а для возведения в степень метод Math.pow. Вызовите
//разработанный метод передав туда параметры командной строки полученные точкой входа в
//программу. Реализуйте метод так, что бы для возведения в степень и преобразования строки
//использовались короткие имена статических методов.