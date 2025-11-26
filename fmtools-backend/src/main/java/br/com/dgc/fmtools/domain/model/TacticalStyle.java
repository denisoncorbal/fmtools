package br.com.dgc.fmtools.domain.model;

public class TacticalStyle {
    private String name;
    private Formation formation;

    public Formation getFormation() {
        return formation;
    }

    public TacticalStyle(String name, Formation formation) {
        this.name = name;
        this.formation = formation;
    }

    @Override
    public String toString() {
        return "TacticalStyle [name=" + name + ", formation=" + formation + ", getClass()=" + getClass()
                + ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
    }

}
