/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package library;

/**
 *
 * @author mustafa.mentesoglu
 */
public class CourseBook extends Book{

    public CourseBook() {
        author = "ABC";   // You can access protected variable if it cretaed in same package
        modifyTemplate(); // You can 
        
    }
    
}
