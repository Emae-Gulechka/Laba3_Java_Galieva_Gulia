import java.util.Arrays;

public class Class_2_1 {
    private int[] values;

    // Конструктор с массивом целых чисел
    public Class_2_1(int[] array) {
        if (array == null) {
            this.values = new int[0];
        } else {
            this.values = Arrays.copyOf(array, array.length);
        }
    }

    // Конструктор с другим списком (копирование значений)
    public Class_2_1(Class_2_1 other) {
        if (other == null) {
            this.values = new int[0];
        } else {
            this.values = Arrays.copyOf(other.values, other.values.length);
        }
    }

    // Статический метод для создания списка из перечня чисел
    public static Class_2_1 of(int... numbers) {
        Class_2_1 list = new Class_2_1();
        list.values = Arrays.copyOf(numbers, numbers.length);
        return list;
    }

    // Приватный конструктор для статического метода of
    private Class_2_1() {
        this.values = new int[0];
    }

    // Получение значения из позиции N
    public int getValue(int position) {
        if (position < 0 || position >= values.length) {
            throw new IndexOutOfBoundsException("Позиция " + position + " выходит за границы [0, " + (values.length - 1) + "]");
        }
        return values[position];
    }

    // Замена значения в позиции N на новое значение
    public void setValue(int position, int newValue) {
        if (position < 0 || position >= values.length) {
            throw new IndexOutOfBoundsException("Позиция " + position + " выходит за границы [0, " + (values.length - 1) + "]");
        }
        values[position] = newValue;
    }

    // Проверка, пуст ли список
    public boolean isEmpty() {
        return values.length == 0;
    }

    // Получение текущего размера
    public int size() {
        return values.length;
    }

    // Получение всех значений в виде стандартного массива
    public int[] toArray() {
        return Arrays.copyOf(values, values.length);
    }

    // Метод toString
    @Override
    public String toString() {
        return Arrays.toString(values);
    }
}

//Неизменяемый массив.
//Необходимо разработать сущность НеизменяемыйСписокЗначений, представляющий собой
//обертку над массивом целых чисел, который сохранит функциональные возможности массивов,
//но добавит некоторые дополнительные возможности.
//Состояние сущности описывают следующие сведения:
//• Имеет массив целых чисел. Именно он используется для хранения значений.
//Инициализация сущности может быть выполнена следующим образом:
//• С указанием значений в виде массива целых чисел.
//• С указанием перечня чисел как независимых значений (через запятую)
//• С указанием другого Списка, в этом случае копируются все значения указанного списка.
//Поведение сущности описывают следующие действия:
//• Получение значения из позицииN. Позиция должна попадать в диапазон от 0 до N-1, где
//N–текущее количество значений, иначе выкинуть ошибку.
//• Замена значения в позиции N на новое значение. Позиция должна попадать в диапазон от
//0 до N-1, где N–текущее количество значений, иначе выкинуть ошибку.
//• Может быть приведен к строке. Строка должна представлять собой полный перечень всех
//хранимых чисел, причем первый символ строки это ”[“, а последний “]”.
//• Можно проверить пуст Список или нет. Список пуст если его размер 0.
//• Можно узнать текущий размер.
//• Все хранящиеся значения можно запросить в виде стандартного массива.
//Продемонстрируйте работоспособность решения на примерах.