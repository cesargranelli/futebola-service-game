package com.futebola.service.game.business.entity;

import lombok.Getter;
import lombok.Setter;

import java.util.UUID;

@Getter
@Setter
public class Player {
    private long id;
    private UUID uuid = UUID.randomUUID();
    private String name;
    private String position;
    private Team team;
}