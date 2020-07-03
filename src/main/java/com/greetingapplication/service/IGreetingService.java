/***************************************************************************
 * @purpose : IGreetingService interface is used for managed service operation
 * @author  : Seema Rajpure
 * @Date    : 03/07/2020
 ***************************************************************************/
package com.greetingapplication.service;

import com.greetingapplication.model.User;

import java.util.List;

public interface IGreetingService {
    /**+
     * @Purpose: To pass data to service
     * @param user
     * @return user
     */
    User addUser(User user);

    /**+
     *
     * @Purpose: To pass id to service
     * @param id
     * @return user
     */
    User getById(int id);

    /**+
     * @purpose : To passed user
     * @return
     */
    List<User> getOverallList();
}
