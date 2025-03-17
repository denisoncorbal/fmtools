package br.com.dgc.fmtools.positions_calculator_service.domain.model.position.striker_centre;

import br.com.dgc.fmtools.positions_calculator_service.domain.model.player.LinePlayer;

public interface StrikerCentrePositions {
  default LinePlayer applyAttributeWeight(LinePlayer initPlayer) {
    LinePlayer player = new LinePlayer(initPlayer);
    player.setCorners(player.getCorners() * 1);
    player.setCrossing(player.getCrossing() * 2);
    player.setDribbling(player.getDribbling() * 5);
    player.setFinishing(player.getFinishing() * 8);
    player.setFirstTouch(player.getFirstTouch() * 6);
    player.setFreeKickTaking(player.getFreeKickTaking() * 1);
    player.setHeading(player.getHeading() * 6);
    player.setLongShots(player.getLongShots() * 2);
    player.setLongThrows(player.getLongThrows() * 1);
    player.setMarking(player.getMarking() * 1);
    player.setPassing(player.getPassing() * 2);
    player.setPenaltyTaking(player.getPenaltyTaking() * 1);
    player.setTackling(player.getTackling() * 1);
    player.setTechnique(player.getTechnique() * 4);
    player.setAggression(player.getAggression() * 0);
    player.setAnticipation(player.getAnticipation() * 5);
    player.setBravery(player.getBravery() * 1);
    player.setComposure(player.getComposure() * 6);
    player.setConcentration(player.getConcentration() * 2);
    player.setDecisions(player.getDecisions() * 5);
    player.setDetermination(player.getDetermination() * 0);
    player.setFlair(player.getFlair() * 0);
    player.setLeadership(player.getLeadership() * 1);
    player.setOffTheBall(player.getOffTheBall() * 6);
    player.setPositioning(player.getPositioning() * 2);
    player.setTeamwork(player.getTeamwork() * 1);
    player.setVision(player.getVision() * 2);
    player.setWorkRate(player.getWorkRate() * 2);
    player.setAcceleration(player.getAcceleration() * 10);
    player.setAgility(player.getAgility() * 6);
    player.setBalance(player.getBalance() * 2);
    player.setJumpingReach(player.getJumpingReach() * 5);
    player.setNaturalFitness(player.getNaturalFitness() * 0);
    player.setPace(player.getPace() * 7);
    player.setStamina(player.getStamina() * 6);
    player.setStrength(player.getStrength() * 6);
    return player;
  }
}
