package com.example.elk.logs.model.logs;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * <br>
 *
 * @author : AFAQY
 */
@Data
@NoArgsConstructor

public class LogMsg implements Serializable {
    private String message;

    public LogMsg(String message) {
        this.message=message;
    }

}
