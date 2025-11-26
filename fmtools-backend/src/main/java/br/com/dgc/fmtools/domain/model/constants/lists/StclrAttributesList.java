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

public class StclrAttributesList {
        private Map<String, List<PlayerAttributes>> preferableAttributesMapping = new HashMap<>();
        private Map<String, List<PlayerAttributes>> keyAttributesMapping = new HashMap<>();

        public Map<String, List<PlayerAttributes>> getPreferableAttributesMapping() {
                return preferableAttributesMapping;
        }

        public Map<String, List<PlayerAttributes>> getKeyAttributesMapping() {
                return keyAttributesMapping;
        }

        public StclrAttributesList() {
                // STCL DEEP LYING FORWARD SUPPORT
                keyAttributesMapping.put(
                                FieldPosition.STCL.name() + Role.DEEP_LYING_FORWARD.name() + Duty.SUPPORT.name(),
                                List.of(
                                                TechnicalAttributes.FIRST_TOUCH, TechnicalAttributes.PASSING,
                                                TechnicalAttributes.TECHNIQUE,
                                                MentalAttributes.COMPOSURE, MentalAttributes.DECISIONS,
                                                MentalAttributes.OFF_THE_BALL,
                                                MentalAttributes.TEAMWORK));

                preferableAttributesMapping.put(
                                FieldPosition.STCL.name() + Role.DEEP_LYING_FORWARD.name() + Duty.SUPPORT.name(),
                                List.of(
                                                TechnicalAttributes.FINISHING, MentalAttributes.ANTICIPATION,
                                                MentalAttributes.FLAIR,
                                                MentalAttributes.VISION, PhysicalAttributes.BALANCE,
                                                PhysicalAttributes.STRENGTH));

                // STC DEEP LYING FORWARD SUPPORT
                keyAttributesMapping.put(
                                FieldPosition.STC.name() + Role.DEEP_LYING_FORWARD.name() + Duty.SUPPORT.name(),
                                List.of(
                                                TechnicalAttributes.FIRST_TOUCH, TechnicalAttributes.PASSING,
                                                TechnicalAttributes.TECHNIQUE,
                                                MentalAttributes.COMPOSURE, MentalAttributes.DECISIONS,
                                                MentalAttributes.OFF_THE_BALL,
                                                MentalAttributes.TEAMWORK));

                preferableAttributesMapping.put(
                                FieldPosition.STC.name() + Role.DEEP_LYING_FORWARD.name() + Duty.SUPPORT.name(),
                                List.of(
                                                TechnicalAttributes.FINISHING, MentalAttributes.ANTICIPATION,
                                                MentalAttributes.FLAIR,
                                                MentalAttributes.VISION, PhysicalAttributes.BALANCE,
                                                PhysicalAttributes.STRENGTH));

                // STCR DEEP LYING FORWARD SUPPORT
                keyAttributesMapping.put(
                                FieldPosition.STCR.name() + Role.DEEP_LYING_FORWARD.name() + Duty.SUPPORT.name(),
                                List.of(
                                                TechnicalAttributes.FIRST_TOUCH, TechnicalAttributes.PASSING,
                                                TechnicalAttributes.TECHNIQUE,
                                                MentalAttributes.COMPOSURE, MentalAttributes.DECISIONS,
                                                MentalAttributes.OFF_THE_BALL,
                                                MentalAttributes.TEAMWORK));

                preferableAttributesMapping.put(
                                FieldPosition.STCR.name() + Role.DEEP_LYING_FORWARD.name() + Duty.SUPPORT.name(),
                                List.of(
                                                TechnicalAttributes.FINISHING, MentalAttributes.ANTICIPATION,
                                                MentalAttributes.FLAIR,
                                                MentalAttributes.VISION, PhysicalAttributes.BALANCE,
                                                PhysicalAttributes.STRENGTH));

                // STCL DEEP LYING FORWARD ATTACK
                keyAttributesMapping.put(
                                FieldPosition.STCL.name() + Role.DEEP_LYING_FORWARD.name() + Duty.ATTACK.name(),
                                List.of(
                                                TechnicalAttributes.FIRST_TOUCH, TechnicalAttributes.PASSING,
                                                TechnicalAttributes.TECHNIQUE,
                                                MentalAttributes.COMPOSURE, MentalAttributes.DECISIONS,
                                                MentalAttributes.OFF_THE_BALL,
                                                MentalAttributes.TEAMWORK));

                preferableAttributesMapping.put(
                                FieldPosition.STCL.name() + Role.DEEP_LYING_FORWARD.name() + Duty.ATTACK.name(),
                                List.of(
                                                TechnicalAttributes.DRIBBLING, TechnicalAttributes.FINISHING,
                                                MentalAttributes.ANTICIPATION,
                                                MentalAttributes.FLAIR,
                                                MentalAttributes.VISION, PhysicalAttributes.BALANCE,
                                                PhysicalAttributes.STRENGTH));

                // STC DEEP LYING FORWARD ATTACK
                keyAttributesMapping.put(
                                FieldPosition.STC.name() + Role.DEEP_LYING_FORWARD.name() + Duty.ATTACK.name(),
                                List.of(
                                                TechnicalAttributes.FIRST_TOUCH, TechnicalAttributes.PASSING,
                                                TechnicalAttributes.TECHNIQUE,
                                                MentalAttributes.COMPOSURE, MentalAttributes.DECISIONS,
                                                MentalAttributes.OFF_THE_BALL,
                                                MentalAttributes.TEAMWORK));

                preferableAttributesMapping.put(
                                FieldPosition.STC.name() + Role.DEEP_LYING_FORWARD.name() + Duty.ATTACK.name(),
                                List.of(
                                                TechnicalAttributes.DRIBBLING, TechnicalAttributes.FINISHING,
                                                MentalAttributes.ANTICIPATION,
                                                MentalAttributes.FLAIR,
                                                MentalAttributes.VISION, PhysicalAttributes.BALANCE,
                                                PhysicalAttributes.STRENGTH));

                // STCR DEEP LYING FORWARD ATTACK
                keyAttributesMapping.put(
                                FieldPosition.STCR.name() + Role.DEEP_LYING_FORWARD.name() + Duty.ATTACK.name(),
                                List.of(
                                                TechnicalAttributes.FIRST_TOUCH, TechnicalAttributes.PASSING,
                                                TechnicalAttributes.TECHNIQUE,
                                                MentalAttributes.COMPOSURE, MentalAttributes.DECISIONS,
                                                MentalAttributes.OFF_THE_BALL,
                                                MentalAttributes.TEAMWORK));

                preferableAttributesMapping.put(
                                FieldPosition.STCR.name() + Role.DEEP_LYING_FORWARD.name() + Duty.ATTACK.name(),
                                List.of(
                                                TechnicalAttributes.DRIBBLING, TechnicalAttributes.FINISHING,
                                                MentalAttributes.ANTICIPATION,
                                                MentalAttributes.FLAIR,
                                                MentalAttributes.VISION, PhysicalAttributes.BALANCE,
                                                PhysicalAttributes.STRENGTH));

                // STCL ADVANCED FORWARD ATTACK
                keyAttributesMapping.put(
                                FieldPosition.STCL.name() + Role.ADVANCED_FORWARD.name() + Duty.ATTACK.name(),
                                List.of(
                                                TechnicalAttributes.DRIBBLING, TechnicalAttributes.FINISHING,
                                                TechnicalAttributes.FIRST_TOUCH,
                                                TechnicalAttributes.TECHNIQUE, MentalAttributes.COMPOSURE,
                                                MentalAttributes.OFF_THE_BALL,
                                                PhysicalAttributes.ACCELERATION));

                preferableAttributesMapping.put(
                                FieldPosition.STCL.name() + Role.ADVANCED_FORWARD.name() + Duty.ATTACK.name(),
                                List.of(
                                                TechnicalAttributes.PASSING, MentalAttributes.ANTICIPATION,
                                                MentalAttributes.DECISIONS,
                                                MentalAttributes.WORK_RATE, PhysicalAttributes.AGILITY,
                                                PhysicalAttributes.BALANCE,
                                                PhysicalAttributes.PACE, PhysicalAttributes.STAMINA));

                // STC ADVANCED FORWARD ATTACK
                keyAttributesMapping.put(
                                FieldPosition.STC.name() + Role.ADVANCED_FORWARD.name() + Duty.ATTACK.name(),
                                List.of(
                                                TechnicalAttributes.DRIBBLING, TechnicalAttributes.FINISHING,
                                                TechnicalAttributes.FIRST_TOUCH,
                                                TechnicalAttributes.TECHNIQUE, MentalAttributes.COMPOSURE,
                                                MentalAttributes.OFF_THE_BALL,
                                                PhysicalAttributes.ACCELERATION));

                preferableAttributesMapping.put(
                                FieldPosition.STC.name() + Role.ADVANCED_FORWARD.name() + Duty.ATTACK.name(),
                                List.of(
                                                TechnicalAttributes.PASSING, MentalAttributes.ANTICIPATION,
                                                MentalAttributes.DECISIONS,
                                                MentalAttributes.WORK_RATE, PhysicalAttributes.AGILITY,
                                                PhysicalAttributes.BALANCE,
                                                PhysicalAttributes.PACE, PhysicalAttributes.STAMINA));

                // STCR ADVANCED FORWARD ATTACK
                keyAttributesMapping.put(
                                FieldPosition.STCR.name() + Role.ADVANCED_FORWARD.name() + Duty.ATTACK.name(),
                                List.of(
                                                TechnicalAttributes.DRIBBLING, TechnicalAttributes.FINISHING,
                                                TechnicalAttributes.FIRST_TOUCH,
                                                TechnicalAttributes.TECHNIQUE, MentalAttributes.COMPOSURE,
                                                MentalAttributes.OFF_THE_BALL,
                                                PhysicalAttributes.ACCELERATION));

                preferableAttributesMapping.put(
                                FieldPosition.STCR.name() + Role.ADVANCED_FORWARD.name() + Duty.ATTACK.name(),
                                List.of(
                                                TechnicalAttributes.PASSING, MentalAttributes.ANTICIPATION,
                                                MentalAttributes.DECISIONS,
                                                MentalAttributes.WORK_RATE, PhysicalAttributes.AGILITY,
                                                PhysicalAttributes.BALANCE,
                                                PhysicalAttributes.PACE, PhysicalAttributes.STAMINA));

                // STCL TARGET FORWARD SUPPORT
                keyAttributesMapping.put(
                                FieldPosition.STCL.name() + Role.TARGET_FORWARD.name() + Duty.SUPPORT.name(),
                                List.of(
                                                TechnicalAttributes.HEADING, MentalAttributes.BRAVERY,
                                                MentalAttributes.TEAMWORK,
                                                PhysicalAttributes.BALANCE, PhysicalAttributes.JUMPING_REACH,
                                                PhysicalAttributes.STRENGTH));

                preferableAttributesMapping.put(
                                FieldPosition.STCL.name() + Role.TARGET_FORWARD.name() + Duty.SUPPORT.name(),
                                List.of(
                                                TechnicalAttributes.FINISHING, TechnicalAttributes.FIRST_TOUCH,
                                                MentalAttributes.AGGRESSION,
                                                MentalAttributes.ANTICIPATION, MentalAttributes.COMPOSURE,
                                                MentalAttributes.DECISIONS,
                                                MentalAttributes.OFF_THE_BALL));

                // STC TARGET FORWARD SUPPORT
                keyAttributesMapping.put(
                                FieldPosition.STC.name() + Role.TARGET_FORWARD.name() + Duty.SUPPORT.name(),
                                List.of(
                                                TechnicalAttributes.HEADING, MentalAttributes.BRAVERY,
                                                MentalAttributes.TEAMWORK,
                                                PhysicalAttributes.BALANCE, PhysicalAttributes.JUMPING_REACH,
                                                PhysicalAttributes.STRENGTH));

                preferableAttributesMapping.put(
                                FieldPosition.STC.name() + Role.TARGET_FORWARD.name() + Duty.SUPPORT.name(),
                                List.of(
                                                TechnicalAttributes.FINISHING, TechnicalAttributes.FIRST_TOUCH,
                                                MentalAttributes.AGGRESSION,
                                                MentalAttributes.ANTICIPATION, MentalAttributes.COMPOSURE,
                                                MentalAttributes.DECISIONS,
                                                MentalAttributes.OFF_THE_BALL));

                // STCR TARGET FORWARD SUPPORT
                keyAttributesMapping.put(
                                FieldPosition.STCR.name() + Role.TARGET_FORWARD.name() + Duty.SUPPORT.name(),
                                List.of(
                                                TechnicalAttributes.HEADING, MentalAttributes.BRAVERY,
                                                MentalAttributes.TEAMWORK,
                                                PhysicalAttributes.BALANCE, PhysicalAttributes.JUMPING_REACH,
                                                PhysicalAttributes.STRENGTH));

                preferableAttributesMapping.put(
                                FieldPosition.STCR.name() + Role.TARGET_FORWARD.name() + Duty.SUPPORT.name(),
                                List.of(
                                                TechnicalAttributes.FINISHING, TechnicalAttributes.FIRST_TOUCH,
                                                MentalAttributes.AGGRESSION,
                                                MentalAttributes.ANTICIPATION, MentalAttributes.COMPOSURE,
                                                MentalAttributes.DECISIONS,
                                                MentalAttributes.OFF_THE_BALL));

                // STCL TARGET FORWARD ATTACK
                keyAttributesMapping.put(
                                FieldPosition.STCL.name() + Role.TARGET_FORWARD.name() + Duty.ATTACK.name(),
                                List.of(
                                                TechnicalAttributes.FINISHING, TechnicalAttributes.HEADING,
                                                MentalAttributes.BRAVERY,
                                                MentalAttributes.COMPOSURE, MentalAttributes.OFF_THE_BALL,
                                                PhysicalAttributes.BALANCE, PhysicalAttributes.JUMPING_REACH,
                                                PhysicalAttributes.STRENGTH));

                preferableAttributesMapping.put(
                                FieldPosition.STCL.name() + Role.TARGET_FORWARD.name() + Duty.ATTACK.name(),
                                List.of(
                                                TechnicalAttributes.FIRST_TOUCH, MentalAttributes.AGGRESSION,
                                                MentalAttributes.ANTICIPATION, MentalAttributes.DECISIONS,
                                                MentalAttributes.TEAMWORK));

                // STC TARGET FORWARD ATTACK
                keyAttributesMapping.put(
                                FieldPosition.STC.name() + Role.TARGET_FORWARD.name() + Duty.ATTACK.name(),
                                List.of(
                                                TechnicalAttributes.FINISHING, TechnicalAttributes.HEADING,
                                                MentalAttributes.BRAVERY,
                                                MentalAttributes.COMPOSURE, MentalAttributes.OFF_THE_BALL,
                                                PhysicalAttributes.BALANCE, PhysicalAttributes.JUMPING_REACH,
                                                PhysicalAttributes.STRENGTH));

                preferableAttributesMapping.put(
                                FieldPosition.STC.name() + Role.TARGET_FORWARD.name() + Duty.ATTACK.name(),
                                List.of(
                                                TechnicalAttributes.FIRST_TOUCH, MentalAttributes.AGGRESSION,
                                                MentalAttributes.ANTICIPATION, MentalAttributes.DECISIONS,
                                                MentalAttributes.TEAMWORK));

                // STCR TARGET FORWARD ATTACK
                keyAttributesMapping.put(
                                FieldPosition.STCR.name() + Role.TARGET_FORWARD.name() + Duty.ATTACK.name(),
                                List.of(
                                                TechnicalAttributes.FINISHING, TechnicalAttributes.HEADING,
                                                MentalAttributes.BRAVERY,
                                                MentalAttributes.COMPOSURE, MentalAttributes.OFF_THE_BALL,
                                                PhysicalAttributes.BALANCE, PhysicalAttributes.JUMPING_REACH,
                                                PhysicalAttributes.STRENGTH));

                preferableAttributesMapping.put(
                                FieldPosition.STCR.name() + Role.TARGET_FORWARD.name() + Duty.ATTACK.name(),
                                List.of(
                                                TechnicalAttributes.FIRST_TOUCH, MentalAttributes.AGGRESSION,
                                                MentalAttributes.ANTICIPATION, MentalAttributes.DECISIONS,
                                                MentalAttributes.TEAMWORK));

                // STCL POACHER ATTACK
                keyAttributesMapping.put(
                                FieldPosition.STCL.name() + Role.POACHER.name() + Duty.ATTACK.name(),
                                List.of(
                                                TechnicalAttributes.FINISHING, MentalAttributes.ANTICIPATION,
                                                MentalAttributes.COMPOSURE,
                                                MentalAttributes.OFF_THE_BALL));

                preferableAttributesMapping.put(
                                FieldPosition.STCL.name() + Role.POACHER.name() + Duty.ATTACK.name(),
                                List.of(
                                                TechnicalAttributes.FIRST_TOUCH, TechnicalAttributes.HEADING,
                                                TechnicalAttributes.TECHNIQUE,
                                                MentalAttributes.DECISIONS, PhysicalAttributes.ACCELERATION));

                // STC POACHER ATTACK
                keyAttributesMapping.put(
                                FieldPosition.STC.name() + Role.POACHER.name() + Duty.ATTACK.name(),
                                List.of(
                                                TechnicalAttributes.FINISHING, MentalAttributes.ANTICIPATION,
                                                MentalAttributes.COMPOSURE,
                                                MentalAttributes.OFF_THE_BALL));

                preferableAttributesMapping.put(
                                FieldPosition.STC.name() + Role.POACHER.name() + Duty.ATTACK.name(),
                                List.of(
                                                TechnicalAttributes.FIRST_TOUCH, TechnicalAttributes.HEADING,
                                                TechnicalAttributes.TECHNIQUE,
                                                MentalAttributes.DECISIONS, PhysicalAttributes.ACCELERATION));

                // STCR POACHER ATTACK
                keyAttributesMapping.put(
                                FieldPosition.STCR.name() + Role.POACHER.name() + Duty.ATTACK.name(),
                                List.of(
                                                TechnicalAttributes.FINISHING, MentalAttributes.ANTICIPATION,
                                                MentalAttributes.COMPOSURE,
                                                MentalAttributes.OFF_THE_BALL));

                preferableAttributesMapping.put(
                                FieldPosition.STCR.name() + Role.POACHER.name() + Duty.ATTACK.name(),
                                List.of(
                                                TechnicalAttributes.FIRST_TOUCH, TechnicalAttributes.HEADING,
                                                TechnicalAttributes.TECHNIQUE,
                                                MentalAttributes.DECISIONS, PhysicalAttributes.ACCELERATION));

                // STCL COMPLETE FORWARD SUPPORT
                keyAttributesMapping.put(
                                FieldPosition.STCL.name() + Role.COMPLETE_FORWARD.name() + Duty.SUPPORT.name(),
                                List.of(
                                                TechnicalAttributes.DRIBBLING, TechnicalAttributes.FIRST_TOUCH,
                                                TechnicalAttributes.HEADING,
                                                TechnicalAttributes.LONG_SHOTS, TechnicalAttributes.PASSING,
                                                TechnicalAttributes.TECHNIQUE,
                                                MentalAttributes.ANTICIPATION, MentalAttributes.COMPOSURE,
                                                MentalAttributes.DECISIONS,
                                                MentalAttributes.OFF_THE_BALL, MentalAttributes.VISION,
                                                PhysicalAttributes.ACCELERATION,
                                                PhysicalAttributes.AGILITY, PhysicalAttributes.STRENGTH));

                preferableAttributesMapping.put(
                                FieldPosition.STCL.name() + Role.COMPLETE_FORWARD.name() + Duty.SUPPORT.name(),
                                List.of(
                                                TechnicalAttributes.FINISHING, MentalAttributes.TEAMWORK,
                                                MentalAttributes.WORK_RATE,
                                                PhysicalAttributes.BALANCE, PhysicalAttributes.JUMPING_REACH,
                                                PhysicalAttributes.PACE,
                                                PhysicalAttributes.STAMINA));

                // STC COMPLETE FORWARD SUPPORT
                keyAttributesMapping.put(
                                FieldPosition.STC.name() + Role.COMPLETE_FORWARD.name() + Duty.SUPPORT.name(),
                                List.of(
                                                TechnicalAttributes.DRIBBLING, TechnicalAttributes.FIRST_TOUCH,
                                                TechnicalAttributes.HEADING,
                                                TechnicalAttributes.LONG_SHOTS, TechnicalAttributes.PASSING,
                                                TechnicalAttributes.TECHNIQUE,
                                                MentalAttributes.ANTICIPATION, MentalAttributes.COMPOSURE,
                                                MentalAttributes.DECISIONS,
                                                MentalAttributes.OFF_THE_BALL, MentalAttributes.VISION,
                                                PhysicalAttributes.ACCELERATION,
                                                PhysicalAttributes.AGILITY, PhysicalAttributes.STRENGTH));

                preferableAttributesMapping.put(
                                FieldPosition.STC.name() + Role.COMPLETE_FORWARD.name() + Duty.SUPPORT.name(),
                                List.of(
                                                TechnicalAttributes.FINISHING, MentalAttributes.TEAMWORK,
                                                MentalAttributes.WORK_RATE,
                                                PhysicalAttributes.BALANCE, PhysicalAttributes.JUMPING_REACH,
                                                PhysicalAttributes.PACE,
                                                PhysicalAttributes.STAMINA));

                // STCR COMPLETE FORWARD SUPPORT
                keyAttributesMapping.put(
                                FieldPosition.STCR.name() + Role.COMPLETE_FORWARD.name() + Duty.SUPPORT.name(),
                                List.of(
                                                TechnicalAttributes.DRIBBLING, TechnicalAttributes.FIRST_TOUCH,
                                                TechnicalAttributes.HEADING,
                                                TechnicalAttributes.LONG_SHOTS, TechnicalAttributes.PASSING,
                                                TechnicalAttributes.TECHNIQUE,
                                                MentalAttributes.ANTICIPATION, MentalAttributes.COMPOSURE,
                                                MentalAttributes.DECISIONS,
                                                MentalAttributes.OFF_THE_BALL, MentalAttributes.VISION,
                                                PhysicalAttributes.ACCELERATION,
                                                PhysicalAttributes.AGILITY, PhysicalAttributes.STRENGTH));

                preferableAttributesMapping.put(
                                FieldPosition.STCR.name() + Role.COMPLETE_FORWARD.name() + Duty.SUPPORT.name(),
                                List.of(
                                                TechnicalAttributes.FINISHING, MentalAttributes.TEAMWORK,
                                                MentalAttributes.WORK_RATE,
                                                PhysicalAttributes.BALANCE, PhysicalAttributes.JUMPING_REACH,
                                                PhysicalAttributes.PACE,
                                                PhysicalAttributes.STAMINA));

                // STCL COMPLETE FORWARD ATTACK
                keyAttributesMapping.put(
                                FieldPosition.STCL.name() + Role.COMPLETE_FORWARD.name() + Duty.ATTACK.name(),
                                List.of(
                                                TechnicalAttributes.DRIBBLING, TechnicalAttributes.FINISHING,
                                                TechnicalAttributes.FIRST_TOUCH,
                                                TechnicalAttributes.HEADING,
                                                TechnicalAttributes.TECHNIQUE,
                                                MentalAttributes.ANTICIPATION, MentalAttributes.COMPOSURE,
                                                MentalAttributes.OFF_THE_BALL, PhysicalAttributes.ACCELERATION,
                                                PhysicalAttributes.AGILITY, PhysicalAttributes.STRENGTH));

                preferableAttributesMapping.put(
                                FieldPosition.STCL.name() + Role.COMPLETE_FORWARD.name() + Duty.ATTACK.name(),
                                List.of(
                                                TechnicalAttributes.LONG_SHOTS, TechnicalAttributes.PASSING,
                                                MentalAttributes.DECISIONS,
                                                MentalAttributes.TEAMWORK, MentalAttributes.VISION,
                                                MentalAttributes.WORK_RATE,
                                                PhysicalAttributes.BALANCE, PhysicalAttributes.JUMPING_REACH,
                                                PhysicalAttributes.PACE,
                                                PhysicalAttributes.STAMINA));

                // STC COMPLETE FORWARD ATTACK
                keyAttributesMapping.put(
                                FieldPosition.STC.name() + Role.COMPLETE_FORWARD.name() + Duty.ATTACK.name(),
                                List.of(
                                                TechnicalAttributes.DRIBBLING, TechnicalAttributes.FINISHING,
                                                TechnicalAttributes.FIRST_TOUCH,
                                                TechnicalAttributes.HEADING,
                                                TechnicalAttributes.TECHNIQUE,
                                                MentalAttributes.ANTICIPATION, MentalAttributes.COMPOSURE,
                                                MentalAttributes.OFF_THE_BALL, PhysicalAttributes.ACCELERATION,
                                                PhysicalAttributes.AGILITY, PhysicalAttributes.STRENGTH));

                preferableAttributesMapping.put(
                                FieldPosition.STC.name() + Role.COMPLETE_FORWARD.name() + Duty.ATTACK.name(),
                                List.of(
                                                TechnicalAttributes.LONG_SHOTS, TechnicalAttributes.PASSING,
                                                MentalAttributes.DECISIONS,
                                                MentalAttributes.TEAMWORK, MentalAttributes.VISION,
                                                MentalAttributes.WORK_RATE,
                                                PhysicalAttributes.BALANCE, PhysicalAttributes.JUMPING_REACH,
                                                PhysicalAttributes.PACE,
                                                PhysicalAttributes.STAMINA));

                // STCR COMPLETE FORWARD ATTACK
                keyAttributesMapping.put(
                                FieldPosition.STCR.name() + Role.COMPLETE_FORWARD.name() + Duty.ATTACK.name(),
                                List.of(
                                                TechnicalAttributes.DRIBBLING, TechnicalAttributes.FINISHING,
                                                TechnicalAttributes.FIRST_TOUCH,
                                                TechnicalAttributes.HEADING,
                                                TechnicalAttributes.TECHNIQUE,
                                                MentalAttributes.ANTICIPATION, MentalAttributes.COMPOSURE,
                                                MentalAttributes.OFF_THE_BALL, PhysicalAttributes.ACCELERATION,
                                                PhysicalAttributes.AGILITY, PhysicalAttributes.STRENGTH));

                preferableAttributesMapping.put(
                                FieldPosition.STCR.name() + Role.COMPLETE_FORWARD.name() + Duty.ATTACK.name(),
                                List.of(
                                                TechnicalAttributes.LONG_SHOTS, TechnicalAttributes.PASSING,
                                                MentalAttributes.DECISIONS,
                                                MentalAttributes.TEAMWORK, MentalAttributes.VISION,
                                                MentalAttributes.WORK_RATE,
                                                PhysicalAttributes.BALANCE, PhysicalAttributes.JUMPING_REACH,
                                                PhysicalAttributes.PACE,
                                                PhysicalAttributes.STAMINA));

                // STCL PRESSING FORWARD DEFEND
                keyAttributesMapping.put(
                                FieldPosition.STCL.name() + Role.PRESSING_FORWARD.name() + Duty.DEFEND.name(),
                                List.of(
                                                MentalAttributes.AGGRESSION, MentalAttributes.ANTICIPATION,
                                                MentalAttributes.BRAVERY,
                                                MentalAttributes.DECISIONS, MentalAttributes.TEAMWORK,
                                                MentalAttributes.WORK_RATE,
                                                PhysicalAttributes.ACCELERATION, PhysicalAttributes.PACE,
                                                PhysicalAttributes.STAMINA));

                preferableAttributesMapping.put(
                                FieldPosition.STCL.name() + Role.PRESSING_FORWARD.name() + Duty.DEFEND.name(),
                                List.of(
                                                TechnicalAttributes.FIRST_TOUCH, MentalAttributes.COMPOSURE,
                                                MentalAttributes.CONCENTRATION,
                                                PhysicalAttributes.AGILITY, PhysicalAttributes.BALANCE,
                                                PhysicalAttributes.STRENGTH));

                // STC PRESSING FORWARD DEFEND
                keyAttributesMapping.put(
                                FieldPosition.STC.name() + Role.PRESSING_FORWARD.name() + Duty.DEFEND.name(),
                                List.of(
                                                MentalAttributes.AGGRESSION, MentalAttributes.ANTICIPATION,
                                                MentalAttributes.BRAVERY,
                                                MentalAttributes.DECISIONS, MentalAttributes.TEAMWORK,
                                                MentalAttributes.WORK_RATE,
                                                PhysicalAttributes.ACCELERATION, PhysicalAttributes.PACE,
                                                PhysicalAttributes.STAMINA));

                preferableAttributesMapping.put(
                                FieldPosition.STC.name() + Role.PRESSING_FORWARD.name() + Duty.DEFEND.name(),
                                List.of(
                                                TechnicalAttributes.FIRST_TOUCH, MentalAttributes.COMPOSURE,
                                                MentalAttributes.CONCENTRATION,
                                                PhysicalAttributes.AGILITY, PhysicalAttributes.BALANCE,
                                                PhysicalAttributes.STRENGTH));

                // STCR PRESSING FORWARD DEFEND
                keyAttributesMapping.put(
                                FieldPosition.STCR.name() + Role.PRESSING_FORWARD.name() + Duty.DEFEND.name(),
                                List.of(
                                                MentalAttributes.AGGRESSION, MentalAttributes.ANTICIPATION,
                                                MentalAttributes.BRAVERY,
                                                MentalAttributes.DECISIONS, MentalAttributes.TEAMWORK,
                                                MentalAttributes.WORK_RATE,
                                                PhysicalAttributes.ACCELERATION, PhysicalAttributes.PACE,
                                                PhysicalAttributes.STAMINA));

                preferableAttributesMapping.put(
                                FieldPosition.STCR.name() + Role.PRESSING_FORWARD.name() + Duty.DEFEND.name(),
                                List.of(
                                                TechnicalAttributes.FIRST_TOUCH, MentalAttributes.COMPOSURE,
                                                MentalAttributes.CONCENTRATION,
                                                PhysicalAttributes.AGILITY, PhysicalAttributes.BALANCE,
                                                PhysicalAttributes.STRENGTH));

                // STCL PRESSING FORWARD SUPPORT
                keyAttributesMapping.put(
                                FieldPosition.STCL.name() + Role.PRESSING_FORWARD.name() + Duty.SUPPORT.name(),
                                List.of(
                                                MentalAttributes.AGGRESSION, MentalAttributes.ANTICIPATION,
                                                MentalAttributes.BRAVERY,
                                                MentalAttributes.DECISIONS, MentalAttributes.TEAMWORK,
                                                MentalAttributes.WORK_RATE,
                                                PhysicalAttributes.ACCELERATION, PhysicalAttributes.PACE,
                                                PhysicalAttributes.STAMINA));

                preferableAttributesMapping.put(
                                FieldPosition.STCL.name() + Role.PRESSING_FORWARD.name() + Duty.SUPPORT.name(),
                                List.of(
                                                TechnicalAttributes.FIRST_TOUCH, TechnicalAttributes.PASSING,
                                                MentalAttributes.COMPOSURE, MentalAttributes.CONCENTRATION,
                                                MentalAttributes.OFF_THE_BALL, PhysicalAttributes.AGILITY,
                                                PhysicalAttributes.BALANCE, PhysicalAttributes.STRENGTH));

                // STC PRESSING FORWARD SUPPORT
                keyAttributesMapping.put(
                                FieldPosition.STC.name() + Role.PRESSING_FORWARD.name() + Duty.SUPPORT.name(),
                                List.of(
                                                MentalAttributes.AGGRESSION, MentalAttributes.ANTICIPATION,
                                                MentalAttributes.BRAVERY,
                                                MentalAttributes.DECISIONS, MentalAttributes.TEAMWORK,
                                                MentalAttributes.WORK_RATE,
                                                PhysicalAttributes.ACCELERATION, PhysicalAttributes.PACE,
                                                PhysicalAttributes.STAMINA));

                preferableAttributesMapping.put(
                                FieldPosition.STC.name() + Role.PRESSING_FORWARD.name() + Duty.SUPPORT.name(),
                                List.of(
                                                TechnicalAttributes.FIRST_TOUCH, TechnicalAttributes.PASSING,
                                                MentalAttributes.COMPOSURE, MentalAttributes.CONCENTRATION,
                                                MentalAttributes.OFF_THE_BALL, PhysicalAttributes.AGILITY,
                                                PhysicalAttributes.BALANCE, PhysicalAttributes.STRENGTH));

                // STCR PRESSING FORWARD SUPPORT
                keyAttributesMapping.put(
                                FieldPosition.STCR.name() + Role.PRESSING_FORWARD.name() + Duty.SUPPORT.name(),
                                List.of(
                                                MentalAttributes.AGGRESSION, MentalAttributes.ANTICIPATION,
                                                MentalAttributes.BRAVERY,
                                                MentalAttributes.DECISIONS, MentalAttributes.TEAMWORK,
                                                MentalAttributes.WORK_RATE,
                                                PhysicalAttributes.ACCELERATION, PhysicalAttributes.PACE,
                                                PhysicalAttributes.STAMINA));

                preferableAttributesMapping.put(
                                FieldPosition.STCR.name() + Role.PRESSING_FORWARD.name() + Duty.SUPPORT.name(),
                                List.of(
                                                TechnicalAttributes.FIRST_TOUCH, TechnicalAttributes.PASSING,
                                                MentalAttributes.COMPOSURE, MentalAttributes.CONCENTRATION,
                                                MentalAttributes.OFF_THE_BALL, PhysicalAttributes.AGILITY,
                                                PhysicalAttributes.BALANCE, PhysicalAttributes.STRENGTH));

                // STCL PRESSING FORWARD ATTACK
                keyAttributesMapping.put(
                                FieldPosition.STCL.name() + Role.PRESSING_FORWARD.name() + Duty.ATTACK.name(),
                                List.of(
                                                MentalAttributes.AGGRESSION, MentalAttributes.ANTICIPATION,
                                                MentalAttributes.BRAVERY, MentalAttributes.OFF_THE_BALL,
                                                MentalAttributes.TEAMWORK,
                                                MentalAttributes.WORK_RATE,
                                                PhysicalAttributes.ACCELERATION, PhysicalAttributes.PACE,
                                                PhysicalAttributes.STAMINA));

                preferableAttributesMapping.put(
                                FieldPosition.STCL.name() + Role.PRESSING_FORWARD.name() + Duty.ATTACK.name(),
                                List.of(
                                                TechnicalAttributes.FINISHING, TechnicalAttributes.FIRST_TOUCH,
                                                MentalAttributes.COMPOSURE, MentalAttributes.CONCENTRATION,
                                                MentalAttributes.DECISIONS, PhysicalAttributes.AGILITY,
                                                PhysicalAttributes.BALANCE, PhysicalAttributes.STRENGTH));

                // STC PRESSING FORWARD ATTACK
                keyAttributesMapping.put(
                                FieldPosition.STC.name() + Role.PRESSING_FORWARD.name() + Duty.ATTACK.name(),
                                List.of(
                                                MentalAttributes.AGGRESSION, MentalAttributes.ANTICIPATION,
                                                MentalAttributes.BRAVERY, MentalAttributes.OFF_THE_BALL,
                                                MentalAttributes.TEAMWORK,
                                                MentalAttributes.WORK_RATE,
                                                PhysicalAttributes.ACCELERATION, PhysicalAttributes.PACE,
                                                PhysicalAttributes.STAMINA));

                preferableAttributesMapping.put(
                                FieldPosition.STC.name() + Role.PRESSING_FORWARD.name() + Duty.ATTACK.name(),
                                List.of(
                                                TechnicalAttributes.FINISHING, TechnicalAttributes.FIRST_TOUCH,
                                                MentalAttributes.COMPOSURE, MentalAttributes.CONCENTRATION,
                                                MentalAttributes.DECISIONS, PhysicalAttributes.AGILITY,
                                                PhysicalAttributes.BALANCE, PhysicalAttributes.STRENGTH));

                // STCR PRESSING FORWARD ATTACK
                keyAttributesMapping.put(
                                FieldPosition.STCR.name() + Role.PRESSING_FORWARD.name() + Duty.ATTACK.name(),
                                List.of(
                                                MentalAttributes.AGGRESSION, MentalAttributes.ANTICIPATION,
                                                MentalAttributes.BRAVERY, MentalAttributes.OFF_THE_BALL,
                                                MentalAttributes.TEAMWORK,
                                                MentalAttributes.WORK_RATE,
                                                PhysicalAttributes.ACCELERATION, PhysicalAttributes.PACE,
                                                PhysicalAttributes.STAMINA));

                preferableAttributesMapping.put(
                                FieldPosition.STCR.name() + Role.PRESSING_FORWARD.name() + Duty.ATTACK.name(),
                                List.of(
                                                TechnicalAttributes.FINISHING, TechnicalAttributes.FIRST_TOUCH,
                                                MentalAttributes.COMPOSURE, MentalAttributes.CONCENTRATION,
                                                MentalAttributes.DECISIONS, PhysicalAttributes.AGILITY,
                                                PhysicalAttributes.BALANCE, PhysicalAttributes.STRENGTH));

                // STCL TREQUARTISTA ATTACK
                keyAttributesMapping.put(
                                FieldPosition.STCL.name() + Role.TREQUARTISTA.name() + Duty.ATTACK.name(),
                                List.of(
                                                TechnicalAttributes.DRIBBLING, TechnicalAttributes.FIRST_TOUCH,
                                                TechnicalAttributes.PASSING, TechnicalAttributes.TECHNIQUE,
                                                MentalAttributes.COMPOSURE, MentalAttributes.DECISIONS,
                                                MentalAttributes.FLAIR, MentalAttributes.OFF_THE_BALL,
                                                MentalAttributes.VISION, PhysicalAttributes.ACCELERATION));

                preferableAttributesMapping.put(
                                FieldPosition.STCL.name() + Role.TREQUARTISTA.name() + Duty.ATTACK.name(),
                                List.of(
                                                TechnicalAttributes.FINISHING, MentalAttributes.ANTICIPATION,
                                                PhysicalAttributes.AGILITY, PhysicalAttributes.BALANCE));

                // STC TREQUARTISTA ATTACK
                keyAttributesMapping.put(
                                FieldPosition.STC.name() + Role.TREQUARTISTA.name() + Duty.ATTACK.name(),
                                List.of(
                                                TechnicalAttributes.DRIBBLING, TechnicalAttributes.FIRST_TOUCH,
                                                TechnicalAttributes.PASSING, TechnicalAttributes.TECHNIQUE,
                                                MentalAttributes.COMPOSURE, MentalAttributes.DECISIONS,
                                                MentalAttributes.FLAIR, MentalAttributes.OFF_THE_BALL,
                                                MentalAttributes.VISION, PhysicalAttributes.ACCELERATION));

                preferableAttributesMapping.put(
                                FieldPosition.STC.name() + Role.TREQUARTISTA.name() + Duty.ATTACK.name(),
                                List.of(
                                                TechnicalAttributes.FINISHING, MentalAttributes.ANTICIPATION,
                                                PhysicalAttributes.AGILITY, PhysicalAttributes.BALANCE));

                // STCR TREQUARTISTA ATTACK
                keyAttributesMapping.put(
                                FieldPosition.STCR.name() + Role.TREQUARTISTA.name() + Duty.ATTACK.name(),
                                List.of(
                                                TechnicalAttributes.DRIBBLING, TechnicalAttributes.FIRST_TOUCH,
                                                TechnicalAttributes.PASSING, TechnicalAttributes.TECHNIQUE,
                                                MentalAttributes.COMPOSURE, MentalAttributes.DECISIONS,
                                                MentalAttributes.FLAIR, MentalAttributes.OFF_THE_BALL,
                                                MentalAttributes.VISION, PhysicalAttributes.ACCELERATION));

                preferableAttributesMapping.put(
                                FieldPosition.STCR.name() + Role.TREQUARTISTA.name() + Duty.ATTACK.name(),
                                List.of(
                                                TechnicalAttributes.FINISHING, MentalAttributes.ANTICIPATION,
                                                PhysicalAttributes.AGILITY, PhysicalAttributes.BALANCE));

                // STCL FALSE NINE SUPPORT
                keyAttributesMapping.put(
                                FieldPosition.STCL.name() + Role.FALSE_NINE.name() + Duty.SUPPORT.name(),
                                List.of(
                                                TechnicalAttributes.DRIBBLING, TechnicalAttributes.FIRST_TOUCH,
                                                TechnicalAttributes.PASSING, TechnicalAttributes.TECHNIQUE,
                                                MentalAttributes.COMPOSURE, MentalAttributes.DECISIONS,
                                                MentalAttributes.OFF_THE_BALL, MentalAttributes.VISION,
                                                PhysicalAttributes.ACCELERATION, PhysicalAttributes.AGILITY));

                preferableAttributesMapping.put(
                                FieldPosition.STCL.name() + Role.FALSE_NINE.name() + Duty.SUPPORT.name(),
                                List.of(
                                                TechnicalAttributes.FINISHING, MentalAttributes.ANTICIPATION,
                                                MentalAttributes.FLAIR, MentalAttributes.TEAMWORK,
                                                PhysicalAttributes.BALANCE));

                // STC FALSE NINE SUPPORT
                keyAttributesMapping.put(
                                FieldPosition.STC.name() + Role.FALSE_NINE.name() + Duty.SUPPORT.name(),
                                List.of(
                                                TechnicalAttributes.DRIBBLING, TechnicalAttributes.FIRST_TOUCH,
                                                TechnicalAttributes.PASSING, TechnicalAttributes.TECHNIQUE,
                                                MentalAttributes.COMPOSURE, MentalAttributes.DECISIONS,
                                                MentalAttributes.OFF_THE_BALL, MentalAttributes.VISION,
                                                PhysicalAttributes.ACCELERATION, PhysicalAttributes.AGILITY));

                preferableAttributesMapping.put(
                                FieldPosition.STC.name() + Role.FALSE_NINE.name() + Duty.SUPPORT.name(),
                                List.of(
                                                TechnicalAttributes.FINISHING, MentalAttributes.ANTICIPATION,
                                                MentalAttributes.FLAIR, MentalAttributes.TEAMWORK,
                                                PhysicalAttributes.BALANCE));

                // STCR FALSE NINE SUPPORT
                keyAttributesMapping.put(
                                FieldPosition.STCR.name() + Role.FALSE_NINE.name() + Duty.SUPPORT.name(),
                                List.of(
                                                TechnicalAttributes.DRIBBLING, TechnicalAttributes.FIRST_TOUCH,
                                                TechnicalAttributes.PASSING, TechnicalAttributes.TECHNIQUE,
                                                MentalAttributes.COMPOSURE, MentalAttributes.DECISIONS,
                                                MentalAttributes.OFF_THE_BALL, MentalAttributes.VISION,
                                                PhysicalAttributes.ACCELERATION, PhysicalAttributes.AGILITY));

                preferableAttributesMapping.put(
                                FieldPosition.STCR.name() + Role.FALSE_NINE.name() + Duty.SUPPORT.name(),
                                List.of(
                                                TechnicalAttributes.FINISHING, MentalAttributes.ANTICIPATION,
                                                MentalAttributes.FLAIR, MentalAttributes.TEAMWORK,
                                                PhysicalAttributes.BALANCE));
        }
}
