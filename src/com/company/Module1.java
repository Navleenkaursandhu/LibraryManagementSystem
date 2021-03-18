package com.company;

//module 1 comprises of Students first_name, last_name, university_id, user_id and semester

public class Module1 {

    String first_name, uni_id, user_id;   // instance variables
    int semester;

    public void getData(String first_name, String uni_id , String user_id, int semester){
        this.first_name = first_name;
        this.uni_id = uni_id;
        this.user_id = user_id;
        this.semester = semester;
    }


    public void setData(){
        System.out.println("Students first name: " + first_name);
        System.out.println("University ID: " + uni_id);
        System.out.println("User ID: " + user_id);
        System.out.println("Semester: " + semester);
    }
}
