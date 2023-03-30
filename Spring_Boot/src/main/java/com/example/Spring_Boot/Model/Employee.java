package com.example.Spring_Boot.Model;


import jakarta.persistence.*;

@Entity
@Table(name = "employee")
public
class Employee {
    public Employee() {
    }

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    int Emp_id;
    String Emp_name;

    public int getEmp_id() {
        return Emp_id;
    }

    public void setEmp_id(int emp_id) {
        Emp_id = emp_id;
    }

    public String getEmp_name() {
        return Emp_name;
    }

    public Employee(int emp_id, String emp_name, String designation) {
        Emp_id = emp_id;
        Emp_name = emp_name;
        Designation = designation;
    }

    public void setEmp_name(String emp_name) {
        Emp_name = emp_name;
    }

    public String getEmp_designation() {
        return Designation;
    }

    public void setEmp_designation(String designation) {
        Designation = designation;
    }

    String Designation;




    @Override
    public String toString() {
        return "Employee{" +
                "Emp_id=" + Emp_id +
                ", Emp_name='" + Emp_name + '\'' +
                ", Designation='" + Designation + '\'' +
                '}';
    }
}
