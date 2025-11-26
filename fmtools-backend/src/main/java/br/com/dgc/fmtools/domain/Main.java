package br.com.dgc.fmtools.domain;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

import br.com.dgc.fmtools.domain.exceptions.InvalidFieldPositionAndRoleCombination;
import br.com.dgc.fmtools.domain.exceptions.InvalidPositionsSizeException;
import br.com.dgc.fmtools.domain.exceptions.InvalidRoleAndDutyCombination;
import br.com.dgc.fmtools.domain.exceptions.NotUniqueFieldPositionsException;
import br.com.dgc.fmtools.domain.model.Calculator;
import br.com.dgc.fmtools.domain.model.Formation;
import br.com.dgc.fmtools.domain.model.Player;
import br.com.dgc.fmtools.domain.model.Squad;
import br.com.dgc.fmtools.domain.model.Tactic;
import br.com.dgc.fmtools.domain.model.TacticalPosition;
import br.com.dgc.fmtools.domain.model.TacticalStyle;
import br.com.dgc.fmtools.domain.model.Team;
import br.com.dgc.fmtools.domain.model.constants.Duty;
import br.com.dgc.fmtools.domain.model.constants.FieldPosition;
import br.com.dgc.fmtools.domain.model.constants.GoalkeepingAttributes;
import br.com.dgc.fmtools.domain.model.constants.MentalAttributes;
import br.com.dgc.fmtools.domain.model.constants.PhysicalAttributes;
import br.com.dgc.fmtools.domain.model.constants.Role;
import br.com.dgc.fmtools.domain.model.constants.TechnicalAttributes;

public class Main {
        public static void main(String[] args) throws InvalidPositionsSizeException, NotUniqueFieldPositionsException,
                        InvalidFieldPositionAndRoleCombination, InvalidRoleAndDutyCombination {
                List<Player> players = List.of(
                                new Player(UUID.randomUUID(), "Marcelo", Main.generateRandomAttributes()),
                                new Player(UUID.randomUUID(), "Danilo", Main.generateRandomAttributes()),
                                new Player(UUID.randomUUID(), "Fábio Aguiar", Main.generateRandomAttributes()),
                                new Player(UUID.randomUUID(), "Luís Pedro", Main.generateRandomAttributes()),
                                new Player(UUID.randomUUID(), "Alex Murici", Main.generateRandomAttributes()),
                                new Player(UUID.randomUUID(), "Netinho", Main.generateRandomAttributes()),
                                new Player(UUID.randomUUID(), "Jordan Souza", Main.generateRandomAttributes()),
                                new Player(UUID.randomUUID(), "Marcos Aurélio", Main.generateRandomAttributes()),
                                new Player(UUID.randomUUID(), "Lucas Campos", Main.generateRandomAttributes()),
                                new Player(UUID.randomUUID(), "Elielton", Main.generateRandomAttributes()),
                                new Player(UUID.randomUUID(), "Adriano Napão", Main.generateRandomAttributes()),
                                new Player(UUID.randomUUID(), "Teste 1", Main.generateRandomAttributes()),
                                new Player(UUID.randomUUID(), "Teste 2", Main.generateRandomAttributes()));

                List<Squad> squads = List.of(new Squad("Senior Squad", players));

                List<TacticalPosition> tacticalPositions = List.of(
                                new TacticalPosition(UUID.randomUUID(), FieldPosition.GK, Role.SWEEPER_KEEPER,
                                                Duty.SUPPORT),
                                new TacticalPosition(UUID.randomUUID(), FieldPosition.DL, Role.WING_BACK, Duty.SUPPORT),
                                new TacticalPosition(UUID.randomUUID(), FieldPosition.DCL, Role.BALL_PLAYING_DEFENDER,
                                                Duty.DEFEND),
                                new TacticalPosition(UUID.randomUUID(), FieldPosition.DCR, Role.CENTRAL_DEFENDER,
                                                Duty.DEFEND),
                                new TacticalPosition(UUID.randomUUID(), FieldPosition.DR, Role.WING_BACK, Duty.ATTACK),
                                new TacticalPosition(UUID.randomUUID(), FieldPosition.DM, Role.REGISTA, Duty.SUPPORT),
                                new TacticalPosition(UUID.randomUUID(), FieldPosition.MCL, Role.MEZZALA, Duty.SUPPORT),
                                new TacticalPosition(UUID.randomUUID(), FieldPosition.MCR, Role.BOX_TO_BOX_MIDFIELDER,
                                                Duty.SUPPORT),
                                new TacticalPosition(UUID.randomUUID(), FieldPosition.AML, Role.INSIDE_FORWARD,
                                                Duty.ATTACK),
                                new TacticalPosition(UUID.randomUUID(), FieldPosition.AMR, Role.INVERTED_WINGER,
                                                Duty.SUPPORT),
                                new TacticalPosition(UUID.randomUUID(), FieldPosition.STC, Role.PRESSING_FORWARD,
                                                Duty.ATTACK));

                Formation formation = new Formation("4-3-3 DM Wide", tacticalPositions);

                TacticalStyle tacticalStyle = new TacticalStyle("Vertical Tiki-Taka", formation);

                List<Tactic> tactics = List.of(new Tactic("1", tacticalStyle));

                Team team = new Team("AAA", squads, tactics);

                System.out.println("Team before calculation");
                System.out.println(team.toString());

                Calculator calculator = new Calculator();
                double totalWeight = calculator.calculateBestPlayersForFormation(team.getSquads().get(0).getPlayers(),
                                team.getTactics().get(0).getTacticalStyle().getFormation().getTacticalPositions());

                team.getTactics().get(0).getTacticalStyle().getFormation().setSuitability(totalWeight);

                System.out.println("Team after calculation");
                System.out.println(team.toString());

        }

        private static Map<String, Integer> generateRandomAttributes() {
                Map<String, Integer> attributes = new HashMap<>();

                Arrays.stream(GoalkeepingAttributes.values()).forEach(
                                attrib -> attributes.put(attrib.name(), (int) (Math.random() * 20 + 1)));

                Arrays.stream(MentalAttributes.values()).forEach(
                                attrib -> attributes.put(attrib.name(), (int) (Math.random() * 20 + 1)));

                Arrays.stream(PhysicalAttributes.values()).forEach(
                                attrib -> attributes.put(attrib.name(), (int) (Math.random() * 20 + 1)));

                Arrays.stream(TechnicalAttributes.values()).forEach(
                                attrib -> attributes.put(attrib.name(), (int) (Math.random() * 20 + 1)));

                return attributes;
        }
}