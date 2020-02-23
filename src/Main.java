import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Programmer programmer1 = new Programmer("Fedor");
        Programmer programmer2 = new Programmer("Anton");
        Programmer programmer3 = new Programmer("Denis");
        Driver driver1 = new Driver("Sotyu");
        Driver driver2 = new Driver("Levinho");
        Driver driver3 = new Driver("Sevou");
        Cooker cooker1 = new Cooker("Vasya");
        Cooker cooker2 = new Cooker("Luda");
        Cooker cooker3 = new Cooker("Gosha");

        ArrayList<Employee> employees = new ArrayList<>();
        employees.add(driver1);
        employees.add(cooker1);
        employees.add(programmer1);
        employees.add(programmer2);
        employees.add(programmer3);
        employees.add(driver2);
        employees.add(driver3);
        employees.add(cooker2);
        employees.add(cooker3);

        for (Employee employee : employees){
            employee.voice();
            if(employee instanceof Programmer){
                ((Programmer) employee).writeCode();
            } else if (employee instanceof Driver){
                ((Driver) employee).drive();
            } else if (employee instanceof Cooker){
                ((Cooker) employee).cook();
            }
        }
    }
}
