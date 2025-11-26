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

public class DmclrAttributesList {

        private Map<String, List<PlayerAttributes>> preferableAttributesMapping = new HashMap<>();
        private Map<String, List<PlayerAttributes>> keyAttributesMapping = new HashMap<>();

        public Map<String, List<PlayerAttributes>> getPreferableAttributesMapping() {
                return preferableAttributesMapping;
        }

        public Map<String, List<PlayerAttributes>> getKeyAttributesMapping() {
                return keyAttributesMapping;
        }

        public DmclrAttributesList() {
                // DMCL Defensive Midfielder Defend
                keyAttributesMapping.put(
                                FieldPosition.DMCL.name() + Role.DEFENSIVE_MIDFIELDER.name() + Duty.DEFEND.name(),
                                List.of(
                                                TechnicalAttributes.TACKLING, MentalAttributes.ANTICIPATION,
                                                MentalAttributes.CONCENTRATION, MentalAttributes.POSITIONING,
                                                MentalAttributes.TEAMWORK));

                preferableAttributesMapping.put(
                                FieldPosition.DMCL.name() + Role.DEFENSIVE_MIDFIELDER.name() + Duty.DEFEND.name(),
                                List.of(
                                                TechnicalAttributes.MARKING, TechnicalAttributes.PASSING,
                                                MentalAttributes.AGGRESSION, MentalAttributes.COMPOSURE,
                                                MentalAttributes.DECISIONS, MentalAttributes.WORK_RATE,
                                                PhysicalAttributes.STAMINA, PhysicalAttributes.STRENGTH));

                // DM Defensive Midfielder Defend
                keyAttributesMapping.put(
                                FieldPosition.DM.name() + Role.DEFENSIVE_MIDFIELDER.name() + Duty.DEFEND.name(),
                                List.of(
                                                TechnicalAttributes.TACKLING, MentalAttributes.ANTICIPATION,
                                                MentalAttributes.CONCENTRATION, MentalAttributes.POSITIONING,
                                                MentalAttributes.TEAMWORK));

                preferableAttributesMapping.put(
                                FieldPosition.DM.name() + Role.DEFENSIVE_MIDFIELDER.name() + Duty.DEFEND.name(),
                                List.of(
                                                TechnicalAttributes.MARKING, TechnicalAttributes.PASSING,
                                                MentalAttributes.AGGRESSION, MentalAttributes.COMPOSURE,
                                                MentalAttributes.DECISIONS, MentalAttributes.WORK_RATE,
                                                PhysicalAttributes.STAMINA, PhysicalAttributes.STRENGTH));

                // DMCR Defensive Midfielder Defend
                keyAttributesMapping.put(
                                FieldPosition.DMCR.name() + Role.DEFENSIVE_MIDFIELDER.name() + Duty.DEFEND.name(),
                                List.of(
                                                TechnicalAttributes.TACKLING, MentalAttributes.ANTICIPATION,
                                                MentalAttributes.CONCENTRATION, MentalAttributes.POSITIONING,
                                                MentalAttributes.TEAMWORK));

                preferableAttributesMapping.put(
                                FieldPosition.DMCR.name() + Role.DEFENSIVE_MIDFIELDER.name() + Duty.DEFEND.name(),
                                List.of(
                                                TechnicalAttributes.MARKING, TechnicalAttributes.PASSING,
                                                MentalAttributes.AGGRESSION, MentalAttributes.COMPOSURE,
                                                MentalAttributes.DECISIONS, MentalAttributes.WORK_RATE,
                                                PhysicalAttributes.STAMINA, PhysicalAttributes.STRENGTH));

                // DMCL Defensive Midfielder Support
                keyAttributesMapping.put(
                                FieldPosition.DMCL.name() + Role.DEFENSIVE_MIDFIELDER.name() + Duty.SUPPORT.name(),
                                List.of(
                                                TechnicalAttributes.TACKLING, MentalAttributes.ANTICIPATION,
                                                MentalAttributes.CONCENTRATION, MentalAttributes.POSITIONING,
                                                MentalAttributes.TEAMWORK));

                preferableAttributesMapping.put(
                                FieldPosition.DMCL.name() + Role.DEFENSIVE_MIDFIELDER.name() + Duty.SUPPORT.name(),
                                List.of(
                                                TechnicalAttributes.FIRST_TOUCH, TechnicalAttributes.MARKING,
                                                TechnicalAttributes.PASSING,
                                                MentalAttributes.AGGRESSION, MentalAttributes.COMPOSURE,
                                                MentalAttributes.DECISIONS, MentalAttributes.WORK_RATE,
                                                PhysicalAttributes.STAMINA, PhysicalAttributes.STRENGTH));

                // DM Defensive Midfielder Support
                keyAttributesMapping.put(
                                FieldPosition.DM.name() + Role.DEFENSIVE_MIDFIELDER.name() + Duty.SUPPORT.name(),
                                List.of(
                                                TechnicalAttributes.TACKLING, MentalAttributes.ANTICIPATION,
                                                MentalAttributes.CONCENTRATION, MentalAttributes.POSITIONING,
                                                MentalAttributes.TEAMWORK));

                preferableAttributesMapping.put(
                                FieldPosition.DM.name() + Role.DEFENSIVE_MIDFIELDER.name() + Duty.SUPPORT.name(),
                                List.of(
                                                TechnicalAttributes.FIRST_TOUCH, TechnicalAttributes.MARKING,
                                                TechnicalAttributes.PASSING,
                                                MentalAttributes.AGGRESSION, MentalAttributes.COMPOSURE,
                                                MentalAttributes.DECISIONS, MentalAttributes.WORK_RATE,
                                                PhysicalAttributes.STAMINA, PhysicalAttributes.STRENGTH));

                // DMCR Defensive Midfielder Support
                keyAttributesMapping.put(
                                FieldPosition.DMCR.name() + Role.DEFENSIVE_MIDFIELDER.name() + Duty.SUPPORT.name(),
                                List.of(
                                                TechnicalAttributes.TACKLING, MentalAttributes.ANTICIPATION,
                                                MentalAttributes.CONCENTRATION, MentalAttributes.POSITIONING,
                                                MentalAttributes.TEAMWORK));

                preferableAttributesMapping.put(
                                FieldPosition.DMCR.name() + Role.DEFENSIVE_MIDFIELDER.name() + Duty.SUPPORT.name(),
                                List.of(
                                                TechnicalAttributes.FIRST_TOUCH, TechnicalAttributes.MARKING,
                                                TechnicalAttributes.PASSING,
                                                MentalAttributes.AGGRESSION, MentalAttributes.COMPOSURE,
                                                MentalAttributes.DECISIONS, MentalAttributes.WORK_RATE,
                                                PhysicalAttributes.STAMINA, PhysicalAttributes.STRENGTH));

                // DMCL Deep Lying Playmaker Defend
                keyAttributesMapping.put(
                                FieldPosition.DMCL.name() + Role.DEEP_LYING_PLAYMAKER.name() + Duty.DEFEND.name(),
                                List.of(
                                                TechnicalAttributes.FIRST_TOUCH, TechnicalAttributes.PASSING,
                                                TechnicalAttributes.TECHNIQUE,
                                                MentalAttributes.COMPOSURE, MentalAttributes.DECISIONS,
                                                MentalAttributes.TEAMWORK, MentalAttributes.VISION));

                preferableAttributesMapping.put(
                                FieldPosition.DMCL.name() + Role.DEEP_LYING_PLAYMAKER.name() + Duty.DEFEND.name(),
                                List.of(
                                                TechnicalAttributes.TACKLING, MentalAttributes.ANTICIPATION,
                                                MentalAttributes.POSITIONING, PhysicalAttributes.BALANCE));

                // DM Deep Lying Playmaker Defend
                keyAttributesMapping.put(
                                FieldPosition.DM.name() + Role.DEEP_LYING_PLAYMAKER.name() + Duty.DEFEND.name(),
                                List.of(
                                                TechnicalAttributes.FIRST_TOUCH, TechnicalAttributes.PASSING,
                                                TechnicalAttributes.TECHNIQUE,
                                                MentalAttributes.COMPOSURE, MentalAttributes.DECISIONS,
                                                MentalAttributes.TEAMWORK, MentalAttributes.VISION));

                preferableAttributesMapping.put(
                                FieldPosition.DM.name() + Role.DEEP_LYING_PLAYMAKER.name() + Duty.DEFEND.name(),
                                List.of(
                                                TechnicalAttributes.TACKLING, MentalAttributes.ANTICIPATION,
                                                MentalAttributes.POSITIONING, PhysicalAttributes.BALANCE));

                // DMCR Deep Lying Playmaker Defend
                keyAttributesMapping.put(
                                FieldPosition.DMCR.name() + Role.DEEP_LYING_PLAYMAKER.name() + Duty.DEFEND.name(),
                                List.of(
                                                TechnicalAttributes.FIRST_TOUCH, TechnicalAttributes.PASSING,
                                                TechnicalAttributes.TECHNIQUE,
                                                MentalAttributes.COMPOSURE, MentalAttributes.DECISIONS,
                                                MentalAttributes.TEAMWORK, MentalAttributes.VISION));

                preferableAttributesMapping.put(
                                FieldPosition.DMCR.name() + Role.DEEP_LYING_PLAYMAKER.name() + Duty.DEFEND.name(),
                                List.of(
                                                TechnicalAttributes.TACKLING, MentalAttributes.ANTICIPATION,
                                                MentalAttributes.POSITIONING, PhysicalAttributes.BALANCE));

                // DMCL Deep Lying Playmaker Support
                keyAttributesMapping.put(
                                FieldPosition.DMCL.name() + Role.DEEP_LYING_PLAYMAKER.name() + Duty.SUPPORT.name(),
                                List.of(
                                                TechnicalAttributes.FIRST_TOUCH, TechnicalAttributes.PASSING,
                                                TechnicalAttributes.TECHNIQUE,
                                                MentalAttributes.COMPOSURE, MentalAttributes.DECISIONS,
                                                MentalAttributes.TEAMWORK, MentalAttributes.VISION));

                preferableAttributesMapping.put(
                                FieldPosition.DMCL.name() + Role.DEEP_LYING_PLAYMAKER.name() + Duty.SUPPORT.name(),
                                List.of(
                                                MentalAttributes.ANTICIPATION, MentalAttributes.OFF_THE_BALL,
                                                MentalAttributes.POSITIONING, PhysicalAttributes.BALANCE));

                // DM Deep Lying Playmaker Support
                keyAttributesMapping.put(
                                FieldPosition.DM.name() + Role.DEEP_LYING_PLAYMAKER.name() + Duty.SUPPORT.name(),
                                List.of(
                                                TechnicalAttributes.FIRST_TOUCH, TechnicalAttributes.PASSING,
                                                TechnicalAttributes.TECHNIQUE,
                                                MentalAttributes.COMPOSURE, MentalAttributes.DECISIONS,
                                                MentalAttributes.TEAMWORK, MentalAttributes.VISION));

                preferableAttributesMapping.put(
                                FieldPosition.DM.name() + Role.DEEP_LYING_PLAYMAKER.name() + Duty.SUPPORT.name(),
                                List.of(
                                                MentalAttributes.ANTICIPATION, MentalAttributes.OFF_THE_BALL,
                                                MentalAttributes.POSITIONING, PhysicalAttributes.BALANCE));

                // DMCR Deep Lying Playmaker Support
                keyAttributesMapping.put(
                                FieldPosition.DMCR.name() + Role.DEEP_LYING_PLAYMAKER.name() + Duty.SUPPORT.name(),
                                List.of(
                                                TechnicalAttributes.FIRST_TOUCH, TechnicalAttributes.PASSING,
                                                TechnicalAttributes.TECHNIQUE,
                                                MentalAttributes.COMPOSURE, MentalAttributes.DECISIONS,
                                                MentalAttributes.TEAMWORK, MentalAttributes.VISION));

                preferableAttributesMapping.put(
                                FieldPosition.DMCR.name() + Role.DEEP_LYING_PLAYMAKER.name() + Duty.SUPPORT.name(),
                                List.of(
                                                MentalAttributes.ANTICIPATION, MentalAttributes.OFF_THE_BALL,
                                                MentalAttributes.POSITIONING, PhysicalAttributes.BALANCE));

                // DMCL Ball Winning Midfielder Defend
                keyAttributesMapping.put(
                                FieldPosition.DMCL.name() + Role.BALL_WINNING_MIDFIELDER.name() + Duty.DEFEND.name(),
                                List.of(
                                                TechnicalAttributes.TACKLING, MentalAttributes.AGGRESSION,
                                                MentalAttributes.ANTICIPATION, MentalAttributes.TEAMWORK,
                                                MentalAttributes.WORK_RATE, PhysicalAttributes.STAMINA));

                preferableAttributesMapping.put(
                                FieldPosition.DMCL.name() + Role.BALL_WINNING_MIDFIELDER.name() + Duty.DEFEND.name(),
                                List.of(
                                                TechnicalAttributes.MARKING, MentalAttributes.BRAVERY,
                                                MentalAttributes.CONCENTRATION,
                                                MentalAttributes.POSITIONING, PhysicalAttributes.AGILITY,
                                                PhysicalAttributes.PACE, PhysicalAttributes.STRENGTH));

                // DM Ball Winning Midfielder Defend
                keyAttributesMapping.put(
                                FieldPosition.DM.name() + Role.BALL_WINNING_MIDFIELDER.name() + Duty.DEFEND.name(),
                                List.of(
                                                TechnicalAttributes.TACKLING, MentalAttributes.AGGRESSION,
                                                MentalAttributes.ANTICIPATION, MentalAttributes.TEAMWORK,
                                                MentalAttributes.WORK_RATE, PhysicalAttributes.STAMINA));

                preferableAttributesMapping.put(
                                FieldPosition.DM.name() + Role.BALL_WINNING_MIDFIELDER.name() + Duty.DEFEND.name(),
                                List.of(
                                                TechnicalAttributes.MARKING, MentalAttributes.BRAVERY,
                                                MentalAttributes.CONCENTRATION,
                                                MentalAttributes.POSITIONING, PhysicalAttributes.AGILITY,
                                                PhysicalAttributes.PACE, PhysicalAttributes.STRENGTH));

                // DMCR Ball Winning Midfielder Defend
                keyAttributesMapping.put(
                                FieldPosition.DMCR.name() + Role.BALL_WINNING_MIDFIELDER.name() + Duty.DEFEND.name(),
                                List.of(
                                                TechnicalAttributes.TACKLING, MentalAttributes.AGGRESSION,
                                                MentalAttributes.ANTICIPATION, MentalAttributes.TEAMWORK,
                                                MentalAttributes.WORK_RATE, PhysicalAttributes.STAMINA));

                preferableAttributesMapping.put(
                                FieldPosition.DMCR.name() + Role.BALL_WINNING_MIDFIELDER.name() + Duty.DEFEND.name(),
                                List.of(
                                                TechnicalAttributes.MARKING, MentalAttributes.BRAVERY,
                                                MentalAttributes.CONCENTRATION,
                                                MentalAttributes.POSITIONING, PhysicalAttributes.AGILITY,
                                                PhysicalAttributes.PACE, PhysicalAttributes.STRENGTH));

                // DMCL Ball Winning Midfielder Support
                keyAttributesMapping.put(
                                FieldPosition.DMCL.name() + Role.BALL_WINNING_MIDFIELDER.name() + Duty.SUPPORT.name(),
                                List.of(
                                                TechnicalAttributes.TACKLING, MentalAttributes.AGGRESSION,
                                                MentalAttributes.ANTICIPATION, MentalAttributes.TEAMWORK,
                                                MentalAttributes.WORK_RATE, PhysicalAttributes.STAMINA));

                preferableAttributesMapping.put(
                                FieldPosition.DMCL.name() + Role.BALL_WINNING_MIDFIELDER.name() + Duty.SUPPORT.name(),
                                List.of(
                                                TechnicalAttributes.MARKING, TechnicalAttributes.PASSING,
                                                MentalAttributes.BRAVERY,
                                                MentalAttributes.CONCENTRATION,
                                                PhysicalAttributes.AGILITY,
                                                PhysicalAttributes.PACE, PhysicalAttributes.STRENGTH));

                // DM Ball Winning Midfielder Support
                keyAttributesMapping.put(
                                FieldPosition.DM.name() + Role.BALL_WINNING_MIDFIELDER.name() + Duty.SUPPORT.name(),
                                List.of(
                                                TechnicalAttributes.TACKLING, MentalAttributes.AGGRESSION,
                                                MentalAttributes.ANTICIPATION, MentalAttributes.TEAMWORK,
                                                MentalAttributes.WORK_RATE, PhysicalAttributes.STAMINA));

                preferableAttributesMapping.put(
                                FieldPosition.DM.name() + Role.BALL_WINNING_MIDFIELDER.name() + Duty.SUPPORT.name(),
                                List.of(
                                                TechnicalAttributes.MARKING, TechnicalAttributes.PASSING,
                                                MentalAttributes.BRAVERY,
                                                MentalAttributes.CONCENTRATION,
                                                PhysicalAttributes.AGILITY,
                                                PhysicalAttributes.PACE, PhysicalAttributes.STRENGTH));

                // DMCR Ball Winning Midfielder Support
                keyAttributesMapping.put(
                                FieldPosition.DMCR.name() + Role.BALL_WINNING_MIDFIELDER.name() + Duty.SUPPORT.name(),
                                List.of(
                                                TechnicalAttributes.TACKLING, MentalAttributes.AGGRESSION,
                                                MentalAttributes.ANTICIPATION, MentalAttributes.TEAMWORK,
                                                MentalAttributes.WORK_RATE, PhysicalAttributes.STAMINA));

                preferableAttributesMapping.put(
                                FieldPosition.DMCR.name() + Role.BALL_WINNING_MIDFIELDER.name() + Duty.SUPPORT.name(),
                                List.of(
                                                TechnicalAttributes.MARKING, TechnicalAttributes.PASSING,
                                                MentalAttributes.BRAVERY,
                                                MentalAttributes.CONCENTRATION,
                                                PhysicalAttributes.AGILITY,
                                                PhysicalAttributes.PACE, PhysicalAttributes.STRENGTH));

                // DMCL Anchor Defend
                keyAttributesMapping.put(
                                FieldPosition.DMCL.name() + Role.ANCHOR.name() + Duty.DEFEND.name(),
                                List.of(
                                                TechnicalAttributes.MARKING, TechnicalAttributes.TACKLING,
                                                MentalAttributes.ANTICIPATION, MentalAttributes.CONCENTRATION,
                                                MentalAttributes.DECISIONS, MentalAttributes.POSITIONING));

                preferableAttributesMapping.put(
                                FieldPosition.DMCL.name() + Role.ANCHOR.name() + Duty.DEFEND.name(),
                                List.of(
                                                MentalAttributes.COMPOSURE, MentalAttributes.TEAMWORK,
                                                PhysicalAttributes.STRENGTH));

                // DM Anchor Defend
                keyAttributesMapping.put(
                                FieldPosition.DM.name() + Role.ANCHOR.name() + Duty.DEFEND.name(),
                                List.of(
                                                TechnicalAttributes.MARKING, TechnicalAttributes.TACKLING,
                                                MentalAttributes.ANTICIPATION, MentalAttributes.CONCENTRATION,
                                                MentalAttributes.DECISIONS, MentalAttributes.POSITIONING));

                preferableAttributesMapping.put(
                                FieldPosition.DM.name() + Role.ANCHOR.name() + Duty.DEFEND.name(),
                                List.of(
                                                MentalAttributes.COMPOSURE, MentalAttributes.TEAMWORK,
                                                PhysicalAttributes.STRENGTH));

                // DMCR Anchor Defend
                keyAttributesMapping.put(
                                FieldPosition.DMCR.name() + Role.ANCHOR.name() + Duty.DEFEND.name(),
                                List.of(
                                                TechnicalAttributes.MARKING, TechnicalAttributes.TACKLING,
                                                MentalAttributes.ANTICIPATION, MentalAttributes.CONCENTRATION,
                                                MentalAttributes.DECISIONS, MentalAttributes.POSITIONING));

                preferableAttributesMapping.put(
                                FieldPosition.DMCR.name() + Role.ANCHOR.name() + Duty.DEFEND.name(),
                                List.of(
                                                MentalAttributes.COMPOSURE, MentalAttributes.TEAMWORK,
                                                PhysicalAttributes.STRENGTH));

                // DMCL Half Back Defend
                keyAttributesMapping.put(
                                FieldPosition.DMCL.name() + Role.HALF_BACK.name() + Duty.DEFEND.name(),
                                List.of(
                                                TechnicalAttributes.MARKING, TechnicalAttributes.TACKLING,
                                                MentalAttributes.ANTICIPATION, MentalAttributes.COMPOSURE,
                                                MentalAttributes.CONCENTRATION,
                                                MentalAttributes.DECISIONS, MentalAttributes.POSITIONING,
                                                MentalAttributes.TEAMWORK));

                preferableAttributesMapping.put(
                                FieldPosition.DMCL.name() + Role.HALF_BACK.name() + Duty.DEFEND.name(),
                                List.of(
                                                TechnicalAttributes.FIRST_TOUCH, TechnicalAttributes.PASSING,
                                                MentalAttributes.AGGRESSION, MentalAttributes.BRAVERY,
                                                MentalAttributes.WORK_RATE,
                                                PhysicalAttributes.JUMPING_REACH, PhysicalAttributes.STAMINA,
                                                PhysicalAttributes.STRENGTH));

                // DM Half Back Defend
                keyAttributesMapping.put(
                                FieldPosition.DM.name() + Role.HALF_BACK.name() + Duty.DEFEND.name(),
                                List.of(
                                                TechnicalAttributes.MARKING, TechnicalAttributes.TACKLING,
                                                MentalAttributes.ANTICIPATION, MentalAttributes.COMPOSURE,
                                                MentalAttributes.CONCENTRATION,
                                                MentalAttributes.DECISIONS, MentalAttributes.POSITIONING,
                                                MentalAttributes.TEAMWORK));

                preferableAttributesMapping.put(
                                FieldPosition.DM.name() + Role.HALF_BACK.name() + Duty.DEFEND.name(),
                                List.of(
                                                TechnicalAttributes.FIRST_TOUCH, TechnicalAttributes.PASSING,
                                                MentalAttributes.AGGRESSION, MentalAttributes.BRAVERY,
                                                MentalAttributes.WORK_RATE,
                                                PhysicalAttributes.JUMPING_REACH, PhysicalAttributes.STAMINA,
                                                PhysicalAttributes.STRENGTH));

                // DMCR Half Back Defend
                keyAttributesMapping.put(
                                FieldPosition.DMCR.name() + Role.HALF_BACK.name() + Duty.DEFEND.name(),
                                List.of(
                                                TechnicalAttributes.MARKING, TechnicalAttributes.TACKLING,
                                                MentalAttributes.ANTICIPATION, MentalAttributes.COMPOSURE,
                                                MentalAttributes.CONCENTRATION,
                                                MentalAttributes.DECISIONS, MentalAttributes.POSITIONING,
                                                MentalAttributes.TEAMWORK));

                preferableAttributesMapping.put(
                                FieldPosition.DMCR.name() + Role.HALF_BACK.name() + Duty.DEFEND.name(),
                                List.of(
                                                TechnicalAttributes.FIRST_TOUCH, TechnicalAttributes.PASSING,
                                                MentalAttributes.AGGRESSION, MentalAttributes.BRAVERY,
                                                MentalAttributes.WORK_RATE,
                                                PhysicalAttributes.JUMPING_REACH, PhysicalAttributes.STAMINA,
                                                PhysicalAttributes.STRENGTH));

                // DMCL Regista Support
                keyAttributesMapping.put(
                                FieldPosition.DMCL.name() + Role.REGISTA.name() + Duty.SUPPORT.name(),
                                List.of(
                                                TechnicalAttributes.FIRST_TOUCH, TechnicalAttributes.PASSING,
                                                TechnicalAttributes.TECHNIQUE,
                                                MentalAttributes.COMPOSURE,
                                                MentalAttributes.DECISIONS, MentalAttributes.FLAIR,
                                                MentalAttributes.OFF_THE_BALL,
                                                MentalAttributes.TEAMWORK, MentalAttributes.VISION));

                preferableAttributesMapping.put(
                                FieldPosition.DMCL.name() + Role.REGISTA.name() + Duty.SUPPORT.name(),
                                List.of(
                                                TechnicalAttributes.DRIBBLING, TechnicalAttributes.LONG_SHOTS,
                                                MentalAttributes.ANTICIPATION, PhysicalAttributes.BALANCE));

                // DM Regista Support
                keyAttributesMapping.put(
                                FieldPosition.DM.name() + Role.REGISTA.name() + Duty.SUPPORT.name(),
                                List.of(
                                                TechnicalAttributes.FIRST_TOUCH, TechnicalAttributes.PASSING,
                                                TechnicalAttributes.TECHNIQUE,
                                                MentalAttributes.COMPOSURE,
                                                MentalAttributes.DECISIONS, MentalAttributes.FLAIR,
                                                MentalAttributes.OFF_THE_BALL,
                                                MentalAttributes.TEAMWORK, MentalAttributes.VISION));

                preferableAttributesMapping.put(
                                FieldPosition.DM.name() + Role.REGISTA.name() + Duty.SUPPORT.name(),
                                List.of(
                                                TechnicalAttributes.DRIBBLING, TechnicalAttributes.LONG_SHOTS,
                                                MentalAttributes.ANTICIPATION, PhysicalAttributes.BALANCE));

                // DMCR Regista Support
                keyAttributesMapping.put(
                                FieldPosition.DMCR.name() + Role.REGISTA.name() + Duty.SUPPORT.name(),
                                List.of(
                                                TechnicalAttributes.FIRST_TOUCH, TechnicalAttributes.PASSING,
                                                TechnicalAttributes.TECHNIQUE,
                                                MentalAttributes.COMPOSURE,
                                                MentalAttributes.DECISIONS, MentalAttributes.FLAIR,
                                                MentalAttributes.OFF_THE_BALL,
                                                MentalAttributes.TEAMWORK, MentalAttributes.VISION));

                preferableAttributesMapping.put(
                                FieldPosition.DMCR.name() + Role.REGISTA.name() + Duty.SUPPORT.name(),
                                List.of(
                                                TechnicalAttributes.DRIBBLING, TechnicalAttributes.LONG_SHOTS,
                                                MentalAttributes.ANTICIPATION, PhysicalAttributes.BALANCE));

                // DMCL Roaming Playmaker Support
                keyAttributesMapping.put(
                                FieldPosition.DMCL.name() + Role.ROAMING_PLAYMAKER.name() + Duty.SUPPORT.name(),
                                List.of(
                                                TechnicalAttributes.FIRST_TOUCH, TechnicalAttributes.PASSING,
                                                TechnicalAttributes.TECHNIQUE, MentalAttributes.ANTICIPATION,
                                                MentalAttributes.COMPOSURE, MentalAttributes.DECISIONS,
                                                MentalAttributes.OFF_THE_BALL, MentalAttributes.TEAMWORK,
                                                MentalAttributes.VISION, MentalAttributes.WORK_RATE,
                                                PhysicalAttributes.ACCELERATION, PhysicalAttributes.STAMINA));

                preferableAttributesMapping.put(
                                FieldPosition.DMCL.name() + Role.ROAMING_PLAYMAKER.name() + Duty.SUPPORT.name(),
                                List.of(
                                                TechnicalAttributes.DRIBBLING, TechnicalAttributes.LONG_SHOTS,
                                                MentalAttributes.CONCENTRATION, MentalAttributes.POSITIONING,
                                                PhysicalAttributes.AGILITY, PhysicalAttributes.BALANCE,
                                                PhysicalAttributes.PACE));

                // DM Roaming Playmaker Support
                keyAttributesMapping.put(
                                FieldPosition.DM.name() + Role.ROAMING_PLAYMAKER.name() + Duty.SUPPORT.name(),
                                List.of(
                                                TechnicalAttributes.FIRST_TOUCH, TechnicalAttributes.PASSING,
                                                TechnicalAttributes.TECHNIQUE, MentalAttributes.ANTICIPATION,
                                                MentalAttributes.COMPOSURE, MentalAttributes.DECISIONS,
                                                MentalAttributes.OFF_THE_BALL, MentalAttributes.TEAMWORK,
                                                MentalAttributes.VISION, MentalAttributes.WORK_RATE,
                                                PhysicalAttributes.ACCELERATION, PhysicalAttributes.STAMINA));

                preferableAttributesMapping.put(
                                FieldPosition.DM.name() + Role.ROAMING_PLAYMAKER.name() + Duty.SUPPORT.name(),
                                List.of(
                                                TechnicalAttributes.DRIBBLING, TechnicalAttributes.LONG_SHOTS,
                                                MentalAttributes.CONCENTRATION, MentalAttributes.POSITIONING,
                                                PhysicalAttributes.AGILITY, PhysicalAttributes.BALANCE,
                                                PhysicalAttributes.PACE));

                // DMCR Roaming Playmaker Support
                keyAttributesMapping.put(
                                FieldPosition.DMCR.name() + Role.ROAMING_PLAYMAKER.name() + Duty.SUPPORT.name(),
                                List.of(
                                                TechnicalAttributes.FIRST_TOUCH, TechnicalAttributes.PASSING,
                                                TechnicalAttributes.TECHNIQUE, MentalAttributes.ANTICIPATION,
                                                MentalAttributes.COMPOSURE, MentalAttributes.DECISIONS,
                                                MentalAttributes.OFF_THE_BALL, MentalAttributes.TEAMWORK,
                                                MentalAttributes.VISION, MentalAttributes.WORK_RATE,
                                                PhysicalAttributes.ACCELERATION, PhysicalAttributes.STAMINA));

                preferableAttributesMapping.put(
                                FieldPosition.DMCR.name() + Role.ROAMING_PLAYMAKER.name() + Duty.SUPPORT.name(),
                                List.of(
                                                TechnicalAttributes.DRIBBLING, TechnicalAttributes.LONG_SHOTS,
                                                MentalAttributes.CONCENTRATION, MentalAttributes.POSITIONING,
                                                PhysicalAttributes.AGILITY, PhysicalAttributes.BALANCE,
                                                PhysicalAttributes.PACE));

                // DMCL Segundo Volante Support
                keyAttributesMapping.put(
                                FieldPosition.DMCL.name() + Role.SEGUNDO_VOLANTE.name() + Duty.SUPPORT.name(),
                                List.of(
                                                TechnicalAttributes.MARKING, TechnicalAttributes.PASSING,
                                                TechnicalAttributes.TACKLING,
                                                MentalAttributes.OFF_THE_BALL, MentalAttributes.POSITIONING,
                                                MentalAttributes.WORK_RATE,
                                                PhysicalAttributes.PACE, PhysicalAttributes.STAMINA));

                preferableAttributesMapping.put(
                                FieldPosition.DMCL.name() + Role.SEGUNDO_VOLANTE.name() + Duty.SUPPORT.name(),
                                List.of(
                                                TechnicalAttributes.FINISHING, TechnicalAttributes.FIRST_TOUCH,
                                                TechnicalAttributes.LONG_SHOTS,
                                                MentalAttributes.ANTICIPATION, MentalAttributes.COMPOSURE,
                                                MentalAttributes.CONCENTRATION, MentalAttributes.DECISIONS,
                                                PhysicalAttributes.ACCELERATION, PhysicalAttributes.BALANCE,
                                                PhysicalAttributes.STRENGTH));

                // DMCR Segundo Volante Support
                keyAttributesMapping.put(
                                FieldPosition.DMCR.name() + Role.SEGUNDO_VOLANTE.name() + Duty.SUPPORT.name(),
                                List.of(
                                                TechnicalAttributes.MARKING, TechnicalAttributes.PASSING,
                                                TechnicalAttributes.TACKLING,
                                                MentalAttributes.OFF_THE_BALL, MentalAttributes.POSITIONING,
                                                MentalAttributes.WORK_RATE,
                                                PhysicalAttributes.PACE, PhysicalAttributes.STAMINA));

                preferableAttributesMapping.put(
                                FieldPosition.DMCR.name() + Role.SEGUNDO_VOLANTE.name() + Duty.SUPPORT.name(),
                                List.of(
                                                TechnicalAttributes.FINISHING, TechnicalAttributes.FIRST_TOUCH,
                                                TechnicalAttributes.LONG_SHOTS,
                                                MentalAttributes.ANTICIPATION, MentalAttributes.COMPOSURE,
                                                MentalAttributes.CONCENTRATION, MentalAttributes.DECISIONS,
                                                PhysicalAttributes.ACCELERATION, PhysicalAttributes.BALANCE,
                                                PhysicalAttributes.STRENGTH));

                // DMCL Segundo Volante Attack
                keyAttributesMapping.put(
                                FieldPosition.DMCL.name() + Role.SEGUNDO_VOLANTE.name() + Duty.ATTACK.name(),
                                List.of(
                                                TechnicalAttributes.FINISHING, TechnicalAttributes.LONG_SHOTS,
                                                TechnicalAttributes.PASSING,
                                                TechnicalAttributes.TACKLING, MentalAttributes.ANTICIPATION,
                                                MentalAttributes.OFF_THE_BALL, MentalAttributes.POSITIONING,
                                                MentalAttributes.WORK_RATE,
                                                PhysicalAttributes.PACE, PhysicalAttributes.STAMINA));

                preferableAttributesMapping.put(
                                FieldPosition.DMCL.name() + Role.SEGUNDO_VOLANTE.name() + Duty.ATTACK.name(),
                                List.of(
                                                TechnicalAttributes.FIRST_TOUCH, TechnicalAttributes.MARKING,
                                                MentalAttributes.COMPOSURE,
                                                MentalAttributes.CONCENTRATION, MentalAttributes.DECISIONS,
                                                PhysicalAttributes.ACCELERATION, PhysicalAttributes.BALANCE,
                                                PhysicalAttributes.STRENGTH));

                // DMCR Segundo Volante Attack
                keyAttributesMapping.put(
                                FieldPosition.DMCR.name() + Role.SEGUNDO_VOLANTE.name() + Duty.ATTACK.name(),
                                List.of(
                                                TechnicalAttributes.FINISHING, TechnicalAttributes.LONG_SHOTS,
                                                TechnicalAttributes.PASSING,
                                                TechnicalAttributes.TACKLING, MentalAttributes.ANTICIPATION,
                                                MentalAttributes.OFF_THE_BALL, MentalAttributes.POSITIONING,
                                                MentalAttributes.WORK_RATE,
                                                PhysicalAttributes.PACE, PhysicalAttributes.STAMINA));

                preferableAttributesMapping.put(
                                FieldPosition.DMCR.name() + Role.SEGUNDO_VOLANTE.name() + Duty.ATTACK.name(),
                                List.of(
                                                TechnicalAttributes.FIRST_TOUCH, TechnicalAttributes.MARKING,
                                                MentalAttributes.COMPOSURE,
                                                MentalAttributes.CONCENTRATION, MentalAttributes.DECISIONS,
                                                PhysicalAttributes.ACCELERATION, PhysicalAttributes.BALANCE,
                                                PhysicalAttributes.STRENGTH));
        }
}
