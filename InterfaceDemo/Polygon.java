package InterfaceDemo;

public interface Polygon {
    void getArea(int length, int breadth);
    void getArea(int radius);

    default int operation(int no1, int no2) {
        int res = no1 + no2;
        return res;
    }
}
