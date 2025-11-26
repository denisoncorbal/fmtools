package br.com.dgc.fmtools.infrastructure.adapters.outbound.persistence.entities;

import java.util.Set;
import java.util.UUID;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "TB_Formation")
public class FormationEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;

    public FormationEntity() {
    }

    public FormationEntity(String name) {
        this.name = name;
    }

    @Column(nullable = false)
    private UUID ownerId;

    public UUID getOwnerId() {
        return ownerId;
    }

    public void setOwnerId(UUID ownerId) {
        this.ownerId = ownerId;
    }

    @Column(nullable = false)
    private String name;

    @Column(nullable = true)
    private Double suitability;

    public Double getSuitability() {
        return suitability;
    }

    public void setSuitability(Double suitability) {
        this.suitability = suitability;
    }

    @OneToOne
    @JoinColumn(name = "tactical_style_id")
    private TacticalStyleEntity tacticalStyle;

    @OneToMany(mappedBy = "formation", cascade = CascadeType.PERSIST)
    private Set<TacticalPositionEntity> tacticalPositions;

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

    public TacticalStyleEntity getTacticalStyle() {
        return tacticalStyle;
    }

    public void setTacticalStyle(TacticalStyleEntity tacticalStyle) {
        this.tacticalStyle = tacticalStyle;
    }

    public Set<TacticalPositionEntity> getTacticalPositions() {
        return tacticalPositions;
    }

    public void setTacticalPositions(Set<TacticalPositionEntity> tacticalPositions) {
        this.tacticalPositions = tacticalPositions;
        this.tacticalPositions.forEach(tp -> tp.setFormation(this));
    }
}
