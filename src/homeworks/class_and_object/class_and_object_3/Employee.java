package homeworks.class_and_object.class_and_object_3;

/*  7.Սահմանել Employee class-ը, որը ունի
●	fields (id, name, department, age , gender)
●	methods printEmploye() որը տպում է Employee  մասին ամբողջական ինֆորմացիա։
Ստեղծել 3 աշխատող(2 տղա և 1 աղջիկ), որոնցից երկուսը աշխատում են նույն դեպարտամենտում և ունեն նույն տարիքը։

*/
public class Employee {
    public long id;
    public String name;
    public String department;
    public int age;
    public String gender;

    public Employee(long id, String name, String department, int age, String gender) {
        this.id = id;
        this.name = name;
        this.department = department;
        this.age = age;
        this.gender = gender;
    }

    void printEmployee() {
        System.out.print(id + " ");
        System.out.print(name + " ");
        System.out.print(department + " ");
        System.out.print(age + " ");
        System.out.print(gender + " ");
        System.out.println();
    }

    public static void main(String[] args) {
        Employee employee1 = new Employee(200101214, "Artak", "Tenders", 32, "male");
        Employee employee2 = new Employee(118014214, "Serob", "Service", 32, "male");
        Employee employee3 = new Employee(214536214, "Mariam", "Tenders", 25, "female");
        employee1.printEmployee();
        employee2.printEmployee();
        employee3.printEmployee();
    }
}
