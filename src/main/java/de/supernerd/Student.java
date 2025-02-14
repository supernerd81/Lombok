package de.supernerd;

import lombok.*;

@Getter
@Setter
@EqualsAndHashCode
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Student {
    private int id;
    private String name;
    private String address;
    private int grade;
}
