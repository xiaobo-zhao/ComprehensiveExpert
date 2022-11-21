package com.example.demo.vo;

import lombok.Data;
import org.springframework.stereotype.Component;

/**
 * @ClassName : Result  //类名
 * @Description :   //描述
 * @Author : cy //作者
 * @Date: 2022/11/21  18:25
 */
//返回crud操作结果，对前端进行反馈。
@Data
@Component
public class Result {
    private Boolean status = true;
    private String msg;
}