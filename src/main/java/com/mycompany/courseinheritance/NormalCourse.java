/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.courseinheritance;

/**
 *
 * @author alie0
 */
public class NormalCourse extends Course{

    public NormalCourse() {
        
    }

    public NormalCourse(String name, int MinStudentLevel, int creditHours) {
        super(name, MinStudentLevel, creditHours);
        this.code=name+"_N"+MinStudentLevel;
    }
    
    
}
