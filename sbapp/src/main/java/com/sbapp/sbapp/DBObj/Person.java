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
    private Integer age;
    

    public Integer getId() {
        return this.id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getFirst_name() {
        return this.first_name;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public String getLast_name() {
        return this.last_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public Integer getAge() {
        return this.age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

}
