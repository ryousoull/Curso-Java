package Entities;

import java.util.List;

public class OutsourcedEmployee extends Employee{

    private Double additionalCharge;

    public OutsourcedEmployee(){
    }

    public OutsourcedEmployee(String name, Integer hours, Double valuePerHour, List<Employee> listEmployee, Double additionalCharge) {
        super(name, hours, valuePerHour, listEmployee);
        this.additionalCharge = additionalCharge;
    }

    public Double getAdditionalCharge() {
        return additionalCharge;
    }

    public void setAdditionalCharge(Double additionalCharge) {
        this.additionalCharge = additionalCharge;
    }

    @Override
    public double payment() {
        return  super.payment() + additionalCharge * 1.1;
    }
}
