/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import model.Person;

/**
 *
 * @author aitor
 */
public class GestionListaEnMemoria {
    
 //  
    
    public static ObservableList<Person> cargarDatos(){
        
        return FXCollections.observableArrayList(
            new Person("Jacob", "Smith", "jacob.smith@example.com"),
            new Person("Isabella", "Johnson", "isabella.johnson@example.com"),
            new Person("Ethan", "Williams", "ethan.williams@example.com"),
            new Person("Emma", "Jones", "emma.jones@example.com"),
            new Person("Michael", "Brown", "michael.brown@example.com")
        );
    }     
    
//    public static void añadirDato(ObservableList<Person> lista, Person persona){
//        
//        lista.add(persona);
//    }      
//    
    
}
