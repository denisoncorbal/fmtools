package br.com.dgc.fmtools.domain.model;

import java.util.UUID;

import br.com.dgc.fmtools.domain.exceptions.InvalidFieldPositionAndRoleCombination;
import br.com.dgc.fmtools.domain.exceptions.InvalidRoleAndDutyCombination;
import br.com.dgc.fmtools.domain.model.constants.Duty;
import br.com.dgc.fmtools.domain.model.constants.FieldPosition;
import br.com.dgc.fmtools.domain.model.constants.Role;

public class TacticalPosition {
    private UUID id;

    public UUID getId() {
        return id;
    }

    private FieldPosition fieldPosition;
    private Role role;
    private Duty duty;
    private Player player;
    private double suitability;

    public double getSuitability() {
        return suitability;
    }

    public TacticalPosition(UUID id, FieldPosition fieldPosition, Role role, Duty duty)
            throws InvalidFieldPositionAndRoleCombination, InvalidRoleAndDutyCombination {
        if (!role.getValidPositions().contains(fieldPosition))
            throw new InvalidFieldPositionAndRoleCombination(fieldPosition.name(), role.name());
        if (!duty.getValidRoles().contains(role))
            throw new InvalidRoleAndDutyCombination(role.name(), duty.name());
        this.id = id;
        this.fieldPosition = fieldPosition;
        this.role = role;
        this.duty = duty;
    }

    public FieldPosition getFieldPosition() {
        return fieldPosition;
    }

    public void assignPlayer(Player player, double suitability) {
        this.player = player;
        this.suitability = suitability;
    }

    public Role getRole() {
        return role;
    }

    public Duty getDuty() {
        return duty;
    }

    public Player getPlayer() {
        return player;
    }

    @Override
    public String toString() {
        return "TacticalPosition [id=" + id + ", fieldPosition=" + fieldPosition + ", role=" + role + ", duty=" + duty
                + ", player=" + player + ", suitability=" + suitability + ", getId()=" + getId() + ", getSuitability()="
                + getSuitability() + ", getFieldPosition()=" + getFieldPosition() + ", getRole()=" + getRole()
                + ", getDuty()=" + getDuty() + ", getPlayer()=" + getPlayer() + ", getClass()=" + getClass()
                + ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
    }

    

}
