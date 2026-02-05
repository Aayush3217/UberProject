package com.codingshuttle.youtube.uberprojectentityservice.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import lombok.*;

@Entity
@Setter
@Getter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Color extends BaseModel{

    @Column(unique=true, nullable=false)
    private String name;
}
