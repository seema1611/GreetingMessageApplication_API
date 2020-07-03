/*********************************************************************
 * @purpose : Greeting Service class implement the business logic
 * @author  : Seema Rajpure
 * @Date    : 03/07/2020
 *********************************************************************/
package com.greetingapplication.service.implementors;

import com.greetingapplication.model.User;
import com.greetingapplication.repository.IGreetingRepository;
import com.greetingapplication.service.IGreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service
public class GreetingService implements IGreetingService {
    private static final String template = "Hello  %s !";

    @Autowired
    private IGreetingRepository greetingRepository;

    /**+
     *
     * @purpose: To add firstname and lastname in database
     * @param user
     * @return user
     */
    @Override
    public User addUser(User user) {
        user.setRegisterDate(LocalDateTime.now());
        return greetingRepository.save(user);
    }
}
