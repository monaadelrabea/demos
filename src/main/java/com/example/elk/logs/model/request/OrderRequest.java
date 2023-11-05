package com.example.elk.logs.model.request;

import lombok.Data;

import java.io.Serializable;

/**
 * <br>
 *
 * @author : AFAQY
 */
@Data
public class OrderRequest implements Serializable {

    private String orderId;
    private String userId;
    private String orderNum;

}
