/*********************************************************************
 * @purpose : Greeting Service class implement the business logic
 * @author  : Seema Rajpure
 * @Date    : 03/07/2020
 *********************************************************************/
package com.greetingapplication.service.implementors;

import com.greetingapplication.exception.GreetingException;
import com.greetingapplication.model.User;
import com.greetingapplication.repository.IGreetingRepository;
import com.greetingapplication.service.IGreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@Service
public class GreetingService implements IGreetingService {

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

    /**+
     *
     * @purpose : To retire all data based on id
     * @param id
     * @return user
     */
    @Override
    public User getById(int id) {
        return greetingRepository.findById(id).orElseThrow(() -> new GreetingException("Greeting Not found"));
    }

    /**+
     *
     * @purpose : To retire all user list
     * @return
     */
    @Override
    public List<User> getOverallList() {
        return greetingRepository.findAll();
    }

    /**+
     *
     * @purpose : To modify the data
     * @param id
     * @param user
     * @return modified user
     */
    @Override
    public User getUserAfterModification(int id, User user) {
        User update = greetingRepository.findById(id).get();
        update.setFirstName(user.getFirstName());
        update.setLastName(user.getLastName());
        return greetingRepository.save(update);
    }

    /**+
     *
     * @purpose : To delete the user
     * @param id
     * @return all user details display
     */
    @Override
    public List<User> getUpdatedListAfterDeletionById(int id) {
        User user = greetingRepository.findById(id).orElseThrow(() -> new GreetingException("Greeting Not found"));
        greetingRepository.delete(user);
        return greetingRepository.findAll();
    }
}