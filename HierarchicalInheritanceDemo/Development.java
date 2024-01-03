package HierarchicalInheritanceDemo;

public class Development extends Employee {
    Development(){
        System.out.println("This is development class.");
        System.out.println("This is a good employee.");
    }

    public static void main(String[] args) {
        Development development = new Development();
        development.setInfo(101, "Tushar", 987654321);
        development.getInfo();
    }
}
