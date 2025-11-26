package br.com.dgc.fmtools.infrastructure.adapters.outbound.persistence.entities;

import java.util.Set;
import java.util.UUID;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "TB_Team")
public class TeamEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;

    @Column(nullable = false)
    private UUID ownerId;

    private String name;

    @OneToMany(mappedBy = "team")
    private Set<SquadEntity> squads;

    @OneToMany(mappedBy = "team")
    private Set<TacticEntity> tactics;

    public TeamEntity() {
    }

    public TeamEntity(String name) {
        this.name = name;
    }

    public TeamEntity(String name, Set<SquadEntity> squads, Set<TacticEntity> tactics, UUID ownerId) {
        this.name = name;
        this.squads = squads;
        this.tactics = tactics;
        this.ownerId = ownerId;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public UUID getOwnerId() {
        return ownerId;
    }

    public void setOwnerId(UUID ownerId) {
        this.ownerId = ownerId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Set<SquadEntity> getSquads() {
        return squads;
    }

    public void setSquads(Set<SquadEntity> squads) {
        this.squads = squads;
    }

    public Set<TacticEntity> getTactics() {
        return tactics;
    }

    public void setTactics(Set<TacticEntity> tactics) {
        this.tactics = tactics;
    }

}
