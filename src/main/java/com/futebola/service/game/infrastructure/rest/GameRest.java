package com.futebola.service.game.infrastructure.rest;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.futebola.service.game.application.usecase.GetListPlayersUsecase;
import com.futebola.service.game.application.usecase.output.PlayerOutput;
import com.futebola.service.game.infrastructure.rest.response.PlayerResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequiredArgsConstructor
@RestController
public class GameRest {

    private final GetListPlayersUsecase getListPlayersUsecase;
    private final ObjectMapper mapper;

    @GetMapping("players")
    public ResponseEntity<List<PlayerResponse>> getPlayers() {
        List<PlayerOutput> playerOutputList = getListPlayersUsecase.execute();

        return ResponseEntity.ok().body(mapper.convertValue(playerOutputList, new TypeReference<>() {
        }));
    }

}
