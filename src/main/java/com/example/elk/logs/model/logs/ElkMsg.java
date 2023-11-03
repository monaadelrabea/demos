package com.example.elk.logs.model.logs;

import com.example.elk.logs.model.request.OrderRequest;
import com.example.elk.logs.model.request.UserRequest;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.util.HashMap;
import java.util.Map;

/**
 * <br>
 *
 * @author : AFAQY
 */
public class ElkMsg {

    static Gson gson = new GsonBuilder().create();

    public static String userElkMessage(String message, UserRequest userRequest) {
        return object(message, userRequest);
    }

    public static String orderElkMessage(String message, OrderRequest orderRequest) {
        return object(message, orderRequest);
    }

    public static String object(String message, Object object) {
        Map<String, Object> objectMap = new HashMap();
        objectMap.put("msg", message);
        objectMap.put("object", object);
        return gson.toJson(objectMap);
    }

}