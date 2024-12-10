package com.futebola.service.game.application.usecase;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.futebola.service.game.application.service.GetListPlayerData;
import com.futebola.service.game.application.usecase.output.PlayerOutput;
import com.futebola.service.game.business.entity.Player;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.List;

@RequiredArgsConstructor
@Component
public class GetListPlayersUsecase {

    private final GetListPlayerData getListPlayerData;
    private final ObjectMapper mapper;

    public List<PlayerOutput> execute() {
        List<Player> players = getListPlayerData.getPlayers();

        return mapper.convertValue(players, new TypeReference<>() {
        });
    }

}
