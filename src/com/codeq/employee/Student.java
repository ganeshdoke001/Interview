package com.codeq.employee;

import java.util.Map;
import java.util.Objects;

public class Student {

    private String name;
    private Map<String, Integer> sub;

    public String getName() {

        return name;
    }

    public void setName(
            String name) {

        this.name = name;
    }

    public Student(String name, Map<String, Integer> sub) {

        super();
        this.name = name;
        this.sub = sub;
    }

    @Override
    public int hashCode() {

        return Objects.hash(name, sub);
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
        Student other = (Student) obj;
        return Objects.equals(name, other.name) && Objects.equals(sub, other.sub);
    }

    public Map<String, Integer> getSub() {

        return sub;
    }

    public void setSub(
            Map<String, Integer> sub) {

        this.sub = sub;
    }
}
