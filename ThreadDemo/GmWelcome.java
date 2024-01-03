package ThreadDemo;

public class GmWelcome extends Thread {

    void fun(){
        for(int i=0;i<4;i++){
            try {
                Thread.sleep(2000);
            }
            catch (Exception e){
                System.out.println(e.getMessage());
            }

            System.out.println("Good Morning! Welcome");

        }
    }


    public static void main(String[] args) {

        GmWelcome th1=new GmWelcome();
        GmWelcome th2=new GmWelcome();
        th1.setName("th1");
        th2.setName("th2");

        th1.start();
        th1.fun();

    }
}
