public class Class_4_5 {
    private Integer x;
    private Integer y;
    private Integer z;
    private String color;
    private String time;


    public Class_4_5(int x) {
        this(x, null, null, null, null);
    }

    public Class_4_5(int x, String color) {
        this(x, null, null, color, null);
    }

    public Class_4_5(int x, int y) {
        this(x, y, null, null, null);
    }

    public Class_4_5(int x, int y, int z) {
        this(x, y, z, null, null);
    }

    public Class_4_5(int x, int y, String time) {
        this(x, y, null, null, time);
    }

    public Class_4_5(int x, int y, int z, String time) {
        this(x, y, z, null, time);
    }

    public Class_4_5(int x, int y, String color, String time) {
        this(x, y, null, color, time);
    }

    // Основной конструктор
    public Class_4_5(Integer x, Integer y, Integer z, String color, String time) {
        this.x = x;
        this.y = y;
        this.z = z;
        this.color = color;
        this.time = time;
    }

    public Integer getX() { return x; }
    public Integer getY() { return y; }
    public Integer getZ() { return z; }
    public String getColor() { return color; }
    public String getTime() { return time; }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Точка");

        // Координаты
        if (x != null || y != null || z != null) {
            sb.append(" в координате ");
            if (z != null) {
                sb.append("{" + x + "," + y + "," + z + "}");
            } else if (y != null) {
                sb.append("{" + x + "," + y + "}");
            } else {
                sb.append(x);
            }
        }

        // Цвет
        if (color != null) {
            sb.append(", " + color + " цвета");
        }

        // Время
        if (time != null) {
            sb.append(", в " + time);
        }

        return sb.toString();
    }
}

//Точки.
//Необходимо разработать сущности, которые позволят создавать Точки координат с разными
//характеристиками. Например, мы можем иметь точки координат со следующими
//характеристиками:
//• Одна, две или три координаты в пространстве (X,Y,Z: целые числа)
//• Цвет точки (строка)
//• Время появления точки (строка)
//Обратите внимание, что эти характеристики не составляют исчерпывающий список (так как в
//будущем могут появиться новые характеристики) и могут составлять любые комбинации,
//например:
//• Точка в координате 3, красного цвета
//• Точка в координате {4,2,5} в 11:00
//• Точка в координате {7,7} в 15:35, желтого цвета
//С целью совместимости с последующими задачами, сохраните Двухмерную и Трёхмерную точки
//из задачи 2.3.5 без изменений