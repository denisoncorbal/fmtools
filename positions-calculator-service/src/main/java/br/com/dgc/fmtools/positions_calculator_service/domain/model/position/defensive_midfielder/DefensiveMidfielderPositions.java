package br.com.dgc.fmtools.positions_calculator_service.domain.model.position.defensive_midfielder;

import br.com.dgc.fmtools.positions_calculator_service.domain.model.player.LinePlayer;

public interface DefensiveMidfielderPositions {
  default LinePlayer applyAttributeWeight(LinePlayer initPlayer) {
    LinePlayer player = new LinePlayer(initPlayer);
    player.setCorners(player.getCorners() * 1);
    player.setCrossing(player.getCrossing() * 1);
    player.setDribbling(player.getDribbling() * 2);
    player.setFinishing(player.getFinishing() * 2);
    player.setFirstTouch(player.getFirstTouch() * 4);
    player.setFreeKickTaking(player.getFreeKickTaking() * 1);
    player.setHeading(player.getHeading() * 1);
    player.setLongShots(player.getLongShots() * 3);
    player.setLongThrows(player.getLongThrows() * 1);
    player.setMarking(player.getMarking() * 3);
    player.setPassing(player.getPassing() * 4);
    player.setPenaltyTaking(player.getPenaltyTaking() * 1);
    player.setTackling(player.getTackling() * 7);
    player.setTechnique(player.getTechnique() * 3);
    player.setAggression(player.getAggression() * 0);
    player.setAnticipation(player.getAnticipation() * 5);
    player.setBravery(player.getBravery() * 1);
    player.setComposure(player.getComposure() * 2);
    player.setConcentration(player.getConcentration() * 3);
    player.setDecisions(player.getDecisions() * 8);
    player.setDetermination(player.getDetermination() * 0);
    player.setFlair(player.getFlair() * 0);
    player.setLeadership(player.getLeadership() * 1);
    player.setOffTheBall(player.getOffTheBall() * 1);
    player.setPositioning(player.getPositioning() * 5);
    player.setTeamwork(player.getTeamwork() * 2);
    player.setVision(player.getVision() * 4);
    player.setWorkRate(player.getWorkRate() * 4);
    player.setAcceleration(player.getAcceleration() * 6);
    player.setAgility(player.getAgility() * 6);
    player.setBalance(player.getBalance() * 2);
    player.setJumpingReach(player.getJumpingReach() * 1);
    player.setNaturalFitness(player.getNaturalFitness() * 0);
    player.setPace(player.getPace() * 4);
    player.setStamina(player.getStamina() * 4);
    player.setStrength(player.getStrength() * 5);
    return player;
  }
}
