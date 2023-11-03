package com.example.elk.logs.controller;

import com.example.elk.logs.model.logs.ElkMsg;
import com.example.elk.logs.model.request.UserRequest;
import io.swagger.v3.oas.annotations.Operation;
import lombok.extern.log4j.Log4j2;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

/**
 * <br>
 *
 * @author : AFAQY
 */
@Log4j2
@RestController
@RequestMapping("/user")
public class UserController {

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    @Operation(summary = "Add user ", description = "To add new user")
    public ResponseEntity<Void> addUser(@RequestBody UserRequest userRequest) {
        log.info(ElkMsg.userElkMessage("Add new user", userRequest));
        return ResponseEntity.ok().build();
    }

}
