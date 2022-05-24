package com.mybatisplus.entities;

import com.baomidou.mybatisplus.annotation.*;
import com.mybatisplus.enums.SexEnum;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.io.Serializable;

@Data
@NoArgsConstructor
@AllArgsConstructor
@TableName("user")
public class User implements Serializable {

    @TableId
    private Long id;

    @TableField("name")
    private String t_name;

    @TableField("password")
    private String password;
}