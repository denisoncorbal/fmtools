package br.com.dgc.fmtools.domain.model.constants.lists;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import br.com.dgc.fmtools.domain.model.constants.Duty;
import br.com.dgc.fmtools.domain.model.constants.FieldPosition;
import br.com.dgc.fmtools.domain.model.constants.MentalAttributes;
import br.com.dgc.fmtools.domain.model.constants.PhysicalAttributes;
import br.com.dgc.fmtools.domain.model.constants.Role;
import br.com.dgc.fmtools.domain.model.constants.TechnicalAttributes;
import br.com.dgc.fmtools.domain.model.interfaces.PlayerAttributes;

public class AmclrAttributesList {
        private Map<String, List<PlayerAttributes>> preferableAttributesMapping = new HashMap<>();
        private Map<String, List<PlayerAttributes>> keyAttributesMapping = new HashMap<>();

        public Map<String, List<PlayerAttributes>> getPreferableAttributesMapping() {
                return preferableAttributesMapping;
        }

        public Map<String, List<PlayerAttributes>> getKeyAttributesMapping() {
                return keyAttributesMapping;
        }

        public AmclrAttributesList() {
                // AMCL ATTACKING MIDFIELDER SUPPORT
                keyAttributesMapping.put(
                                FieldPosition.AMCL.name() + Role.ATTACKING_MIDFIELDER.name() + Duty.SUPPORT.name(),
                                List.of(
                                                TechnicalAttributes.FIRST_TOUCH, TechnicalAttributes.LONG_SHOTS,
                                                TechnicalAttributes.PASSING,
                                                TechnicalAttributes.TECHNIQUE, MentalAttributes.ANTICIPATION,
                                                MentalAttributes.DECISIONS,
                                                MentalAttributes.FLAIR, MentalAttributes.OFF_THE_BALL));

                preferableAttributesMapping.put(
                                FieldPosition.AMCL.name() + Role.ATTACKING_MIDFIELDER.name() + Duty.SUPPORT.name(),
                                List.of(
                                                TechnicalAttributes.DRIBBLING, MentalAttributes.COMPOSURE,
                                                MentalAttributes.VISION,
                                                PhysicalAttributes.AGILITY));

                // AMC ATTACKING MIDFIELDER SUPPORT
                keyAttributesMapping.put(
                                FieldPosition.AMC.name() + Role.ATTACKING_MIDFIELDER.name() + Duty.SUPPORT.name(),
                                List.of(
                                                TechnicalAttributes.FIRST_TOUCH, TechnicalAttributes.LONG_SHOTS,
                                                TechnicalAttributes.PASSING,
                                                TechnicalAttributes.TECHNIQUE, MentalAttributes.ANTICIPATION,
                                                MentalAttributes.DECISIONS,
                                                MentalAttributes.FLAIR, MentalAttributes.OFF_THE_BALL));

                preferableAttributesMapping.put(
                                FieldPosition.AMC.name() + Role.ATTACKING_MIDFIELDER.name() + Duty.SUPPORT.name(),
                                List.of(
                                                TechnicalAttributes.DRIBBLING, MentalAttributes.COMPOSURE,
                                                MentalAttributes.VISION,
                                                PhysicalAttributes.AGILITY));

                // AMCR ATTACKING MIDFIELDER SUPPORT
                keyAttributesMapping.put(
                                FieldPosition.AMCR.name() + Role.ATTACKING_MIDFIELDER.name() + Duty.SUPPORT.name(),
                                List.of(
                                                TechnicalAttributes.FIRST_TOUCH, TechnicalAttributes.LONG_SHOTS,
                                                TechnicalAttributes.PASSING,
                                                TechnicalAttributes.TECHNIQUE, MentalAttributes.ANTICIPATION,
                                                MentalAttributes.DECISIONS,
                                                MentalAttributes.FLAIR, MentalAttributes.OFF_THE_BALL));

                preferableAttributesMapping.put(
                                FieldPosition.AMCR.name() + Role.ATTACKING_MIDFIELDER.name() + Duty.SUPPORT.name(),
                                List.of(
                                                TechnicalAttributes.DRIBBLING, MentalAttributes.COMPOSURE,
                                                MentalAttributes.VISION,
                                                PhysicalAttributes.AGILITY));

                // AMCL ATTACKING MIDFIELDER ATTACK
                keyAttributesMapping.put(
                                FieldPosition.AMCL.name() + Role.ATTACKING_MIDFIELDER.name() + Duty.ATTACK.name(),
                                List.of(
                                                TechnicalAttributes.DRIBBLING, TechnicalAttributes.FIRST_TOUCH,
                                                TechnicalAttributes.LONG_SHOTS,
                                                TechnicalAttributes.PASSING,
                                                TechnicalAttributes.TECHNIQUE, MentalAttributes.ANTICIPATION,
                                                MentalAttributes.DECISIONS,
                                                MentalAttributes.FLAIR, MentalAttributes.OFF_THE_BALL));

                preferableAttributesMapping.put(
                                FieldPosition.AMCL.name() + Role.ATTACKING_MIDFIELDER.name() + Duty.ATTACK.name(),
                                List.of(
                                                TechnicalAttributes.FINISHING, MentalAttributes.COMPOSURE,
                                                MentalAttributes.VISION,
                                                PhysicalAttributes.AGILITY));

                // AMC ATTACKING MIDFIELDER ATTACK
                keyAttributesMapping.put(
                                FieldPosition.AMC.name() + Role.ATTACKING_MIDFIELDER.name() + Duty.ATTACK.name(),
                                List.of(
                                                TechnicalAttributes.DRIBBLING, TechnicalAttributes.FIRST_TOUCH,
                                                TechnicalAttributes.LONG_SHOTS,
                                                TechnicalAttributes.PASSING,
                                                TechnicalAttributes.TECHNIQUE, MentalAttributes.ANTICIPATION,
                                                MentalAttributes.DECISIONS,
                                                MentalAttributes.FLAIR, MentalAttributes.OFF_THE_BALL));

                preferableAttributesMapping.put(
                                FieldPosition.AMC.name() + Role.ATTACKING_MIDFIELDER.name() + Duty.ATTACK.name(),
                                List.of(
                                                TechnicalAttributes.FINISHING, MentalAttributes.COMPOSURE,
                                                MentalAttributes.VISION,
                                                PhysicalAttributes.AGILITY));

                // AMCR ATTACKING MIDFIELDER ATTACK
                keyAttributesMapping.put(
                                FieldPosition.AMCR.name() + Role.ATTACKING_MIDFIELDER.name() + Duty.ATTACK.name(),
                                List.of(
                                                TechnicalAttributes.DRIBBLING, TechnicalAttributes.FIRST_TOUCH,
                                                TechnicalAttributes.LONG_SHOTS,
                                                TechnicalAttributes.PASSING,
                                                TechnicalAttributes.TECHNIQUE, MentalAttributes.ANTICIPATION,
                                                MentalAttributes.DECISIONS,
                                                MentalAttributes.FLAIR, MentalAttributes.OFF_THE_BALL));

                preferableAttributesMapping.put(
                                FieldPosition.AMCR.name() + Role.ATTACKING_MIDFIELDER.name() + Duty.ATTACK.name(),
                                List.of(
                                                TechnicalAttributes.FINISHING, MentalAttributes.COMPOSURE,
                                                MentalAttributes.VISION,
                                                PhysicalAttributes.AGILITY));

                // AMCL ADVANCED PLAYMAKER SUPPORT
                keyAttributesMapping.put(
                                FieldPosition.AMCL.name() + Role.ADVANCED_PLAYMAKER.name() + Duty.SUPPORT.name(),
                                List.of(
                                                TechnicalAttributes.FIRST_TOUCH, TechnicalAttributes.PASSING,
                                                TechnicalAttributes.TECHNIQUE,
                                                MentalAttributes.COMPOSURE, MentalAttributes.DECISIONS,
                                                MentalAttributes.OFF_THE_BALL, MentalAttributes.TEAMWORK,
                                                MentalAttributes.VISION));

                preferableAttributesMapping.put(
                                FieldPosition.AMCL.name() + Role.ADVANCED_PLAYMAKER.name() + Duty.SUPPORT.name(),
                                List.of(
                                                TechnicalAttributes.DRIBBLING, MentalAttributes.ANTICIPATION,
                                                MentalAttributes.FLAIR, PhysicalAttributes.AGILITY));

                // AMC ADVANCED PLAYMAKER SUPPORT
                keyAttributesMapping.put(
                                FieldPosition.AMC.name() + Role.ADVANCED_PLAYMAKER.name() + Duty.SUPPORT.name(),
                                List.of(
                                                TechnicalAttributes.FIRST_TOUCH, TechnicalAttributes.PASSING,
                                                TechnicalAttributes.TECHNIQUE,
                                                MentalAttributes.COMPOSURE, MentalAttributes.DECISIONS,
                                                MentalAttributes.OFF_THE_BALL, MentalAttributes.TEAMWORK,
                                                MentalAttributes.VISION));

                preferableAttributesMapping.put(
                                FieldPosition.AMC.name() + Role.ADVANCED_PLAYMAKER.name() + Duty.SUPPORT.name(),
                                List.of(
                                                TechnicalAttributes.DRIBBLING, MentalAttributes.ANTICIPATION,
                                                MentalAttributes.FLAIR, PhysicalAttributes.AGILITY));

                // AMCR ADVANCED PLAYMAKER SUPPORT
                keyAttributesMapping.put(
                                FieldPosition.AMCR.name() + Role.ADVANCED_PLAYMAKER.name() + Duty.SUPPORT.name(),
                                List.of(
                                                TechnicalAttributes.FIRST_TOUCH, TechnicalAttributes.PASSING,
                                                TechnicalAttributes.TECHNIQUE,
                                                MentalAttributes.COMPOSURE, MentalAttributes.DECISIONS,
                                                MentalAttributes.OFF_THE_BALL, MentalAttributes.TEAMWORK,
                                                MentalAttributes.VISION));

                preferableAttributesMapping.put(
                                FieldPosition.AMCR.name() + Role.ADVANCED_PLAYMAKER.name() + Duty.SUPPORT.name(),
                                List.of(
                                                TechnicalAttributes.DRIBBLING, MentalAttributes.ANTICIPATION,
                                                MentalAttributes.FLAIR, PhysicalAttributes.AGILITY));

                // AMCL ADVANCED PLAYMAKER ATTACK
                keyAttributesMapping.put(
                                FieldPosition.AMCL.name() + Role.ADVANCED_PLAYMAKER.name() + Duty.ATTACK.name(),
                                List.of(
                                                TechnicalAttributes.DRIBBLING, TechnicalAttributes.FIRST_TOUCH,
                                                TechnicalAttributes.PASSING, TechnicalAttributes.TECHNIQUE,
                                                MentalAttributes.COMPOSURE, MentalAttributes.DECISIONS,
                                                MentalAttributes.OFF_THE_BALL, MentalAttributes.TEAMWORK,
                                                MentalAttributes.VISION));

                preferableAttributesMapping.put(
                                FieldPosition.AMCL.name() + Role.ADVANCED_PLAYMAKER.name() + Duty.ATTACK.name(),
                                List.of(
                                                MentalAttributes.ANTICIPATION, MentalAttributes.FLAIR,
                                                PhysicalAttributes.ACCELERATION, PhysicalAttributes.AGILITY));

                // AMC ADVANCED PLAYMAKER ATTACK
                keyAttributesMapping.put(
                                FieldPosition.AMC.name() + Role.ADVANCED_PLAYMAKER.name() + Duty.ATTACK.name(),
                                List.of(
                                                TechnicalAttributes.DRIBBLING, TechnicalAttributes.FIRST_TOUCH,
                                                TechnicalAttributes.PASSING, TechnicalAttributes.TECHNIQUE,
                                                MentalAttributes.COMPOSURE, MentalAttributes.DECISIONS,
                                                MentalAttributes.OFF_THE_BALL, MentalAttributes.TEAMWORK,
                                                MentalAttributes.VISION));

                preferableAttributesMapping.put(
                                FieldPosition.AMC.name() + Role.ADVANCED_PLAYMAKER.name() + Duty.ATTACK.name(),
                                List.of(
                                                MentalAttributes.ANTICIPATION, MentalAttributes.FLAIR,
                                                PhysicalAttributes.ACCELERATION, PhysicalAttributes.AGILITY));

                // AMCR ADVANCED PLAYMAKER ATTACK
                keyAttributesMapping.put(
                                FieldPosition.AMCR.name() + Role.ADVANCED_PLAYMAKER.name() + Duty.ATTACK.name(),
                                List.of(
                                                TechnicalAttributes.DRIBBLING, TechnicalAttributes.FIRST_TOUCH,
                                                TechnicalAttributes.PASSING, TechnicalAttributes.TECHNIQUE,
                                                MentalAttributes.COMPOSURE, MentalAttributes.DECISIONS,
                                                MentalAttributes.OFF_THE_BALL, MentalAttributes.TEAMWORK,
                                                MentalAttributes.VISION));

                preferableAttributesMapping.put(
                                FieldPosition.AMCR.name() + Role.ADVANCED_PLAYMAKER.name() + Duty.ATTACK.name(),
                                List.of(
                                                MentalAttributes.ANTICIPATION, MentalAttributes.FLAIR,
                                                PhysicalAttributes.ACCELERATION, PhysicalAttributes.AGILITY));

                // AMCL TREQUARTISTA ATTACK
                keyAttributesMapping.put(
                                FieldPosition.AMCL.name() + Role.TREQUARTISTA.name() + Duty.ATTACK.name(),
                                List.of(
                                                TechnicalAttributes.DRIBBLING, TechnicalAttributes.FIRST_TOUCH,
                                                TechnicalAttributes.PASSING, TechnicalAttributes.TECHNIQUE,
                                                MentalAttributes.COMPOSURE, MentalAttributes.DECISIONS,
                                                MentalAttributes.FLAIR,
                                                MentalAttributes.OFF_THE_BALL,
                                                MentalAttributes.VISION, PhysicalAttributes.ACCELERATION));

                preferableAttributesMapping.put(
                                FieldPosition.AMCL.name() + Role.TREQUARTISTA.name() + Duty.ATTACK.name(),
                                List.of(
                                                TechnicalAttributes.FINISHING, MentalAttributes.ANTICIPATION,
                                                PhysicalAttributes.AGILITY, PhysicalAttributes.BALANCE));

                // AMC TREQUARTISTA ATTACK
                keyAttributesMapping.put(
                                FieldPosition.AMC.name() + Role.TREQUARTISTA.name() + Duty.ATTACK.name(),
                                List.of(
                                                TechnicalAttributes.DRIBBLING, TechnicalAttributes.FIRST_TOUCH,
                                                TechnicalAttributes.PASSING, TechnicalAttributes.TECHNIQUE,
                                                MentalAttributes.COMPOSURE, MentalAttributes.DECISIONS,
                                                MentalAttributes.FLAIR,
                                                MentalAttributes.OFF_THE_BALL,
                                                MentalAttributes.VISION, PhysicalAttributes.ACCELERATION));

                preferableAttributesMapping.put(
                                FieldPosition.AMC.name() + Role.TREQUARTISTA.name() + Duty.ATTACK.name(),
                                List.of(
                                                TechnicalAttributes.FINISHING, MentalAttributes.ANTICIPATION,
                                                PhysicalAttributes.AGILITY, PhysicalAttributes.BALANCE));

                // AMCR TREQUARTISTA ATTACK
                keyAttributesMapping.put(
                                FieldPosition.AMCR.name() + Role.TREQUARTISTA.name() + Duty.ATTACK.name(),
                                List.of(
                                                TechnicalAttributes.DRIBBLING, TechnicalAttributes.FIRST_TOUCH,
                                                TechnicalAttributes.PASSING, TechnicalAttributes.TECHNIQUE,
                                                MentalAttributes.COMPOSURE, MentalAttributes.DECISIONS,
                                                MentalAttributes.FLAIR,
                                                MentalAttributes.OFF_THE_BALL,
                                                MentalAttributes.VISION, PhysicalAttributes.ACCELERATION));

                preferableAttributesMapping.put(
                                FieldPosition.AMCR.name() + Role.TREQUARTISTA.name() + Duty.ATTACK.name(),
                                List.of(
                                                TechnicalAttributes.FINISHING, MentalAttributes.ANTICIPATION,
                                                PhysicalAttributes.AGILITY, PhysicalAttributes.BALANCE));

                // AMCL ENGANCHE SUPPORT
                keyAttributesMapping.put(
                                FieldPosition.AMCL.name() + Role.ENGANCHE.name() + Duty.SUPPORT.name(),
                                List.of(
                                                TechnicalAttributes.FIRST_TOUCH, TechnicalAttributes.PASSING,
                                                TechnicalAttributes.TECHNIQUE, MentalAttributes.COMPOSURE,
                                                MentalAttributes.DECISIONS, MentalAttributes.VISION));

                preferableAttributesMapping.put(
                                FieldPosition.AMCL.name() + Role.ENGANCHE.name() + Duty.SUPPORT.name(),
                                List.of(
                                                TechnicalAttributes.DRIBBLING, MentalAttributes.ANTICIPATION,
                                                MentalAttributes.FLAIR, MentalAttributes.OFF_THE_BALL,
                                                MentalAttributes.TEAMWORK, PhysicalAttributes.AGILITY));

                // AMC ENGANCHE SUPPORT
                keyAttributesMapping.put(
                                FieldPosition.AMC.name() + Role.ENGANCHE.name() + Duty.SUPPORT.name(),
                                List.of(
                                                TechnicalAttributes.FIRST_TOUCH, TechnicalAttributes.PASSING,
                                                TechnicalAttributes.TECHNIQUE, MentalAttributes.COMPOSURE,
                                                MentalAttributes.DECISIONS, MentalAttributes.VISION));

                preferableAttributesMapping.put(
                                FieldPosition.AMC.name() + Role.ENGANCHE.name() + Duty.SUPPORT.name(),
                                List.of(
                                                TechnicalAttributes.DRIBBLING, MentalAttributes.ANTICIPATION,
                                                MentalAttributes.FLAIR, MentalAttributes.OFF_THE_BALL,
                                                MentalAttributes.TEAMWORK, PhysicalAttributes.AGILITY));

                // AMCR ENGANCHE SUPPORT
                keyAttributesMapping.put(
                                FieldPosition.AMCR.name() + Role.ENGANCHE.name() + Duty.SUPPORT.name(),
                                List.of(
                                                TechnicalAttributes.FIRST_TOUCH, TechnicalAttributes.PASSING,
                                                TechnicalAttributes.TECHNIQUE, MentalAttributes.COMPOSURE,
                                                MentalAttributes.DECISIONS, MentalAttributes.VISION));

                preferableAttributesMapping.put(
                                FieldPosition.AMCR.name() + Role.ENGANCHE.name() + Duty.SUPPORT.name(),
                                List.of(
                                                TechnicalAttributes.DRIBBLING, MentalAttributes.ANTICIPATION,
                                                MentalAttributes.FLAIR, MentalAttributes.OFF_THE_BALL,
                                                MentalAttributes.TEAMWORK, PhysicalAttributes.AGILITY));

                // AMCL SHADOW STRIKER ATTACK
                keyAttributesMapping.put(
                                FieldPosition.AMCL.name() + Role.SHADOW_STRIKER.name() + Duty.ATTACK.name(),
                                List.of(
                                                TechnicalAttributes.DRIBBLING, TechnicalAttributes.FINISHING,
                                                TechnicalAttributes.FIRST_TOUCH, MentalAttributes.ANTICIPATION,
                                                MentalAttributes.COMPOSURE, MentalAttributes.OFF_THE_BALL,
                                                PhysicalAttributes.ACCELERATION));

                preferableAttributesMapping.put(
                                FieldPosition.AMCL.name() + Role.SHADOW_STRIKER.name() + Duty.ATTACK.name(),
                                List.of(
                                                TechnicalAttributes.PASSING, TechnicalAttributes.TECHNIQUE,
                                                MentalAttributes.CONCENTRATION, MentalAttributes.DECISIONS,
                                                MentalAttributes.WORK_RATE, PhysicalAttributes.AGILITY,
                                                PhysicalAttributes.BALANCE, PhysicalAttributes.PACE,
                                                PhysicalAttributes.STAMINA));

                // AMC SHADOW STRIKER ATTACK
                keyAttributesMapping.put(
                                FieldPosition.AMC.name() + Role.SHADOW_STRIKER.name() + Duty.ATTACK.name(),
                                List.of(
                                                TechnicalAttributes.DRIBBLING, TechnicalAttributes.FINISHING,
                                                TechnicalAttributes.FIRST_TOUCH, MentalAttributes.ANTICIPATION,
                                                MentalAttributes.COMPOSURE, MentalAttributes.OFF_THE_BALL,
                                                PhysicalAttributes.ACCELERATION));

                preferableAttributesMapping.put(
                                FieldPosition.AMC.name() + Role.SHADOW_STRIKER.name() + Duty.ATTACK.name(),
                                List.of(
                                                TechnicalAttributes.PASSING, TechnicalAttributes.TECHNIQUE,
                                                MentalAttributes.CONCENTRATION, MentalAttributes.DECISIONS,
                                                MentalAttributes.WORK_RATE, PhysicalAttributes.AGILITY,
                                                PhysicalAttributes.BALANCE, PhysicalAttributes.PACE,
                                                PhysicalAttributes.STAMINA));

                // AMCR SHADOW STRIKER ATTACK
                keyAttributesMapping.put(
                                FieldPosition.AMCR.name() + Role.SHADOW_STRIKER.name() + Duty.ATTACK.name(),
                                List.of(
                                                TechnicalAttributes.DRIBBLING, TechnicalAttributes.FINISHING,
                                                TechnicalAttributes.FIRST_TOUCH, MentalAttributes.ANTICIPATION,
                                                MentalAttributes.COMPOSURE, MentalAttributes.OFF_THE_BALL,
                                                PhysicalAttributes.ACCELERATION));

                preferableAttributesMapping.put(
                                FieldPosition.AMCR.name() + Role.SHADOW_STRIKER.name() + Duty.ATTACK.name(),
                                List.of(
                                                TechnicalAttributes.PASSING, TechnicalAttributes.TECHNIQUE,
                                                MentalAttributes.CONCENTRATION, MentalAttributes.DECISIONS,
                                                MentalAttributes.WORK_RATE, PhysicalAttributes.AGILITY,
                                                PhysicalAttributes.BALANCE, PhysicalAttributes.PACE,
                                                PhysicalAttributes.STAMINA));
        }
}
