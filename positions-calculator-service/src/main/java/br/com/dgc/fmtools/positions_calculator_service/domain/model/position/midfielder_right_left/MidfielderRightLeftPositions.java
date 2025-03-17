package br.com.dgc.fmtools.positions_calculator_service.domain.model.position.midfielder_right_left;

import br.com.dgc.fmtools.positions_calculator_service.domain.model.player.LinePlayer;

public interface MidfielderRightLeftPositions {
  default LinePlayer applyAttributeWeight(LinePlayer initPlayer) {
    LinePlayer player = new LinePlayer(initPlayer);
    player.setCorners(player.getCorners() * 1);
    player.setCrossing(player.getCrossing() * 5);
    player.setDribbling(player.getDribbling() * 3);
    player.setFinishing(player.getFinishing() * 2);
    player.setFirstTouch(player.getFirstTouch() * 4);
    player.setFreeKickTaking(player.getFreeKickTaking() * 1);
    player.setHeading(player.getHeading() * 1);
    player.setLongShots(player.getLongShots() * 2);
    player.setLongThrows(player.getLongThrows() * 1);
    player.setMarking(player.getMarking() * 1);
    player.setPassing(player.getPassing() * 3);
    player.setPenaltyTaking(player.getPenaltyTaking() * 1);
    player.setTackling(player.getTackling() * 2);
    player.setTechnique(player.getTechnique() * 4);
    player.setAggression(player.getAggression() * 0);
    player.setAnticipation(player.getAnticipation() * 3);
    player.setBravery(player.getBravery() * 1);
    player.setComposure(player.getComposure() * 3);
    player.setConcentration(player.getConcentration() * 2);
    player.setDecisions(player.getDecisions() * 5);
    player.setDetermination(player.getDetermination() * 0);
    player.setFlair(player.getFlair() * 0);
    player.setLeadership(player.getLeadership() * 1);
    player.setOffTheBall(player.getOffTheBall() * 2);
    player.setPositioning(player.getPositioning() * 1);
    player.setTeamwork(player.getTeamwork() * 2);
    player.setVision(player.getVision() * 3);
    player.setWorkRate(player.getWorkRate() * 3);
    player.setAcceleration(player.getAcceleration() * 8);
    player.setAgility(player.getAgility() * 6);
    player.setBalance(player.getBalance() * 2);
    player.setJumpingReach(player.getJumpingReach() * 1);
    player.setNaturalFitness(player.getNaturalFitness() * 0);
    player.setPace(player.getPace() * 6);
    player.setStamina(player.getStamina() * 5);
    player.setStrength(player.getStrength() * 3);
    return player;
  }
}
