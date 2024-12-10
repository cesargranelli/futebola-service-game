package com.futebola.service.game.application.usecase;

import com.futebola.service.game.application.service.GetListPlayerData;
import com.futebola.service.game.application.usecase.output.PlayerOutput;
import com.futebola.service.game.business.entity.Player;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;

@RequiredArgsConstructor
@Component
public class GetListPlayersUsecase {

    private final GetListPlayerData getListPlayerData;

    public List<PlayerOutput> execute() {
        List<Player> players = getListPlayerData.getPlayers();

        return Arrays.asList(new PlayerOutput(), new PlayerOutput());
    }

}
