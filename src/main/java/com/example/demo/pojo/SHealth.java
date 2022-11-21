package com.example.demo.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

/**
 * @ClassName : SHealth  //类名
 * @Description :   //描述
 * @Author : cy //作者
 * @Date: 2022/11/21  18:20
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Component
public class SHealth {
    private String sid;
    private String sname;
    private String stemperature;
    private String sposition;
    private String sstatus;
}
