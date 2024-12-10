package com.futebola.service.game.infrastructure.repository.document;

import com.google.cloud.firestore.annotation.DocumentId;
import com.google.cloud.spring.data.firestore.Document;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;

@Getter
@Setter
@Document(collectionName = "players")
public class PlayerDocument {
    @Id
    private String id;
    @DocumentId
    private String uuid;
    private String name;
    private String position;
    private TeamDocument team;
}
