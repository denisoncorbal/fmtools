package br.com.dgc.fmtools.positions_calculator_service.domain.model.position.defender_centre;

import br.com.dgc.fmtools.positions_calculator_service.domain.model.player.LinePlayer;

public interface DefenderCentrePositions {
  default LinePlayer applyAttributeWeight(LinePlayer initPlayer) {
    LinePlayer player = new LinePlayer(initPlayer);
    player.setCorners(player.getCorners() * 1);
    player.setCrossing(player.getCrossing() * 1);
    player.setDribbling(player.getDribbling() * 1);
    player.setFinishing(player.getFinishing() * 1);
    player.setFirstTouch(player.getFirstTouch() * 2);
    player.setFreeKickTaking(player.getFreeKickTaking() * 1);
    player.setHeading(player.getHeading() * 5);
    player.setLongShots(player.getLongShots() * 1);
    player.setLongThrows(player.getLongThrows() * 1);
    player.setMarking(player.getMarking() * 8);
    player.setPassing(player.getPassing() * 2);
    player.setPenaltyTaking(player.getPenaltyTaking() * 1);
    player.setTackling(player.getTackling() * 5);
    player.setTechnique(player.getTechnique() * 1);
    player.setAggression(player.getAggression() * 0);
    player.setAnticipation(player.getAnticipation() * 5);
    player.setBravery(player.getBravery() * 2);
    player.setComposure(player.getComposure() * 2);
    player.setConcentration(player.getConcentration() * 4);
    player.setDecisions(player.getDecisions() * 10);
    player.setDetermination(player.getDetermination() * 0);
    player.setFlair(player.getFlair() * 0);
    player.setLeadership(player.getLeadership() * 2);
    player.setOffTheBall(player.getOffTheBall() * 1);
    player.setPositioning(player.getPositioning() * 8);
    player.setTeamwork(player.getTeamwork() * 1);
    player.setVision(player.getVision() * 1);
    player.setWorkRate(player.getWorkRate() * 2);
    player.setAcceleration(player.getAcceleration() * 6);
    player.setAgility(player.getAgility() * 6);
    player.setBalance(player.getBalance() * 2);
    player.setJumpingReach(player.getJumpingReach() * 6);
    player.setNaturalFitness(player.getNaturalFitness() * 0);
    player.setPace(player.getPace() * 5);
    player.setStamina(player.getStamina() * 3);
    player.setStrength(player.getStrength() * 6);
    return player;
  }
}
