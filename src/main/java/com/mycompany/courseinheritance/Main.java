/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.courseinheritance;

import java.util.Scanner;

/**
 *
 * @author alie0
 */
public class Main {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.print("Enter number of students:");
        int stdNum = in.nextInt();
        Student arr[] = new Student[stdNum];
        for (int i = 0; i < stdNum; i++) {
            System.out.print("Enter student type(0.genral,1.special) :");
            int type = in.nextInt();
            in.nextLine();
            Student s;
            if (type == 0) {
                s = new GeneralProgramStudent();
            } else if (type == 1) {
                s = new SpecialProgramStudent();
            } else {
                System.out.println("Invalid student type. Must be 0 or 1.");
                return;
            }
            System.out.print("Enter student" + (i + 1) + " name:");
            String name = in.nextLine().trim();
            s.setName(name);
            System.out.print("Enter student" + (i + 1) + " ID:");
            int id = in.nextInt();
            s.setId(id);
            System.out.print("Enter student" + (i + 1) + " level:");
            int level = in.nextInt();
            while (level < 1 || level > 4) {
                System.out.println("level should be [1,2,3,4]");
                System.out.print("enter again:");
                level = in.nextInt();
            }

            s.setLevel(level);
            System.out.print("Enter number of Courses to register:");
            int numCourses = in.nextInt();
            in.nextLine();
            for (int j = 0; j < numCourses; j++) {
                System.out.print("enter course code:");
                String courseCode = in.nextLine().trim();
                Course course = CourseList.searchCourse(courseCode);
                if (course == null) {
                    System.out.println("not found");
                } else {
                    boolean flag = s.registerCourse(course);
                    if (flag) {
                        System.out.println("Enter grade:");
                        double grade = in.nextDouble();
                        in.nextLine();
                        if (grade < 0 || grade > 100) {
                            System.out.println("Percentage must be in [0, 100].");

                        } else {
                            s.grade[j] = grade;
                        }

                    } else {
                        System.out.print("Cant register\n");
                    }

                }

            }
            arr[i] = s;
        }
        for (int c = 0; c < stdNum; c++) {
            System.out.print("Name:" + arr[c].getName());
            System.out.print(",ID:" + arr[c].getId());
            System.out.print(",Level:" + arr[c].getLevel() + "\n");
            System.out.println("Cousres:");
            arr[c].printRegisteredCourses();
            System.out.println("Expenses:" + arr[c].calculateExpenses());
            System.out.println("GPA:");
            System.out.print(arr[c].getTotalGPA() + "\n");
        }

    }
}
