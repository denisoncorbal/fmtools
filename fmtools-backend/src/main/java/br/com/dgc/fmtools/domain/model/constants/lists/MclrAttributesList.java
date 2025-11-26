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

public class MclrAttributesList {
        private Map<String, List<PlayerAttributes>> preferableAttributesMapping = new HashMap<>();
        private Map<String, List<PlayerAttributes>> keyAttributesMapping = new HashMap<>();

        public Map<String, List<PlayerAttributes>> getPreferableAttributesMapping() {
                return preferableAttributesMapping;
        }

        public Map<String, List<PlayerAttributes>> getKeyAttributesMapping() {
                return keyAttributesMapping;
        }

        public MclrAttributesList() {
                // MCL Central Midfielder Defend
                keyAttributesMapping.put(
                                FieldPosition.MCL.name() + Role.CENTRAL_MIDFIELDER.name() + Duty.DEFEND.name(),
                                List.of(
                                                TechnicalAttributes.TACKLING, MentalAttributes.CONCENTRATION,
                                                MentalAttributes.DECISIONS,
                                                MentalAttributes.POSITIONING, MentalAttributes.TEAMWORK));

                preferableAttributesMapping.put(
                                FieldPosition.MCL.name() + Role.CENTRAL_MIDFIELDER.name() + Duty.DEFEND.name(),
                                List.of(
                                                TechnicalAttributes.FIRST_TOUCH, TechnicalAttributes.MARKING,
                                                TechnicalAttributes.PASSING,
                                                TechnicalAttributes.TECHNIQUE, MentalAttributes.AGGRESSION,
                                                MentalAttributes.ANTICIPATION,
                                                MentalAttributes.COMPOSURE, MentalAttributes.WORK_RATE,
                                                PhysicalAttributes.STAMINA));

                // MC Central Midfielder Defend
                keyAttributesMapping.put(
                                FieldPosition.MC.name() + Role.CENTRAL_MIDFIELDER.name() + Duty.DEFEND.name(),
                                List.of(
                                                TechnicalAttributes.TACKLING, MentalAttributes.CONCENTRATION,
                                                MentalAttributes.DECISIONS,
                                                MentalAttributes.POSITIONING, MentalAttributes.TEAMWORK));

                preferableAttributesMapping.put(
                                FieldPosition.MC.name() + Role.CENTRAL_MIDFIELDER.name() + Duty.DEFEND.name(),
                                List.of(
                                                TechnicalAttributes.FIRST_TOUCH, TechnicalAttributes.MARKING,
                                                TechnicalAttributes.PASSING,
                                                TechnicalAttributes.TECHNIQUE, MentalAttributes.AGGRESSION,
                                                MentalAttributes.ANTICIPATION,
                                                MentalAttributes.COMPOSURE, MentalAttributes.WORK_RATE,
                                                PhysicalAttributes.STAMINA));

                // MCR Central Midfielder Defend
                keyAttributesMapping.put(
                                FieldPosition.MCR.name() + Role.CENTRAL_MIDFIELDER.name() + Duty.DEFEND.name(),
                                List.of(
                                                TechnicalAttributes.TACKLING, MentalAttributes.CONCENTRATION,
                                                MentalAttributes.DECISIONS,
                                                MentalAttributes.POSITIONING, MentalAttributes.TEAMWORK));

                preferableAttributesMapping.put(
                                FieldPosition.MCR.name() + Role.CENTRAL_MIDFIELDER.name() + Duty.DEFEND.name(),
                                List.of(
                                                TechnicalAttributes.FIRST_TOUCH, TechnicalAttributes.MARKING,
                                                TechnicalAttributes.PASSING,
                                                TechnicalAttributes.TECHNIQUE, MentalAttributes.AGGRESSION,
                                                MentalAttributes.ANTICIPATION,
                                                MentalAttributes.COMPOSURE, MentalAttributes.WORK_RATE,
                                                PhysicalAttributes.STAMINA));

                // MCL Central Midfielder Support
                keyAttributesMapping.put(
                                FieldPosition.MCL.name() + Role.CENTRAL_MIDFIELDER.name() + Duty.SUPPORT.name(),
                                List.of(
                                                TechnicalAttributes.FIRST_TOUCH, TechnicalAttributes.PASSING,
                                                TechnicalAttributes.TACKLING,
                                                MentalAttributes.DECISIONS,
                                                MentalAttributes.TEAMWORK));

                preferableAttributesMapping.put(
                                FieldPosition.MCL.name() + Role.CENTRAL_MIDFIELDER.name() + Duty.SUPPORT.name(),
                                List.of(
                                                TechnicalAttributes.TECHNIQUE, MentalAttributes.ANTICIPATION,
                                                MentalAttributes.COMPOSURE, MentalAttributes.CONCENTRATION,
                                                MentalAttributes.OFF_THE_BALL,
                                                MentalAttributes.VISION, MentalAttributes.WORK_RATE,
                                                PhysicalAttributes.STAMINA));

                // MC Central Midfielder Support
                keyAttributesMapping.put(
                                FieldPosition.MC.name() + Role.CENTRAL_MIDFIELDER.name() + Duty.SUPPORT.name(),
                                List.of(
                                                TechnicalAttributes.FIRST_TOUCH, TechnicalAttributes.PASSING,
                                                TechnicalAttributes.TACKLING,
                                                MentalAttributes.DECISIONS,
                                                MentalAttributes.TEAMWORK));

                preferableAttributesMapping.put(
                                FieldPosition.MC.name() + Role.CENTRAL_MIDFIELDER.name() + Duty.SUPPORT.name(),
                                List.of(
                                                TechnicalAttributes.TECHNIQUE, MentalAttributes.ANTICIPATION,
                                                MentalAttributes.COMPOSURE, MentalAttributes.CONCENTRATION,
                                                MentalAttributes.OFF_THE_BALL,
                                                MentalAttributes.VISION, MentalAttributes.WORK_RATE,
                                                PhysicalAttributes.STAMINA));

                // MCR Central Midfielder Support
                keyAttributesMapping.put(
                                FieldPosition.MCR.name() + Role.CENTRAL_MIDFIELDER.name() + Duty.SUPPORT.name(),
                                List.of(
                                                TechnicalAttributes.FIRST_TOUCH, TechnicalAttributes.PASSING,
                                                TechnicalAttributes.TACKLING,
                                                MentalAttributes.DECISIONS,
                                                MentalAttributes.TEAMWORK));

                preferableAttributesMapping.put(
                                FieldPosition.MCR.name() + Role.CENTRAL_MIDFIELDER.name() + Duty.SUPPORT.name(),
                                List.of(
                                                TechnicalAttributes.TECHNIQUE, MentalAttributes.ANTICIPATION,
                                                MentalAttributes.COMPOSURE, MentalAttributes.CONCENTRATION,
                                                MentalAttributes.OFF_THE_BALL,
                                                MentalAttributes.VISION, MentalAttributes.WORK_RATE,
                                                PhysicalAttributes.STAMINA));

                // MCL Central Midfielder Attack
                keyAttributesMapping.put(
                                FieldPosition.MCL.name() + Role.CENTRAL_MIDFIELDER.name() + Duty.ATTACK.name(),
                                List.of(
                                                TechnicalAttributes.FIRST_TOUCH, TechnicalAttributes.PASSING,
                                                MentalAttributes.DECISIONS,
                                                MentalAttributes.OFF_THE_BALL));

                preferableAttributesMapping.put(
                                FieldPosition.MCL.name() + Role.CENTRAL_MIDFIELDER.name() + Duty.ATTACK.name(),
                                List.of(
                                                TechnicalAttributes.LONG_SHOTS, TechnicalAttributes.TACKLING,
                                                TechnicalAttributes.TECHNIQUE, MentalAttributes.ANTICIPATION,
                                                MentalAttributes.COMPOSURE,
                                                MentalAttributes.TEAMWORK, MentalAttributes.VISION,
                                                MentalAttributes.WORK_RATE,
                                                PhysicalAttributes.ACCELERATION, PhysicalAttributes.STAMINA));

                // MC Central Midfielder Attack
                keyAttributesMapping.put(
                                FieldPosition.MC.name() + Role.CENTRAL_MIDFIELDER.name() + Duty.ATTACK.name(),
                                List.of(
                                                TechnicalAttributes.FIRST_TOUCH, TechnicalAttributes.PASSING,
                                                MentalAttributes.DECISIONS,
                                                MentalAttributes.OFF_THE_BALL));

                preferableAttributesMapping.put(
                                FieldPosition.MC.name() + Role.CENTRAL_MIDFIELDER.name() + Duty.ATTACK.name(),
                                List.of(
                                                TechnicalAttributes.LONG_SHOTS, TechnicalAttributes.TACKLING,
                                                TechnicalAttributes.TECHNIQUE, MentalAttributes.ANTICIPATION,
                                                MentalAttributes.COMPOSURE,
                                                MentalAttributes.TEAMWORK, MentalAttributes.VISION,
                                                MentalAttributes.WORK_RATE,
                                                PhysicalAttributes.ACCELERATION, PhysicalAttributes.STAMINA));

                // MCR Central Midfielder Attack
                keyAttributesMapping.put(
                                FieldPosition.MCR.name() + Role.CENTRAL_MIDFIELDER.name() + Duty.ATTACK.name(),
                                List.of(
                                                TechnicalAttributes.FIRST_TOUCH, TechnicalAttributes.PASSING,
                                                MentalAttributes.DECISIONS,
                                                MentalAttributes.OFF_THE_BALL));

                preferableAttributesMapping.put(
                                FieldPosition.MCR.name() + Role.CENTRAL_MIDFIELDER.name() + Duty.ATTACK.name(),
                                List.of(
                                                TechnicalAttributes.LONG_SHOTS, TechnicalAttributes.TACKLING,
                                                TechnicalAttributes.TECHNIQUE, MentalAttributes.ANTICIPATION,
                                                MentalAttributes.COMPOSURE,
                                                MentalAttributes.TEAMWORK, MentalAttributes.VISION,
                                                MentalAttributes.WORK_RATE,
                                                PhysicalAttributes.ACCELERATION, PhysicalAttributes.STAMINA));

                // MCL Central Midfielder Automatic
                keyAttributesMapping.put(
                                FieldPosition.MCL.name() + Role.CENTRAL_MIDFIELDER.name() + Duty.AUTOMATIC.name(),
                                List.of(
                                                TechnicalAttributes.FIRST_TOUCH, TechnicalAttributes.PASSING,
                                                TechnicalAttributes.TACKLING,
                                                MentalAttributes.DECISIONS,
                                                MentalAttributes.TEAMWORK));

                preferableAttributesMapping.put(
                                FieldPosition.MCL.name() + Role.CENTRAL_MIDFIELDER.name() + Duty.AUTOMATIC.name(),
                                List.of(
                                                TechnicalAttributes.TECHNIQUE, MentalAttributes.ANTICIPATION,
                                                MentalAttributes.COMPOSURE, MentalAttributes.CONCENTRATION,
                                                MentalAttributes.OFF_THE_BALL,
                                                MentalAttributes.VISION,
                                                MentalAttributes.WORK_RATE,
                                                PhysicalAttributes.STAMINA));

                // MC Central Midfielder Automatic
                keyAttributesMapping.put(
                                FieldPosition.MC.name() + Role.CENTRAL_MIDFIELDER.name() + Duty.AUTOMATIC.name(),
                                List.of(
                                                TechnicalAttributes.FIRST_TOUCH, TechnicalAttributes.PASSING,
                                                TechnicalAttributes.TACKLING,
                                                MentalAttributes.DECISIONS,
                                                MentalAttributes.TEAMWORK));

                preferableAttributesMapping.put(
                                FieldPosition.MC.name() + Role.CENTRAL_MIDFIELDER.name() + Duty.AUTOMATIC.name(),
                                List.of(
                                                TechnicalAttributes.TECHNIQUE, MentalAttributes.ANTICIPATION,
                                                MentalAttributes.COMPOSURE, MentalAttributes.CONCENTRATION,
                                                MentalAttributes.OFF_THE_BALL,
                                                MentalAttributes.VISION,
                                                MentalAttributes.WORK_RATE,
                                                PhysicalAttributes.STAMINA));

                // MCR Central Midfielder Automatic
                keyAttributesMapping.put(
                                FieldPosition.MCR.name() + Role.CENTRAL_MIDFIELDER.name() + Duty.AUTOMATIC.name(),
                                List.of(
                                                TechnicalAttributes.FIRST_TOUCH, TechnicalAttributes.PASSING,
                                                TechnicalAttributes.TACKLING,
                                                MentalAttributes.DECISIONS,
                                                MentalAttributes.TEAMWORK));

                preferableAttributesMapping.put(
                                FieldPosition.MCR.name() + Role.CENTRAL_MIDFIELDER.name() + Duty.AUTOMATIC.name(),
                                List.of(
                                                TechnicalAttributes.TECHNIQUE, MentalAttributes.ANTICIPATION,
                                                MentalAttributes.COMPOSURE, MentalAttributes.CONCENTRATION,
                                                MentalAttributes.OFF_THE_BALL,
                                                MentalAttributes.VISION,
                                                MentalAttributes.WORK_RATE,
                                                PhysicalAttributes.STAMINA));

                // MCL Deep Lying Playmaker Defend
                keyAttributesMapping.put(
                                FieldPosition.MCL.name() + Role.DEEP_LYING_PLAYMAKER.name() + Duty.DEFEND.name(),
                                List.of(
                                                TechnicalAttributes.FIRST_TOUCH, TechnicalAttributes.PASSING,
                                                TechnicalAttributes.TECHNIQUE,
                                                MentalAttributes.COMPOSURE,
                                                MentalAttributes.DECISIONS,
                                                MentalAttributes.TEAMWORK, MentalAttributes.VISION));

                preferableAttributesMapping.put(
                                FieldPosition.MCL.name() + Role.DEEP_LYING_PLAYMAKER.name() + Duty.DEFEND.name(),
                                List.of(
                                                TechnicalAttributes.TACKLING, MentalAttributes.ANTICIPATION,
                                                MentalAttributes.POSITIONING, PhysicalAttributes.BALANCE));

                // MC Deep Lying Playmaker Defend
                keyAttributesMapping.put(
                                FieldPosition.MC.name() + Role.DEEP_LYING_PLAYMAKER.name() + Duty.DEFEND.name(),
                                List.of(
                                                TechnicalAttributes.FIRST_TOUCH, TechnicalAttributes.PASSING,
                                                TechnicalAttributes.TECHNIQUE,
                                                MentalAttributes.COMPOSURE,
                                                MentalAttributes.DECISIONS,
                                                MentalAttributes.TEAMWORK, MentalAttributes.VISION));

                preferableAttributesMapping.put(
                                FieldPosition.MC.name() + Role.DEEP_LYING_PLAYMAKER.name() + Duty.DEFEND.name(),
                                List.of(
                                                TechnicalAttributes.TACKLING, MentalAttributes.ANTICIPATION,
                                                MentalAttributes.POSITIONING, PhysicalAttributes.BALANCE));

                // MCR Deep Lying Playmaker Defend
                keyAttributesMapping.put(
                                FieldPosition.MCR.name() + Role.DEEP_LYING_PLAYMAKER.name() + Duty.DEFEND.name(),
                                List.of(
                                                TechnicalAttributes.FIRST_TOUCH, TechnicalAttributes.PASSING,
                                                TechnicalAttributes.TECHNIQUE,
                                                MentalAttributes.COMPOSURE,
                                                MentalAttributes.DECISIONS,
                                                MentalAttributes.TEAMWORK, MentalAttributes.VISION));

                preferableAttributesMapping.put(
                                FieldPosition.MCR.name() + Role.DEEP_LYING_PLAYMAKER.name() + Duty.DEFEND.name(),
                                List.of(
                                                TechnicalAttributes.TACKLING, MentalAttributes.ANTICIPATION,
                                                MentalAttributes.POSITIONING, PhysicalAttributes.BALANCE));

                // MCL Deep Lying Playmaker Support
                keyAttributesMapping.put(
                                FieldPosition.MCL.name() + Role.DEEP_LYING_PLAYMAKER.name() + Duty.SUPPORT.name(),
                                List.of(
                                                TechnicalAttributes.FIRST_TOUCH, TechnicalAttributes.PASSING,
                                                TechnicalAttributes.TECHNIQUE,
                                                MentalAttributes.COMPOSURE,
                                                MentalAttributes.DECISIONS,
                                                MentalAttributes.TEAMWORK, MentalAttributes.VISION));

                preferableAttributesMapping.put(
                                FieldPosition.MCL.name() + Role.DEEP_LYING_PLAYMAKER.name() + Duty.SUPPORT.name(),
                                List.of(
                                                MentalAttributes.ANTICIPATION, MentalAttributes.OFF_THE_BALL,
                                                MentalAttributes.POSITIONING, PhysicalAttributes.BALANCE));

                // MC Deep Lying Playmaker Support
                keyAttributesMapping.put(
                                FieldPosition.MC.name() + Role.DEEP_LYING_PLAYMAKER.name() + Duty.SUPPORT.name(),
                                List.of(
                                                TechnicalAttributes.FIRST_TOUCH, TechnicalAttributes.PASSING,
                                                TechnicalAttributes.TECHNIQUE,
                                                MentalAttributes.COMPOSURE,
                                                MentalAttributes.DECISIONS,
                                                MentalAttributes.TEAMWORK, MentalAttributes.VISION));

                preferableAttributesMapping.put(
                                FieldPosition.MC.name() + Role.DEEP_LYING_PLAYMAKER.name() + Duty.SUPPORT.name(),
                                List.of(
                                                MentalAttributes.ANTICIPATION, MentalAttributes.OFF_THE_BALL,
                                                MentalAttributes.POSITIONING, PhysicalAttributes.BALANCE));

                // MCR Deep Lying Playmaker Support
                keyAttributesMapping.put(
                                FieldPosition.MCR.name() + Role.DEEP_LYING_PLAYMAKER.name() + Duty.SUPPORT.name(),
                                List.of(
                                                TechnicalAttributes.FIRST_TOUCH, TechnicalAttributes.PASSING,
                                                TechnicalAttributes.TECHNIQUE,
                                                MentalAttributes.COMPOSURE,
                                                MentalAttributes.DECISIONS,
                                                MentalAttributes.TEAMWORK, MentalAttributes.VISION));

                preferableAttributesMapping.put(
                                FieldPosition.MCR.name() + Role.DEEP_LYING_PLAYMAKER.name() + Duty.SUPPORT.name(),
                                List.of(
                                                MentalAttributes.ANTICIPATION, MentalAttributes.OFF_THE_BALL,
                                                MentalAttributes.POSITIONING, PhysicalAttributes.BALANCE));

                // MCL Box To Box Midfielder Support
                keyAttributesMapping.put(
                                FieldPosition.MCL.name() + Role.BOX_TO_BOX_MIDFIELDER.name() + Duty.SUPPORT.name(),
                                List.of(
                                                TechnicalAttributes.PASSING, TechnicalAttributes.TACKLING,
                                                MentalAttributes.OFF_THE_BALL,
                                                MentalAttributes.TEAMWORK, MentalAttributes.WORK_RATE,
                                                PhysicalAttributes.STAMINA));

                preferableAttributesMapping.put(
                                FieldPosition.MCL.name() + Role.BOX_TO_BOX_MIDFIELDER.name() + Duty.SUPPORT.name(),
                                List.of(
                                                TechnicalAttributes.DRIBBLING, TechnicalAttributes.FINISHING,
                                                TechnicalAttributes.FIRST_TOUCH, TechnicalAttributes.LONG_SHOTS,
                                                TechnicalAttributes.TECHNIQUE,
                                                MentalAttributes.AGGRESSION, MentalAttributes.ANTICIPATION,
                                                MentalAttributes.COMPOSURE, MentalAttributes.DECISIONS,
                                                MentalAttributes.POSITIONING,
                                                PhysicalAttributes.ACCELERATION, PhysicalAttributes.BALANCE,
                                                PhysicalAttributes.PACE, PhysicalAttributes.STRENGTH));

                // MC Box To Box Midfielder Support
                keyAttributesMapping.put(
                                FieldPosition.MC.name() + Role.BOX_TO_BOX_MIDFIELDER.name() + Duty.SUPPORT.name(),
                                List.of(
                                                TechnicalAttributes.PASSING, TechnicalAttributes.TACKLING,
                                                MentalAttributes.OFF_THE_BALL,
                                                MentalAttributes.TEAMWORK, MentalAttributes.WORK_RATE,
                                                PhysicalAttributes.STAMINA));

                preferableAttributesMapping.put(
                                FieldPosition.MC.name() + Role.BOX_TO_BOX_MIDFIELDER.name() + Duty.SUPPORT.name(),
                                List.of(
                                                TechnicalAttributes.DRIBBLING, TechnicalAttributes.FINISHING,
                                                TechnicalAttributes.FIRST_TOUCH, TechnicalAttributes.LONG_SHOTS,
                                                TechnicalAttributes.TECHNIQUE,
                                                MentalAttributes.AGGRESSION, MentalAttributes.ANTICIPATION,
                                                MentalAttributes.COMPOSURE, MentalAttributes.DECISIONS,
                                                MentalAttributes.POSITIONING,
                                                PhysicalAttributes.ACCELERATION, PhysicalAttributes.BALANCE,
                                                PhysicalAttributes.PACE, PhysicalAttributes.STRENGTH));

                // MCR Box To Box Midfielder Support
                keyAttributesMapping.put(
                                FieldPosition.MCR.name() + Role.BOX_TO_BOX_MIDFIELDER.name() + Duty.SUPPORT.name(),
                                List.of(
                                                TechnicalAttributes.PASSING, TechnicalAttributes.TACKLING,
                                                MentalAttributes.OFF_THE_BALL,
                                                MentalAttributes.TEAMWORK, MentalAttributes.WORK_RATE,
                                                PhysicalAttributes.STAMINA));

                preferableAttributesMapping.put(
                                FieldPosition.MCR.name() + Role.BOX_TO_BOX_MIDFIELDER.name() + Duty.SUPPORT.name(),
                                List.of(
                                                TechnicalAttributes.DRIBBLING, TechnicalAttributes.FINISHING,
                                                TechnicalAttributes.FIRST_TOUCH, TechnicalAttributes.LONG_SHOTS,
                                                TechnicalAttributes.TECHNIQUE,
                                                MentalAttributes.AGGRESSION, MentalAttributes.ANTICIPATION,
                                                MentalAttributes.COMPOSURE, MentalAttributes.DECISIONS,
                                                MentalAttributes.POSITIONING,
                                                PhysicalAttributes.ACCELERATION, PhysicalAttributes.BALANCE,
                                                PhysicalAttributes.PACE, PhysicalAttributes.STRENGTH));

                // MCL Advanced Playmaker Support
                keyAttributesMapping.put(
                                FieldPosition.MCL.name() + Role.ADVANCED_PLAYMAKER.name() + Duty.SUPPORT.name(),
                                List.of(
                                                TechnicalAttributes.FIRST_TOUCH, TechnicalAttributes.PASSING,
                                                TechnicalAttributes.TECHNIQUE,
                                                MentalAttributes.COMPOSURE, MentalAttributes.DECISIONS,
                                                MentalAttributes.OFF_THE_BALL, MentalAttributes.TEAMWORK,
                                                MentalAttributes.VISION,
                                                PhysicalAttributes.STAMINA));

                preferableAttributesMapping.put(
                                FieldPosition.MCL.name() + Role.ADVANCED_PLAYMAKER.name() + Duty.SUPPORT.name(),
                                List.of(
                                                TechnicalAttributes.DRIBBLING, MentalAttributes.ANTICIPATION,
                                                MentalAttributes.FLAIR,
                                                PhysicalAttributes.AGILITY));

                // MC Advanced Playmaker Support
                keyAttributesMapping.put(
                                FieldPosition.MC.name() + Role.ADVANCED_PLAYMAKER.name() + Duty.SUPPORT.name(),
                                List.of(
                                                TechnicalAttributes.FIRST_TOUCH, TechnicalAttributes.PASSING,
                                                TechnicalAttributes.TECHNIQUE,
                                                MentalAttributes.COMPOSURE, MentalAttributes.DECISIONS,
                                                MentalAttributes.OFF_THE_BALL, MentalAttributes.TEAMWORK,
                                                MentalAttributes.VISION,
                                                PhysicalAttributes.STAMINA));

                preferableAttributesMapping.put(
                                FieldPosition.MC.name() + Role.ADVANCED_PLAYMAKER.name() + Duty.SUPPORT.name(),
                                List.of(
                                                TechnicalAttributes.DRIBBLING, MentalAttributes.ANTICIPATION,
                                                MentalAttributes.FLAIR,
                                                PhysicalAttributes.AGILITY));

                // MCR Advanced Playmaker Support
                keyAttributesMapping.put(
                                FieldPosition.MCR.name() + Role.ADVANCED_PLAYMAKER.name() + Duty.SUPPORT.name(),
                                List.of(
                                                TechnicalAttributes.FIRST_TOUCH, TechnicalAttributes.PASSING,
                                                TechnicalAttributes.TECHNIQUE,
                                                MentalAttributes.COMPOSURE, MentalAttributes.DECISIONS,
                                                MentalAttributes.OFF_THE_BALL, MentalAttributes.TEAMWORK,
                                                MentalAttributes.VISION,
                                                PhysicalAttributes.STAMINA));

                preferableAttributesMapping.put(
                                FieldPosition.MCR.name() + Role.ADVANCED_PLAYMAKER.name() + Duty.SUPPORT.name(),
                                List.of(
                                                TechnicalAttributes.DRIBBLING, MentalAttributes.ANTICIPATION,
                                                MentalAttributes.FLAIR,
                                                PhysicalAttributes.AGILITY));

                // MCL Advanced Playmaker Attack
                keyAttributesMapping.put(
                                FieldPosition.MCL.name() + Role.ADVANCED_PLAYMAKER.name() + Duty.ATTACK.name(),
                                List.of(
                                                TechnicalAttributes.DRIBBLING, TechnicalAttributes.FIRST_TOUCH,
                                                TechnicalAttributes.PASSING,
                                                TechnicalAttributes.TECHNIQUE,
                                                MentalAttributes.COMPOSURE, MentalAttributes.DECISIONS,
                                                MentalAttributes.OFF_THE_BALL, MentalAttributes.TEAMWORK,
                                                MentalAttributes.VISION));

                preferableAttributesMapping.put(
                                FieldPosition.MCL.name() + Role.ADVANCED_PLAYMAKER.name() + Duty.ATTACK.name(),
                                List.of(
                                                MentalAttributes.ANTICIPATION,
                                                MentalAttributes.FLAIR,
                                                PhysicalAttributes.ACCELERATION, PhysicalAttributes.AGILITY));

                // MC Advanced Playmaker Attack
                keyAttributesMapping.put(
                                FieldPosition.MC.name() + Role.ADVANCED_PLAYMAKER.name() + Duty.ATTACK.name(),
                                List.of(
                                                TechnicalAttributes.DRIBBLING, TechnicalAttributes.FIRST_TOUCH,
                                                TechnicalAttributes.PASSING,
                                                TechnicalAttributes.TECHNIQUE,
                                                MentalAttributes.COMPOSURE, MentalAttributes.DECISIONS,
                                                MentalAttributes.OFF_THE_BALL, MentalAttributes.TEAMWORK,
                                                MentalAttributes.VISION));

                preferableAttributesMapping.put(
                                FieldPosition.MC.name() + Role.ADVANCED_PLAYMAKER.name() + Duty.ATTACK.name(),
                                List.of(
                                                MentalAttributes.ANTICIPATION,
                                                MentalAttributes.FLAIR,
                                                PhysicalAttributes.ACCELERATION, PhysicalAttributes.AGILITY));

                // MCR Advanced Playmaker Attack
                keyAttributesMapping.put(
                                FieldPosition.MCR.name() + Role.ADVANCED_PLAYMAKER.name() + Duty.ATTACK.name(),
                                List.of(
                                                TechnicalAttributes.DRIBBLING, TechnicalAttributes.FIRST_TOUCH,
                                                TechnicalAttributes.PASSING,
                                                TechnicalAttributes.TECHNIQUE,
                                                MentalAttributes.COMPOSURE, MentalAttributes.DECISIONS,
                                                MentalAttributes.OFF_THE_BALL, MentalAttributes.TEAMWORK,
                                                MentalAttributes.VISION));

                preferableAttributesMapping.put(
                                FieldPosition.MCR.name() + Role.ADVANCED_PLAYMAKER.name() + Duty.ATTACK.name(),
                                List.of(
                                                MentalAttributes.ANTICIPATION,
                                                MentalAttributes.FLAIR,
                                                PhysicalAttributes.ACCELERATION, PhysicalAttributes.AGILITY));

                // MCL Ball Winning Midfielder Defend
                keyAttributesMapping.put(
                                FieldPosition.MCL.name() + Role.BALL_WINNING_MIDFIELDER.name() + Duty.DEFEND.name(),
                                List.of(
                                                TechnicalAttributes.TACKLING, MentalAttributes.AGGRESSION,
                                                MentalAttributes.ANTICIPATION, MentalAttributes.TEAMWORK,
                                                MentalAttributes.WORK_RATE, PhysicalAttributes.STAMINA));

                preferableAttributesMapping.put(
                                FieldPosition.MCL.name() + Role.BALL_WINNING_MIDFIELDER.name() + Duty.DEFEND.name(),
                                List.of(
                                                TechnicalAttributes.MARKING, MentalAttributes.BRAVERY,
                                                MentalAttributes.CONCENTRATION, MentalAttributes.POSITIONING,
                                                PhysicalAttributes.AGILITY, PhysicalAttributes.PACE,
                                                PhysicalAttributes.STRENGTH));

                // MC Ball Winning Midfielder Defend
                keyAttributesMapping.put(
                                FieldPosition.MC.name() + Role.BALL_WINNING_MIDFIELDER.name() + Duty.DEFEND.name(),
                                List.of(
                                                TechnicalAttributes.TACKLING, MentalAttributes.AGGRESSION,
                                                MentalAttributes.ANTICIPATION, MentalAttributes.TEAMWORK,
                                                MentalAttributes.WORK_RATE, PhysicalAttributes.STAMINA));

                preferableAttributesMapping.put(
                                FieldPosition.MC.name() + Role.BALL_WINNING_MIDFIELDER.name() + Duty.DEFEND.name(),
                                List.of(
                                                TechnicalAttributes.MARKING, MentalAttributes.BRAVERY,
                                                MentalAttributes.CONCENTRATION, MentalAttributes.POSITIONING,
                                                PhysicalAttributes.AGILITY, PhysicalAttributes.PACE,
                                                PhysicalAttributes.STRENGTH));

                // MCR Ball Winning Midfielder Defend
                keyAttributesMapping.put(
                                FieldPosition.MCR.name() + Role.BALL_WINNING_MIDFIELDER.name() + Duty.DEFEND.name(),
                                List.of(
                                                TechnicalAttributes.TACKLING, MentalAttributes.AGGRESSION,
                                                MentalAttributes.ANTICIPATION, MentalAttributes.TEAMWORK,
                                                MentalAttributes.WORK_RATE, PhysicalAttributes.STAMINA));

                preferableAttributesMapping.put(
                                FieldPosition.MCR.name() + Role.BALL_WINNING_MIDFIELDER.name() + Duty.DEFEND.name(),
                                List.of(
                                                TechnicalAttributes.MARKING, MentalAttributes.BRAVERY,
                                                MentalAttributes.CONCENTRATION, MentalAttributes.POSITIONING,
                                                PhysicalAttributes.AGILITY, PhysicalAttributes.PACE,
                                                PhysicalAttributes.STRENGTH));

                // MCL Ball Winning Midfielder Support
                keyAttributesMapping.put(
                                FieldPosition.MCL.name() + Role.BALL_WINNING_MIDFIELDER.name() + Duty.SUPPORT.name(),
                                List.of(
                                                TechnicalAttributes.TACKLING, MentalAttributes.AGGRESSION,
                                                MentalAttributes.ANTICIPATION, MentalAttributes.TEAMWORK,
                                                MentalAttributes.WORK_RATE, PhysicalAttributes.STAMINA));

                preferableAttributesMapping.put(
                                FieldPosition.MCL.name() + Role.BALL_WINNING_MIDFIELDER.name() + Duty.SUPPORT.name(),
                                List.of(
                                                TechnicalAttributes.MARKING, TechnicalAttributes.PASSING,
                                                MentalAttributes.BRAVERY,
                                                MentalAttributes.CONCENTRATION,
                                                PhysicalAttributes.AGILITY, PhysicalAttributes.PACE,
                                                PhysicalAttributes.STRENGTH));

                // MC Ball Winning Midfielder Support
                keyAttributesMapping.put(
                                FieldPosition.MC.name() + Role.BALL_WINNING_MIDFIELDER.name() + Duty.SUPPORT.name(),
                                List.of(
                                                TechnicalAttributes.TACKLING, MentalAttributes.AGGRESSION,
                                                MentalAttributes.ANTICIPATION, MentalAttributes.TEAMWORK,
                                                MentalAttributes.WORK_RATE, PhysicalAttributes.STAMINA));

                preferableAttributesMapping.put(
                                FieldPosition.MC.name() + Role.BALL_WINNING_MIDFIELDER.name() + Duty.SUPPORT.name(),
                                List.of(
                                                TechnicalAttributes.MARKING, TechnicalAttributes.PASSING,
                                                MentalAttributes.BRAVERY,
                                                MentalAttributes.CONCENTRATION,
                                                PhysicalAttributes.AGILITY, PhysicalAttributes.PACE,
                                                PhysicalAttributes.STRENGTH));

                // MCR Ball Winning Midfielder Support
                keyAttributesMapping.put(
                                FieldPosition.MCR.name() + Role.BALL_WINNING_MIDFIELDER.name() + Duty.SUPPORT.name(),
                                List.of(
                                                TechnicalAttributes.TACKLING, MentalAttributes.AGGRESSION,
                                                MentalAttributes.ANTICIPATION, MentalAttributes.TEAMWORK,
                                                MentalAttributes.WORK_RATE, PhysicalAttributes.STAMINA));

                preferableAttributesMapping.put(
                                FieldPosition.MCR.name() + Role.BALL_WINNING_MIDFIELDER.name() + Duty.SUPPORT.name(),
                                List.of(
                                                TechnicalAttributes.MARKING, TechnicalAttributes.PASSING,
                                                MentalAttributes.BRAVERY,
                                                MentalAttributes.CONCENTRATION,
                                                PhysicalAttributes.AGILITY, PhysicalAttributes.PACE,
                                                PhysicalAttributes.STRENGTH));

                // MCL Roaming Playmaker Support
                keyAttributesMapping.put(
                                FieldPosition.MCL.name() + Role.ROAMING_PLAYMAKER.name() + Duty.SUPPORT.name(),
                                List.of(
                                                TechnicalAttributes.FIRST_TOUCH, TechnicalAttributes.PASSING,
                                                TechnicalAttributes.TECHNIQUE, MentalAttributes.ANTICIPATION,
                                                MentalAttributes.COMPOSURE, MentalAttributes.DECISIONS,
                                                MentalAttributes.OFF_THE_BALL, MentalAttributes.TEAMWORK,
                                                MentalAttributes.VISION, MentalAttributes.WORK_RATE,
                                                PhysicalAttributes.ACCELERATION, PhysicalAttributes.STAMINA));

                preferableAttributesMapping.put(
                                FieldPosition.MCL.name() + Role.ROAMING_PLAYMAKER.name() + Duty.SUPPORT.name(),
                                List.of(
                                                TechnicalAttributes.DRIBBLING, TechnicalAttributes.LONG_SHOTS,
                                                MentalAttributes.CONCENTRATION, MentalAttributes.POSITIONING,
                                                PhysicalAttributes.AGILITY, PhysicalAttributes.BALANCE,
                                                PhysicalAttributes.PACE));

                // MC Roaming Playmaker Support
                keyAttributesMapping.put(
                                FieldPosition.MC.name() + Role.ROAMING_PLAYMAKER.name() + Duty.SUPPORT.name(),
                                List.of(
                                                TechnicalAttributes.FIRST_TOUCH, TechnicalAttributes.PASSING,
                                                TechnicalAttributes.TECHNIQUE, MentalAttributes.ANTICIPATION,
                                                MentalAttributes.COMPOSURE, MentalAttributes.DECISIONS,
                                                MentalAttributes.OFF_THE_BALL, MentalAttributes.TEAMWORK,
                                                MentalAttributes.VISION, MentalAttributes.WORK_RATE,
                                                PhysicalAttributes.ACCELERATION, PhysicalAttributes.STAMINA));

                preferableAttributesMapping.put(
                                FieldPosition.MC.name() + Role.ROAMING_PLAYMAKER.name() + Duty.SUPPORT.name(),
                                List.of(
                                                TechnicalAttributes.DRIBBLING, TechnicalAttributes.LONG_SHOTS,
                                                MentalAttributes.CONCENTRATION, MentalAttributes.POSITIONING,
                                                PhysicalAttributes.AGILITY, PhysicalAttributes.BALANCE,
                                                PhysicalAttributes.PACE));

                // MCR Roaming Playmaker Support
                keyAttributesMapping.put(
                                FieldPosition.MCR.name() + Role.ROAMING_PLAYMAKER.name() + Duty.SUPPORT.name(),
                                List.of(
                                                TechnicalAttributes.FIRST_TOUCH, TechnicalAttributes.PASSING,
                                                TechnicalAttributes.TECHNIQUE, MentalAttributes.ANTICIPATION,
                                                MentalAttributes.COMPOSURE, MentalAttributes.DECISIONS,
                                                MentalAttributes.OFF_THE_BALL, MentalAttributes.TEAMWORK,
                                                MentalAttributes.VISION, MentalAttributes.WORK_RATE,
                                                PhysicalAttributes.ACCELERATION, PhysicalAttributes.STAMINA));

                preferableAttributesMapping.put(
                                FieldPosition.MCR.name() + Role.ROAMING_PLAYMAKER.name() + Duty.SUPPORT.name(),
                                List.of(
                                                TechnicalAttributes.DRIBBLING, TechnicalAttributes.LONG_SHOTS,
                                                MentalAttributes.CONCENTRATION, MentalAttributes.POSITIONING,
                                                PhysicalAttributes.AGILITY, PhysicalAttributes.BALANCE,
                                                PhysicalAttributes.PACE));

                // MCL Mezzala Support
                keyAttributesMapping.put(
                                FieldPosition.MCL.name() + Role.MEZZALA.name() + Duty.SUPPORT.name(),
                                List.of(
                                                TechnicalAttributes.PASSING, TechnicalAttributes.TECHNIQUE,
                                                MentalAttributes.DECISIONS, MentalAttributes.OFF_THE_BALL,
                                                MentalAttributes.WORK_RATE, PhysicalAttributes.ACCELERATION));

                preferableAttributesMapping.put(
                                FieldPosition.MCL.name() + Role.MEZZALA.name() + Duty.SUPPORT.name(),
                                List.of(
                                                TechnicalAttributes.DRIBBLING, TechnicalAttributes.FIRST_TOUCH,
                                                TechnicalAttributes.LONG_SHOTS, TechnicalAttributes.TACKLING,
                                                MentalAttributes.ANTICIPATION, MentalAttributes.COMPOSURE,
                                                MentalAttributes.VISION, PhysicalAttributes.BALANCE,
                                                PhysicalAttributes.STAMINA));

                // MCR Mezzala Support
                keyAttributesMapping.put(
                                FieldPosition.MCR.name() + Role.MEZZALA.name() + Duty.SUPPORT.name(),
                                List.of(
                                                TechnicalAttributes.PASSING, TechnicalAttributes.TECHNIQUE,
                                                MentalAttributes.DECISIONS, MentalAttributes.OFF_THE_BALL,
                                                MentalAttributes.WORK_RATE, PhysicalAttributes.ACCELERATION));

                preferableAttributesMapping.put(
                                FieldPosition.MCR.name() + Role.MEZZALA.name() + Duty.SUPPORT.name(),
                                List.of(
                                                TechnicalAttributes.DRIBBLING, TechnicalAttributes.FIRST_TOUCH,
                                                TechnicalAttributes.LONG_SHOTS, TechnicalAttributes.TACKLING,
                                                MentalAttributes.ANTICIPATION, MentalAttributes.COMPOSURE,
                                                MentalAttributes.VISION, PhysicalAttributes.BALANCE,
                                                PhysicalAttributes.STAMINA));

                // MCL Mezzala Attack
                keyAttributesMapping.put(
                                FieldPosition.MCL.name() + Role.MEZZALA.name() + Duty.ATTACK.name(),
                                List.of(
                                                TechnicalAttributes.DRIBBLING, TechnicalAttributes.PASSING,
                                                TechnicalAttributes.TECHNIQUE, MentalAttributes.DECISIONS,
                                                MentalAttributes.OFF_THE_BALL, MentalAttributes.VISION,
                                                MentalAttributes.WORK_RATE, PhysicalAttributes.ACCELERATION));

                preferableAttributesMapping.put(
                                FieldPosition.MCL.name() + Role.MEZZALA.name() + Duty.ATTACK.name(),
                                List.of(
                                                TechnicalAttributes.FINISHING, TechnicalAttributes.FIRST_TOUCH,
                                                TechnicalAttributes.LONG_SHOTS, MentalAttributes.ANTICIPATION,
                                                MentalAttributes.COMPOSURE, MentalAttributes.FLAIR,
                                                PhysicalAttributes.BALANCE, PhysicalAttributes.STAMINA));

                // MCR Mezzala Attack
                keyAttributesMapping.put(
                                FieldPosition.MCR.name() + Role.MEZZALA.name() + Duty.ATTACK.name(),
                                List.of(
                                                TechnicalAttributes.DRIBBLING, TechnicalAttributes.PASSING,
                                                TechnicalAttributes.TECHNIQUE, MentalAttributes.DECISIONS,
                                                MentalAttributes.OFF_THE_BALL, MentalAttributes.VISION,
                                                MentalAttributes.WORK_RATE, PhysicalAttributes.ACCELERATION));

                preferableAttributesMapping.put(
                                FieldPosition.MCR.name() + Role.MEZZALA.name() + Duty.ATTACK.name(),
                                List.of(
                                                TechnicalAttributes.FINISHING, TechnicalAttributes.FIRST_TOUCH,
                                                TechnicalAttributes.LONG_SHOTS, MentalAttributes.ANTICIPATION,
                                                MentalAttributes.COMPOSURE, MentalAttributes.FLAIR,
                                                PhysicalAttributes.BALANCE, PhysicalAttributes.STAMINA));

                // MCL Carrilero Support
                keyAttributesMapping.put(
                                FieldPosition.MCL.name() + Role.CARRILERO.name() + Duty.SUPPORT.name(),
                                List.of(
                                                TechnicalAttributes.FIRST_TOUCH, TechnicalAttributes.PASSING,
                                                TechnicalAttributes.TACKLING, MentalAttributes.DECISIONS,
                                                MentalAttributes.POSITIONING, MentalAttributes.TEAMWORK,
                                                PhysicalAttributes.STAMINA));

                preferableAttributesMapping.put(
                                FieldPosition.MCL.name() + Role.CARRILERO.name() + Duty.SUPPORT.name(),
                                List.of(
                                                TechnicalAttributes.TECHNIQUE, MentalAttributes.ANTICIPATION,
                                                MentalAttributes.COMPOSURE, MentalAttributes.CONCENTRATION,
                                                MentalAttributes.OFF_THE_BALL, MentalAttributes.VISION,
                                                MentalAttributes.WORK_RATE));

                // MCR Carrilero Support
                keyAttributesMapping.put(
                                FieldPosition.MCR.name() + Role.CARRILERO.name() + Duty.SUPPORT.name(),
                                List.of(
                                                TechnicalAttributes.FIRST_TOUCH, TechnicalAttributes.PASSING,
                                                TechnicalAttributes.TACKLING, MentalAttributes.DECISIONS,
                                                MentalAttributes.POSITIONING, MentalAttributes.TEAMWORK,
                                                PhysicalAttributes.STAMINA));

                preferableAttributesMapping.put(
                                FieldPosition.MCR.name() + Role.CARRILERO.name() + Duty.SUPPORT.name(),
                                List.of(
                                                TechnicalAttributes.TECHNIQUE, MentalAttributes.ANTICIPATION,
                                                MentalAttributes.COMPOSURE, MentalAttributes.CONCENTRATION,
                                                MentalAttributes.OFF_THE_BALL, MentalAttributes.VISION,
                                                MentalAttributes.WORK_RATE));
        }
}
