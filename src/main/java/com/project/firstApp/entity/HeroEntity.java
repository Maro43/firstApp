package com.project.firstApp.entity;

import javax.persistence.*;

@Entity
@Table(name = "hero")
public class HeroEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nickname;

    public HeroEntity() {
    }

    public HeroEntity(String nickname) {
        this.nickname = nickname;
    }

    public Long getId() {
        return id;
    }

    public String getNickname() {
        return nickname;
    }


}
