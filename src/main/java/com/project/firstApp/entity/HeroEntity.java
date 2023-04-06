package com.project.firstApp.entity;

import com.project.firstApp.dto.Universe;

import javax.persistence.*;

@Entity
@Table(name = "hero")
public class HeroEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nickname;

    @Enumerated(value = EnumType.STRING)
    private Universe universe;

    public HeroEntity() {
    }

    public HeroEntity(String nickname, Universe universe) {
        this.nickname = nickname;
        this.universe = universe;
    }

    public Long getId() {
        return id;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getNickname() {
        return nickname;
    }

    public Universe getUniverse() {
        return universe;
    }

    public void setUniverse(Universe universe) {
        this.universe = universe;
    }
}
