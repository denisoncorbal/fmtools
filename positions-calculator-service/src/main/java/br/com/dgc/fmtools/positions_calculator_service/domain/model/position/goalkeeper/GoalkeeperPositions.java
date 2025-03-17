package br.com.dgc.fmtools.positions_calculator_service.domain.model.position.goalkeeper;

import br.com.dgc.fmtools.positions_calculator_service.domain.model.player.GoalkeeperPlayer;

public interface GoalkeeperPositions {
  default GoalkeeperPlayer applyAttributeWeight(GoalkeeperPlayer initPlayer) {
    GoalkeeperPlayer player = new GoalkeeperPlayer(initPlayer);
    player.setFreeKickTaking(player.getFreeKickTaking() * 0);
    player.setPenaltyTaking(player.getPenaltyTaking() * 0);
    player.setTechnique(player.getTechnique() * 1);
    player.setAggression(player.getAggression() * 0);
    player.setAnticipation(player.getAnticipation() * 3);
    player.setBravery(player.getBravery() * 6);
    player.setComposure(player.getComposure() * 2);
    player.setConcentration(player.getConcentration() * 6);
    player.setDecisions(player.getDecisions() * 10);
    player.setDetermination(player.getDetermination() * 0);
    player.setFlair(player.getFlair() * 0);
    player.setLeadership(player.getLeadership() * 2);
    player.setOffTheBall(player.getOffTheBall() * 0);
    player.setPositioning(player.getPositioning() * 5);
    player.setTeamwork(player.getTeamwork() * 2);
    player.setVision(player.getVision() * 1);
    player.setWorkRate(player.getWorkRate() * 1);
    player.setAcceleration(player.getAcceleration() * 6);
    player.setAgility(player.getAgility() * 8);
    player.setBalance(player.getBalance() * 2);
    player.setJumpingReach(player.getJumpingReach() * 1);
    player.setNaturalFitness(player.getNaturalFitness() * 0);
    player.setPace(player.getPace() * 3);
    player.setStamina(player.getStamina() * 1);
    player.setStrength(player.getStrength() * 4);
    player.setAerialReach(player.getAerialReach() * 6);
    player.setCommandOfArea(player.getCommandOfArea() * 6);
    player.setCommunication(player.getCommunication() * 5);
    player.setEccentricity(player.getEccentricity() * 0);
    player.setFirstTouch(player.getFirstTouch() * 1);
    player.setHandling(player.getHandling() * 8);
    player.setKicking(player.getKicking() * 5);
    player.setOneOnOnes(player.getOneOnOnes() * 4);
    player.setPassing(player.getPassing() * 3);
    player.setPunching(player.getPunching() * 0);
    player.setReflexes(player.getReflexes() * 8);
    player.setRushingOut(player.getRushingOut() * 0);
    player.setThrowing(player.getThrowing() * 3);

    return player;
  }
}
