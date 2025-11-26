package br.com.dgc.fmtools.domain.exceptions;

public class InvalidRoleAndDutyCombination extends Exception {
    public InvalidRoleAndDutyCombination(String roleName, String dutyName) {
        super(roleName + " cannot be combined with " + dutyName);
    }
}
