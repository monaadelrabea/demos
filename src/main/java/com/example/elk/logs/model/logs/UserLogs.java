package com.example.elk.logs.model.logs;

import com.example.elk.logs.model.request.UserRequest;

/**
 * <br>
 *
 * @author : AFAQY
 */

public class UserLogs extends LogMsg{
    private UserRequest userRequest;

    public UserLogs(String message, UserRequest userRequest) {
        super(message);
        this.userRequest=userRequest;
    }

}
