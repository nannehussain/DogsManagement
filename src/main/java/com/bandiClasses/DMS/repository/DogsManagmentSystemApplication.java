package com.bandiClasses.DMS.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.bandiClasses.DMS.Models.Dog;



@Repository
public interface DogsManagmentSystemApplication extends CrudRepository<Dog,Integer>{

}
