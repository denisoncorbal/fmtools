package br.com.dgc.fmtools.domain.model;

import java.util.List;

public class Squad {
    private String name;
    private List<Player> players;

    public List<Player> getPlayers() {
        return players;
    }

    public Squad(String name, List<Player> players) {
        this.name = name;
        this.players = players;
    }

    @Override
    public String toString() {
        return "Squad [name=" + name + ", players=" + players + ", getClass()=" + getClass() + ", hashCode()="
                + hashCode() + ", toString()=" + super.toString() + "]";
    }

}
