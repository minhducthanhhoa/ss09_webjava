package com.data.sesson09_webjava.model;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Customer {
    private Long id;
    private String username;
    private String password;
    private String phone;
    private String address;
    private String gender;
    private String email;
}
