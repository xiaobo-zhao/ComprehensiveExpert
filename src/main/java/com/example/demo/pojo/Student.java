package com.example.demo.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

/**
 * @ClassName : Student  //类名
 * @Description :   //描述
 * @Author : bbx //作者
 * @Date: 2022/12/2  0:49
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Component
public class Student {
    private String sid;
    private String sPassword;
    private String sName;
    private String sCollege;
    private String sPhone;
}
