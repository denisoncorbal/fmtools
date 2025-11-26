package br.com.dgc.fmtools.infrastructure.adapters.outbound.persistence.entities;

import java.util.UUID;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "TB_Player")
public class PlayerEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;

    @Column(nullable = false)
    private UUID ownerId;

    public UUID getOwnerId() {
        return ownerId;
    }

    public void setOwnerId(UUID ownerId) {
        this.ownerId = ownerId;
    }

    public PlayerEntity() {
    }

    public PlayerEntity(String name, String attributes) {
        this.name = name;
        this.attributes = attributes;
    }

    @Column(nullable = false)
    private String name;

    @Column(nullable = false, columnDefinition = "jsonb")
    private String attributes;

    public String getAttributes() {
        return attributes;
    }

    public void setAttributes(String attributes) {
        this.attributes = attributes;
    }

    @ManyToOne
    @JoinColumn(name = "squad_id")
    private SquadEntity squad;

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public SquadEntity getSquad() {
        return squad;
    }

    public void setSquad(SquadEntity squad) {
        this.squad = squad;
    }
}
