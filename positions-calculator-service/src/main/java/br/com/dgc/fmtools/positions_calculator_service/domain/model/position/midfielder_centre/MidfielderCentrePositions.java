package br.com.dgc.fmtools.positions_calculator_service.domain.model.position.midfielder_centre;

import br.com.dgc.fmtools.positions_calculator_service.domain.model.player.LinePlayer;

public interface MidfielderCentrePositions {
  default LinePlayer applyAttributeWeight(LinePlayer initPlayer) {
    LinePlayer player = new LinePlayer(initPlayer);
    player.setCorners(player.getCorners() * 1);
    player.setCrossing(player.getCrossing() * 1);
    player.setDribbling(player.getDribbling() * 2);
    player.setFinishing(player.getFinishing() * 2);
    player.setFirstTouch(player.getFirstTouch() * 6);
    player.setFreeKickTaking(player.getFreeKickTaking() * 1);
    player.setHeading(player.getHeading() * 1);
    player.setLongShots(player.getLongShots() * 3);
    player.setLongThrows(player.getLongThrows() * 1);
    player.setMarking(player.getMarking() * 3);
    player.setPassing(player.getPassing() * 6);
    player.setPenaltyTaking(player.getPenaltyTaking() * 1);
    player.setTackling(player.getTackling() * 3);
    player.setTechnique(player.getTechnique() * 4);
    player.setAggression(player.getAggression() * 0);
    player.setAnticipation(player.getAnticipation() * 3);
    player.setBravery(player.getBravery() * 1);
    player.setComposure(player.getComposure() * 3);
    player.setConcentration(player.getConcentration() * 2);
    player.setDecisions(player.getDecisions() * 7);
    player.setDetermination(player.getDetermination() * 0);
    player.setFlair(player.getFlair() * 0);
    player.setLeadership(player.getLeadership() * 1);
    player.setOffTheBall(player.getOffTheBall() * 3);
    player.setPositioning(player.getPositioning() * 3);
    player.setTeamwork(player.getTeamwork() * 2);
    player.setVision(player.getVision() * 6);
    player.setWorkRate(player.getWorkRate() * 3);
    player.setAcceleration(player.getAcceleration() * 6);
    player.setAgility(player.getAgility() * 6);
    player.setBalance(player.getBalance() * 2);
    player.setJumpingReach(player.getJumpingReach() * 1);
    player.setNaturalFitness(player.getNaturalFitness() * 0);
    player.setPace(player.getPace() * 5);
    player.setStamina(player.getStamina() * 6);
    player.setStrength(player.getStrength() * 4);
    return player;
  }
}
