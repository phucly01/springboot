package com.sbapp.sbapp.DBObj; 
import jakarta.persistence.*; 

/**
 * Database table "people" with each row mapping to class object "Person"
 */
@Entity
@Table(name="people")
public class Person 
{
    @Id
    @GeneratedValue
    private Integer id;
    private String first_name;
    private String last_name;
    
}
