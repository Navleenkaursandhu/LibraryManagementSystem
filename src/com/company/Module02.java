package com.company;

// module2 comprises of subjects namely physics, chemistry and mathematics

import java.sql.SQLOutput;

public class Module02 {

    public void physics() {
        String phy[] = {"Electromagnetism", "Dynamics", "Mechanics", "Astro Physics", "Solid State Physics"};
        System.out.println("-------------------------------------------");
        System.out.println("Books available in Physics Department: ");
        for (int i=0; i <= phy.length - 1; i++) {
            System.out.println("*" + phy[i]);
        }
    }
    public void chemistry(){
        String chem[] = { "Inorganic Chemistry", "Organic Chemistry", "Polymer Chemistry" , "Bio Chemistry"};
        System.out.println("--------------------------------------------");
        System.out.println("Books available in Chemistry Department: ");
        for(int i=0; i<=chem.length-1 ; i++){
            System.out.println("o" + chem[i] );
        }
    }
    public void mathematics(){
        String maths [] = {"Trigonometry",  "Geometry", "Integration", "Differentiation", "Probability"};
        System.out.println("---------------------------------------------");
        System.out.println("Books available in Mathematics Department: ");
        for(int i=0; i<=maths.length-1; i++){
            System.out.println("-" + maths[i]);
        }
    }

}