package com.sbapp.sbapp.DBServices;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.sbapp.sbapp.Repo;
import com.sbapp.sbapp.DBObj.Person;

import java.util.List;

@Service
@Transactional
public class RepoService 
{

    @Autowired
    private Repo repo;

    public List<Person> list()
    {
        return repo.findAll();
    }
    
}
