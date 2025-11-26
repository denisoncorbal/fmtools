package br.com.dgc.fmtools.domain.model;

public class Tactic {
    private String name;
    private TacticalStyle tacticalStyle;

    public TacticalStyle getTacticalStyle() {
        return tacticalStyle;
    }

    public Tactic(String name, TacticalStyle tacticalStyle) {
        this.name = name;
        this.tacticalStyle = tacticalStyle;
    }

    @Override
    public String toString() {
        return "Tactic [name=" + name + ", tacticalStyle=" + tacticalStyle + ", getClass()=" + getClass()
                + ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
    }

}
