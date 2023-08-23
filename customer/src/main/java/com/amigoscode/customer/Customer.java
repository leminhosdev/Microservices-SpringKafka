package com.amigoscode.customer;

import lombok.*;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Customer {
    private Integer id;
    private String firstName;
    private String lastName;
    private String email;
}
