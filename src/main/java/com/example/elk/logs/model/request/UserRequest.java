package com.example.elk.logs.model.request;

import lombok.Data;

import java.sql.Timestamp;

/**
 * <br>
 *
 * @author : AFAQY
 */
@Data
public class UserRequest {

    private String userId;
    private String name;
    private String address;
    private Timestamp requestTime;

}
