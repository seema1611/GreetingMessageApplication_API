/*********************************************************************
 * @purpose : Greeting Repository is used to performed CRUD operation
 * @author  : Seema Rajpure
 * @Date    : 03/07/2020
 *********************************************************************/
package com.greetingapplication.repository;

import com.greetingapplication.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IGreetingRepository extends JpaRepository<User, Integer> {
}
