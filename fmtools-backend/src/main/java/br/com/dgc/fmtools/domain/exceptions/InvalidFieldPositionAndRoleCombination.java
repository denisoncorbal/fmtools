package br.com.dgc.fmtools.domain.exceptions;

public class InvalidFieldPositionAndRoleCombination extends Exception {
    public InvalidFieldPositionAndRoleCombination(String fieldPositionName, String roleName) {
        super(fieldPositionName + " cannot be combined with " + roleName);
    }
}
