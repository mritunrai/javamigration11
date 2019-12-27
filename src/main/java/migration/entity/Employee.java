package migration.entity;

public class Employee {
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    private long id;
    private String name;
    private double salary;

    public Employee(long id, String name, double salary) {
        super();
        this.setId(id);
        this.setName(name);
        this.setSalary(salary);
    }

    //Getters and setters

    @Override
    public String toString() {
        return "Employee [id=" + getId() + ", name=" + getName() + ", salary=" + getSalary() + "]";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}
