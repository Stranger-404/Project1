/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication2objects;

/**
 *
 * @author AHMAD
 */
public class JavaApplication2Objects {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Define and print 3 student information
        
        Student s1 = new Student();
        s1.setName("Ahmad");
        s1.setAge(21);
        Student s2 = new Student();
        s2.setName("Mansi");
        s2.setAge(20);
        Student s3 = new Student();
        s3.setAge(23);
        s3.setName("David");
        Student[] list = new Student[3]; //array of object declaration
        // store object of student class in array
        list[0]=s1;
        list[1]=s2;
        list[2]=s3;
        for(int i=0;i<list.length;i++){
            System.out.println(list[i].getName()+" "+list[i].getAge());
        }
        
    }
    
}
