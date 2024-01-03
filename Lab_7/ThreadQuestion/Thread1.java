package Lab_7.ThreadQuestion;



public class Thread1 {
    public static void main(String[] args) {
        Thread2 th1 = new Thread2();
        Thread2 th2 = new Thread2();
        Thread2 th3 = new Thread2();

        th1.setName("th1");
        th2.setName("th2");
        th3.setName("th3");

        th1.start();
        try {
            th1.join();

        }
        catch (Exception e){
            System.out.println("Exception : " + e.toString());
        }

        th2.start();
        try {
            th2.join();

        }
        catch (Exception e){
            System.out.println("Exception : " + e.toString());
        }

        th3.start();
        try {
            th3.join();

        }
        catch (Exception e){
            System.out.println("Exception : " + e.toString());
        }

    }
}


