package com.AbhijeetProject.sms.dto;


import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class StudentDto {
    private Long id;
    @NotEmpty(message = "student first name should not empty")
    private String firstName;
    @NotEmpty(message = "student last name should not empty")
    private String lastName;
    @NotEmpty(message = "student email should not empty")
    @Email
    private String email;
}
