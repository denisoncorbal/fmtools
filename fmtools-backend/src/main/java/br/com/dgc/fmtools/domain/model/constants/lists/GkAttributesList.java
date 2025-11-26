package br.com.dgc.fmtools.domain.model.constants.lists;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import br.com.dgc.fmtools.domain.model.constants.Duty;
import br.com.dgc.fmtools.domain.model.constants.FieldPosition;
import br.com.dgc.fmtools.domain.model.constants.GoalkeepingAttributes;
import br.com.dgc.fmtools.domain.model.constants.MentalAttributes;
import br.com.dgc.fmtools.domain.model.constants.PhysicalAttributes;
import br.com.dgc.fmtools.domain.model.constants.Role;
import br.com.dgc.fmtools.domain.model.interfaces.PlayerAttributes;

public class GkAttributesList {
        private Map<String, List<PlayerAttributes>> preferableAttributesMapping = new HashMap<>();
        private Map<String, List<PlayerAttributes>> keyAttributesMapping = new HashMap<>();

        public Map<String, List<PlayerAttributes>> getPreferableAttributesMapping() {
                return preferableAttributesMapping;
        }

        public Map<String, List<PlayerAttributes>> getKeyAttributesMapping() {
                return keyAttributesMapping;
        }

        public GkAttributesList() {
                // GK GOALKEEPER DEFEND

                keyAttributesMapping.put(FieldPosition.GK.name() + Role.GOALKEEPER.name() + Duty.DEFEND.name(),
                                List.of(GoalkeepingAttributes.AERIAL_REACH, GoalkeepingAttributes.COMMAND_OF_AREA,
                                                GoalkeepingAttributes.COMMUNICATION, GoalkeepingAttributes.HANDLING,
                                                GoalkeepingAttributes.KICKING, GoalkeepingAttributes.REFLEXES,
                                                MentalAttributes.CONCENTRATION,
                                                MentalAttributes.POSITIONING, PhysicalAttributes.AGILITY));
                preferableAttributesMapping.put(FieldPosition.GK.name() + Role.GOALKEEPER.name() + Duty.DEFEND.name(),
                                List.of(GoalkeepingAttributes.ONE_ON_ONES, GoalkeepingAttributes.THROWING,
                                                MentalAttributes.ANTICIPATION, MentalAttributes.DECISIONS));

                // GK SWEEPER KEEPER DEFEND
                keyAttributesMapping.put(FieldPosition.GK.name() + Role.SWEEPER_KEEPER.name() + Duty.DEFEND.name(),
                                List.of(GoalkeepingAttributes.COMMAND_OF_AREA, GoalkeepingAttributes.KICKING,
                                                GoalkeepingAttributes.ONE_ON_ONES, GoalkeepingAttributes.REFLEXES,
                                                MentalAttributes.ANTICIPATION, MentalAttributes.CONCENTRATION,
                                                MentalAttributes.POSITIONING,
                                                PhysicalAttributes.AGILITY));

                preferableAttributesMapping.put(
                                FieldPosition.GK.name() + Role.SWEEPER_KEEPER.name() + Duty.DEFEND.name(),
                                List.of(GoalkeepingAttributes.AERIAL_REACH, GoalkeepingAttributes.COMMUNICATION,
                                                GoalkeepingAttributes.FIRST_TOUCH, GoalkeepingAttributes.HANDLING,
                                                GoalkeepingAttributes.PASSING, GoalkeepingAttributes.RUSHING_OUT,
                                                GoalkeepingAttributes.THROWING, MentalAttributes.COMPOSURE,
                                                MentalAttributes.DECISIONS,
                                                MentalAttributes.VISION, PhysicalAttributes.ACCELERATION));

                // GK SWEEPER KEEPER SUPPORT
                keyAttributesMapping.put(FieldPosition.GK.name() + Role.SWEEPER_KEEPER.name() + Duty.SUPPORT.name(),
                                List.of(GoalkeepingAttributes.COMMAND_OF_AREA, GoalkeepingAttributes.KICKING,
                                                GoalkeepingAttributes.ONE_ON_ONES, GoalkeepingAttributes.REFLEXES,
                                                GoalkeepingAttributes.RUSHING_OUT,
                                                MentalAttributes.ANTICIPATION, MentalAttributes.COMPOSURE,
                                                MentalAttributes.CONCENTRATION,
                                                MentalAttributes.POSITIONING,
                                                PhysicalAttributes.AGILITY));

                preferableAttributesMapping.put(
                                FieldPosition.GK.name() + Role.SWEEPER_KEEPER.name() + Duty.SUPPORT.name(),
                                List.of(GoalkeepingAttributes.AERIAL_REACH, GoalkeepingAttributes.COMMUNICATION,
                                                GoalkeepingAttributes.FIRST_TOUCH, GoalkeepingAttributes.HANDLING,
                                                GoalkeepingAttributes.PASSING,
                                                GoalkeepingAttributes.THROWING, MentalAttributes.DECISIONS,
                                                MentalAttributes.VISION, PhysicalAttributes.ACCELERATION));

                // GK SWEEPER KEEPER ATTACK
                keyAttributesMapping.put(FieldPosition.GK.name() + Role.SWEEPER_KEEPER.name() + Duty.ATTACK.name(),
                                List.of(GoalkeepingAttributes.COMMAND_OF_AREA, GoalkeepingAttributes.KICKING,
                                                GoalkeepingAttributes.ONE_ON_ONES, GoalkeepingAttributes.REFLEXES,
                                                GoalkeepingAttributes.RUSHING_OUT,
                                                MentalAttributes.ANTICIPATION, MentalAttributes.COMPOSURE,
                                                MentalAttributes.CONCENTRATION,
                                                MentalAttributes.POSITIONING,
                                                PhysicalAttributes.AGILITY));

                preferableAttributesMapping.put(
                                FieldPosition.GK.name() + Role.SWEEPER_KEEPER.name() + Duty.ATTACK.name(),
                                List.of(GoalkeepingAttributes.AERIAL_REACH, GoalkeepingAttributes.COMMUNICATION,
                                                GoalkeepingAttributes.ECCENTRICITY,
                                                GoalkeepingAttributes.FIRST_TOUCH, GoalkeepingAttributes.HANDLING,
                                                GoalkeepingAttributes.PASSING,
                                                GoalkeepingAttributes.THROWING, MentalAttributes.DECISIONS,
                                                MentalAttributes.VISION, PhysicalAttributes.ACCELERATION));
        }

}
