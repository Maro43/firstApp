package com.project.firstApp.dto;

public class HeroDto {

    private Long id;
    private String nickname;
    private Universe universe;

    public HeroDto() {
    }

    public HeroDto(Long id, String nickname, Universe universe) {
        this.id = id;
        this.nickname = nickname;
        this.universe = universe;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public Universe getUniverse() {
        return universe;
    }

    public void setUniverse(Universe universe) {
        this.universe = universe;
    }

    public HeroDto(String nickname) {
        this.nickname = nickname;
    }
}
