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

public class AmlrAttributesList {
        private Map<String, List<PlayerAttributes>> preferableAttributesMapping = new HashMap<>();
        private Map<String, List<PlayerAttributes>> keyAttributesMapping = new HashMap<>();

        public Map<String, List<PlayerAttributes>> getPreferableAttributesMapping() {
                return preferableAttributesMapping;
        }

        public Map<String, List<PlayerAttributes>> getKeyAttributesMapping() {
                return keyAttributesMapping;
        }

        public AmlrAttributesList() {
                // AML WINGER SUPPORT
                keyAttributesMapping.put(
                                FieldPosition.AML.name() + Role.WINGER.name() + Duty.SUPPORT.name(),
                                List.of(
                                                TechnicalAttributes.CROSSING, TechnicalAttributes.DRIBBLING,
                                                TechnicalAttributes.TECHNIQUE,
                                                MentalAttributes.OFF_THE_BALL, PhysicalAttributes.ACCELERATION,
                                                PhysicalAttributes.PACE));

                preferableAttributesMapping.put(
                                FieldPosition.AML.name() + Role.WINGER.name() + Duty.SUPPORT.name(),
                                List.of(
                                                TechnicalAttributes.FIRST_TOUCH, TechnicalAttributes.PASSING,
                                                MentalAttributes.WORK_RATE,
                                                PhysicalAttributes.AGILITY, PhysicalAttributes.STAMINA));

                // AMR WINGER SUPPORT
                keyAttributesMapping.put(
                                FieldPosition.AMR.name() + Role.WINGER.name() + Duty.SUPPORT.name(),
                                List.of(
                                                TechnicalAttributes.CROSSING, TechnicalAttributes.DRIBBLING,
                                                TechnicalAttributes.TECHNIQUE,
                                                MentalAttributes.OFF_THE_BALL, PhysicalAttributes.ACCELERATION,
                                                PhysicalAttributes.PACE));

                preferableAttributesMapping.put(
                                FieldPosition.AMR.name() + Role.WINGER.name() + Duty.SUPPORT.name(),
                                List.of(
                                                TechnicalAttributes.FIRST_TOUCH, TechnicalAttributes.PASSING,
                                                MentalAttributes.WORK_RATE,
                                                PhysicalAttributes.AGILITY, PhysicalAttributes.STAMINA));

                // AML WINGER ATTACK
                keyAttributesMapping.put(
                                FieldPosition.AML.name() + Role.WINGER.name() + Duty.ATTACK.name(),
                                List.of(
                                                TechnicalAttributes.CROSSING, TechnicalAttributes.DRIBBLING,
                                                TechnicalAttributes.TECHNIQUE,
                                                MentalAttributes.OFF_THE_BALL, PhysicalAttributes.ACCELERATION,
                                                PhysicalAttributes.PACE));

                preferableAttributesMapping.put(
                                FieldPosition.AML.name() + Role.WINGER.name() + Duty.ATTACK.name(),
                                List.of(
                                                TechnicalAttributes.FIRST_TOUCH, TechnicalAttributes.PASSING,
                                                MentalAttributes.ANTICIPATION,
                                                MentalAttributes.FLAIR,
                                                PhysicalAttributes.AGILITY));

                // AMR WINGER ATTACK
                keyAttributesMapping.put(
                                FieldPosition.AMR.name() + Role.WINGER.name() + Duty.ATTACK.name(),
                                List.of(
                                                TechnicalAttributes.CROSSING, TechnicalAttributes.DRIBBLING,
                                                TechnicalAttributes.TECHNIQUE,
                                                MentalAttributes.OFF_THE_BALL, PhysicalAttributes.ACCELERATION,
                                                PhysicalAttributes.PACE));

                preferableAttributesMapping.put(
                                FieldPosition.AMR.name() + Role.WINGER.name() + Duty.ATTACK.name(),
                                List.of(
                                                TechnicalAttributes.FIRST_TOUCH, TechnicalAttributes.PASSING,
                                                MentalAttributes.ANTICIPATION,
                                                MentalAttributes.FLAIR,
                                                PhysicalAttributes.AGILITY));

                // AML ADVANCED PLAYMAKER SUPPORT
                keyAttributesMapping.put(
                                FieldPosition.AML.name() + Role.ADVANCED_PLAYMAKER.name() + Duty.SUPPORT.name(),
                                List.of(
                                                TechnicalAttributes.FIRST_TOUCH, TechnicalAttributes.PASSING,
                                                TechnicalAttributes.TECHNIQUE,
                                                MentalAttributes.COMPOSURE, MentalAttributes.DECISIONS,
                                                MentalAttributes.OFF_THE_BALL,
                                                MentalAttributes.TEAMWORK, MentalAttributes.VISION));

                preferableAttributesMapping.put(
                                FieldPosition.AML.name() + Role.ADVANCED_PLAYMAKER.name() + Duty.SUPPORT.name(),
                                List.of(
                                                TechnicalAttributes.DRIBBLING, MentalAttributes.ANTICIPATION,
                                                MentalAttributes.FLAIR,
                                                PhysicalAttributes.AGILITY));

                // AMR ADVANCED PLAYMAKER SUPPORT
                keyAttributesMapping.put(
                                FieldPosition.AMR.name() + Role.ADVANCED_PLAYMAKER.name() + Duty.SUPPORT.name(),
                                List.of(
                                                TechnicalAttributes.FIRST_TOUCH, TechnicalAttributes.PASSING,
                                                TechnicalAttributes.TECHNIQUE,
                                                MentalAttributes.COMPOSURE, MentalAttributes.DECISIONS,
                                                MentalAttributes.OFF_THE_BALL,
                                                MentalAttributes.TEAMWORK, MentalAttributes.VISION));

                preferableAttributesMapping.put(
                                FieldPosition.AMR.name() + Role.ADVANCED_PLAYMAKER.name() + Duty.SUPPORT.name(),
                                List.of(
                                                TechnicalAttributes.DRIBBLING, MentalAttributes.ANTICIPATION,
                                                MentalAttributes.FLAIR,
                                                PhysicalAttributes.AGILITY));

                // AML ADVANCED PLAYMAKER ATTACK
                keyAttributesMapping.put(
                                FieldPosition.AML.name() + Role.ADVANCED_PLAYMAKER.name() + Duty.ATTACK.name(),
                                List.of(
                                                TechnicalAttributes.DRIBBLING, TechnicalAttributes.FIRST_TOUCH,
                                                TechnicalAttributes.PASSING,
                                                TechnicalAttributes.TECHNIQUE,
                                                MentalAttributes.COMPOSURE, MentalAttributes.DECISIONS,
                                                MentalAttributes.OFF_THE_BALL,
                                                MentalAttributes.TEAMWORK, MentalAttributes.VISION));

                preferableAttributesMapping.put(
                                FieldPosition.AML.name() + Role.ADVANCED_PLAYMAKER.name() + Duty.ATTACK.name(),
                                List.of(
                                                MentalAttributes.ANTICIPATION, MentalAttributes.FLAIR,
                                                PhysicalAttributes.ACCELERATION, PhysicalAttributes.AGILITY));

                // AMR ADVANCED PLAYMAKER ATTACK
                keyAttributesMapping.put(
                                FieldPosition.AMR.name() + Role.ADVANCED_PLAYMAKER.name() + Duty.ATTACK.name(),
                                List.of(
                                                TechnicalAttributes.DRIBBLING, TechnicalAttributes.FIRST_TOUCH,
                                                TechnicalAttributes.PASSING,
                                                TechnicalAttributes.TECHNIQUE,
                                                MentalAttributes.COMPOSURE, MentalAttributes.DECISIONS,
                                                MentalAttributes.OFF_THE_BALL,
                                                MentalAttributes.TEAMWORK, MentalAttributes.VISION));

                preferableAttributesMapping.put(
                                FieldPosition.AMR.name() + Role.ADVANCED_PLAYMAKER.name() + Duty.ATTACK.name(),
                                List.of(
                                                MentalAttributes.ANTICIPATION, MentalAttributes.FLAIR,
                                                PhysicalAttributes.ACCELERATION, PhysicalAttributes.AGILITY));

                // AML INSIDE FORWARD SUPPORT
                keyAttributesMapping.put(
                                FieldPosition.AML.name() + Role.INSIDE_FORWARD.name() + Duty.SUPPORT.name(),
                                List.of(
                                                TechnicalAttributes.DRIBBLING, TechnicalAttributes.FIRST_TOUCH,
                                                TechnicalAttributes.PASSING,
                                                TechnicalAttributes.TECHNIQUE,
                                                MentalAttributes.OFF_THE_BALL, PhysicalAttributes.ACCELERATION,
                                                PhysicalAttributes.AGILITY,
                                                PhysicalAttributes.BALANCE));

                preferableAttributesMapping.put(
                                FieldPosition.AML.name() + Role.INSIDE_FORWARD.name() + Duty.SUPPORT.name(),
                                List.of(
                                                TechnicalAttributes.FINISHING, TechnicalAttributes.LONG_SHOTS,
                                                MentalAttributes.ANTICIPATION,
                                                MentalAttributes.COMPOSURE, MentalAttributes.FLAIR,
                                                MentalAttributes.VISION, PhysicalAttributes.PACE));

                // AMR INSIDE FORWARD SUPPORT
                keyAttributesMapping.put(
                                FieldPosition.AMR.name() + Role.INSIDE_FORWARD.name() + Duty.SUPPORT.name(),
                                List.of(
                                                TechnicalAttributes.DRIBBLING, TechnicalAttributes.FIRST_TOUCH,
                                                TechnicalAttributes.PASSING,
                                                TechnicalAttributes.TECHNIQUE,
                                                MentalAttributes.OFF_THE_BALL, PhysicalAttributes.ACCELERATION,
                                                PhysicalAttributes.AGILITY,
                                                PhysicalAttributes.BALANCE));

                preferableAttributesMapping.put(
                                FieldPosition.AMR.name() + Role.INSIDE_FORWARD.name() + Duty.SUPPORT.name(),
                                List.of(
                                                TechnicalAttributes.FINISHING, TechnicalAttributes.LONG_SHOTS,
                                                MentalAttributes.ANTICIPATION,
                                                MentalAttributes.COMPOSURE, MentalAttributes.FLAIR,
                                                MentalAttributes.VISION, PhysicalAttributes.PACE));

                // AML INSIDE FORWARD ATTACK
                keyAttributesMapping.put(
                                FieldPosition.AML.name() + Role.INSIDE_FORWARD.name() + Duty.ATTACK.name(),
                                List.of(
                                                TechnicalAttributes.DRIBBLING, TechnicalAttributes.FINISHING,
                                                TechnicalAttributes.FIRST_TOUCH,
                                                TechnicalAttributes.TECHNIQUE,
                                                MentalAttributes.OFF_THE_BALL, PhysicalAttributes.ACCELERATION,
                                                PhysicalAttributes.AGILITY,
                                                PhysicalAttributes.BALANCE));

                preferableAttributesMapping.put(
                                FieldPosition.AML.name() + Role.INSIDE_FORWARD.name() + Duty.ATTACK.name(),
                                List.of(
                                                TechnicalAttributes.LONG_SHOTS, TechnicalAttributes.PASSING,
                                                MentalAttributes.ANTICIPATION,
                                                MentalAttributes.COMPOSURE, MentalAttributes.FLAIR,
                                                PhysicalAttributes.PACE));

                // AMR INSIDE FORWARD ATTACK
                keyAttributesMapping.put(
                                FieldPosition.AMR.name() + Role.INSIDE_FORWARD.name() + Duty.ATTACK.name(),
                                List.of(
                                                TechnicalAttributes.DRIBBLING, TechnicalAttributes.FINISHING,
                                                TechnicalAttributes.FIRST_TOUCH,
                                                TechnicalAttributes.TECHNIQUE,
                                                MentalAttributes.OFF_THE_BALL, PhysicalAttributes.ACCELERATION,
                                                PhysicalAttributes.AGILITY,
                                                PhysicalAttributes.BALANCE));

                preferableAttributesMapping.put(
                                FieldPosition.AMR.name() + Role.INSIDE_FORWARD.name() + Duty.ATTACK.name(),
                                List.of(
                                                TechnicalAttributes.LONG_SHOTS, TechnicalAttributes.PASSING,
                                                MentalAttributes.ANTICIPATION,
                                                MentalAttributes.COMPOSURE, MentalAttributes.FLAIR,
                                                PhysicalAttributes.PACE));

                // AML TREQUARTISTA ATTACK
                keyAttributesMapping.put(
                                FieldPosition.AML.name() + Role.TREQUARTISTA.name() + Duty.ATTACK.name(),
                                List.of(
                                                TechnicalAttributes.DRIBBLING, TechnicalAttributes.FIRST_TOUCH,
                                                TechnicalAttributes.PASSING,
                                                TechnicalAttributes.TECHNIQUE, MentalAttributes.COMPOSURE,
                                                MentalAttributes.DECISIONS,
                                                MentalAttributes.FLAIR,
                                                MentalAttributes.OFF_THE_BALL, MentalAttributes.VISION,
                                                PhysicalAttributes.ACCELERATION));

                preferableAttributesMapping.put(
                                FieldPosition.AML.name() + Role.TREQUARTISTA.name() + Duty.ATTACK.name(),
                                List.of(
                                                TechnicalAttributes.FINISHING, MentalAttributes.ANTICIPATION,
                                                PhysicalAttributes.AGILITY, PhysicalAttributes.BALANCE));

                // AMR TREQUARTISTA ATTACK
                keyAttributesMapping.put(
                                FieldPosition.AMR.name() + Role.TREQUARTISTA.name() + Duty.ATTACK.name(),
                                List.of(
                                                TechnicalAttributes.DRIBBLING, TechnicalAttributes.FIRST_TOUCH,
                                                TechnicalAttributes.PASSING,
                                                TechnicalAttributes.TECHNIQUE, MentalAttributes.COMPOSURE,
                                                MentalAttributes.DECISIONS,
                                                MentalAttributes.FLAIR,
                                                MentalAttributes.OFF_THE_BALL, MentalAttributes.VISION,
                                                PhysicalAttributes.ACCELERATION));

                preferableAttributesMapping.put(
                                FieldPosition.AMR.name() + Role.TREQUARTISTA.name() + Duty.ATTACK.name(),
                                List.of(
                                                TechnicalAttributes.FINISHING, MentalAttributes.ANTICIPATION,
                                                PhysicalAttributes.AGILITY, PhysicalAttributes.BALANCE));

                // AML WIDE TARGET FORWARD SUPPORT
                keyAttributesMapping.put(
                                FieldPosition.AML.name() + Role.WIDE_TARGET_FORWARD.name() + Duty.SUPPORT.name(),
                                List.of(
                                                TechnicalAttributes.HEADING, MentalAttributes.BRAVERY,
                                                MentalAttributes.TEAMWORK,
                                                PhysicalAttributes.JUMPING_REACH, PhysicalAttributes.STRENGTH));

                preferableAttributesMapping.put(
                                FieldPosition.AML.name() + Role.WIDE_TARGET_FORWARD.name() + Duty.SUPPORT.name(),
                                List.of(
                                                TechnicalAttributes.CROSSING, TechnicalAttributes.FIRST_TOUCH,
                                                MentalAttributes.ANTICIPATION,
                                                MentalAttributes.OFF_THE_BALL, MentalAttributes.WORK_RATE,
                                                PhysicalAttributes.BALANCE,
                                                PhysicalAttributes.STAMINA));

                // AMR WIDE TARGET FORWARD SUPPORT
                keyAttributesMapping.put(
                                FieldPosition.AMR.name() + Role.WIDE_TARGET_FORWARD.name() + Duty.SUPPORT.name(),
                                List.of(
                                                TechnicalAttributes.HEADING, MentalAttributes.BRAVERY,
                                                MentalAttributes.TEAMWORK,
                                                PhysicalAttributes.JUMPING_REACH, PhysicalAttributes.STRENGTH));

                preferableAttributesMapping.put(
                                FieldPosition.AMR.name() + Role.WIDE_TARGET_FORWARD.name() + Duty.SUPPORT.name(),
                                List.of(
                                                TechnicalAttributes.CROSSING, TechnicalAttributes.FIRST_TOUCH,
                                                MentalAttributes.ANTICIPATION,
                                                MentalAttributes.OFF_THE_BALL, MentalAttributes.WORK_RATE,
                                                PhysicalAttributes.BALANCE,
                                                PhysicalAttributes.STAMINA));

                // AML WIDE TARGET FORWARD SUPPORT
                keyAttributesMapping.put(
                                FieldPosition.AML.name() + Role.WIDE_TARGET_FORWARD.name() + Duty.SUPPORT.name(),
                                List.of(
                                                TechnicalAttributes.HEADING, MentalAttributes.BRAVERY,
                                                MentalAttributes.OFF_THE_BALL,
                                                PhysicalAttributes.JUMPING_REACH, PhysicalAttributes.STRENGTH));

                preferableAttributesMapping.put(
                                FieldPosition.AML.name() + Role.WIDE_TARGET_FORWARD.name() + Duty.SUPPORT.name(),
                                List.of(
                                                TechnicalAttributes.CROSSING, TechnicalAttributes.FINISHING,
                                                TechnicalAttributes.FIRST_TOUCH,
                                                MentalAttributes.ANTICIPATION,
                                                MentalAttributes.TEAMWORK, MentalAttributes.WORK_RATE,
                                                PhysicalAttributes.BALANCE,
                                                PhysicalAttributes.STAMINA));

                // AMR WIDE TARGET FORWARD SUPPORT
                keyAttributesMapping.put(
                                FieldPosition.AMR.name() + Role.WIDE_TARGET_FORWARD.name() + Duty.SUPPORT.name(),
                                List.of(
                                                TechnicalAttributes.HEADING, MentalAttributes.BRAVERY,
                                                MentalAttributes.OFF_THE_BALL,
                                                PhysicalAttributes.JUMPING_REACH, PhysicalAttributes.STRENGTH));

                preferableAttributesMapping.put(
                                FieldPosition.AMR.name() + Role.WIDE_TARGET_FORWARD.name() + Duty.SUPPORT.name(),
                                List.of(
                                                TechnicalAttributes.CROSSING, TechnicalAttributes.FINISHING,
                                                TechnicalAttributes.FIRST_TOUCH,
                                                MentalAttributes.ANTICIPATION,
                                                MentalAttributes.TEAMWORK, MentalAttributes.WORK_RATE,
                                                PhysicalAttributes.BALANCE,
                                                PhysicalAttributes.STAMINA));

                // AML RAUMDEUTER ATTACK
                keyAttributesMapping.put(
                                FieldPosition.AML.name() + Role.RAUMDEUTER.name() + Duty.ATTACK.name(),
                                List.of(
                                                TechnicalAttributes.FIRST_TOUCH, TechnicalAttributes.TECHNIQUE,
                                                MentalAttributes.WORK_RATE,
                                                PhysicalAttributes.ACCELERATION, PhysicalAttributes.STAMINA));

                preferableAttributesMapping.put(
                                FieldPosition.AML.name() + Role.RAUMDEUTER.name() + Duty.ATTACK.name(),
                                List.of(
                                                TechnicalAttributes.FINISHING,
                                                MentalAttributes.ANTICIPATION, MentalAttributes.COMPOSURE,
                                                MentalAttributes.CONCENTRATION,
                                                MentalAttributes.DECISIONS, MentalAttributes.OFF_THE_BALL,
                                                PhysicalAttributes.BALANCE));

                // AMR RAUMDEUTER ATTACK
                keyAttributesMapping.put(
                                FieldPosition.AMR.name() + Role.RAUMDEUTER.name() + Duty.ATTACK.name(),
                                List.of(
                                                TechnicalAttributes.FIRST_TOUCH, TechnicalAttributes.TECHNIQUE,
                                                MentalAttributes.WORK_RATE,
                                                PhysicalAttributes.ACCELERATION, PhysicalAttributes.STAMINA));

                preferableAttributesMapping.put(
                                FieldPosition.AMR.name() + Role.RAUMDEUTER.name() + Duty.ATTACK.name(),
                                List.of(
                                                TechnicalAttributes.FINISHING,
                                                MentalAttributes.ANTICIPATION, MentalAttributes.COMPOSURE,
                                                MentalAttributes.CONCENTRATION,
                                                MentalAttributes.DECISIONS, MentalAttributes.OFF_THE_BALL,
                                                PhysicalAttributes.BALANCE));

                // AML INVERTED WINGER SUPPORT
                keyAttributesMapping.put(
                                FieldPosition.AML.name() + Role.INVERTED_WINGER.name() + Duty.SUPPORT.name(),
                                List.of(
                                                TechnicalAttributes.DRIBBLING, TechnicalAttributes.PASSING,
                                                TechnicalAttributes.TECHNIQUE,
                                                MentalAttributes.OFF_THE_BALL, PhysicalAttributes.ACCELERATION));

                preferableAttributesMapping.put(
                                FieldPosition.AML.name() + Role.INVERTED_WINGER.name() + Duty.SUPPORT.name(),
                                List.of(
                                                TechnicalAttributes.CROSSING, TechnicalAttributes.FIRST_TOUCH,
                                                TechnicalAttributes.LONG_SHOTS,
                                                MentalAttributes.COMPOSURE, MentalAttributes.DECISIONS,
                                                MentalAttributes.VISION,
                                                MentalAttributes.WORK_RATE, PhysicalAttributes.AGILITY,
                                                PhysicalAttributes.PACE,
                                                PhysicalAttributes.STAMINA));

                // AMR INVERTED WINGER SUPPORT
                keyAttributesMapping.put(
                                FieldPosition.AMR.name() + Role.INVERTED_WINGER.name() + Duty.SUPPORT.name(),
                                List.of(
                                                TechnicalAttributes.DRIBBLING, TechnicalAttributes.PASSING,
                                                TechnicalAttributes.TECHNIQUE,
                                                MentalAttributes.OFF_THE_BALL, PhysicalAttributes.ACCELERATION));

                preferableAttributesMapping.put(
                                FieldPosition.AMR.name() + Role.INVERTED_WINGER.name() + Duty.SUPPORT.name(),
                                List.of(
                                                TechnicalAttributes.CROSSING, TechnicalAttributes.FIRST_TOUCH,
                                                TechnicalAttributes.LONG_SHOTS,
                                                MentalAttributes.COMPOSURE, MentalAttributes.DECISIONS,
                                                MentalAttributes.VISION,
                                                MentalAttributes.WORK_RATE, PhysicalAttributes.AGILITY,
                                                PhysicalAttributes.PACE,
                                                PhysicalAttributes.STAMINA));

                // AML INVERTED WINGER ATTACK
                keyAttributesMapping.put(
                                FieldPosition.AML.name() + Role.INVERTED_WINGER.name() + Duty.ATTACK.name(),
                                List.of(
                                                TechnicalAttributes.DRIBBLING, TechnicalAttributes.PASSING,
                                                TechnicalAttributes.TECHNIQUE,
                                                MentalAttributes.OFF_THE_BALL, PhysicalAttributes.ACCELERATION,
                                                PhysicalAttributes.AGILITY));

                preferableAttributesMapping.put(
                                FieldPosition.AML.name() + Role.INVERTED_WINGER.name() + Duty.ATTACK.name(),
                                List.of(
                                                TechnicalAttributes.CROSSING, TechnicalAttributes.FIRST_TOUCH,
                                                TechnicalAttributes.LONG_SHOTS,
                                                MentalAttributes.ANTICIPATION, MentalAttributes.COMPOSURE,
                                                MentalAttributes.DECISIONS,
                                                MentalAttributes.FLAIR, MentalAttributes.VISION,
                                                PhysicalAttributes.PACE));

                // AMR INVERTED WINGER ATTACK
                keyAttributesMapping.put(
                                FieldPosition.AML.name() + Role.INVERTED_WINGER.name() + Duty.ATTACK.name(),
                                List.of(
                                                TechnicalAttributes.DRIBBLING, TechnicalAttributes.PASSING,
                                                TechnicalAttributes.TECHNIQUE,
                                                MentalAttributes.OFF_THE_BALL, PhysicalAttributes.ACCELERATION,
                                                PhysicalAttributes.AGILITY));

                preferableAttributesMapping.put(
                                FieldPosition.AML.name() + Role.INVERTED_WINGER.name() + Duty.ATTACK.name(),
                                List.of(
                                                TechnicalAttributes.CROSSING, TechnicalAttributes.FIRST_TOUCH,
                                                TechnicalAttributes.LONG_SHOTS,
                                                MentalAttributes.ANTICIPATION, MentalAttributes.COMPOSURE,
                                                MentalAttributes.DECISIONS,
                                                MentalAttributes.FLAIR, MentalAttributes.VISION,
                                                PhysicalAttributes.PACE));
        }
}
