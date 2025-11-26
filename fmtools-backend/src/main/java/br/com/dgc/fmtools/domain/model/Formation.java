package br.com.dgc.fmtools.domain.model;

import java.util.List;

import br.com.dgc.fmtools.domain.exceptions.InvalidPositionsSizeException;
import br.com.dgc.fmtools.domain.exceptions.NotUniqueFieldPositionsException;

public class Formation {
    private String name;
    private List<TacticalPosition> tacticalPositions;
    private double suitability;

    public void setSuitability(double suitability) {
        this.suitability = suitability;
    }

    public List<TacticalPosition> getTacticalPositions() {
        return tacticalPositions;
    }

    public Formation(String name, List<TacticalPosition> positions)
            throws InvalidPositionsSizeException, NotUniqueFieldPositionsException {
        if (positions.size() > 11)
            throw new InvalidPositionsSizeException();
        if (positions.size() != positions.stream().map(TacticalPosition::getFieldPosition).distinct().count())
            throw new NotUniqueFieldPositionsException();
        this.name = name;
        this.tacticalPositions = positions;
    }

    @Override
    public String toString() {
        return "Formation [name=" + name + ", tacticalPositions=" + tacticalPositions + ", suitability=" + suitability
                + ", getTacticalPositions()=" + getTacticalPositions() + ", getClass()=" + getClass() + ", hashCode()="
                + hashCode() + ", toString()=" + super.toString() + "]";
    }

    

}
