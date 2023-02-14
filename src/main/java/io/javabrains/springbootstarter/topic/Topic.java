package io.javabrains.springbootstarter.topic;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name="courses_in_myapplication")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Topic {
    @Id
    private String id;
    @Column(name = "Course_Name")
    private String name;
    @Column(name = "Course_Desc")
    private String description;


}
