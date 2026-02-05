package com.codingshuttle.youtube.uberprojectentityservice.models;


import jakarta.persistence.Entity;
import lombok.*;

import java.util.Random;

@Entity
@Setter
@Getter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class OTP extends BaseModel {

    private String code;

    private String sentToNumber;

    public static OTP make(String phoneNumber){
        Random random = new Random();

        // generate a random Interger from 0 to 899, then add 1000
        Integer code = random.nextInt(9000) + 1000;

        return OTP.builder().code(code.toString()).sentToNumber(phoneNumber).build();
    }
}
