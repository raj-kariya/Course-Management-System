package com.company;

import java.awt.*;
import java.util.Objects;
import java.util.Scanner;

public class Faculty extends Admin {
    Student s = new Student();
    int i;
    final private String[] FacultyPassoword = new String[8];
    int courseId;
    String[] Faculty = new String[8];

    //String[][] data = new String[8][8];
    Scanner sc = new Scanner(System.in);

    void FacultyManagementSystem() throws Exception {
        System.out.println("--------------------------------------------");
        System.out.print("Name: ");
        Faculty[i] = sc.next();
        System.out.print("Enter your course ID : ");
        courseId = sc.nextInt();
        System.out.print("Password: ");
        FacultyPassoword[i] = sc.next();
        System.out.println("--------------------------------------------");

        try {
            if ((courseId == 0 && Objects.equals(FacultyPassoword[i], "bharani@123")) ||
                    (courseId == 1 && Objects.equals(FacultyPassoword[i], "avik@123")) ||
                    (courseId == 2 && Objects.equals(FacultyPassoword[i], "madhukant@123")) ||
                    (courseId == 3 && Objects.equals(FacultyPassoword[i], "jaideep@123")) ||
                    (courseId == 4 && Objects.equals(FacultyPassoword[i], "saurabh@123")) ||
                    (courseId == 5 && Objects.equals(FacultyPassoword[i], "supantha@123")) ||
                    (courseId == 6 && Objects.equals(FacultyPassoword[i], "shruti@123"))) {
                {
                    boolean FacultyManagement = true;
                    int fmanagement;
                    Thread.sleep(1000);
                    System.out.println();
                    System.out.println();
                    System.out.println("Welcome " + Faculty[i] + " !");
                    System.out.println();
                    System.out.println();
                    System.out.println("-----------------------------------------------");

                    while (FacultyManagement) {

                        System.out.println("***************************************************");
                        System.out.println("1. Profile");
                        System.out.println("2. Students List");
                        System.out.println("3. Logout");
                        System.out.println("***************************************************");

                        fmanagement = sc.nextInt();
                        if (fmanagement == 1) {
                            Thread.sleep(1000);
                            System.out.println("-----------------------------------------------");
                            System.out.println(Faculty[i] + "'s Profile");
                            System.out.println("-----------------------------------------------");
                            System.out.println("Name : " + Faculty[i]);
                            System.out.println("CourseId : " + courseId);
                            System.out.println("Institute - Dhirubhai Ambhani Institute of Information and Communication Technology");
                            System.out.println("-----------------------------------------------");
                        }
                        else if (fmanagement == 2) {


                            int q = 0;
                            switch (courseId) {
                                case 0:
                                    q = 0;
                                    break;
                                case 1:
                                    q = 1;
                                    break;
                                case 2:
                                    q = 2;
                                    break;
                                case 3:
                                    q = 3;
                                    break;
                                case 4:
                                    q = 4;
                                    break;
                                case 5:
                                    q = 5;
                                    break;
                                case 6:
                                    q = 6;
                                    break;
                                default:
                                    break;
                            }
                            i++;
                            Thread.sleep(1000);
                            System.out.println("-----------------------------------------------");
                            System.out.println("Students in your Course : ");
                            System.out.println("Jay");
                            System.out.println("null");
                            System.out.println("null");
                            System.out.println("null");
                            System.out.println("null");
                            System.out.println("null");
                            System.out.println("null");
                            System.out.println("null");
                            System.out.println("-----------------------------------------------");

                        } else if (fmanagement == 3) {
                            FacultyManagement = false;
                        }
                        else {
                            Thread.sleep(300);
                            break;
                        }

                    }
                }

            } else {
                Thread.sleep(300);
                throw new Exception();
            }
        } catch (Exception e) {
            Thread.sleep(2000);
            throw new Exception("Login Failed");
        }
    }
}
