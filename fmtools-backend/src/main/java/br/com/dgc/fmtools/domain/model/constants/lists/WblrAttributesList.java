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

public class WblrAttributesList {

        private Map<String, List<PlayerAttributes>> preferableAttributesMapping = new HashMap<>();
        private Map<String, List<PlayerAttributes>> keyAttributesMapping = new HashMap<>();

        public Map<String, List<PlayerAttributes>> getPreferableAttributesMapping() {
                return preferableAttributesMapping;
        }

        public Map<String, List<PlayerAttributes>> getKeyAttributesMapping() {
                return keyAttributesMapping;
        }

        public WblrAttributesList() {
                // WBL WING BACK DEFEND
                keyAttributesMapping.put(
                                FieldPosition.WBL.name() + Role.WING_BACK.name() + Duty.DEFEND.name(),
                                List.of(
                                                TechnicalAttributes.MARKING, TechnicalAttributes.TACKLING,
                                                MentalAttributes.ANTICIPATION, MentalAttributes.POSITIONING,
                                                MentalAttributes.TEAMWORK, MentalAttributes.WORK_RATE,
                                                PhysicalAttributes.ACCELERATION, PhysicalAttributes.STAMINA));

                preferableAttributesMapping.put(
                                FieldPosition.WBL.name() + Role.WING_BACK.name() + Duty.DEFEND.name(),
                                List.of(
                                                TechnicalAttributes.CROSSING, TechnicalAttributes.DRIBBLING,
                                                TechnicalAttributes.FIRST_TOUCH, TechnicalAttributes.PASSING,
                                                TechnicalAttributes.TECHNIQUE,
                                                MentalAttributes.CONCENTRATION,
                                                MentalAttributes.DECISIONS, MentalAttributes.OFF_THE_BALL,
                                                PhysicalAttributes.AGILITY, PhysicalAttributes.PACE));

                // WBR WING BACK DEFEND
                keyAttributesMapping.put(
                                FieldPosition.WBR.name() + Role.WING_BACK.name() + Duty.DEFEND.name(),
                                List.of(
                                                TechnicalAttributes.MARKING, TechnicalAttributes.TACKLING,
                                                MentalAttributes.ANTICIPATION, MentalAttributes.POSITIONING,
                                                MentalAttributes.TEAMWORK, MentalAttributes.WORK_RATE,
                                                PhysicalAttributes.ACCELERATION, PhysicalAttributes.STAMINA));

                preferableAttributesMapping.put(
                                FieldPosition.WBR.name() + Role.WING_BACK.name() + Duty.DEFEND.name(),
                                List.of(
                                                TechnicalAttributes.CROSSING, TechnicalAttributes.DRIBBLING,
                                                TechnicalAttributes.FIRST_TOUCH, TechnicalAttributes.PASSING,
                                                TechnicalAttributes.TECHNIQUE,
                                                MentalAttributes.CONCENTRATION,
                                                MentalAttributes.DECISIONS, MentalAttributes.OFF_THE_BALL,
                                                PhysicalAttributes.AGILITY, PhysicalAttributes.PACE));

                // WBL WING BACK SUPPORT
                keyAttributesMapping.put(
                                FieldPosition.WBL.name() + Role.WING_BACK.name() + Duty.SUPPORT.name(),
                                List.of(
                                                TechnicalAttributes.CROSSING, TechnicalAttributes.DRIBBLING,
                                                TechnicalAttributes.MARKING, TechnicalAttributes.TACKLING,
                                                MentalAttributes.OFF_THE_BALL, MentalAttributes.TEAMWORK,
                                                MentalAttributes.WORK_RATE,
                                                PhysicalAttributes.ACCELERATION, PhysicalAttributes.STAMINA));

                preferableAttributesMapping.put(
                                FieldPosition.WBL.name() + Role.WING_BACK.name() + Duty.SUPPORT.name(),
                                List.of(
                                                TechnicalAttributes.FIRST_TOUCH, TechnicalAttributes.PASSING,
                                                TechnicalAttributes.TECHNIQUE,
                                                MentalAttributes.ANTICIPATION, MentalAttributes.CONCENTRATION,
                                                MentalAttributes.DECISIONS, MentalAttributes.POSITIONING,
                                                PhysicalAttributes.AGILITY, PhysicalAttributes.PACE));

                // WBR WING BACK SUPPORT
                keyAttributesMapping.put(
                                FieldPosition.WBR.name() + Role.WING_BACK.name() + Duty.SUPPORT.name(),
                                List.of(
                                                TechnicalAttributes.CROSSING, TechnicalAttributes.DRIBBLING,
                                                TechnicalAttributes.MARKING, TechnicalAttributes.TACKLING,
                                                MentalAttributes.OFF_THE_BALL, MentalAttributes.TEAMWORK,
                                                MentalAttributes.WORK_RATE,
                                                PhysicalAttributes.ACCELERATION, PhysicalAttributes.STAMINA));

                preferableAttributesMapping.put(
                                FieldPosition.WBR.name() + Role.WING_BACK.name() + Duty.SUPPORT.name(),
                                List.of(
                                                TechnicalAttributes.FIRST_TOUCH, TechnicalAttributes.PASSING,
                                                TechnicalAttributes.TECHNIQUE,
                                                MentalAttributes.ANTICIPATION, MentalAttributes.CONCENTRATION,
                                                MentalAttributes.DECISIONS, MentalAttributes.POSITIONING,
                                                PhysicalAttributes.AGILITY, PhysicalAttributes.PACE));

                // WBL WING BACK ATTACK
                keyAttributesMapping.put(
                                FieldPosition.WBL.name() + Role.WING_BACK.name() + Duty.ATTACK.name(),
                                List.of(
                                                TechnicalAttributes.CROSSING, TechnicalAttributes.DRIBBLING,
                                                TechnicalAttributes.TACKLING, TechnicalAttributes.TECHNIQUE,
                                                MentalAttributes.OFF_THE_BALL, MentalAttributes.TEAMWORK,
                                                MentalAttributes.WORK_RATE,
                                                PhysicalAttributes.ACCELERATION, PhysicalAttributes.PACE,
                                                PhysicalAttributes.STAMINA));

                preferableAttributesMapping.put(
                                FieldPosition.WBL.name() + Role.WING_BACK.name() + Duty.ATTACK.name(),
                                List.of(
                                                TechnicalAttributes.FIRST_TOUCH, TechnicalAttributes.MARKING,
                                                TechnicalAttributes.PASSING,
                                                MentalAttributes.ANTICIPATION, MentalAttributes.CONCENTRATION,
                                                MentalAttributes.DECISIONS, MentalAttributes.FLAIR,
                                                MentalAttributes.POSITIONING,
                                                PhysicalAttributes.AGILITY));

                // WBR WING BACK ATTACK
                keyAttributesMapping.put(
                                FieldPosition.WBR.name() + Role.WING_BACK.name() + Duty.ATTACK.name(),
                                List.of(
                                                TechnicalAttributes.CROSSING, TechnicalAttributes.DRIBBLING,
                                                TechnicalAttributes.TACKLING, TechnicalAttributes.TECHNIQUE,
                                                MentalAttributes.OFF_THE_BALL, MentalAttributes.TEAMWORK,
                                                MentalAttributes.WORK_RATE,
                                                PhysicalAttributes.ACCELERATION, PhysicalAttributes.PACE,
                                                PhysicalAttributes.STAMINA));

                preferableAttributesMapping.put(
                                FieldPosition.WBR.name() + Role.WING_BACK.name() + Duty.ATTACK.name(),
                                List.of(
                                                TechnicalAttributes.FIRST_TOUCH, TechnicalAttributes.MARKING,
                                                TechnicalAttributes.PASSING,
                                                MentalAttributes.ANTICIPATION, MentalAttributes.CONCENTRATION,
                                                MentalAttributes.DECISIONS, MentalAttributes.FLAIR,
                                                MentalAttributes.POSITIONING,
                                                PhysicalAttributes.AGILITY));

                // WBL WING BACK AUTOMATIC
                keyAttributesMapping.put(
                                FieldPosition.WBL.name() + Role.WING_BACK.name() + Duty.AUTOMATIC.name(),
                                List.of(
                                                TechnicalAttributes.CROSSING, TechnicalAttributes.DRIBBLING,
                                                TechnicalAttributes.MARKING, TechnicalAttributes.TACKLING,
                                                MentalAttributes.OFF_THE_BALL, MentalAttributes.TEAMWORK,
                                                MentalAttributes.WORK_RATE,
                                                PhysicalAttributes.ACCELERATION,
                                                PhysicalAttributes.STAMINA));

                preferableAttributesMapping.put(
                                FieldPosition.WBL.name() + Role.WING_BACK.name() + Duty.AUTOMATIC.name(),
                                List.of(
                                                TechnicalAttributes.FIRST_TOUCH,
                                                TechnicalAttributes.PASSING, TechnicalAttributes.TECHNIQUE,
                                                MentalAttributes.ANTICIPATION, MentalAttributes.CONCENTRATION,
                                                MentalAttributes.DECISIONS,
                                                MentalAttributes.POSITIONING,
                                                PhysicalAttributes.AGILITY, PhysicalAttributes.PACE));

                // WBR WING BACK AUTOMATIC
                keyAttributesMapping.put(
                                FieldPosition.WBR.name() + Role.WING_BACK.name() + Duty.AUTOMATIC.name(),
                                List.of(
                                                TechnicalAttributes.CROSSING, TechnicalAttributes.DRIBBLING,
                                                TechnicalAttributes.MARKING, TechnicalAttributes.TACKLING,
                                                MentalAttributes.OFF_THE_BALL, MentalAttributes.TEAMWORK,
                                                MentalAttributes.WORK_RATE,
                                                PhysicalAttributes.ACCELERATION,
                                                PhysicalAttributes.STAMINA));

                preferableAttributesMapping.put(
                                FieldPosition.WBR.name() + Role.WING_BACK.name() + Duty.AUTOMATIC.name(),
                                List.of(
                                                TechnicalAttributes.FIRST_TOUCH,
                                                TechnicalAttributes.PASSING, TechnicalAttributes.TECHNIQUE,
                                                MentalAttributes.ANTICIPATION, MentalAttributes.CONCENTRATION,
                                                MentalAttributes.DECISIONS,
                                                MentalAttributes.POSITIONING,
                                                PhysicalAttributes.AGILITY, PhysicalAttributes.PACE));

                // WBL COMPLETE WING BACK SUPPORT
                keyAttributesMapping.put(
                                FieldPosition.WBL.name() + Role.COMPLETE_WING_BACK.name() + Duty.SUPPORT.name(),
                                List.of(
                                                TechnicalAttributes.CROSSING, TechnicalAttributes.DRIBBLING,
                                                TechnicalAttributes.FIRST_TOUCH, TechnicalAttributes.PASSING,
                                                TechnicalAttributes.TECHNIQUE,
                                                MentalAttributes.DECISIONS, MentalAttributes.OFF_THE_BALL,
                                                MentalAttributes.TEAMWORK,
                                                MentalAttributes.WORK_RATE,
                                                PhysicalAttributes.ACCELERATION, PhysicalAttributes.PACE,
                                                PhysicalAttributes.STAMINA));

                preferableAttributesMapping.put(
                                FieldPosition.WBL.name() + Role.COMPLETE_WING_BACK.name() + Duty.SUPPORT.name(),
                                List.of(
                                                TechnicalAttributes.TACKLING,
                                                MentalAttributes.ANTICIPATION, MentalAttributes.COMPOSURE,
                                                MentalAttributes.FLAIR,
                                                PhysicalAttributes.AGILITY, PhysicalAttributes.BALANCE));

                // WBR COMPLETE WING BACK SUPPORT
                keyAttributesMapping.put(
                                FieldPosition.WBR.name() + Role.COMPLETE_WING_BACK.name() + Duty.SUPPORT.name(),
                                List.of(
                                                TechnicalAttributes.CROSSING, TechnicalAttributes.DRIBBLING,
                                                TechnicalAttributes.FIRST_TOUCH, TechnicalAttributes.PASSING,
                                                TechnicalAttributes.TECHNIQUE,
                                                MentalAttributes.DECISIONS, MentalAttributes.OFF_THE_BALL,
                                                MentalAttributes.TEAMWORK,
                                                MentalAttributes.WORK_RATE,
                                                PhysicalAttributes.ACCELERATION, PhysicalAttributes.PACE,
                                                PhysicalAttributes.STAMINA));

                preferableAttributesMapping.put(
                                FieldPosition.WBR.name() + Role.COMPLETE_WING_BACK.name() + Duty.SUPPORT.name(),
                                List.of(
                                                TechnicalAttributes.TACKLING,
                                                MentalAttributes.ANTICIPATION, MentalAttributes.COMPOSURE,
                                                MentalAttributes.FLAIR,
                                                PhysicalAttributes.AGILITY, PhysicalAttributes.BALANCE));

                // WBL COMPLETE WING BACK ATTACK
                keyAttributesMapping.put(
                                FieldPosition.WBL.name() + Role.COMPLETE_WING_BACK.name() + Duty.ATTACK.name(),
                                List.of(
                                                TechnicalAttributes.CROSSING, TechnicalAttributes.DRIBBLING,
                                                TechnicalAttributes.FIRST_TOUCH, TechnicalAttributes.PASSING,
                                                TechnicalAttributes.TECHNIQUE,
                                                MentalAttributes.DECISIONS, MentalAttributes.FLAIR,
                                                MentalAttributes.OFF_THE_BALL,
                                                MentalAttributes.TEAMWORK,
                                                MentalAttributes.WORK_RATE,
                                                PhysicalAttributes.ACCELERATION, PhysicalAttributes.PACE,
                                                PhysicalAttributes.STAMINA));

                preferableAttributesMapping.put(
                                FieldPosition.WBL.name() + Role.COMPLETE_WING_BACK.name() + Duty.ATTACK.name(),
                                List.of(
                                                TechnicalAttributes.TACKLING,
                                                MentalAttributes.ANTICIPATION, MentalAttributes.COMPOSURE,
                                                PhysicalAttributes.AGILITY, PhysicalAttributes.BALANCE));

                // WBR COMPLETE WING BACK ATTACK
                keyAttributesMapping.put(
                                FieldPosition.WBR.name() + Role.COMPLETE_WING_BACK.name() + Duty.ATTACK.name(),
                                List.of(
                                                TechnicalAttributes.CROSSING, TechnicalAttributes.DRIBBLING,
                                                TechnicalAttributes.FIRST_TOUCH, TechnicalAttributes.PASSING,
                                                TechnicalAttributes.TECHNIQUE,
                                                MentalAttributes.DECISIONS, MentalAttributes.FLAIR,
                                                MentalAttributes.OFF_THE_BALL,
                                                MentalAttributes.TEAMWORK,
                                                MentalAttributes.WORK_RATE,
                                                PhysicalAttributes.ACCELERATION, PhysicalAttributes.PACE,
                                                PhysicalAttributes.STAMINA));

                preferableAttributesMapping.put(
                                FieldPosition.WBR.name() + Role.COMPLETE_WING_BACK.name() + Duty.ATTACK.name(),
                                List.of(
                                                TechnicalAttributes.TACKLING,
                                                MentalAttributes.ANTICIPATION, MentalAttributes.COMPOSURE,
                                                PhysicalAttributes.AGILITY, PhysicalAttributes.BALANCE));

                // WBL INVERTED WING BACK DEFEND
                keyAttributesMapping.put(
                                FieldPosition.WBL.name() + Role.INVERTED_WING_BACK.name() + Duty.DEFEND.name(),
                                List.of(
                                                TechnicalAttributes.MARKING, TechnicalAttributes.PASSING,
                                                TechnicalAttributes.TACKLING,
                                                MentalAttributes.ANTICIPATION,
                                                MentalAttributes.DECISIONS, MentalAttributes.POSITIONING,
                                                MentalAttributes.TEAMWORK,
                                                MentalAttributes.WORK_RATE));

                preferableAttributesMapping.put(
                                FieldPosition.WBL.name() + Role.INVERTED_WING_BACK.name() + Duty.DEFEND.name(),
                                List.of(
                                                TechnicalAttributes.DRIBBLING, TechnicalAttributes.FIRST_TOUCH,
                                                TechnicalAttributes.TECHNIQUE,
                                                MentalAttributes.CONCENTRATION, MentalAttributes.OFF_THE_BALL,
                                                PhysicalAttributes.ACCELERATION, PhysicalAttributes.AGILITY,
                                                PhysicalAttributes.STAMINA));

                // WBR INVERTED WING BACK DEFEND
                keyAttributesMapping.put(
                                FieldPosition.WBR.name() + Role.INVERTED_WING_BACK.name() + Duty.DEFEND.name(),
                                List.of(
                                                TechnicalAttributes.MARKING, TechnicalAttributes.PASSING,
                                                TechnicalAttributes.TACKLING,
                                                MentalAttributes.ANTICIPATION,
                                                MentalAttributes.DECISIONS, MentalAttributes.POSITIONING,
                                                MentalAttributes.TEAMWORK,
                                                MentalAttributes.WORK_RATE));

                preferableAttributesMapping.put(
                                FieldPosition.WBR.name() + Role.INVERTED_WING_BACK.name() + Duty.DEFEND.name(),
                                List.of(
                                                TechnicalAttributes.DRIBBLING, TechnicalAttributes.FIRST_TOUCH,
                                                TechnicalAttributes.TECHNIQUE,
                                                MentalAttributes.CONCENTRATION, MentalAttributes.OFF_THE_BALL,
                                                PhysicalAttributes.ACCELERATION, PhysicalAttributes.AGILITY,
                                                PhysicalAttributes.STAMINA));

                // WBL INVERTED WING BACK SUPPORT
                keyAttributesMapping.put(
                                FieldPosition.WBL.name() + Role.INVERTED_WING_BACK.name() + Duty.SUPPORT.name(),
                                List.of(
                                                TechnicalAttributes.MARKING, TechnicalAttributes.PASSING,
                                                TechnicalAttributes.TACKLING,
                                                MentalAttributes.DECISIONS, MentalAttributes.OFF_THE_BALL,
                                                MentalAttributes.TEAMWORK,
                                                MentalAttributes.WORK_RATE, PhysicalAttributes.STAMINA));

                preferableAttributesMapping.put(
                                FieldPosition.WBL.name() + Role.INVERTED_WING_BACK.name() + Duty.SUPPORT.name(),
                                List.of(
                                                TechnicalAttributes.DRIBBLING, TechnicalAttributes.FIRST_TOUCH,
                                                TechnicalAttributes.TECHNIQUE,
                                                MentalAttributes.ANTICIPATION, MentalAttributes.COMPOSURE,
                                                MentalAttributes.CONCENTRATION, MentalAttributes.POSITIONING,
                                                PhysicalAttributes.ACCELERATION, PhysicalAttributes.AGILITY));

                // WBR INVERTED WING BACK SUPPORT
                keyAttributesMapping.put(
                                FieldPosition.WBR.name() + Role.INVERTED_WING_BACK.name() + Duty.SUPPORT.name(),
                                List.of(
                                                TechnicalAttributes.MARKING, TechnicalAttributes.PASSING,
                                                TechnicalAttributes.TACKLING,
                                                MentalAttributes.DECISIONS, MentalAttributes.OFF_THE_BALL,
                                                MentalAttributes.TEAMWORK,
                                                MentalAttributes.WORK_RATE, PhysicalAttributes.STAMINA));

                preferableAttributesMapping.put(
                                FieldPosition.WBR.name() + Role.INVERTED_WING_BACK.name() + Duty.SUPPORT.name(),
                                List.of(
                                                TechnicalAttributes.DRIBBLING, TechnicalAttributes.FIRST_TOUCH,
                                                TechnicalAttributes.TECHNIQUE,
                                                MentalAttributes.ANTICIPATION, MentalAttributes.COMPOSURE,
                                                MentalAttributes.CONCENTRATION, MentalAttributes.POSITIONING,
                                                PhysicalAttributes.ACCELERATION, PhysicalAttributes.AGILITY));

                // WBL INVERTED WING BACK ATTACK
                keyAttributesMapping.put(
                                FieldPosition.WBL.name() + Role.INVERTED_WING_BACK.name() + Duty.ATTACK.name(),
                                List.of(
                                                TechnicalAttributes.DRIBBLING, TechnicalAttributes.MARKING,
                                                TechnicalAttributes.PASSING,
                                                TechnicalAttributes.TACKLING, TechnicalAttributes.TECHNIQUE,
                                                MentalAttributes.DECISIONS, MentalAttributes.OFF_THE_BALL,
                                                MentalAttributes.TEAMWORK,
                                                MentalAttributes.WORK_RATE, PhysicalAttributes.ACCELERATION,
                                                PhysicalAttributes.STAMINA));

                preferableAttributesMapping.put(
                                FieldPosition.WBL.name() + Role.INVERTED_WING_BACK.name() + Duty.ATTACK.name(),
                                List.of(
                                                TechnicalAttributes.FIRST_TOUCH, TechnicalAttributes.LONG_SHOTS,
                                                MentalAttributes.ANTICIPATION, MentalAttributes.COMPOSURE,
                                                MentalAttributes.CONCENTRATION, MentalAttributes.FLAIR,
                                                MentalAttributes.POSITIONING,
                                                PhysicalAttributes.AGILITY, PhysicalAttributes.PACE));

                // WBR INVERTED WING BACK ATTACK
                keyAttributesMapping.put(
                                FieldPosition.WBR.name() + Role.INVERTED_WING_BACK.name() + Duty.ATTACK.name(),
                                List.of(
                                                TechnicalAttributes.DRIBBLING, TechnicalAttributes.MARKING,
                                                TechnicalAttributes.PASSING,
                                                TechnicalAttributes.TACKLING, TechnicalAttributes.TECHNIQUE,
                                                MentalAttributes.DECISIONS, MentalAttributes.OFF_THE_BALL,
                                                MentalAttributes.TEAMWORK,
                                                MentalAttributes.WORK_RATE, PhysicalAttributes.ACCELERATION,
                                                PhysicalAttributes.STAMINA));

                preferableAttributesMapping.put(
                                FieldPosition.WBR.name() + Role.INVERTED_WING_BACK.name() + Duty.ATTACK.name(),
                                List.of(
                                                TechnicalAttributes.FIRST_TOUCH, TechnicalAttributes.LONG_SHOTS,
                                                MentalAttributes.ANTICIPATION, MentalAttributes.COMPOSURE,
                                                MentalAttributes.CONCENTRATION, MentalAttributes.FLAIR,
                                                MentalAttributes.POSITIONING,
                                                PhysicalAttributes.AGILITY, PhysicalAttributes.PACE));

                // WBL INVERTED WING BACK AUTOMATIC
                keyAttributesMapping.put(
                                FieldPosition.WBL.name() + Role.INVERTED_WING_BACK.name() + Duty.AUTOMATIC.name(),
                                List.of(
                                                TechnicalAttributes.MARKING,
                                                TechnicalAttributes.PASSING,
                                                TechnicalAttributes.TACKLING, MentalAttributes.DECISIONS,
                                                MentalAttributes.OFF_THE_BALL,
                                                MentalAttributes.TEAMWORK,
                                                MentalAttributes.WORK_RATE, PhysicalAttributes.STAMINA));

                preferableAttributesMapping.put(
                                FieldPosition.WBL.name() + Role.INVERTED_WING_BACK.name() + Duty.AUTOMATIC.name(),
                                List.of(
                                                TechnicalAttributes.DRIBBLING, TechnicalAttributes.FIRST_TOUCH,
                                                TechnicalAttributes.TECHNIQUE,
                                                MentalAttributes.ANTICIPATION, MentalAttributes.COMPOSURE,
                                                MentalAttributes.CONCENTRATION,
                                                MentalAttributes.POSITIONING, PhysicalAttributes.ACCELERATION,
                                                PhysicalAttributes.AGILITY));

                // WBR INVERTED WING BACK AUTOMATIC
                keyAttributesMapping.put(
                                FieldPosition.WBR.name() + Role.INVERTED_WING_BACK.name() + Duty.AUTOMATIC.name(),
                                List.of(
                                                TechnicalAttributes.MARKING,
                                                TechnicalAttributes.PASSING,
                                                TechnicalAttributes.TACKLING, MentalAttributes.DECISIONS,
                                                MentalAttributes.OFF_THE_BALL,
                                                MentalAttributes.TEAMWORK,
                                                MentalAttributes.WORK_RATE, PhysicalAttributes.STAMINA));

                preferableAttributesMapping.put(
                                FieldPosition.WBR.name() + Role.INVERTED_WING_BACK.name() + Duty.AUTOMATIC.name(),
                                List.of(
                                                TechnicalAttributes.DRIBBLING, TechnicalAttributes.FIRST_TOUCH,
                                                TechnicalAttributes.TECHNIQUE,
                                                MentalAttributes.ANTICIPATION, MentalAttributes.COMPOSURE,
                                                MentalAttributes.CONCENTRATION,
                                                MentalAttributes.POSITIONING, PhysicalAttributes.ACCELERATION,
                                                PhysicalAttributes.AGILITY));
        }
}
