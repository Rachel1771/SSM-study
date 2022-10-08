package com.rachel.pojo;

import lombok.Data;

/**
 * @author Rachel
 * @date 2022/8/30 17:40
 * @desciption:
 * @status
 */
@Data
public class User {
    private Integer id;
    private String username;
    private String password;

    public User(Integer id, String username, String password) {
        this.id = id;
        this.username = username;
        this.password = password;
    }

    public User() {
    }

}
