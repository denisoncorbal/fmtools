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

public class DlrAttributesList {
        private Map<String, List<PlayerAttributes>> preferableAttributesMapping = new HashMap<>();
        private Map<String, List<PlayerAttributes>> keyAttributesMapping = new HashMap<>();

        public Map<String, List<PlayerAttributes>> getPreferableAttributesMapping() {
                return preferableAttributesMapping;
        }

        public Map<String, List<PlayerAttributes>> getKeyAttributesMapping() {
                return keyAttributesMapping;
        }

        public DlrAttributesList() {
                // DL FULL BACK DEFEND
                keyAttributesMapping.put(FieldPosition.DL.name() + Role.FULL_BACK.name() + Duty.DEFEND.name(),
                                List.of(TechnicalAttributes.MARKING, TechnicalAttributes.TACKLING,
                                                MentalAttributes.ANTICIPATION,
                                                MentalAttributes.CONCENTRATION, MentalAttributes.POSITIONING));

                preferableAttributesMapping.put(FieldPosition.DL.name() + Role.FULL_BACK.name() + Duty.DEFEND.name(),
                                List.of(TechnicalAttributes.CROSSING, TechnicalAttributes.PASSING,
                                                MentalAttributes.COMPOSURE,
                                                MentalAttributes.DECISIONS, MentalAttributes.TEAMWORK,
                                                PhysicalAttributes.PACE,
                                                PhysicalAttributes.STAMINA));

                // DR FULL BACK DEFEND
                keyAttributesMapping.put(FieldPosition.DR.name() + Role.FULL_BACK.name() + Duty.DEFEND.name(),
                                List.of(TechnicalAttributes.MARKING, TechnicalAttributes.TACKLING,
                                                MentalAttributes.ANTICIPATION,
                                                MentalAttributes.CONCENTRATION, MentalAttributes.POSITIONING));

                preferableAttributesMapping.put(FieldPosition.DR.name() + Role.FULL_BACK.name() + Duty.DEFEND.name(),
                                List.of(TechnicalAttributes.CROSSING, TechnicalAttributes.PASSING,
                                                MentalAttributes.COMPOSURE,
                                                MentalAttributes.DECISIONS, MentalAttributes.TEAMWORK,
                                                PhysicalAttributes.PACE,
                                                PhysicalAttributes.STAMINA));

                // DL FULL BACK SUPPORT
                keyAttributesMapping.put(FieldPosition.DL.name() + Role.FULL_BACK.name() + Duty.SUPPORT.name(),
                                List.of(TechnicalAttributes.MARKING, TechnicalAttributes.TACKLING,
                                                MentalAttributes.ANTICIPATION,
                                                MentalAttributes.CONCENTRATION, MentalAttributes.POSITIONING,
                                                MentalAttributes.TEAMWORK,
                                                MentalAttributes.WORK_RATE));

                preferableAttributesMapping.put(FieldPosition.DL.name() + Role.FULL_BACK.name() + Duty.SUPPORT.name(),
                                List.of(TechnicalAttributes.CROSSING, TechnicalAttributes.DRIBBLING,
                                                TechnicalAttributes.PASSING,
                                                TechnicalAttributes.TECHNIQUE, MentalAttributes.COMPOSURE,
                                                MentalAttributes.DECISIONS, PhysicalAttributes.PACE,
                                                PhysicalAttributes.STAMINA));

                // DR FULL BACK SUPPORT
                keyAttributesMapping.put(FieldPosition.DR.name() + Role.FULL_BACK.name() + Duty.SUPPORT.name(),
                                List.of(TechnicalAttributes.MARKING, TechnicalAttributes.TACKLING,
                                                MentalAttributes.ANTICIPATION,
                                                MentalAttributes.CONCENTRATION, MentalAttributes.POSITIONING,
                                                MentalAttributes.TEAMWORK,
                                                MentalAttributes.WORK_RATE));

                preferableAttributesMapping.put(FieldPosition.DR.name() + Role.FULL_BACK.name() + Duty.SUPPORT.name(),
                                List.of(TechnicalAttributes.CROSSING, TechnicalAttributes.DRIBBLING,
                                                TechnicalAttributes.PASSING,
                                                TechnicalAttributes.TECHNIQUE, MentalAttributes.COMPOSURE,
                                                MentalAttributes.DECISIONS, PhysicalAttributes.PACE,
                                                PhysicalAttributes.STAMINA));

                // DL FULL BACK ATTACK
                keyAttributesMapping.put(FieldPosition.DL.name() + Role.FULL_BACK.name() + Duty.ATTACK.name(),
                                List.of(TechnicalAttributes.CROSSING, TechnicalAttributes.TACKLING,
                                                MentalAttributes.ANTICIPATION,
                                                MentalAttributes.POSITIONING, MentalAttributes.TEAMWORK,
                                                MentalAttributes.WORK_RATE, PhysicalAttributes.PACE,
                                                PhysicalAttributes.STAMINA));

                preferableAttributesMapping.put(FieldPosition.DL.name() + Role.FULL_BACK.name() + Duty.ATTACK.name(),
                                List.of(TechnicalAttributes.DRIBBLING, TechnicalAttributes.FIRST_TOUCH,
                                                TechnicalAttributes.MARKING,
                                                TechnicalAttributes.PASSING,
                                                TechnicalAttributes.TECHNIQUE, MentalAttributes.COMPOSURE,
                                                MentalAttributes.CONCENTRATION,
                                                MentalAttributes.DECISIONS, MentalAttributes.OFF_THE_BALL,
                                                PhysicalAttributes.ACCELERATION,
                                                PhysicalAttributes.AGILITY));

                // DR FULL BACK ATTACK
                keyAttributesMapping.put(FieldPosition.DR.name() + Role.FULL_BACK.name() + Duty.ATTACK.name(),
                                List.of(TechnicalAttributes.CROSSING, TechnicalAttributes.TACKLING,
                                                MentalAttributes.ANTICIPATION,
                                                MentalAttributes.POSITIONING, MentalAttributes.TEAMWORK,
                                                MentalAttributes.WORK_RATE, PhysicalAttributes.PACE,
                                                PhysicalAttributes.STAMINA));

                preferableAttributesMapping.put(FieldPosition.DR.name() + Role.FULL_BACK.name() + Duty.ATTACK.name(),
                                List.of(TechnicalAttributes.DRIBBLING, TechnicalAttributes.FIRST_TOUCH,
                                                TechnicalAttributes.MARKING,
                                                TechnicalAttributes.PASSING,
                                                TechnicalAttributes.TECHNIQUE, MentalAttributes.COMPOSURE,
                                                MentalAttributes.CONCENTRATION,
                                                MentalAttributes.DECISIONS, MentalAttributes.OFF_THE_BALL,
                                                PhysicalAttributes.ACCELERATION,
                                                PhysicalAttributes.AGILITY));

                // DL FULL BACK AUTOMATIC
                keyAttributesMapping.put(FieldPosition.DL.name() + Role.FULL_BACK.name() + Duty.AUTOMATIC.name(),
                                List.of(TechnicalAttributes.MARKING, TechnicalAttributes.TACKLING,
                                                MentalAttributes.ANTICIPATION,
                                                MentalAttributes.CONCENTRATION, MentalAttributes.POSITIONING,
                                                MentalAttributes.TEAMWORK,
                                                MentalAttributes.WORK_RATE));

                preferableAttributesMapping.put(FieldPosition.DL.name() + Role.FULL_BACK.name() + Duty.AUTOMATIC.name(),
                                List.of(TechnicalAttributes.CROSSING, TechnicalAttributes.DRIBBLING,
                                                TechnicalAttributes.PASSING,
                                                TechnicalAttributes.TECHNIQUE, MentalAttributes.COMPOSURE,
                                                MentalAttributes.DECISIONS,
                                                PhysicalAttributes.PACE, PhysicalAttributes.STAMINA));

                // DR FULL BACK AUTOMATIC
                keyAttributesMapping.put(FieldPosition.DR.name() + Role.FULL_BACK.name() + Duty.AUTOMATIC.name(),
                                List.of(TechnicalAttributes.MARKING, TechnicalAttributes.TACKLING,
                                                MentalAttributes.ANTICIPATION,
                                                MentalAttributes.CONCENTRATION, MentalAttributes.POSITIONING,
                                                MentalAttributes.TEAMWORK,
                                                MentalAttributes.WORK_RATE));

                preferableAttributesMapping.put(FieldPosition.DR.name() + Role.FULL_BACK.name() + Duty.AUTOMATIC.name(),
                                List.of(TechnicalAttributes.CROSSING, TechnicalAttributes.DRIBBLING,
                                                TechnicalAttributes.PASSING,
                                                TechnicalAttributes.TECHNIQUE, MentalAttributes.COMPOSURE,
                                                MentalAttributes.DECISIONS,
                                                PhysicalAttributes.PACE, PhysicalAttributes.STAMINA));

                // DL WING BACK DEFEND
                keyAttributesMapping.put(FieldPosition.DL.name() + Role.WING_BACK.name() + Duty.DEFEND.name(),
                                List.of(
                                                TechnicalAttributes.MARKING, TechnicalAttributes.TACKLING,
                                                MentalAttributes.ANTICIPATION, MentalAttributes.POSITIONING,
                                                MentalAttributes.TEAMWORK, MentalAttributes.WORK_RATE,
                                                PhysicalAttributes.ACCELERATION, PhysicalAttributes.STAMINA));

                preferableAttributesMapping.put(FieldPosition.DL.name() + Role.WING_BACK.name() + Duty.DEFEND.name(),
                                List.of(
                                                TechnicalAttributes.CROSSING, TechnicalAttributes.DRIBBLING,
                                                TechnicalAttributes.FIRST_TOUCH, TechnicalAttributes.PASSING,
                                                TechnicalAttributes.TECHNIQUE, MentalAttributes.CONCENTRATION,
                                                MentalAttributes.DECISIONS, MentalAttributes.OFF_THE_BALL,
                                                PhysicalAttributes.AGILITY, PhysicalAttributes.PACE));

                // DR WING BACK DEFEND
                keyAttributesMapping.put(FieldPosition.DR.name() + Role.WING_BACK.name() + Duty.DEFEND.name(),
                                List.of(
                                                TechnicalAttributes.MARKING, TechnicalAttributes.TACKLING,
                                                MentalAttributes.ANTICIPATION, MentalAttributes.POSITIONING,
                                                MentalAttributes.TEAMWORK, MentalAttributes.WORK_RATE,
                                                PhysicalAttributes.ACCELERATION, PhysicalAttributes.STAMINA));

                preferableAttributesMapping.put(FieldPosition.DR.name() + Role.WING_BACK.name() + Duty.DEFEND.name(),
                                List.of(
                                                TechnicalAttributes.CROSSING, TechnicalAttributes.DRIBBLING,
                                                TechnicalAttributes.FIRST_TOUCH, TechnicalAttributes.PASSING,
                                                TechnicalAttributes.TECHNIQUE, MentalAttributes.CONCENTRATION,
                                                MentalAttributes.DECISIONS, MentalAttributes.OFF_THE_BALL,
                                                PhysicalAttributes.AGILITY, PhysicalAttributes.PACE));

                // DL WING BACK SUPPORT
                keyAttributesMapping.put(FieldPosition.DL.name() + Role.WING_BACK.name() + Duty.SUPPORT.name(),
                                List.of(
                                                TechnicalAttributes.CROSSING, TechnicalAttributes.DRIBBLING,
                                                TechnicalAttributes.MARKING, TechnicalAttributes.TACKLING,
                                                MentalAttributes.OFF_THE_BALL,
                                                MentalAttributes.TEAMWORK, MentalAttributes.WORK_RATE,
                                                PhysicalAttributes.ACCELERATION, PhysicalAttributes.STAMINA));

                preferableAttributesMapping.put(FieldPosition.DL.name() + Role.WING_BACK.name() + Duty.SUPPORT.name(),
                                List.of(

                                                TechnicalAttributes.FIRST_TOUCH, TechnicalAttributes.PASSING,
                                                TechnicalAttributes.TECHNIQUE, MentalAttributes.ANTICIPATION,
                                                MentalAttributes.CONCENTRATION,
                                                MentalAttributes.DECISIONS, MentalAttributes.POSITIONING,
                                                PhysicalAttributes.AGILITY, PhysicalAttributes.PACE));

                // DR WING BACK SUPPORT
                keyAttributesMapping.put(FieldPosition.DR.name() + Role.WING_BACK.name() + Duty.SUPPORT.name(),
                                List.of(
                                                TechnicalAttributes.CROSSING, TechnicalAttributes.DRIBBLING,
                                                TechnicalAttributes.MARKING, TechnicalAttributes.TACKLING,
                                                MentalAttributes.OFF_THE_BALL,
                                                MentalAttributes.TEAMWORK, MentalAttributes.WORK_RATE,
                                                PhysicalAttributes.ACCELERATION, PhysicalAttributes.STAMINA));

                preferableAttributesMapping.put(FieldPosition.DR.name() + Role.WING_BACK.name() + Duty.SUPPORT.name(),
                                List.of(

                                                TechnicalAttributes.FIRST_TOUCH, TechnicalAttributes.PASSING,
                                                TechnicalAttributes.TECHNIQUE, MentalAttributes.ANTICIPATION,
                                                MentalAttributes.CONCENTRATION,
                                                MentalAttributes.DECISIONS, MentalAttributes.POSITIONING,
                                                PhysicalAttributes.AGILITY, PhysicalAttributes.PACE));

                // DL WING BACK ATTACK
                keyAttributesMapping.put(FieldPosition.DL.name() + Role.WING_BACK.name() + Duty.ATTACK.name(),
                                List.of(
                                                TechnicalAttributes.CROSSING, TechnicalAttributes.DRIBBLING,
                                                TechnicalAttributes.TACKLING, TechnicalAttributes.TECHNIQUE,
                                                MentalAttributes.OFF_THE_BALL,
                                                MentalAttributes.TEAMWORK, MentalAttributes.WORK_RATE,
                                                PhysicalAttributes.ACCELERATION, PhysicalAttributes.PACE,
                                                PhysicalAttributes.STAMINA));

                preferableAttributesMapping.put(FieldPosition.DL.name() + Role.WING_BACK.name() + Duty.ATTACK.name(),
                                List.of(

                                                TechnicalAttributes.FIRST_TOUCH, TechnicalAttributes.MARKING,
                                                TechnicalAttributes.PASSING,
                                                MentalAttributes.ANTICIPATION,
                                                MentalAttributes.CONCENTRATION,
                                                MentalAttributes.DECISIONS, MentalAttributes.FLAIR,
                                                MentalAttributes.POSITIONING,
                                                PhysicalAttributes.AGILITY));

                // DR WING BACK ATTACK
                keyAttributesMapping.put(FieldPosition.DR.name() + Role.WING_BACK.name() + Duty.ATTACK.name(),
                                List.of(
                                                TechnicalAttributes.CROSSING, TechnicalAttributes.DRIBBLING,
                                                TechnicalAttributes.TACKLING, TechnicalAttributes.TECHNIQUE,
                                                MentalAttributes.OFF_THE_BALL,
                                                MentalAttributes.TEAMWORK, MentalAttributes.WORK_RATE,
                                                PhysicalAttributes.ACCELERATION, PhysicalAttributes.PACE,
                                                PhysicalAttributes.STAMINA));

                preferableAttributesMapping.put(FieldPosition.DR.name() + Role.WING_BACK.name() + Duty.ATTACK.name(),
                                List.of(

                                                TechnicalAttributes.FIRST_TOUCH, TechnicalAttributes.MARKING,
                                                TechnicalAttributes.PASSING,
                                                MentalAttributes.ANTICIPATION,
                                                MentalAttributes.CONCENTRATION,
                                                MentalAttributes.DECISIONS, MentalAttributes.FLAIR,
                                                MentalAttributes.POSITIONING,
                                                PhysicalAttributes.AGILITY));

                // DL WING BACK AUTOMATIC
                keyAttributesMapping.put(FieldPosition.DL.name() + Role.WING_BACK.name() + Duty.AUTOMATIC.name(),
                                List.of(
                                                TechnicalAttributes.CROSSING, TechnicalAttributes.DRIBBLING,
                                                TechnicalAttributes.MARKING, TechnicalAttributes.TACKLING,
                                                MentalAttributes.OFF_THE_BALL,
                                                MentalAttributes.TEAMWORK, MentalAttributes.WORK_RATE,
                                                PhysicalAttributes.ACCELERATION,
                                                PhysicalAttributes.STAMINA));

                preferableAttributesMapping.put(FieldPosition.DL.name() + Role.WING_BACK.name() + Duty.AUTOMATIC.name(),
                                List.of(

                                                TechnicalAttributes.FIRST_TOUCH,
                                                TechnicalAttributes.PASSING, TechnicalAttributes.TECHNIQUE,
                                                MentalAttributes.ANTICIPATION,
                                                MentalAttributes.CONCENTRATION,
                                                MentalAttributes.DECISIONS,
                                                MentalAttributes.POSITIONING,
                                                PhysicalAttributes.AGILITY, PhysicalAttributes.PACE));

                // DR WING BACK AUTOMATIC
                keyAttributesMapping.put(FieldPosition.DR.name() + Role.WING_BACK.name() + Duty.AUTOMATIC.name(),
                                List.of(
                                                TechnicalAttributes.CROSSING, TechnicalAttributes.DRIBBLING,
                                                TechnicalAttributes.MARKING, TechnicalAttributes.TACKLING,
                                                MentalAttributes.OFF_THE_BALL,
                                                MentalAttributes.TEAMWORK, MentalAttributes.WORK_RATE,
                                                PhysicalAttributes.ACCELERATION,
                                                PhysicalAttributes.STAMINA));

                preferableAttributesMapping.put(FieldPosition.DR.name() + Role.WING_BACK.name() + Duty.AUTOMATIC.name(),
                                List.of(

                                                TechnicalAttributes.FIRST_TOUCH,
                                                TechnicalAttributes.PASSING, TechnicalAttributes.TECHNIQUE,
                                                MentalAttributes.ANTICIPATION,
                                                MentalAttributes.CONCENTRATION,
                                                MentalAttributes.DECISIONS,
                                                MentalAttributes.POSITIONING,
                                                PhysicalAttributes.AGILITY, PhysicalAttributes.PACE));

                // DL NO NONSENSE FULL BACK DEFEND
                keyAttributesMapping.put(
                                FieldPosition.DL.name() + Role.NO_NONSENSE_FULL_BACK.name() + Duty.DEFEND.name(),
                                List.of(

                                                TechnicalAttributes.MARKING, TechnicalAttributes.TACKLING,
                                                MentalAttributes.ANTICIPATION, MentalAttributes.POSITIONING,
                                                PhysicalAttributes.STRENGTH));

                preferableAttributesMapping.put(
                                FieldPosition.DL.name() + Role.NO_NONSENSE_FULL_BACK.name() + Duty.DEFEND.name(),
                                List.of(

                                                TechnicalAttributes.HEADING,
                                                MentalAttributes.AGGRESSION, MentalAttributes.BRAVERY,
                                                MentalAttributes.CONCENTRATION, MentalAttributes.TEAMWORK,
                                                PhysicalAttributes.AGILITY, PhysicalAttributes.PACE));

                // DR NO NONSENSE FULL BACK DEFEND
                keyAttributesMapping.put(
                                FieldPosition.DR.name() + Role.NO_NONSENSE_FULL_BACK.name() + Duty.DEFEND.name(),
                                List.of(

                                                TechnicalAttributes.MARKING, TechnicalAttributes.TACKLING,
                                                MentalAttributes.ANTICIPATION, MentalAttributes.POSITIONING,
                                                PhysicalAttributes.STRENGTH));

                preferableAttributesMapping.put(
                                FieldPosition.DR.name() + Role.NO_NONSENSE_FULL_BACK.name() + Duty.DEFEND.name(),
                                List.of(

                                                TechnicalAttributes.HEADING,
                                                MentalAttributes.AGGRESSION, MentalAttributes.BRAVERY,
                                                MentalAttributes.CONCENTRATION, MentalAttributes.TEAMWORK,
                                                PhysicalAttributes.AGILITY, PhysicalAttributes.PACE));

                // DL COMPLETE WING BACK SUPPORT
                keyAttributesMapping.put(
                                FieldPosition.DL.name() + Role.COMPLETE_WING_BACK.name() + Duty.SUPPORT.name(),
                                List.of(
                                                TechnicalAttributes.CROSSING, TechnicalAttributes.DRIBBLING,
                                                TechnicalAttributes.FIRST_TOUCH, TechnicalAttributes.PASSING,
                                                TechnicalAttributes.TECHNIQUE, MentalAttributes.DECISIONS,
                                                MentalAttributes.OFF_THE_BALL, MentalAttributes.TEAMWORK,
                                                MentalAttributes.WORK_RATE, PhysicalAttributes.ACCELERATION,
                                                PhysicalAttributes.PACE, PhysicalAttributes.STAMINA));

                preferableAttributesMapping.put(
                                FieldPosition.DL.name() + Role.COMPLETE_WING_BACK.name() + Duty.SUPPORT.name(),
                                List.of(

                                                TechnicalAttributes.TACKLING, MentalAttributes.ANTICIPATION,
                                                MentalAttributes.COMPOSURE, MentalAttributes.FLAIR,
                                                PhysicalAttributes.AGILITY, PhysicalAttributes.BALANCE));

                // DR COMPLETE WING BACK SUPPORT
                keyAttributesMapping.put(
                                FieldPosition.DR.name() + Role.COMPLETE_WING_BACK.name() + Duty.SUPPORT.name(),
                                List.of(
                                                TechnicalAttributes.CROSSING, TechnicalAttributes.DRIBBLING,
                                                TechnicalAttributes.FIRST_TOUCH, TechnicalAttributes.PASSING,
                                                TechnicalAttributes.TECHNIQUE, MentalAttributes.DECISIONS,
                                                MentalAttributes.OFF_THE_BALL, MentalAttributes.TEAMWORK,
                                                MentalAttributes.WORK_RATE, PhysicalAttributes.ACCELERATION,
                                                PhysicalAttributes.PACE, PhysicalAttributes.STAMINA));

                preferableAttributesMapping.put(
                                FieldPosition.DR.name() + Role.COMPLETE_WING_BACK.name() + Duty.SUPPORT.name(),
                                List.of(

                                                TechnicalAttributes.TACKLING, MentalAttributes.ANTICIPATION,
                                                MentalAttributes.COMPOSURE, MentalAttributes.FLAIR,
                                                PhysicalAttributes.AGILITY, PhysicalAttributes.BALANCE));

                // DL COMPLETE WING BACK ATTACK
                keyAttributesMapping.put(
                                FieldPosition.DL.name() + Role.COMPLETE_WING_BACK.name() + Duty.ATTACK.name(),
                                List.of(
                                                TechnicalAttributes.CROSSING, TechnicalAttributes.DRIBBLING,
                                                TechnicalAttributes.FIRST_TOUCH, TechnicalAttributes.PASSING,
                                                TechnicalAttributes.TECHNIQUE, MentalAttributes.DECISIONS,
                                                MentalAttributes.FLAIR, MentalAttributes.OFF_THE_BALL,
                                                MentalAttributes.TEAMWORK,
                                                MentalAttributes.WORK_RATE, PhysicalAttributes.ACCELERATION,
                                                PhysicalAttributes.PACE, PhysicalAttributes.STAMINA));

                preferableAttributesMapping.put(
                                FieldPosition.DL.name() + Role.COMPLETE_WING_BACK.name() + Duty.ATTACK.name(),
                                List.of(

                                                TechnicalAttributes.TACKLING, MentalAttributes.ANTICIPATION,
                                                MentalAttributes.COMPOSURE,
                                                PhysicalAttributes.AGILITY, PhysicalAttributes.BALANCE));

                // DR COMPLETE WING BACK ATTACK
                keyAttributesMapping.put(
                                FieldPosition.DR.name() + Role.COMPLETE_WING_BACK.name() + Duty.ATTACK.name(),
                                List.of(
                                                TechnicalAttributes.CROSSING, TechnicalAttributes.DRIBBLING,
                                                TechnicalAttributes.FIRST_TOUCH, TechnicalAttributes.PASSING,
                                                TechnicalAttributes.TECHNIQUE, MentalAttributes.DECISIONS,
                                                MentalAttributes.FLAIR, MentalAttributes.OFF_THE_BALL,
                                                MentalAttributes.TEAMWORK,
                                                MentalAttributes.WORK_RATE, PhysicalAttributes.ACCELERATION,
                                                PhysicalAttributes.PACE, PhysicalAttributes.STAMINA));

                preferableAttributesMapping.put(
                                FieldPosition.DR.name() + Role.COMPLETE_WING_BACK.name() + Duty.ATTACK.name(),
                                List.of(

                                                TechnicalAttributes.TACKLING, MentalAttributes.ANTICIPATION,
                                                MentalAttributes.COMPOSURE,
                                                PhysicalAttributes.AGILITY, PhysicalAttributes.BALANCE));

                // DL INVERTED WING BACK DEFEND
                keyAttributesMapping.put(
                                FieldPosition.DL.name() + Role.INVERTED_WING_BACK.name() + Duty.DEFEND.name(),
                                List.of(
                                                TechnicalAttributes.MARKING, TechnicalAttributes.PASSING,
                                                TechnicalAttributes.TACKLING, MentalAttributes.ANTICIPATION,
                                                MentalAttributes.DECISIONS, MentalAttributes.POSITIONING,
                                                MentalAttributes.TEAMWORK, MentalAttributes.WORK_RATE));

                preferableAttributesMapping.put(
                                FieldPosition.DL.name() + Role.INVERTED_WING_BACK.name() + Duty.DEFEND.name(),
                                List.of(
                                                TechnicalAttributes.DRIBBLING, TechnicalAttributes.FIRST_TOUCH,
                                                TechnicalAttributes.TECHNIQUE, MentalAttributes.CONCENTRATION,
                                                MentalAttributes.OFF_THE_BALL, PhysicalAttributes.ACCELERATION,
                                                PhysicalAttributes.AGILITY, PhysicalAttributes.STAMINA));

                // DR INVERTED WING BACK DEFEND
                keyAttributesMapping.put(
                                FieldPosition.DR.name() + Role.INVERTED_WING_BACK.name() + Duty.DEFEND.name(),
                                List.of(
                                                TechnicalAttributes.MARKING, TechnicalAttributes.PASSING,
                                                TechnicalAttributes.TACKLING, MentalAttributes.ANTICIPATION,
                                                MentalAttributes.DECISIONS, MentalAttributes.POSITIONING,
                                                MentalAttributes.TEAMWORK, MentalAttributes.WORK_RATE));

                preferableAttributesMapping.put(
                                FieldPosition.DR.name() + Role.INVERTED_WING_BACK.name() + Duty.DEFEND.name(),
                                List.of(
                                                TechnicalAttributes.DRIBBLING, TechnicalAttributes.FIRST_TOUCH,
                                                TechnicalAttributes.TECHNIQUE, MentalAttributes.CONCENTRATION,
                                                MentalAttributes.OFF_THE_BALL, PhysicalAttributes.ACCELERATION,
                                                PhysicalAttributes.AGILITY, PhysicalAttributes.STAMINA));

                // DL INVERTED WING BACK SUPPORT
                keyAttributesMapping.put(
                                FieldPosition.DL.name() + Role.INVERTED_WING_BACK.name() + Duty.SUPPORT.name(),
                                List.of(
                                                TechnicalAttributes.MARKING, TechnicalAttributes.PASSING,
                                                TechnicalAttributes.TACKLING,
                                                MentalAttributes.DECISIONS, MentalAttributes.OFF_THE_BALL,
                                                MentalAttributes.TEAMWORK, MentalAttributes.WORK_RATE,
                                                PhysicalAttributes.STAMINA));

                preferableAttributesMapping.put(
                                FieldPosition.DL.name() + Role.INVERTED_WING_BACK.name() + Duty.SUPPORT.name(),
                                List.of(
                                                TechnicalAttributes.DRIBBLING, TechnicalAttributes.FIRST_TOUCH,
                                                TechnicalAttributes.TECHNIQUE, MentalAttributes.ANTICIPATION,
                                                MentalAttributes.COMPOSURE, MentalAttributes.CONCENTRATION,
                                                MentalAttributes.POSITIONING, PhysicalAttributes.ACCELERATION,
                                                PhysicalAttributes.AGILITY));

                // DR INVERTED WING BACK SUPPORT
                keyAttributesMapping.put(
                                FieldPosition.DR.name() + Role.INVERTED_WING_BACK.name() + Duty.SUPPORT.name(),
                                List.of(
                                                TechnicalAttributes.MARKING, TechnicalAttributes.PASSING,
                                                TechnicalAttributes.TACKLING,
                                                MentalAttributes.DECISIONS, MentalAttributes.OFF_THE_BALL,
                                                MentalAttributes.TEAMWORK, MentalAttributes.WORK_RATE,
                                                PhysicalAttributes.STAMINA));

                preferableAttributesMapping.put(
                                FieldPosition.DR.name() + Role.INVERTED_WING_BACK.name() + Duty.SUPPORT.name(),
                                List.of(
                                                TechnicalAttributes.DRIBBLING, TechnicalAttributes.FIRST_TOUCH,
                                                TechnicalAttributes.TECHNIQUE, MentalAttributes.ANTICIPATION,
                                                MentalAttributes.COMPOSURE, MentalAttributes.CONCENTRATION,
                                                MentalAttributes.POSITIONING, PhysicalAttributes.ACCELERATION,
                                                PhysicalAttributes.AGILITY));

                // DL INVERTED WING BACK ATTACK
                keyAttributesMapping.put(
                                FieldPosition.DL.name() + Role.INVERTED_WING_BACK.name() + Duty.ATTACK.name(),
                                List.of(
                                                TechnicalAttributes.DRIBBLING, TechnicalAttributes.MARKING,
                                                TechnicalAttributes.PASSING,
                                                TechnicalAttributes.TACKLING, TechnicalAttributes.TECHNIQUE,
                                                MentalAttributes.DECISIONS, MentalAttributes.OFF_THE_BALL,
                                                MentalAttributes.TEAMWORK, MentalAttributes.WORK_RATE,
                                                PhysicalAttributes.ACCELERATION, PhysicalAttributes.STAMINA));

                preferableAttributesMapping.put(
                                FieldPosition.DL.name() + Role.INVERTED_WING_BACK.name() + Duty.ATTACK.name(),
                                List.of(
                                                TechnicalAttributes.FIRST_TOUCH, TechnicalAttributes.LONG_SHOTS,
                                                MentalAttributes.ANTICIPATION,
                                                MentalAttributes.COMPOSURE, MentalAttributes.CONCENTRATION,
                                                MentalAttributes.FLAIR, MentalAttributes.POSITIONING,
                                                PhysicalAttributes.AGILITY, PhysicalAttributes.PACE));

                // DR INVERTED WING BACK ATTACK
                keyAttributesMapping.put(
                                FieldPosition.DR.name() + Role.INVERTED_WING_BACK.name() + Duty.ATTACK.name(),
                                List.of(
                                                TechnicalAttributes.DRIBBLING, TechnicalAttributes.MARKING,
                                                TechnicalAttributes.PASSING,
                                                TechnicalAttributes.TACKLING, TechnicalAttributes.TECHNIQUE,
                                                MentalAttributes.DECISIONS, MentalAttributes.OFF_THE_BALL,
                                                MentalAttributes.TEAMWORK, MentalAttributes.WORK_RATE,
                                                PhysicalAttributes.ACCELERATION, PhysicalAttributes.STAMINA));

                preferableAttributesMapping.put(
                                FieldPosition.DR.name() + Role.INVERTED_WING_BACK.name() + Duty.ATTACK.name(),
                                List.of(
                                                TechnicalAttributes.FIRST_TOUCH, TechnicalAttributes.LONG_SHOTS,
                                                MentalAttributes.ANTICIPATION,
                                                MentalAttributes.COMPOSURE, MentalAttributes.CONCENTRATION,
                                                MentalAttributes.FLAIR, MentalAttributes.POSITIONING,
                                                PhysicalAttributes.AGILITY, PhysicalAttributes.PACE));

                // DL INVERTED WING BACK AUTOMATIC
                keyAttributesMapping.put(
                                FieldPosition.DL.name() + Role.INVERTED_WING_BACK.name() + Duty.AUTOMATIC.name(),
                                List.of(
                                                TechnicalAttributes.MARKING,
                                                TechnicalAttributes.PASSING,
                                                TechnicalAttributes.TACKLING,
                                                MentalAttributes.DECISIONS, MentalAttributes.OFF_THE_BALL,
                                                MentalAttributes.TEAMWORK, MentalAttributes.WORK_RATE,
                                                PhysicalAttributes.STAMINA));

                preferableAttributesMapping.put(
                                FieldPosition.DL.name() + Role.INVERTED_WING_BACK.name() + Duty.AUTOMATIC.name(),
                                List.of(
                                                TechnicalAttributes.DRIBBLING, TechnicalAttributes.FIRST_TOUCH,
                                                TechnicalAttributes.TECHNIQUE,
                                                MentalAttributes.ANTICIPATION,
                                                MentalAttributes.COMPOSURE, MentalAttributes.CONCENTRATION,
                                                MentalAttributes.POSITIONING, PhysicalAttributes.ACCELERATION,
                                                PhysicalAttributes.AGILITY));

                // DR INVERTED WING BACK AUTOMATIC
                keyAttributesMapping.put(
                                FieldPosition.DR.name() + Role.INVERTED_WING_BACK.name() + Duty.AUTOMATIC.name(),
                                List.of(
                                                TechnicalAttributes.MARKING,
                                                TechnicalAttributes.PASSING,
                                                TechnicalAttributes.TACKLING,
                                                MentalAttributes.DECISIONS, MentalAttributes.OFF_THE_BALL,
                                                MentalAttributes.TEAMWORK, MentalAttributes.WORK_RATE,
                                                PhysicalAttributes.STAMINA));

                preferableAttributesMapping.put(
                                FieldPosition.DR.name() + Role.INVERTED_WING_BACK.name() + Duty.AUTOMATIC.name(),
                                List.of(
                                                TechnicalAttributes.DRIBBLING, TechnicalAttributes.FIRST_TOUCH,
                                                TechnicalAttributes.TECHNIQUE,
                                                MentalAttributes.ANTICIPATION,
                                                MentalAttributes.COMPOSURE, MentalAttributes.CONCENTRATION,
                                                MentalAttributes.POSITIONING, PhysicalAttributes.ACCELERATION,
                                                PhysicalAttributes.AGILITY));
        }
}
