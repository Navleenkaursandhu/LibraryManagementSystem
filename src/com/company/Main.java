package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int choice = 0;
        while( choice != 3){
            System.out.println(" Enter 1 for module 1 \n Enter 2 for module 2");
            choice = input.nextInt();

            if(choice==1){
                Module1 obj = new Module1();
                System.out.println("Enter Students first name: ");
                obj.first_name = input.nextLine();
                obj.first_name = input.nextLine();
                System.out.println("Enter University ID: ");
                obj.uni_id = input.nextLine();
                System.out.println("Enter User ID: ");
                obj.user_id = input.nextLine();
                System.out.println("Enter the Semester: ");
                obj.semester = input.nextInt();

                obj.getData(obj.first_name, obj.uni_id, obj.user_id, obj.semester);
                obj.setData();
            }
            else if (choice == 2){
                Module02 obj2 = new Module02();
                obj2.chemistry();
                obj2.physics();
                obj2.mathematics();
            }
        }
    }
}
