package Office;
public class Manager extends Employee {
    private double Commission;
    public Manager(double salary , double Commission){
        super(salary); //Calls Constructor of Parent Class
        this.Commission = Commission;
    }
    @Override
    public double getSalary(){
        return super.getSalary() + Commission;
    }
}
