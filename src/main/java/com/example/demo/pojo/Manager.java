package com.example.demo.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

/**
 * @BelongsProject: ComprehensiveExpert
 * @BelongsPackage: com.example.demo.pojo
 * @Author: Insist On
 * @CreateTime: 2022-11-21  14:27
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Component
public class Manager {
    private String mid;
    private String musername;
    private String mpassword;
    private String memail;
}
