package com.codeq;

import java.util.Objects;

public class Employee {

    private int id;
    private String name;
    private double sal;
    private String dept;

    public int getId() {

        return id;
    }

    public void setId(
            int id) {

        this.id = id;
    }

    public String getName() {

        return name;
    }

    public void setName(
            String name) {

        this.name = name;
    }

    public double getSal() {

        return sal;
    }

    public void setSal(
            double sal) {

        this.sal = sal;
    }

    public String getDept() {

        return dept;
    }

    public void setDept(
            String dept) {

        this.dept = dept;
    }

    public Employee(int id, String name, double sal, String dept) {

        super();
        this.id = id;
        this.name = name;
        this.sal = sal;
        this.dept = dept;
    }

    public Employee() {

        super();
    }

    @Override
    public String toString() {

        return "Employee [id=" + id + ", name=" + name + ", sal=" + sal + ", dept=" + dept + "]";
    }

    @Override
    public int hashCode() {

        return Objects.hash(dept, id, name, sal);
    }

    @Override
    public boolean equals(
            Object obj) {

        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        Employee other = (Employee) obj;
        return Objects.equals(dept, other.dept) && id == other.id && Objects.equals(name, other.name)
                && Double.doubleToLongBits(sal) == Double.doubleToLongBits(other.sal);
    }

}
