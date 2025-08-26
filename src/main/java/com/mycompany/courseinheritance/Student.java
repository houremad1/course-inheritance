/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.courseinheritance;

/**
 *
 * @author alie0
 */
public abstract class Student {
   protected String name;
    protected int id;
    protected int level;
    protected double grade[] = new double[6];
   protected Course courseList[] = new Course[6];
    protected int noOfCourses;
//    int count=0;
    public Student() {
//        courseList = null;
        noOfCourses = 0;
    }
  
  public String  getName(){
        return name;
   }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getLevel() {
        return level;
    }

//    public Student(String name, int id, int level) {
//        this.name = name;
//        this.id = id;
//        this.level = level;
//       
    public void setLevel(int level) {
        this.level = level;
    }

//    }
    public void printRegisteredCourses() {
        for(int i=0;i<noOfCourses;i++){
            System.out.println(courseList[i]+",grade:"+grade[i]);
        }
    }
  public abstract float calculateExpenses();
  public boolean registerCourse(Course c){
      if(noOfCourses<6){
          courseList[noOfCourses]=c;
          noOfCourses++;
          return true;
      }
      return false;
  }
  public double getCourseGPA(double grade){
     
     if(grade>=93 &&grade <=100){
          return 4.00;
      }
      else if(grade>=90 && grade<=92){
          return 3.70;
      }
      else if( grade>=87 && grade<=89){
          return 3.30;
      }
      else if( grade>=83 && grade<=86){
          return 3.00;
      }
      else if( grade>=80 && grade<=82){
          return 2.70;
      }
      else if( grade>=77 && grade<=79){
          return 2.30;
      }
      else if( grade>=73 && grade<=76){
          return 2.00;
      }
     else if( grade>=70 && grade<=72){
          return 1.70;
      }
     else if( grade>=67 && grade<=69){
          return 1.30;
      }
      else if( grade>=63 && grade<=66){
          return 1.00;
      }
      else if( grade>=60 && grade<=62){
          return 0.70;
      }
      return 0.00;
  }
  public double getTotalGPA(){
      double sumOfCreditHours=0;
      double sumOfpiont=0;
      for(int i=0;i<noOfCourses;i++){
          sumOfpiont+=getCourseGPA(grade[i])*courseList[i].creditHours;
          sumOfCreditHours+=courseList[i].creditHours;
      }
     if(sumOfCreditHours==0){
         return 0;
     }
     return sumOfpiont/sumOfCreditHours;
  }
}
