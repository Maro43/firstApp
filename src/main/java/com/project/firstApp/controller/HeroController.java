package com.project.firstApp.controller;


import com.project.firstApp.dto.HeroDto;
import com.project.firstApp.service.HeroService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/hero")
public class HeroController {

    private final HeroService heroService;

    public HeroController(HeroService heroService) {
        this.heroService = heroService;
    }

    @GetMapping
    public HeroDto get(Long id) {
        return heroService.get(id);
    }

    @PostMapping
    public HeroDto add(HeroDto heroDto) {
        return heroService.add(heroDto);
    }

    @PutMapping
    public HeroDto update(HeroDto heroDto) {
        return heroService.update(heroDto);
    }

    @DeleteMapping
    public HeroDto delete(Long id) {
        return heroService.delete(id);
    }

}
