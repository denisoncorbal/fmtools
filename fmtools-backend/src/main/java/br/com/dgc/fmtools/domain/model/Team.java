package br.com.dgc.fmtools.domain.model;

import java.util.List;

public class Team {
    private String name;
    private List<Squad> squads;

    public List<Squad> getSquads() {
        return squads;
    }

    private List<Tactic> tactics;

    public List<Tactic> getTactics() {
        return tactics;
    }

    public Team(String name, List<Squad> squads, List<Tactic> tactics) {
        this.name = name;
        this.squads = squads;
        this.tactics = tactics;
    }

    @Override
    public String toString() {
        return "Team [name=" + name + ", squads=" + squads + ", tactics=" + tactics + ", getSquads()=" + getSquads()
                + ", getTactics()=" + getTactics() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
                + ", toString()=" + super.toString() + "]";
    }

}
