package br.com.dgc.fmtools.infrastructure.adapters.outbound.persistence.entities;

import java.util.UUID;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "TB_Tactic")
public class TacticEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private UUID ownerId;

    public UUID getOwnerId() {
        return ownerId;
    }

    public void setOwnerId(UUID ownerId) {
        this.ownerId = ownerId;
    }

    @ManyToOne
    @JoinColumn(name = "team_id")
    private TeamEntity team;

    @OneToOne(mappedBy = "tactic")
    private TacticalStyleEntity tacticalStyle;

    public TacticEntity() {
    }

    public TacticEntity(String name) {
        this.name = name;
    }

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

    public TeamEntity getTeam() {
        return team;
    }

    public void setTeam(TeamEntity team) {
        this.team = team;
    }

    public TacticalStyleEntity getTacticalStyle() {
        return tacticalStyle;
    }

    public void setTacticalStyle(TacticalStyleEntity tacticalStyle) {
        this.tacticalStyle = tacticalStyle;
    }

}
