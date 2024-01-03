package GarbageCollection;

class Main{

    boolean checkedOut = false;
    Main(boolean checkOut)
    {
        checkedOut = checkOut;
    }
    void checkIn()
    {
        checkedOut = false;
    }

    @Override
    protected void finalize()
    {
        try {
            if (checkedOut)
                System.out.println("Error: checked out");
        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}
public class FinalizeDemo {
    public static void main(String[] args) {

        Main mn=new Main(true);

        mn.checkIn();

        System.gc();
    }
}


