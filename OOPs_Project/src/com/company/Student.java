package com.company;

import javax.sound.midi.Soundbank;
import java.util.Objects;
import java.util.Scanner;
import java.lang.Throwable;

public class Student extends Admin
{

    int i=0, j=0, e = 0;
    String[] student = new String[8];
    int[] studentId = new int[8];
    final private String[] StudentPassword = new String[8];

    int noc;
    int addCourse;
    int management;
    int sumOfCredit=0;
    final static int[] credit = {4,5,5,5,4,4,5};

    String[][] subject = new String[8][8];
    String[][] data = new String[8][8];

    Scanner sc = new Scanner(System.in);

    boolean login= true,  Registration = true;
    public void Register() throws InterruptedException {
        int coursesId;
        Thread.sleep(1000);
        System.out.println("Available cources : ");
        System.out.println("------------------------------------------------------------------------");
        System.out.println("\t Course ID \t Course \t \t \t \t \t \t \tCredits");
        System.out.println();
        System.out.println("0 : (HM106) \t Approches to Indian Society \t \t (4-3-0-0) ");
        System.out.println("1 : (MC124) \t Data Structure and Algorithm \t \t (5-3-1-0)");
        System.out.println("2 : (MC123) \t Function of Single variable and ODE  (5-3-0-1)");
        System.out.println("3 : (MC215) \t Linear Algebra \t \t \t \t \t  (5-3-0-1)");
        System.out.println("4 : (MC122) \t Object Orienter Programming \t \t  (4-2-1-0)");
        System.out.println("5 : (MC117) \t Discreate Mathematics \t \t \t \t  (4-2-0-1)");
        System.out.println("6 : (MC113) \t Computer Organization and Programming (5-0-0-4)");
        System.out.println("------------------------------------------------------------------------");

        System.out.print("Enter number of courses that you want to add : ");

        noc = sc.nextInt();

        System.out.print("Enter course IDs you want to select : ");

        for (int c = 0; c < noc; c++) {
            coursesId = sc.nextInt();
            sumOfCredit += credit[coursesId];
            data[coursesId][i] = student[i];

            switch (coursesId) {
                case 0:
                    subject[i][coursesId] = "(HM106) Approches to Indian Society";
                    break;
                case 1:
                    subject[i][coursesId] = "(MC124) Data Structure and Algorithm";
                    break;
                case 2:
                    subject[i][coursesId] = "(MC123) Function of Single variable and ODE";
                    break;
                case 3:
                    subject[i][coursesId] = "(MC215) Linear Algebra";
                    break;
                case 4:
                    subject[i][coursesId] = "(MC122) Object Oriented Programming";
                    break;
                case 5:
                    subject[i][coursesId] = "(MC117) Discrete Mathematics";
                    break;
                case 6:
                    subject[i][coursesId] = "(MC113) Computer Organization and Programming Lab ";
                    break;
                default:
                    break;
            }
        }
        if (sumOfCredit < 18) {
            Thread.sleep(500);
            System.out.println("Total course credit must be greater than or equal to 18");
        }
    }
    public void StudentManagementSystem() throws Exception
    {
        int coursesId;
        System.out.println("--------------------------------------------");
        System.out.print("Name: ");
        student[i] = sc.next();
        System.out.print("Student Id: ");
        studentId[i] = sc.nextInt();
        System.out.print("Password: ");
        StudentPassword[i] = sc.next();
        System.out.println("--------------------------------------------");
        try {
            if ((studentId[i] == 202103042 && Objects.equals(StudentPassword[i], "jay@042")) ||
                    (studentId[i] == 202103044 && Objects.equals(StudentPassword[i], "manan@044")) ||
                    (studentId[i] == 202103048 && Objects.equals(StudentPassword[i], "raj@048")) ||
                    (studentId[i] == 202103015 && Objects.equals(StudentPassword[i], "asish@015")) ||
                    (studentId[i] == 202103002 && Objects.equals(StudentPassword[i], "aadesh@002"))) {

                for (int w = 0; w < 8; w++) {
                    if (studentId[i] == studentId[w]) {
                        e = w;
                    }
                }
                Thread.sleep(1000);
                System.out.println();
                System.out.println();
                System.out.println("Welcome " + student[i] + " !");
                System.out.println();
                System.out.println();
                System.out.println("-----------------------------------------------");


                boolean studentManagement = true;
                while (studentManagement) {
                    System.out.println("**********************************************");
                    System.out.println("1. Student Profile");
                    System.out.println("2. Course Registration");
                    System.out.println("3. Result");
                    System.out.println("4. Logout");
                    System.out.println("***********************************************");

                    management = sc.nextInt();
                     if (management == 2)
                     {
                        Registration = true;
                        while (Registration) {
                            System.out.println("***********************************************");
                            System.out.println("1. Add course ");
                            System.out.println("2. Drop course ");
                            System.out.println("3. View your courses");
                            System.out.println("0. Exit");
                            System.out.println("***********************************************");

                            addCourse = sc.nextInt();

                            if (addCourse == 1) {
                                this.Register();
                            }
                            if(addCourse == 2)
                            {
                                System.out.println("Your selected Courses : ");
                                System.out.println("------------------------------------------------------------------------");
                                Thread.sleep(300);
                                for (int s = 0; s < 8; s++) {
                                    if (subject[i][s] != null) {
                                        System.out.println(subject[i][s]);
                                    }
                                }
                                System.out.print("Enter course id you want to drop : ");
                                coursesId = sc.nextInt();
                                sumOfCredit = sumOfCredit - credit[coursesId];
                                data[coursesId][i] = student[i];
                                if (sumOfCredit < 18)
                                {
                                    Thread.sleep(500);
                                    System.out.println("Total course credit must be greater than or equal to 18");
                                }
                                else {

                                    switch (coursesId) {
                                        case 0:
                                            subject[i][coursesId] = null;
                                            break;
                                        case 1:
                                            subject[i][coursesId] = null;
                                            break;
                                        case 2:
                                            subject[i][coursesId] = null;
                                            break;
                                        case 3:
                                            subject[i][coursesId] = null;
                                            break;
                                        case 4:
                                            subject[i][coursesId] = null;
                                            break;
                                        case 5:
                                            subject[i][coursesId] = null;
                                            break;
                                        case 6:
                                            subject[i][coursesId] = null;
                                            break;
                                        default:
                                            break;
                                    }
                                }
                            }
                            if (addCourse == 3) {
                                Thread.sleep(1000);
                                System.out.println("Your Courses : ");
                                System.out.println("------------------------------------------------------------------------");
                                for (int s = 0; s < 8; s++) {
                                    if (subject[i][s] != null) {
                                        System.out.println(subject[i][s]);
                                    }
                                }
                                System.out.println("------------------------------------------------------------------------");

                            }
                            if (addCourse == 0) {
                                Thread.sleep(300);
                                break;
                            }
                        }



                     }
                     else if (management == 1) {
                         Thread.sleep(1000);
                         System.out.println(student[i] + "'s Profile");
                         System.out.println("***********************************************");
                         System.out.println("Student Name: " + student[i]);
                         System.out.println("Student Id: " + studentId[i]);
                         System.out.println("Mail-Id: "+studentId[i] +"@daiict.ac.in");
                         System.out.println("Batch - UG 2022");
                         System.out.println("B.Tech MnC");
                         System.out.println("***********************************************");
                         Thread.sleep(1000);
                     }
                     else if (management == 3) {
                        System.out.println("*****************************************");
                         Thread.sleep(1000);
                         System.out.println("Result");
                        System.out.println("*****************************************");

                         System.out.println("\t Course ID \t Course \t \t \t \t \t \t \tCredits \t\t Grades");
                         System.out.println();
                         System.out.println("1 : (MC124) \t Data Structure and Algorithm \t \t (5-3-1-0) \t\t- NOT AVAILABLE");
                         System.out.println("2 : (MC123) \t Function of Single variable and ODE  (5-3-0-1) \t- NOT AVAILABLE");
                         System.out.println("4 : (MC122) \t Object Orienter Programming \t \t  (4-2-1-0) \t- NOT AVAILABLE");
                         System.out.println("5 : (MC117) \t Discreate Mathematics \t \t \t \t  (4-2-0-1) \t- NOT AVAILABLE");
                         System.out.println("------------------------------------------------------------------------");
//                        for (int s = 0; s < 8; s++) {
//
//                                System.out.print(subject[i][s] + " -  Not available");
//                                System.out.println();
//
//                        }
                        System.out.println("******************************************");
                    } else if (management == 4) {
                        studentManagement = false;
                         break;
                    } else {
                         break;
                    }
                    i++;
                }
            }
            else
            {
                throw new Exception();
            }
        }
        catch (Exception e)
        {
            Thread.sleep(2000);
            throw new Exception("Login Failed");
        }
    }
}