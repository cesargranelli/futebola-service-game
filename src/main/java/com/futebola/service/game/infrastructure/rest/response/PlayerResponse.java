package com.futebola.service.game.infrastructure.rest.response;

import com.futebola.service.game.business.entity.Team;

import java.util.UUID;

public record PlayerResponse(long id, UUID uuid, String name, String position, Team team) {
}
