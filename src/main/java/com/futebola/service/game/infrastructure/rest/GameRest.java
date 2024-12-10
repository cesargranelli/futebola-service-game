package com.futebola.service.game.infrastructure.rest;

import com.futebola.service.game.application.usecase.GetListPlayersUsecase;
import com.futebola.service.game.application.usecase.output.PlayerOutput;
import com.futebola.service.game.infrastructure.rest.response.PlayerResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RequiredArgsConstructor
@RestController
public class GameRest {

    private final GetListPlayersUsecase getListPlayersUsecase;

    @GetMapping("players")
    public ResponseEntity<List<PlayerResponse>> getPlayers() {
        List<PlayerOutput> execute = getListPlayersUsecase.execute();

        return ResponseEntity.ok().body(Arrays.asList(new PlayerResponse(), new PlayerResponse()));
    }

}
