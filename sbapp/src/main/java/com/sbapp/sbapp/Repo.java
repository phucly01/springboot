package com.sbapp.sbapp;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sbapp.sbapp.DBObj.Person;

/**
 * Database "repo" interface that has the table "people" map to class object "Person"
 */

@Repository
public interface Repo extends JpaRepository<Person, Integer> 
{

}
