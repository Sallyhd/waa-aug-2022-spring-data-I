package com.miu.Lab3.dto;

import com.miu.Lab3.entity.User;
import lombok.Data;

@Data
public class AddressDto {
    private int id;
    private String street;
    private int zip;
    private String city;
    private User user;
}
