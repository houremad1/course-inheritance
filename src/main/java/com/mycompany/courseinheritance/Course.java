/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.courseinheritance;

/**
 *
 * @author alie0
 */
public class Course {
    protected String name;
    protected String code;
    protected int MinStudentLevel;
    protected int creditHours;

    public Course() {
    }

    public Course(String name, int MinStudentLevel, int creditHours) {
        this.name = name;
        this.MinStudentLevel = MinStudentLevel;
        this.creditHours = creditHours;
    }

    @Override
    public String toString() {
        return "Course{" + "name=" + name + ", code=" + code + ", MinStudentLevel=" + MinStudentLevel + ", creditHours=" + creditHours + '}';
    }
    
    
}
