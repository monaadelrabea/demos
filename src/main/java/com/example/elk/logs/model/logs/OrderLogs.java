package com.example.elk.logs.model.logs;

import com.example.elk.logs.model.request.OrderRequest;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * <br>
 *
 * @author : AFAQY
 */
@EqualsAndHashCode(callSuper = true)
@Data
@NoArgsConstructor
public class OrderLogs extends LogMsg implements Serializable {

    private OrderRequest orderRequest;

    public OrderLogs(String message, OrderRequest orderRequest) {
        super(message);
        this.orderRequest = orderRequest;
    }

}
