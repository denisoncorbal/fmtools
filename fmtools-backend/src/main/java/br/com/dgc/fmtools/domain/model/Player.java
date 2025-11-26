package br.com.dgc.fmtools.domain.model;

import java.util.Map;
import java.util.UUID;

public class Player {
    private UUID id;

    public UUID getId() {
        return id;
    }

    private String name;

    public String getName() {
        return name;
    }

    Map<String, Integer> attributes;

    public Player(UUID id, String name, Map<String, Integer> attributes) {
        this.id = id;
        this.name = name;
        this.attributes = attributes;
    }

}
