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
@Table(name = "TB_Tactical_Position")
public class TacticalPositionEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;

    @Column(nullable = false)
    private String fieldPosition;

    @Column(nullable = false)
    private String role;

    @Column(nullable = false)
    private String duty;

    @Column(nullable = true)
    private Double suitability;

    public Double getSuitability() {
        return suitability;
    }

    public void setSuitability(Double suitability) {
        this.suitability = suitability;
    }

    @Column(nullable = false)
    private UUID ownerId;

    public UUID getOwnerId() {
        return ownerId;
    }

    public void setOwnerId(UUID ownerId) {
        this.ownerId = ownerId;
    }

    @ManyToOne
    @JoinColumn(name = "formation_id")
    private FormationEntity formation;

    @ManyToOne
    @JoinColumn(name = "player_id")
    private PlayerEntity player;

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getFieldPosition() {
        return fieldPosition;
    }

    public void setFieldPosition(String fieldPosition) {
        this.fieldPosition = fieldPosition;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public String getDuty() {
        return duty;
    }

    public void setDuty(String duty) {
        this.duty = duty;
    }

    public FormationEntity getFormation() {
        return formation;
    }

    public void setFormation(FormationEntity formation) {
        this.formation = formation;
    }

    public PlayerEntity getPlayer() {
        return player;
    }

    public void setPlayer(PlayerEntity player) {
        this.player = player;
    }

    public TacticalPositionEntity(String fieldPosition, String role, String duty) {
        this.fieldPosition = fieldPosition;
        this.role = role;
        this.duty = duty;
    }

    public TacticalPositionEntity() {
    }

}
