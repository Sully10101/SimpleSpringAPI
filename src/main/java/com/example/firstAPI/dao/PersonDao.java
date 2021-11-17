package com.example.firstAPI.dao;

import com.example.firstAPI.model.Person;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

public interface PersonDao {

    /* Java interface achieves abstraction, creating a 'template' class, methods have empty bodies,
    when a class "implements" an interface it needs the methods defined in the interface it is
    implementing. Similar to abstract class but methods CANNOT have bodies and must be abstract.
     */

    int insertPerson(UUID id, Person person);

    default int insertPerson(Person person){

        UUID id = UUID.randomUUID();
        return insertPerson(id, person);
    }

    List<Person> selectAllPeople();

    Optional<Person> selectPersonById(UUID id);

    int deletePersonById(UUID id);

    int updatePersonById(UUID id, Person person);


}
