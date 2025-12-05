package com.example.demo.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;



@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Table(name="user")
public class User {
    @Id
    @SequenceGenerator(name = "user_seq", initialValue = 100, allocationSize = 1)
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column(name="id_user")
    private Long idUser;


    @NotBlank
    @Column(name = "email")
    @Email
    private String email;

    @Column(name = "username")
    @NotBlank
    @Size(max = 50)
    private String username;

    @NotBlank
    @Size(max = 120)
    @Column(name = "password")
    private String password;

}
