/*********************************************************************
 * @purpose : Controller used for handling the request and response
 * @author  : Seema Rajpure
 * @Date    : 03/07/2020
 *********************************************************************/
package com.greetingapplication.controller;

import com.greetingapplication.model.User;
import com.greetingapplication.service.IGreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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
}
