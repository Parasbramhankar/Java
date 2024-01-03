package MenuDriven;

public class Reverse {
    static int reverseNumber(int num){
        int c = 0;
        while (num > 0) {
            int b = num % 10;
            c = (c * 10) + b;
            num /= 10;
        }
        return c;

    }
}
