/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.courseinheritance;

/**
 *
 * @author alie0
 */
public class GeneralProgramStudent extends Student{
     public GeneralProgramStudent() {
        
    }

//    public GeneralProgramStudent(String name, int id, int level) {
//        super(name, id, level);
//    }
  
   @Override
   public boolean registerCourse( Course c){
       
        if(noOfCourses<6  && level>= c.MinStudentLevel){
          courseList[noOfCourses]=c;
          noOfCourses++;
          return true;
      }
      return false; 
       
   }
   @Override
   public float calculateExpenses(){
       return level*1000;
   }
    
    
}
