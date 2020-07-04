/****************************************************************************
 * @purpose : Greeting Controller used for handling the request and response
 * @author  : Seema Rajpure
 * @Date    : 03/07/2020
 ****************************************************************************/
package com.greetingapplication.controller;

import com.greetingapplication.model.User;
import com.greetingapplication.service.IGreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/greeting")
public class GreetingController {

    @Autowired
    IGreetingService greetingService;

    /**+
     *
     * @purpose  : Used for add user in database
     * @param user
     * @return : user
     */
    @PostMapping
    public User addUser (@RequestBody User user) {
        return greetingService.addUser(user);
    }

    /**+
     * @purpose : Used to retire data based on id
     * @param id
     * @return user
     */
    @GetMapping
    public User getUserById(@RequestParam(value = "id") int id) {
        return greetingService.getById(id);
    }

    /**+
     * @purpose : Used to retire data
     * @return alluser
     */
    @GetMapping("alluser")
    public List<User> getOverallUserList() {
        return greetingService.getOverallList();
    }

    /**+
     *
     * @purpose : Used to modify the data
     * @param id
     * @param user
     * @return user
     */
    @PutMapping
    public User getUserModified(@RequestParam(value = "id") int id, @RequestBody User user) {
        return greetingService.getUserAfterModification(id, user);
    }

    /**+
     *
     * @purpose : Used to delete the data
     * @param id
     * @return Remaining user list
     */
    @DeleteMapping
    public List<User> deleteByIdAndGetUpdatedList(@RequestParam(value = "id") int id) {
        return greetingService.getUpdatedListAfterDeletionById(id);
    }
}
