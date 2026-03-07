package com.sample.demo.model;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@ALLArgsConstructor
@Builder
@Entity
@Validated
@Valid
@Table(name "user_table_testing")
public class UserDetails {

@Id
@Min(value = 1)
@Max(value = 100)
private Integer id;

@Size(min=1, max 100, message "first name is not valid please enter min 1 and max 100 letter")
@Column(name="first_name")
@Pattern (regexp="[A-Za-z0-9]-8")

private String firstName;

@Column(name = "Last_name")
@size(min 0, max 100, messago "the last name is not valid")
@NotNull

private String lastName;

@Column(name "age")
@min (value=1)
@Max(value= 100)
private Integer age;

@NotNull

@NotEmpty

private List<String> usero;

}
