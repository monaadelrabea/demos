package com.example.elk.logs.controller;

import com.example.elk.logs.model.logs.ElkMsg;
import com.example.elk.logs.model.request.OrderRequest;
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
@RequestMapping("/order")
public class OrderController {

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    @Operation(summary = "Add order ", description = "To add new order")
    public ResponseEntity<Void> addOrder(@RequestBody OrderRequest orderRequest) {
        log.info(ElkMsg.orderElkMessage("Add new order", orderRequest));
        return ResponseEntity.ok().build();
    }

}
