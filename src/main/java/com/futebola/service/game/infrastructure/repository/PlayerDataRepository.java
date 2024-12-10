package com.futebola.service.game.infrastructure.repository;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.futebola.service.game.application.service.GetListPlayerData;
import com.futebola.service.game.business.entity.Player;
import com.futebola.service.game.infrastructure.repository.document.PlayerDocument;
import com.futebola.service.game.infrastructure.repository.firestore.PlayerFirestoreRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.List;

@RequiredArgsConstructor
@Component
public class PlayerDataRepository implements GetListPlayerData {

    private final PlayerFirestoreRepository repository;
    private final ObjectMapper mapper;

    @Override
    public List<Player> getPlayers() {
        List<PlayerDocument> mono = repository.findAll().collectList().block();

        return null;
    }

}
