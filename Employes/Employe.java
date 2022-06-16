package Employes;

public class Employe{

    private Integer id;
    private String name;
    private double salary;
    public Employe(int id2, String name2, double salary2) {
	}
    
    public Employe(String name, Integer id, double salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }


    public void setName(String name) {
        this.name = name;
    }


    public Integer getId() {
        return id;
    }

    public void setId(Integer id){
        this.id = id;
    }


    public double getSalary() {
        return salary;
    }

    public void setSalary(Double salary){
        this.salary = salary;
    }

    public void increasesalary(double percentage){
        salary += salary * percentage / 100.0;
    }


    public String toString() {
        return id + ", " + name + ", " + String.format("%.2f", salary);
    }
    
}
