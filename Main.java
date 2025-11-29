import java.util.Scanner;
import java.util.InputMismatchException;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("ДЕМОНСТРАЦИЯ ЗАДАНИЙ");

        Class_2_1(scanner);
        System.out.println();
        Class_3_5(scanner);
        System.out.println();
        Class_4_5(scanner);
        System.out.println();
        Class_5_1(scanner);
        System.out.println();
        Class_7_3(scanner, args);

        scanner.close();
    }

    // Функция для демонстрации Class_2_1 (Задание 2.1 - Неизменяемый массив)
    public static void Class_2_1(Scanner scanner) {
        System.out.println("\nЗАДАНИЕ 2.1: НЕИЗМЕНЯЕМЫЙ МАССИВ");

        // 1. Создание списка через массив
        int[] array1 = {1, 2, 3, 4, 5};
        Class_2_1 list1 = new Class_2_1(array1);
        System.out.println("Список 1 (через массив): " + list1);

        // 2. Создание списка через перечень чисел (используем статический метод of)
        Class_2_1 list2 = Class_2_1.of(10, 20, 30, 40, 50);
        System.out.println("Список 2 (через перечень чисел): " + list2);

        // 3. Создание списка через копирование другого списка
        Class_2_1 list3 = new Class_2_1(list1);
        System.out.println("Список 3 (копия списка 1): " + list3);


        // 4. Демонстрация методов
        System.out.println("\nДемонстрация методов списка 1:");
        System.out.println("Размер: " + list1.size());
        System.out.println("Пустой ли: " + list1.isEmpty());
        System.out.println("Элемент на позиции 2: " + list1.getValue(2));

        // 5. Замена элемента
        list1.setValue(2, 100);
        System.out.println("После замены элемента на позиции 2: " + list1);

        // 6. Ввод списка с клавиатуры и демонстрация ВСЕХ возможностей
        System.out.println("\n=== СОЗДАНИЕ И РАБОТА С ВВОДИМЫМ МАССИВОМ ===");
        Class_2_1 userList = inputClass_2_1(scanner);
        demonstrateAllFeatures(userList, scanner);
    }

    // Функция для демонстрации ВСЕХ возможностей вводимого массива
    public static void demonstrateAllFeatures(Class_2_1 userList, Scanner scanner) {

        // 1. Основная информация о списке
        System.out.println("1. ОСНОВНАЯ ИНФОРМАЦИЯ:");
        System.out.println("Ваш список: " + userList);
        System.out.println("Размер списка: " + userList.size());
        System.out.println("Пустой ли список: " + userList.isEmpty());

        if (userList.isEmpty()) {
            System.out.println("Список пуст. Дальнейшие операции невозможны.");
            return;
        }

        // 2. Демонстрация получения элементов
        System.out.println("\n2. ПОЛУЧЕНИЕ ЭЛЕМЕНТОВ:");
        for (int i = 0; i < userList.size(); i++) {
            try {
                System.out.println("Элемент на позиции " + i + ": " + userList.getValue(i));
            } catch (IndexOutOfBoundsException e) {
                System.out.println("Ошибка при получении элемента " + i + ": " + e.getMessage());
            }
        }

        // 3. Демонстрация замены элементов
        System.out.println("\n3. ЗАМЕНА ЭЛЕМЕНТОВ:");
        boolean wantToReplace = askYesNo(scanner, "Хотите заменить какой-либо элемент? (да/нет): ");
        if (wantToReplace) {
            int position = inputIntInRange(scanner, "Введите позицию для замены (0-" + (userList.size()-1) + "): ", 0, userList.size()-1);
            int newValue = inputInt(scanner, "Введите новое значение: ");

            try {
                userList.setValue(position, newValue);
                System.out.println("Элемент успешно заменен!");
                System.out.println("Обновленный список: " + userList);
            } catch (IndexOutOfBoundsException e) {
                System.out.println("Ошибка при замене: " + e.getMessage());
            }
        }

        // 4. Демонстрация преобразования в массив
        System.out.println("\n4. ПРЕОБРАЗОВАНИЕ В СТАНДАРТНЫЙ МАССИВ:");
        int[] standardArray = userList.toArray();
        System.out.println("Стандартный массив: " + java.util.Arrays.toString(standardArray));

        // 5. Демонстрация создания копии списка
        System.out.println("\n5. СОЗДАНИЕ КОПИИ СПИСКА:");
        Class_2_1 copiedList = new Class_2_1(userList);
        System.out.println("Копия вашего списка: " + copiedList);

    }

    // Функция для демонстрации Class_3_5 (Задание 3.5 - Трехмерная точка)
    public static void Class_3_5(Scanner scanner) {
        System.out.println("\nЗАДАНИЕ 3.5: ТРЕХМЕРНАЯ ТОЧКА");

        // 1. Создание трех точек с разными координатами
        Class_3_5 point1 = new Class_3_5(1, 2, 3);
        Class_3_5 point2 = new Class_3_5(4, 5, 6);
        Class_3_5 point3 = new Class_3_5(7, 8, 9);

        System.out.println("Точка 1: " + point1);
        System.out.println("Точка 2: " + point2);
        System.out.println("Точка 3: " + point3);


        // 2. Ввод точки с клавиатуры
        System.out.println("\nСоздание точки с вводом координат:");
        Class_3_5 userPoint = inputClass_3_5(scanner);
        System.out.println("Ваша точка: " + userPoint);
    }

    // Функция для демонстрации Class_4_5 (Задание 4.5 - Точки с характеристиками)
    public static void Class_4_5(Scanner scanner) {
        System.out.println("\nЗАДАНИЕ 4.5: ТОЧКИ С ХАРАКТЕРИСТИКАМИ");

        // 1. Точка в координате 3, красного цвета
        Class_4_5 point1 = new Class_4_5(3, "красного");
        System.out.println("Точка 1: " + point1);

        // 2. Точка в координате {4,2,5} в 11:00
        Class_4_5 point2 = new Class_4_5(4, 2, 5, "11:00");
        System.out.println("Точка 2: " + point2);

        // 3. Точка в координате {7,7} в 15:35, желтого цвета
        Class_4_5 point3 = new Class_4_5(7, 7, "желтого", "15:35");
        System.out.println("Точка 3: " + point3);

        // 4. Точка только с координатой X
        Class_4_5 point4 = new Class_4_5(10);
        System.out.println("Точка 4: " + point4);

        // 5. Точка с тремя координатами, цветом и временем
        Class_4_5 point5 = new Class_4_5(1, 2, 3, "синего", "12:30");
        System.out.println("Точка 5: " + point5);

        // 6. Ввод точки с характеристиками с клавиатуры
        System.out.println("\nСоздание точки с вводом характеристик:");
        Class_4_5 userPoint = inputClass_4_5(scanner);
        System.out.println("Ваша точка: " + userPoint);
    }

    // Функция для демонстрации Class_5_1 (Задание 5.1 - Сложение)
    public static void Class_5_1(Scanner scanner) {
        System.out.println("\nЗАДАНИЕ 5.1: СЛОЖЕНИЕ");

        // 1. Демонстрационные вычисления
        System.out.println("Демонстрационные вычисления:");
        System.out.println("2 + 3/5 + 2.3 = " + Class_5_1.sum(2, 3.0/5, 2.3));
        System.out.println("3.6 + 49/12 + 3 + 3/2 = " + Class_5_1.sum(3.6, 49.0/12, 3, 3.0/2));
        System.out.println("1/3 + 1 = " + Class_5_1.sum(1.0/3, 1));

        // 2. Интерактивное сложение
        System.out.println("\nИнтерактивное сложение:");
        double userSum = inputClass_5_1(scanner);
        System.out.println("Результат сложения: " + userSum);
    }

    // Функция для демонстрации Class_7_3 (Задание 7.3 - Возведение в степень)
    public static void Class_7_3(Scanner scanner, String[] args) {
        System.out.println("\nЗАДАНИЕ 7.3: ВОЗВЕДЕНИЕ В СТЕПЕНЬ");

        // 1. Возведение в степень
        System.out.println("\nВозведение в степень:");
        double userPower = inputClass_7_3(scanner);
        System.out.println("Результат возведения в степень: " + userPower);
    }

    // ФУНКЦИИ ВВОДА С ПРОВЕРКАМИ

    // Функция ввода для Class_2_1
    public static Class_2_1 inputClass_2_1(Scanner scanner) {
        int size = inputInt(scanner, "Введите размер массива: ");

        if (size <= 0) {
            System.out.println("Создан пустой список.");
            return new Class_2_1(new int[0]);
        }

        int[] array = new int[size];
        System.out.println("Введите " + size + " элементов массива:");
        for (int i = 0; i < size; i++) {
            array[i] = inputInt(scanner, "Элемент " + i + ": ");
        }

        return new Class_2_1(array);
    }

    private static boolean askYesNo(Scanner scanner, String prompt) {
        System.out.print(prompt);
        scanner.nextLine(); // очистка буфера
        String answer = scanner.nextLine().trim().toLowerCase();
        return answer.equals("да") || answer.equals("д") || answer.equals("yes") || answer.equals("y");
    }
    // Функция ввода для Class_3_5
    public static Class_3_5 inputClass_3_5(Scanner scanner) {
        System.out.println("Введите координаты трехмерной точки:");
        int x = inputInt(scanner, "X: ");
        int y = inputInt(scanner, "Y: ");
        int z = inputInt(scanner, "Z: ");

        return new Class_3_5(x, y, z);
    }

    // Функция ввода для Class_4_5
    public static Class_4_5 inputClass_4_5(Scanner scanner) {
        System.out.println("Выберите тип точки:");
        System.out.println("1 - Только координата X");
        System.out.println("2 - Координата X и цвет");
        System.out.println("3 - Две координаты и время");
        System.out.println("4 - Три координаты и время");
        System.out.println("5 - Все характеристики (три координаты, цвет, время)");

        int choice = inputIntInRange(scanner, "Ваш выбор (1-5): ", 1, 5);

        switch (choice) {
            case 1:
                int x1 = inputInt(scanner, "Введите координату X: ");
                return new Class_4_5(x1);

            case 2:
                int x2 = inputInt(scanner, "Введите координату X: ");
                scanner.nextLine(); // очистка буфера
                System.out.print("Введите цвет: ");
                String color = scanner.nextLine();
                return new Class_4_5(x2, color);

            case 3:
                int x3 = inputInt(scanner, "Введите координату X: ");
                int y3 = inputInt(scanner, "Введите координату Y: ");
                scanner.nextLine(); // очистка буфера
                System.out.print("Введите время: ");
                String time3 = scanner.nextLine();
                return new Class_4_5(x3, y3, time3);

            case 4:
                int x4 = inputInt(scanner, "Введите координату X: ");
                int y4 = inputInt(scanner, "Введите координату Y: ");
                int z4 = inputInt(scanner, "Введите координату Z: ");
                scanner.nextLine(); // очистка буфера
                System.out.print("Введите время: ");
                String time4 = scanner.nextLine();
                return new Class_4_5(x4, y4, z4, time4);

            case 5:
                int x5 = inputInt(scanner, "Введите координату X: ");
                int y5 = inputInt(scanner, "Введите координату Y: ");
                int z5 = inputInt(scanner, "Введите координату Z: ");
                scanner.nextLine(); // очистка буфера
                System.out.print("Введите цвет: ");
                String color5 = scanner.nextLine();
                System.out.print("Введите время: ");
                String time5 = scanner.nextLine();
                return new Class_4_5(x5, y5, z5, color5, time5);

            default:
                return new Class_4_5(0);
        }
    }

    // Функция ввода для Class_5_1
    public static double inputClass_5_1(Scanner scanner) {
        int count = inputInt(scanner, "Введите количество чисел для сложения: ");

        Number[] numbers = new Number[count];
        for (int i = 0; i < count; i++) {
            System.out.print("Введите число " + (i+1) + " (можно дробное): ");
            numbers[i] = inputDouble(scanner);
        }

        return Class_5_1.sum(numbers);
    }

    // Функция ввода для Class_7_3
    public static double inputClass_7_3(Scanner scanner) {
        scanner.nextLine(); // очистка буфера
        System.out.print("Введите основание (X): ");
        String xStr = scanner.nextLine();

        System.out.print("Введите степень (Y): ");
        String yStr = scanner.nextLine();

        return Class_7_3.power(xStr, yStr);
    }

    // Универсальная функция для ввода double с проверкой
    public static double inputDouble(Scanner scanner) {
        while (true) {
            try {
                return scanner.nextDouble();
            } catch (InputMismatchException e) {
                System.out.print("Ошибка! Введите числовое значение: ");
                scanner.nextLine(); // очистка буфера
            }
        }
    }

    public static double inputDouble(Scanner scanner, String prompt) {
        System.out.print(prompt);
        return inputDouble(scanner);
    }

    // Универсальная функция для ввода int с проверкой
    public static int inputInt(Scanner scanner, String prompt) {
        System.out.print(prompt);
        while (true) {
            try {
                return scanner.nextInt();
            } catch (InputMismatchException e) {
                System.out.print("Ошибка! Введите целое число: ");
                scanner.nextLine(); // очистка буфера
            }
        }
    }

    // Функция для ввода int в диапазоне
    public static int inputIntInRange(Scanner scanner, String prompt, int min, int max) {
        while (true) {
            int value = inputInt(scanner, prompt);
            if (value >= min && value <= max) {
                return value;
            }
            System.out.print("Ошибка! Введите число от " + min + " до " + max + ": ");
        }
    }
}