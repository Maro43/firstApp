package com.project.firstApp.dto;

public class HeroDto {

    private final String nickname;

    public HeroDto(String nickname) {
        this.nickname = nickname;
    }

    public String getNickname() {
        return nickname;
    }

}
