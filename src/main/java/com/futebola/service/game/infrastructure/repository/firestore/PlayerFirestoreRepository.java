package com.futebola.service.game.infrastructure.repository.firestore;

import com.futebola.service.game.infrastructure.repository.document.PlayerDocument;
import com.google.cloud.spring.data.firestore.FirestoreReactiveRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PlayerFirestoreRepository extends FirestoreReactiveRepository<PlayerDocument> {
}
