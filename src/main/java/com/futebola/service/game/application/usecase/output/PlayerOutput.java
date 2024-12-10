package com.futebola.service.game.application.usecase.output;

import com.futebola.service.game.business.entity.Team;

import java.util.UUID;

public record PlayerOutput(long id, UUID uuid, String name, String position, Team team) {
}
