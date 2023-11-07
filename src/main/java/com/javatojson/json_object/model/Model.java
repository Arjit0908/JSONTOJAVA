package com.javatojson.json_object.model;

import lombok.*;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Component
public class Model {

     private String name;
     private String email;
     private String userName;
     private String password;
}
