package com.example.demo.student;

@lombok.ToString
@lombok.NoArgsConstructor
@lombok.AllArgsConstructor
@lombok.EqualsAndHashCode
@lombok.Getter
@lombok.Setter
public class Student {
    private Long id;
    private String name;
    private String email;
    private Gender gender;
}

