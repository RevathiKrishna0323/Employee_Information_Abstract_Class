/*
 * Author Name: Revathi
 * Date: 13-10-2022
 * Created With: IntelliJ IDEA Community Edition
 */

package com.io.github;

import java.util.Objects;

public class Employee {
    private String employeeName;
    private String code;
    private String dateOfBirth;
    private String age;
    private String salary;

    public Employee() {
    }

    public Employee(String employeeName, String code, String dateOfBirth, String age, String salary) {
        this.employeeName = employeeName;
        this.code = code;
        this.dateOfBirth = dateOfBirth;
        this.age = age;
        this.salary = salary;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getSalary() {
        return salary;
    }

    public void setSalary(String salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" + "employeeName='" + employeeName + '\'' + ", code='" + code + '\'' + ", dateOfBirth='" + dateOfBirth + '\'' + ", age='" + age + '\'' + ", salary='" + salary + '\'' + '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return Objects.equals(employeeName, employee.employeeName) && Objects.equals(code, employee.code) && Objects.equals(dateOfBirth, employee.dateOfBirth) && Objects.equals(age, employee.age) && Objects.equals(salary, employee.salary);
    }

    @Override
    public int hashCode() {
        return Objects.hash(employeeName, code, dateOfBirth, age, salary);
    }
}
