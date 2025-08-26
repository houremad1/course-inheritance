/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.courseinheritance;

/**
 *
 * @author alie0
 */
public class SpecialProgramStudent extends Student{
     public SpecialProgramStudent() {
    }

//    public SpecialProgramStudent(String name, int id, int level ) {
//        super(name, id, level);
//    }
    
    
     @Override
     public float calculateExpenses(){
        float sumOfCreditHours=0;
      for(int i=0;i<noOfCourses;i++){
          sumOfCreditHours+=courseList[i].creditHours;
      }
      return sumOfCreditHours*500;
   }
}
