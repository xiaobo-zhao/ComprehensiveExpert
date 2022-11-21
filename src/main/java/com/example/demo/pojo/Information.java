package com.example.demo.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

/**
 * @BelongsProject: ComprehensiveExpert
 * @BelongsPackage: com.example.demo.pojo
 * @Author: Insist On
 * @CreateTime: 2022-11-21  20:30
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Component
public class Information {
    private String sid;
    private String sname;
    private String stemperature;
    private String sposition;
    private String sstatus;
}
