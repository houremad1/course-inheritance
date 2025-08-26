/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.courseinheritance;

/**
 *
 * @author alie0
 */
public class Main {

    public static void main(String[] args) {
        NormalCourse sd1=new NormalCourse("math",1,3);
        SummerCourse std2= new SummerCourse("pl1",2,3);
        System.out.println(sd1.toString());
        System.out.println(std2.toString());
    }
}
