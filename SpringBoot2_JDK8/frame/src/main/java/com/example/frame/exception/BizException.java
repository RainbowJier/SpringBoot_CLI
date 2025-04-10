package com.example.frame.exception;

import com.example.frame.enums.BizCodeEnum;
import lombok.Data;

/**
 * @Description：Global Exception Entity.
 * @Author： RainbowJier
 * @Data： 2024/8/12 21:36
 */

@Data
public class BizException extends RuntimeException {

    private Integer code;

    private String msg;


    /**
     * Constructs a new BizException object with the specified code and message.
     */
    public BizException(Integer code, String message) {
        super(message);
        this.code = code;
        this.msg = message;
    }

    /**
     * Constructs a new BizException object with the specified BizCodeEnum.
     */
    public BizException(BizCodeEnum bizCodeEnum) {
        super(bizCodeEnum.getMessage());
        this.code = bizCodeEnum.getCode();
        this.msg = bizCodeEnum.getMessage();
    }
}