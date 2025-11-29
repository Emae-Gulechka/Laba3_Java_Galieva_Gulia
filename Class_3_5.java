public class Class_3_5 {
    private int x;
    private int y;
    private int z;

    public Class_3_5() {
        this(0, 0, 0);
    }

    public Class_3_5(int x, int y, int z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    // Геттеры
    public int getX() { return x; }
    public int getY() { return y; }
    public int getZ() { return z; }


    @Override
    public String toString() {
        return "{" + x + ";" + y + ";" + z + "}";
    }
}

//Трехмерная точка.
//Создайте такой подвид сущности Точка из задачи 1.1.1, которая будет иметь не две, а три
//координаты на плоскости: X,Y,Z.