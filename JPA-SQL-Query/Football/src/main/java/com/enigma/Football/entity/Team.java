package com.enigma.Football.entity;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

@Table
@Entity
public class Team extends Timestamp {
    @GeneratedValue(generator = "team_id", strategy = GenerationType.IDENTITY)
    @GenericGenerator(name = "team_id", strategy = "uuid")
    @Id
    private String id;

    @Column(nullable = false)
    private String name;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
