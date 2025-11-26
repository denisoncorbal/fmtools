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

public class MlrAttributesList {
        private Map<String, List<PlayerAttributes>> preferableAttributesMapping = new HashMap<>();
        private Map<String, List<PlayerAttributes>> keyAttributesMapping = new HashMap<>();

        public Map<String, List<PlayerAttributes>> getPreferableAttributesMapping() {
                return preferableAttributesMapping;
        }

        public Map<String, List<PlayerAttributes>> getKeyAttributesMapping() {
                return keyAttributesMapping;
        }

        public MlrAttributesList() {
                // ML Wide Midfielder Defend

                keyAttributesMapping.put(FieldPosition.ML.name() + Role.WIDE_MIDFIELDER.name() + Duty.DEFEND.name(),
                                List.of(TechnicalAttributes.PASSING, TechnicalAttributes.TACKLING,
                                                MentalAttributes.CONCENTRATION,
                                                MentalAttributes.DECISIONS, MentalAttributes.POSITIONING,
                                                MentalAttributes.TEAMWORK,
                                                MentalAttributes.WORK_RATE));
                preferableAttributesMapping.put(
                                FieldPosition.ML.name() + Role.WIDE_MIDFIELDER.name() + Duty.DEFEND.name(),
                                List.of(TechnicalAttributes.CROSSING, TechnicalAttributes.FIRST_TOUCH,
                                                TechnicalAttributes.MARKING,
                                                TechnicalAttributes.TECHNIQUE, MentalAttributes.ANTICIPATION,
                                                MentalAttributes.COMPOSURE,
                                                PhysicalAttributes.STAMINA));

                // MR Wide Midfielder Defend

                keyAttributesMapping.put(FieldPosition.MR.name() + Role.WIDE_MIDFIELDER.name() + Duty.DEFEND.name(),
                                List.of(TechnicalAttributes.PASSING, TechnicalAttributes.TACKLING,
                                                MentalAttributes.CONCENTRATION,
                                                MentalAttributes.DECISIONS, MentalAttributes.POSITIONING,
                                                MentalAttributes.TEAMWORK,
                                                MentalAttributes.WORK_RATE));
                preferableAttributesMapping.put(
                                FieldPosition.MR.name() + Role.WIDE_MIDFIELDER.name() + Duty.DEFEND.name(),
                                List.of(TechnicalAttributes.CROSSING, TechnicalAttributes.FIRST_TOUCH,
                                                TechnicalAttributes.MARKING,
                                                TechnicalAttributes.TECHNIQUE, MentalAttributes.ANTICIPATION,
                                                MentalAttributes.COMPOSURE,
                                                PhysicalAttributes.STAMINA));

                // ML Wide Midfielder Support

                keyAttributesMapping.put(FieldPosition.ML.name() + Role.WIDE_MIDFIELDER.name() + Duty.SUPPORT.name(),
                                List.of(TechnicalAttributes.PASSING, TechnicalAttributes.TACKLING,
                                                MentalAttributes.DECISIONS, MentalAttributes.TEAMWORK,
                                                MentalAttributes.WORK_RATE, PhysicalAttributes.STAMINA));
                preferableAttributesMapping.put(
                                FieldPosition.ML.name() + Role.WIDE_MIDFIELDER.name() + Duty.SUPPORT.name(),
                                List.of(TechnicalAttributes.CROSSING, TechnicalAttributes.FIRST_TOUCH,
                                                TechnicalAttributes.TECHNIQUE, MentalAttributes.ANTICIPATION,
                                                MentalAttributes.COMPOSURE,
                                                MentalAttributes.CONCENTRATION, MentalAttributes.OFF_THE_BALL,
                                                MentalAttributes.POSITIONING,
                                                MentalAttributes.VISION));

                // MR Wide Midfielder Support

                keyAttributesMapping.put(FieldPosition.MR.name() + Role.WIDE_MIDFIELDER.name() + Duty.SUPPORT.name(),
                                List.of(TechnicalAttributes.PASSING, TechnicalAttributes.TACKLING,
                                                MentalAttributes.DECISIONS, MentalAttributes.TEAMWORK,
                                                MentalAttributes.WORK_RATE, PhysicalAttributes.STAMINA));
                preferableAttributesMapping.put(
                                FieldPosition.MR.name() + Role.WIDE_MIDFIELDER.name() + Duty.SUPPORT.name(),
                                List.of(TechnicalAttributes.CROSSING, TechnicalAttributes.FIRST_TOUCH,
                                                TechnicalAttributes.TECHNIQUE, MentalAttributes.ANTICIPATION,
                                                MentalAttributes.COMPOSURE,
                                                MentalAttributes.CONCENTRATION, MentalAttributes.OFF_THE_BALL,
                                                MentalAttributes.POSITIONING,
                                                MentalAttributes.VISION));

                // ML Wide Midfielder Attack

                keyAttributesMapping.put(FieldPosition.ML.name() + Role.WIDE_MIDFIELDER.name() + Duty.ATTACK.name(),
                                List.of(TechnicalAttributes.CROSSING, TechnicalAttributes.FIRST_TOUCH,
                                                TechnicalAttributes.PASSING,
                                                MentalAttributes.DECISIONS, MentalAttributes.TEAMWORK,
                                                MentalAttributes.WORK_RATE, PhysicalAttributes.STAMINA));
                preferableAttributesMapping.put(
                                FieldPosition.ML.name() + Role.WIDE_MIDFIELDER.name() + Duty.ATTACK.name(),
                                List.of(TechnicalAttributes.TACKLING,
                                                TechnicalAttributes.TECHNIQUE, MentalAttributes.ANTICIPATION,
                                                MentalAttributes.COMPOSURE,
                                                MentalAttributes.OFF_THE_BALL,
                                                MentalAttributes.VISION));

                // MR Wide Midfielder Attack

                keyAttributesMapping.put(FieldPosition.MR.name() + Role.WIDE_MIDFIELDER.name() + Duty.ATTACK.name(),
                                List.of(TechnicalAttributes.CROSSING, TechnicalAttributes.FIRST_TOUCH,
                                                TechnicalAttributes.PASSING,
                                                MentalAttributes.DECISIONS, MentalAttributes.TEAMWORK,
                                                MentalAttributes.WORK_RATE, PhysicalAttributes.STAMINA));
                preferableAttributesMapping.put(
                                FieldPosition.MR.name() + Role.WIDE_MIDFIELDER.name() + Duty.ATTACK.name(),
                                List.of(TechnicalAttributes.TACKLING,
                                                TechnicalAttributes.TECHNIQUE, MentalAttributes.ANTICIPATION,
                                                MentalAttributes.COMPOSURE,
                                                MentalAttributes.OFF_THE_BALL,
                                                MentalAttributes.VISION));

                // ML Wide Midfielder Automatic

                keyAttributesMapping.put(FieldPosition.ML.name() + Role.WIDE_MIDFIELDER.name() + Duty.AUTOMATIC.name(),
                                List.of(TechnicalAttributes.PASSING, TechnicalAttributes.TACKLING,
                                                MentalAttributes.DECISIONS, MentalAttributes.TEAMWORK,
                                                MentalAttributes.WORK_RATE, PhysicalAttributes.STAMINA));
                preferableAttributesMapping.put(
                                FieldPosition.ML.name() + Role.WIDE_MIDFIELDER.name() + Duty.AUTOMATIC.name(),
                                List.of(TechnicalAttributes.CROSSING, TechnicalAttributes.FIRST_TOUCH,
                                                TechnicalAttributes.TECHNIQUE, MentalAttributes.ANTICIPATION,
                                                MentalAttributes.COMPOSURE,
                                                MentalAttributes.CONCENTRATION,
                                                MentalAttributes.OFF_THE_BALL, MentalAttributes.POSITIONING,
                                                MentalAttributes.VISION));

                // MR Wide Midfielder Automatic

                keyAttributesMapping.put(FieldPosition.MR.name() + Role.WIDE_MIDFIELDER.name() + Duty.AUTOMATIC.name(),
                                List.of(TechnicalAttributes.PASSING, TechnicalAttributes.TACKLING,
                                                MentalAttributes.DECISIONS, MentalAttributes.TEAMWORK,
                                                MentalAttributes.WORK_RATE, PhysicalAttributes.STAMINA));
                preferableAttributesMapping.put(
                                FieldPosition.MR.name() + Role.WIDE_MIDFIELDER.name() + Duty.AUTOMATIC.name(),
                                List.of(TechnicalAttributes.CROSSING, TechnicalAttributes.FIRST_TOUCH,
                                                TechnicalAttributes.TECHNIQUE, MentalAttributes.ANTICIPATION,
                                                MentalAttributes.COMPOSURE,
                                                MentalAttributes.CONCENTRATION,
                                                MentalAttributes.OFF_THE_BALL, MentalAttributes.POSITIONING,
                                                MentalAttributes.VISION));

                // ML Winger Support

                keyAttributesMapping.put(FieldPosition.ML.name() + Role.WINGER.name() + Duty.SUPPORT.name(),
                                List.of(TechnicalAttributes.CROSSING, TechnicalAttributes.DRIBBLING,
                                                TechnicalAttributes.TECHNIQUE,
                                                MentalAttributes.OFF_THE_BALL, PhysicalAttributes.ACCELERATION,
                                                PhysicalAttributes.PACE));
                preferableAttributesMapping.put(FieldPosition.ML.name() + Role.WINGER.name() + Duty.SUPPORT.name(),
                                List.of(TechnicalAttributes.FIRST_TOUCH, TechnicalAttributes.PASSING,
                                                MentalAttributes.WORK_RATE, PhysicalAttributes.AGILITY,
                                                PhysicalAttributes.STAMINA));

                // MR Winger Support

                keyAttributesMapping.put(FieldPosition.MR.name() + Role.WINGER.name() + Duty.SUPPORT.name(),
                                List.of(TechnicalAttributes.CROSSING, TechnicalAttributes.DRIBBLING,
                                                TechnicalAttributes.TECHNIQUE,
                                                MentalAttributes.OFF_THE_BALL, PhysicalAttributes.ACCELERATION,
                                                PhysicalAttributes.PACE));
                preferableAttributesMapping.put(FieldPosition.MR.name() + Role.WINGER.name() + Duty.SUPPORT.name(),
                                List.of(TechnicalAttributes.FIRST_TOUCH, TechnicalAttributes.PASSING,
                                                MentalAttributes.WORK_RATE, PhysicalAttributes.AGILITY,
                                                PhysicalAttributes.STAMINA));

                // ML Winger Attack

                keyAttributesMapping.put(FieldPosition.ML.name() + Role.WINGER.name() + Duty.ATTACK.name(),
                                List.of(TechnicalAttributes.CROSSING, TechnicalAttributes.DRIBBLING,
                                                TechnicalAttributes.TECHNIQUE,
                                                MentalAttributes.OFF_THE_BALL, PhysicalAttributes.ACCELERATION,
                                                PhysicalAttributes.PACE));
                preferableAttributesMapping.put(FieldPosition.ML.name() + Role.WINGER.name() + Duty.ATTACK.name(),
                                List.of(TechnicalAttributes.FIRST_TOUCH, TechnicalAttributes.PASSING,
                                                MentalAttributes.ANTICIPATION, MentalAttributes.FLAIR,
                                                PhysicalAttributes.AGILITY));

                // MR Winger Attack

                keyAttributesMapping.put(FieldPosition.MR.name() + Role.WINGER.name() + Duty.ATTACK.name(),
                                List.of(TechnicalAttributes.CROSSING, TechnicalAttributes.DRIBBLING,
                                                TechnicalAttributes.TECHNIQUE,
                                                MentalAttributes.OFF_THE_BALL, PhysicalAttributes.ACCELERATION,
                                                PhysicalAttributes.PACE));
                preferableAttributesMapping.put(FieldPosition.MR.name() + Role.WINGER.name() + Duty.ATTACK.name(),
                                List.of(TechnicalAttributes.FIRST_TOUCH, TechnicalAttributes.PASSING,
                                                MentalAttributes.ANTICIPATION, MentalAttributes.FLAIR,
                                                PhysicalAttributes.AGILITY));

                // ML Defensive Winger Defend

                keyAttributesMapping.put(FieldPosition.ML.name() + Role.DEFENSIVE_WINGER.name() + Duty.DEFEND.name(),
                                List.of(TechnicalAttributes.TECHNIQUE, MentalAttributes.ANTICIPATION,
                                                MentalAttributes.OFF_THE_BALL, MentalAttributes.POSITIONING,
                                                MentalAttributes.TEAMWORK,
                                                MentalAttributes.WORK_RATE, PhysicalAttributes.STAMINA));
                preferableAttributesMapping.put(
                                FieldPosition.ML.name() + Role.DEFENSIVE_WINGER.name() + Duty.DEFEND.name(),
                                List.of(TechnicalAttributes.CROSSING, TechnicalAttributes.DRIBBLING,
                                                TechnicalAttributes.FIRST_TOUCH,
                                                TechnicalAttributes.MARKING, TechnicalAttributes.TACKLING,
                                                MentalAttributes.AGGRESSION, MentalAttributes.CONCENTRATION,
                                                MentalAttributes.DECISIONS,
                                                PhysicalAttributes.ACCELERATION));

                // MR Defensive Winger Defend

                keyAttributesMapping.put(FieldPosition.MR.name() + Role.DEFENSIVE_WINGER.name() + Duty.DEFEND.name(),
                                List.of(TechnicalAttributes.TECHNIQUE, MentalAttributes.ANTICIPATION,
                                                MentalAttributes.OFF_THE_BALL, MentalAttributes.POSITIONING,
                                                MentalAttributes.TEAMWORK,
                                                MentalAttributes.WORK_RATE, PhysicalAttributes.STAMINA));
                preferableAttributesMapping.put(
                                FieldPosition.MR.name() + Role.DEFENSIVE_WINGER.name() + Duty.DEFEND.name(),
                                List.of(TechnicalAttributes.CROSSING, TechnicalAttributes.DRIBBLING,
                                                TechnicalAttributes.FIRST_TOUCH,
                                                TechnicalAttributes.MARKING, TechnicalAttributes.TACKLING,
                                                MentalAttributes.AGGRESSION, MentalAttributes.CONCENTRATION,
                                                MentalAttributes.DECISIONS,
                                                PhysicalAttributes.ACCELERATION));

                // ML Defensive Winger Support

                keyAttributesMapping.put(FieldPosition.ML.name() + Role.DEFENSIVE_WINGER.name() + Duty.SUPPORT.name(),
                                List.of(TechnicalAttributes.CROSSING, TechnicalAttributes.TECHNIQUE,
                                                MentalAttributes.OFF_THE_BALL, MentalAttributes.TEAMWORK,
                                                MentalAttributes.WORK_RATE, PhysicalAttributes.STAMINA));
                preferableAttributesMapping.put(
                                FieldPosition.ML.name() + Role.DEFENSIVE_WINGER.name() + Duty.SUPPORT.name(),
                                List.of(TechnicalAttributes.DRIBBLING, TechnicalAttributes.FIRST_TOUCH,
                                                TechnicalAttributes.MARKING, TechnicalAttributes.PASSING,
                                                TechnicalAttributes.TACKLING,
                                                MentalAttributes.AGGRESSION, MentalAttributes.ANTICIPATION,
                                                MentalAttributes.COMPOSURE,
                                                MentalAttributes.CONCENTRATION, MentalAttributes.DECISIONS,
                                                MentalAttributes.POSITIONING,
                                                PhysicalAttributes.ACCELERATION));

                // MR Defensive Winger Support

                keyAttributesMapping.put(FieldPosition.MR.name() + Role.DEFENSIVE_WINGER.name() + Duty.SUPPORT.name(),
                                List.of(TechnicalAttributes.CROSSING, TechnicalAttributes.TECHNIQUE,
                                                MentalAttributes.OFF_THE_BALL, MentalAttributes.TEAMWORK,
                                                MentalAttributes.WORK_RATE, PhysicalAttributes.STAMINA));
                preferableAttributesMapping.put(
                                FieldPosition.MR.name() + Role.DEFENSIVE_WINGER.name() + Duty.SUPPORT.name(),
                                List.of(TechnicalAttributes.DRIBBLING, TechnicalAttributes.FIRST_TOUCH,
                                                TechnicalAttributes.MARKING, TechnicalAttributes.PASSING,
                                                TechnicalAttributes.TACKLING,
                                                MentalAttributes.AGGRESSION, MentalAttributes.ANTICIPATION,
                                                MentalAttributes.COMPOSURE,
                                                MentalAttributes.CONCENTRATION, MentalAttributes.DECISIONS,
                                                MentalAttributes.POSITIONING,
                                                PhysicalAttributes.ACCELERATION));

                // ML Wide Playmaker Support

                keyAttributesMapping.put(FieldPosition.ML.name() + Role.WIDE_PLAYMAKER.name() + Duty.SUPPORT.name(),
                                List.of(TechnicalAttributes.FIRST_TOUCH, TechnicalAttributes.PASSING,
                                                TechnicalAttributes.TECHNIQUE,
                                                MentalAttributes.COMPOSURE, MentalAttributes.DECISIONS,
                                                MentalAttributes.TEAMWORK,
                                                MentalAttributes.VISION));
                preferableAttributesMapping.put(
                                FieldPosition.ML.name() + Role.WIDE_PLAYMAKER.name() + Duty.SUPPORT.name(),
                                List.of(TechnicalAttributes.DRIBBLING, MentalAttributes.OFF_THE_BALL,
                                                PhysicalAttributes.AGILITY));

                // MR Wide Playmaker Support

                keyAttributesMapping.put(FieldPosition.MR.name() + Role.WIDE_PLAYMAKER.name() + Duty.SUPPORT.name(),
                                List.of(TechnicalAttributes.FIRST_TOUCH, TechnicalAttributes.PASSING,
                                                TechnicalAttributes.TECHNIQUE,
                                                MentalAttributes.COMPOSURE, MentalAttributes.DECISIONS,
                                                MentalAttributes.TEAMWORK,
                                                MentalAttributes.VISION));
                preferableAttributesMapping.put(
                                FieldPosition.MR.name() + Role.WIDE_PLAYMAKER.name() + Duty.SUPPORT.name(),
                                List.of(TechnicalAttributes.DRIBBLING, MentalAttributes.OFF_THE_BALL,
                                                PhysicalAttributes.AGILITY));

                // ML Wide Playmaker Attack

                keyAttributesMapping.put(FieldPosition.ML.name() + Role.WIDE_PLAYMAKER.name() + Duty.ATTACK.name(),
                                List.of(TechnicalAttributes.DRIBBLING, TechnicalAttributes.FIRST_TOUCH,
                                                TechnicalAttributes.PASSING,
                                                TechnicalAttributes.TECHNIQUE, MentalAttributes.COMPOSURE,
                                                MentalAttributes.DECISIONS,
                                                MentalAttributes.OFF_THE_BALL, MentalAttributes.TEAMWORK,
                                                MentalAttributes.VISION));
                preferableAttributesMapping.put(
                                FieldPosition.ML.name() + Role.WIDE_PLAYMAKER.name() + Duty.ATTACK.name(),
                                List.of(MentalAttributes.ANTICIPATION, MentalAttributes.FLAIR,
                                                PhysicalAttributes.ACCELERATION,
                                                PhysicalAttributes.AGILITY));

                // MR Wide Playmaker Attack

                keyAttributesMapping.put(FieldPosition.MR.name() + Role.WIDE_PLAYMAKER.name() + Duty.ATTACK.name(),
                                List.of(TechnicalAttributes.DRIBBLING, TechnicalAttributes.FIRST_TOUCH,
                                                TechnicalAttributes.PASSING,
                                                TechnicalAttributes.TECHNIQUE, MentalAttributes.COMPOSURE,
                                                MentalAttributes.DECISIONS,
                                                MentalAttributes.OFF_THE_BALL, MentalAttributes.TEAMWORK,
                                                MentalAttributes.VISION));
                preferableAttributesMapping.put(
                                FieldPosition.MR.name() + Role.WIDE_PLAYMAKER.name() + Duty.ATTACK.name(),
                                List.of(MentalAttributes.ANTICIPATION, MentalAttributes.FLAIR,
                                                PhysicalAttributes.ACCELERATION,
                                                PhysicalAttributes.AGILITY));

                // ML Inverted Winger Support

                keyAttributesMapping.put(FieldPosition.ML.name() + Role.INVERTED_WINGER.name() + Duty.SUPPORT.name(),
                                List.of(TechnicalAttributes.DRIBBLING, TechnicalAttributes.PASSING,
                                                TechnicalAttributes.TECHNIQUE,
                                                MentalAttributes.OFF_THE_BALL, PhysicalAttributes.ACCELERATION));
                preferableAttributesMapping.put(
                                FieldPosition.ML.name() + Role.INVERTED_WINGER.name() + Duty.SUPPORT.name(),
                                List.of(TechnicalAttributes.CROSSING, TechnicalAttributes.FIRST_TOUCH,
                                                TechnicalAttributes.LONG_SHOTS,
                                                MentalAttributes.COMPOSURE, MentalAttributes.DECISIONS,
                                                MentalAttributes.VISION,
                                                MentalAttributes.WORK_RATE, PhysicalAttributes.AGILITY,
                                                PhysicalAttributes.PACE,
                                                PhysicalAttributes.STAMINA));

                // MR Inverted Winger Support

                keyAttributesMapping.put(FieldPosition.MR.name() + Role.INVERTED_WINGER.name() + Duty.SUPPORT.name(),
                                List.of(TechnicalAttributes.DRIBBLING, TechnicalAttributes.PASSING,
                                                TechnicalAttributes.TECHNIQUE,
                                                MentalAttributes.OFF_THE_BALL, PhysicalAttributes.ACCELERATION));
                preferableAttributesMapping.put(
                                FieldPosition.MR.name() + Role.INVERTED_WINGER.name() + Duty.SUPPORT.name(),
                                List.of(TechnicalAttributes.CROSSING, TechnicalAttributes.FIRST_TOUCH,
                                                TechnicalAttributes.LONG_SHOTS,
                                                MentalAttributes.COMPOSURE, MentalAttributes.DECISIONS,
                                                MentalAttributes.VISION,
                                                MentalAttributes.WORK_RATE, PhysicalAttributes.AGILITY,
                                                PhysicalAttributes.PACE,
                                                PhysicalAttributes.STAMINA));

                // ML Inverted Winger Attack

                keyAttributesMapping.put(FieldPosition.ML.name() + Role.INVERTED_WINGER.name() + Duty.ATTACK.name(),
                                List.of(TechnicalAttributes.DRIBBLING, TechnicalAttributes.PASSING,
                                                TechnicalAttributes.TECHNIQUE,
                                                MentalAttributes.OFF_THE_BALL, PhysicalAttributes.ACCELERATION,
                                                PhysicalAttributes.AGILITY));
                preferableAttributesMapping.put(
                                FieldPosition.ML.name() + Role.INVERTED_WINGER.name() + Duty.ATTACK.name(),
                                List.of(TechnicalAttributes.CROSSING, TechnicalAttributes.FIRST_TOUCH,
                                                TechnicalAttributes.LONG_SHOTS,
                                                MentalAttributes.ANTICIPATION, MentalAttributes.COMPOSURE,
                                                MentalAttributes.DECISIONS,
                                                MentalAttributes.FLAIR, MentalAttributes.VISION,
                                                PhysicalAttributes.PACE));

                // MR Inverted Winger Attack

                keyAttributesMapping.put(FieldPosition.MR.name() + Role.INVERTED_WINGER.name() + Duty.ATTACK.name(),
                                List.of(TechnicalAttributes.DRIBBLING, TechnicalAttributes.PASSING,
                                                TechnicalAttributes.TECHNIQUE,
                                                MentalAttributes.OFF_THE_BALL, PhysicalAttributes.ACCELERATION,
                                                PhysicalAttributes.AGILITY));
                preferableAttributesMapping.put(
                                FieldPosition.MR.name() + Role.INVERTED_WINGER.name() + Duty.ATTACK.name(),
                                List.of(TechnicalAttributes.CROSSING, TechnicalAttributes.FIRST_TOUCH,
                                                TechnicalAttributes.LONG_SHOTS,
                                                MentalAttributes.ANTICIPATION, MentalAttributes.COMPOSURE,
                                                MentalAttributes.DECISIONS,
                                                MentalAttributes.FLAIR, MentalAttributes.VISION,
                                                PhysicalAttributes.PACE));
        }
}
