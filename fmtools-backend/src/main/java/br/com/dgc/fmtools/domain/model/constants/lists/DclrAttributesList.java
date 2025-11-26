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

public class DclrAttributesList {
        private Map<String, List<PlayerAttributes>> preferableAttributesMapping = new HashMap<>();
        private Map<String, List<PlayerAttributes>> keyAttributesMapping = new HashMap<>();

        public Map<String, List<PlayerAttributes>> getPreferableAttributesMapping() {
                return preferableAttributesMapping;
        }

        public Map<String, List<PlayerAttributes>> getKeyAttributesMapping() {
                return keyAttributesMapping;
        }

        public DclrAttributesList() {
                // DCL CENTRAL DEFENDER DEFEND
                keyAttributesMapping.put(
                                FieldPosition.DCL.name() + Role.CENTRAL_DEFENDER.name() + Duty.DEFEND.name(),
                                List.of(
                                                TechnicalAttributes.HEADING, TechnicalAttributes.MARKING,
                                                TechnicalAttributes.TACKLING, MentalAttributes.POSITIONING,
                                                PhysicalAttributes.JUMPING_REACH, PhysicalAttributes.STRENGTH));

                preferableAttributesMapping.put(
                                FieldPosition.DCL.name() + Role.CENTRAL_DEFENDER.name() + Duty.DEFEND.name(),
                                List.of(
                                                MentalAttributes.AGGRESSION, MentalAttributes.ANTICIPATION,
                                                MentalAttributes.BRAVERY, MentalAttributes.COMPOSURE,
                                                MentalAttributes.CONCENTRATION, MentalAttributes.DECISIONS,
                                                PhysicalAttributes.PACE));

                // DCR CENTRAL DEFENDER DEFEND
                keyAttributesMapping.put(
                                FieldPosition.DCR.name() + Role.CENTRAL_DEFENDER.name() + Duty.DEFEND.name(),
                                List.of(
                                                TechnicalAttributes.HEADING, TechnicalAttributes.MARKING,
                                                TechnicalAttributes.TACKLING, MentalAttributes.POSITIONING,
                                                PhysicalAttributes.JUMPING_REACH, PhysicalAttributes.STRENGTH));

                preferableAttributesMapping.put(
                                FieldPosition.DCR.name() + Role.CENTRAL_DEFENDER.name() + Duty.DEFEND.name(),
                                List.of(
                                                MentalAttributes.AGGRESSION, MentalAttributes.ANTICIPATION,
                                                MentalAttributes.BRAVERY, MentalAttributes.COMPOSURE,
                                                MentalAttributes.CONCENTRATION, MentalAttributes.DECISIONS,
                                                PhysicalAttributes.PACE));

                // DC CENTRAL DEFENDER DEFEND
                keyAttributesMapping.put(
                                FieldPosition.DC.name() + Role.CENTRAL_DEFENDER.name() + Duty.DEFEND.name(),
                                List.of(
                                                TechnicalAttributes.HEADING, TechnicalAttributes.MARKING,
                                                TechnicalAttributes.TACKLING, MentalAttributes.POSITIONING,
                                                PhysicalAttributes.JUMPING_REACH, PhysicalAttributes.STRENGTH));

                preferableAttributesMapping.put(
                                FieldPosition.DC.name() + Role.CENTRAL_DEFENDER.name() + Duty.DEFEND.name(),
                                List.of(
                                                MentalAttributes.AGGRESSION, MentalAttributes.ANTICIPATION,
                                                MentalAttributes.BRAVERY, MentalAttributes.COMPOSURE,
                                                MentalAttributes.CONCENTRATION, MentalAttributes.DECISIONS,
                                                PhysicalAttributes.PACE));

                // DCL CENTRAL DEFENDER STOPPER
                keyAttributesMapping.put(
                                FieldPosition.DCL.name() + Role.CENTRAL_DEFENDER.name() + Duty.STOPPER.name(),
                                List.of(
                                                TechnicalAttributes.HEADING,
                                                TechnicalAttributes.TACKLING, MentalAttributes.AGGRESSION,
                                                MentalAttributes.BRAVERY, MentalAttributes.DECISIONS,
                                                MentalAttributes.POSITIONING,
                                                PhysicalAttributes.JUMPING_REACH, PhysicalAttributes.STRENGTH));

                preferableAttributesMapping.put(
                                FieldPosition.DCL.name() + Role.CENTRAL_DEFENDER.name() + Duty.STOPPER.name(),
                                List.of(
                                                TechnicalAttributes.MARKING, MentalAttributes.ANTICIPATION,
                                                MentalAttributes.COMPOSURE,
                                                MentalAttributes.CONCENTRATION));

                // DCR CENTRAL DEFENDER STOPPER
                keyAttributesMapping.put(
                                FieldPosition.DCR.name() + Role.CENTRAL_DEFENDER.name() + Duty.STOPPER.name(),
                                List.of(
                                                TechnicalAttributes.HEADING,
                                                TechnicalAttributes.TACKLING, MentalAttributes.AGGRESSION,
                                                MentalAttributes.BRAVERY, MentalAttributes.DECISIONS,
                                                MentalAttributes.POSITIONING,
                                                PhysicalAttributes.JUMPING_REACH, PhysicalAttributes.STRENGTH));

                preferableAttributesMapping.put(
                                FieldPosition.DCR.name() + Role.CENTRAL_DEFENDER.name() + Duty.STOPPER.name(),
                                List.of(
                                                TechnicalAttributes.MARKING, MentalAttributes.ANTICIPATION,
                                                MentalAttributes.COMPOSURE,
                                                MentalAttributes.CONCENTRATION));

                // DC CENTRAL DEFENDER STOPPER
                keyAttributesMapping.put(
                                FieldPosition.DC.name() + Role.CENTRAL_DEFENDER.name() + Duty.STOPPER.name(),
                                List.of(
                                                TechnicalAttributes.HEADING,
                                                TechnicalAttributes.TACKLING, MentalAttributes.AGGRESSION,
                                                MentalAttributes.BRAVERY, MentalAttributes.DECISIONS,
                                                MentalAttributes.POSITIONING,
                                                PhysicalAttributes.JUMPING_REACH, PhysicalAttributes.STRENGTH));

                preferableAttributesMapping.put(
                                FieldPosition.DC.name() + Role.CENTRAL_DEFENDER.name() + Duty.STOPPER.name(),
                                List.of(
                                                TechnicalAttributes.MARKING, MentalAttributes.ANTICIPATION,
                                                MentalAttributes.COMPOSURE,
                                                MentalAttributes.CONCENTRATION));

                // DCL CENTRAL DEFENDER COVER
                keyAttributesMapping.put(
                                FieldPosition.DCL.name() + Role.CENTRAL_DEFENDER.name() + Duty.COVER.name(),
                                List.of(
                                                TechnicalAttributes.MARKING,
                                                TechnicalAttributes.TACKLING, MentalAttributes.ANTICIPATION,
                                                MentalAttributes.CONCENTRATION, MentalAttributes.DECISIONS,
                                                MentalAttributes.POSITIONING,
                                                PhysicalAttributes.PACE));

                preferableAttributesMapping.put(
                                FieldPosition.DCL.name() + Role.CENTRAL_DEFENDER.name() + Duty.COVER.name(),
                                List.of(
                                                TechnicalAttributes.HEADING, MentalAttributes.BRAVERY,
                                                MentalAttributes.COMPOSURE,
                                                PhysicalAttributes.JUMPING_REACH, PhysicalAttributes.STRENGTH));

                // DCR CENTRAL DEFENDER COVER
                keyAttributesMapping.put(
                                FieldPosition.DCR.name() + Role.CENTRAL_DEFENDER.name() + Duty.COVER.name(),
                                List.of(
                                                TechnicalAttributes.MARKING,
                                                TechnicalAttributes.TACKLING, MentalAttributes.ANTICIPATION,
                                                MentalAttributes.CONCENTRATION, MentalAttributes.DECISIONS,
                                                MentalAttributes.POSITIONING,
                                                PhysicalAttributes.PACE));

                preferableAttributesMapping.put(
                                FieldPosition.DCR.name() + Role.CENTRAL_DEFENDER.name() + Duty.COVER.name(),
                                List.of(
                                                TechnicalAttributes.HEADING, MentalAttributes.BRAVERY,
                                                MentalAttributes.COMPOSURE,
                                                PhysicalAttributes.JUMPING_REACH, PhysicalAttributes.STRENGTH));

                // DC CENTRAL DEFENDER COVER
                keyAttributesMapping.put(
                                FieldPosition.DC.name() + Role.CENTRAL_DEFENDER.name() + Duty.COVER.name(),
                                List.of(
                                                TechnicalAttributes.MARKING,
                                                TechnicalAttributes.TACKLING, MentalAttributes.ANTICIPATION,
                                                MentalAttributes.CONCENTRATION, MentalAttributes.DECISIONS,
                                                MentalAttributes.POSITIONING,
                                                PhysicalAttributes.PACE));

                preferableAttributesMapping.put(
                                FieldPosition.DC.name() + Role.CENTRAL_DEFENDER.name() + Duty.COVER.name(),
                                List.of(
                                                TechnicalAttributes.HEADING, MentalAttributes.BRAVERY,
                                                MentalAttributes.COMPOSURE,
                                                PhysicalAttributes.JUMPING_REACH, PhysicalAttributes.STRENGTH));

                // DC LIBERO SUPPORT
                keyAttributesMapping.put(
                                FieldPosition.DC.name() + Role.LIBERO.name() + Duty.SUPPORT.name(),
                                List.of(
                                                TechnicalAttributes.FIRST_TOUCH, TechnicalAttributes.MARKING,
                                                TechnicalAttributes.PASSING,
                                                TechnicalAttributes.TACKLING, MentalAttributes.ANTICIPATION,
                                                MentalAttributes.COMPOSURE,
                                                MentalAttributes.CONCENTRATION, MentalAttributes.DECISIONS,
                                                MentalAttributes.POSITIONING, MentalAttributes.TEAMWORK,
                                                MentalAttributes.VISION,
                                                PhysicalAttributes.PACE));

                preferableAttributesMapping.put(
                                FieldPosition.DC.name() + Role.LIBERO.name() + Duty.SUPPORT.name(),
                                List.of(
                                                TechnicalAttributes.DRIBBLING, TechnicalAttributes.HEADING,
                                                TechnicalAttributes.TECHNIQUE, MentalAttributes.BRAVERY,
                                                MentalAttributes.FLAIR, PhysicalAttributes.AGILITY,
                                                PhysicalAttributes.BALANCE, PhysicalAttributes.JUMPING_REACH,
                                                PhysicalAttributes.STAMINA, PhysicalAttributes.STRENGTH));

                // DCL BALL PLAYING DEFENDER DEFEND
                keyAttributesMapping.put(
                                FieldPosition.DCL.name() + Role.BALL_PLAYING_DEFENDER.name() + Duty.DEFEND.name(),
                                List.of(
                                                TechnicalAttributes.HEADING, TechnicalAttributes.MARKING,
                                                TechnicalAttributes.PASSING,
                                                TechnicalAttributes.TACKLING, MentalAttributes.COMPOSURE,
                                                MentalAttributes.POSITIONING,
                                                PhysicalAttributes.JUMPING_REACH, PhysicalAttributes.STRENGTH));

                preferableAttributesMapping.put(
                                FieldPosition.DCL.name() + Role.BALL_PLAYING_DEFENDER.name() + Duty.DEFEND.name(),
                                List.of(
                                                TechnicalAttributes.FIRST_TOUCH, TechnicalAttributes.TECHNIQUE,
                                                MentalAttributes.AGGRESSION, MentalAttributes.ANTICIPATION,
                                                MentalAttributes.BRAVERY, MentalAttributes.CONCENTRATION,
                                                MentalAttributes.DECISIONS, MentalAttributes.VISION,
                                                PhysicalAttributes.PACE));

                // DCR BALL PLAYING DEFENDER DEFEND
                keyAttributesMapping.put(
                                FieldPosition.DCR.name() + Role.BALL_PLAYING_DEFENDER.name() + Duty.DEFEND.name(),
                                List.of(
                                                TechnicalAttributes.HEADING, TechnicalAttributes.MARKING,
                                                TechnicalAttributes.PASSING,
                                                TechnicalAttributes.TACKLING, MentalAttributes.COMPOSURE,
                                                MentalAttributes.POSITIONING,
                                                PhysicalAttributes.JUMPING_REACH, PhysicalAttributes.STRENGTH));

                preferableAttributesMapping.put(
                                FieldPosition.DCR.name() + Role.BALL_PLAYING_DEFENDER.name() + Duty.DEFEND.name(),
                                List.of(
                                                TechnicalAttributes.FIRST_TOUCH, TechnicalAttributes.TECHNIQUE,
                                                MentalAttributes.AGGRESSION, MentalAttributes.ANTICIPATION,
                                                MentalAttributes.BRAVERY, MentalAttributes.CONCENTRATION,
                                                MentalAttributes.DECISIONS, MentalAttributes.VISION,
                                                PhysicalAttributes.PACE));

                // DC BALL PLAYING DEFENDER DEFEND
                keyAttributesMapping.put(
                                FieldPosition.DC.name() + Role.BALL_PLAYING_DEFENDER.name() + Duty.DEFEND.name(),
                                List.of(
                                                TechnicalAttributes.HEADING, TechnicalAttributes.MARKING,
                                                TechnicalAttributes.PASSING,
                                                TechnicalAttributes.TACKLING, MentalAttributes.COMPOSURE,
                                                MentalAttributes.POSITIONING,
                                                PhysicalAttributes.JUMPING_REACH, PhysicalAttributes.STRENGTH));

                preferableAttributesMapping.put(
                                FieldPosition.DC.name() + Role.BALL_PLAYING_DEFENDER.name() + Duty.DEFEND.name(),
                                List.of(
                                                TechnicalAttributes.FIRST_TOUCH, TechnicalAttributes.TECHNIQUE,
                                                MentalAttributes.AGGRESSION, MentalAttributes.ANTICIPATION,
                                                MentalAttributes.BRAVERY, MentalAttributes.CONCENTRATION,
                                                MentalAttributes.DECISIONS, MentalAttributes.VISION,
                                                PhysicalAttributes.PACE));

                // DCL BALL PLAYING DEFENDER STOPPER
                keyAttributesMapping.put(
                                FieldPosition.DCL.name() + Role.BALL_PLAYING_DEFENDER.name() + Duty.STOPPER.name(),
                                List.of(
                                                TechnicalAttributes.HEADING,
                                                TechnicalAttributes.PASSING,
                                                TechnicalAttributes.TACKLING, MentalAttributes.AGGRESSION,
                                                MentalAttributes.BRAVERY, MentalAttributes.COMPOSURE,
                                                MentalAttributes.DECISIONS,
                                                MentalAttributes.POSITIONING,
                                                PhysicalAttributes.JUMPING_REACH, PhysicalAttributes.STRENGTH));

                preferableAttributesMapping.put(
                                FieldPosition.DCL.name() + Role.BALL_PLAYING_DEFENDER.name() + Duty.STOPPER.name(),
                                List.of(
                                                TechnicalAttributes.FIRST_TOUCH, TechnicalAttributes.MARKING,
                                                TechnicalAttributes.TECHNIQUE,
                                                MentalAttributes.ANTICIPATION,
                                                MentalAttributes.CONCENTRATION,
                                                MentalAttributes.VISION));

                // DCR BALL PLAYING DEFENDER STOPPER
                keyAttributesMapping.put(
                                FieldPosition.DCR.name() + Role.BALL_PLAYING_DEFENDER.name() + Duty.STOPPER.name(),
                                List.of(
                                                TechnicalAttributes.HEADING,
                                                TechnicalAttributes.PASSING,
                                                TechnicalAttributes.TACKLING, MentalAttributes.AGGRESSION,
                                                MentalAttributes.BRAVERY, MentalAttributes.COMPOSURE,
                                                MentalAttributes.DECISIONS,
                                                MentalAttributes.POSITIONING,
                                                PhysicalAttributes.JUMPING_REACH, PhysicalAttributes.STRENGTH));

                preferableAttributesMapping.put(
                                FieldPosition.DCR.name() + Role.BALL_PLAYING_DEFENDER.name() + Duty.STOPPER.name(),
                                List.of(
                                                TechnicalAttributes.FIRST_TOUCH, TechnicalAttributes.MARKING,
                                                TechnicalAttributes.TECHNIQUE,
                                                MentalAttributes.ANTICIPATION,
                                                MentalAttributes.CONCENTRATION,
                                                MentalAttributes.VISION));

                // DC BALL PLAYING DEFENDER STOPPER
                keyAttributesMapping.put(
                                FieldPosition.DC.name() + Role.BALL_PLAYING_DEFENDER.name() + Duty.STOPPER.name(),
                                List.of(
                                                TechnicalAttributes.HEADING,
                                                TechnicalAttributes.PASSING,
                                                TechnicalAttributes.TACKLING, MentalAttributes.AGGRESSION,
                                                MentalAttributes.BRAVERY, MentalAttributes.COMPOSURE,
                                                MentalAttributes.DECISIONS,
                                                MentalAttributes.POSITIONING,
                                                PhysicalAttributes.JUMPING_REACH, PhysicalAttributes.STRENGTH));

                preferableAttributesMapping.put(
                                FieldPosition.DC.name() + Role.BALL_PLAYING_DEFENDER.name() + Duty.STOPPER.name(),
                                List.of(
                                                TechnicalAttributes.FIRST_TOUCH, TechnicalAttributes.MARKING,
                                                TechnicalAttributes.TECHNIQUE,
                                                MentalAttributes.ANTICIPATION,
                                                MentalAttributes.CONCENTRATION,
                                                MentalAttributes.VISION));

                // DCL BALL PLAYING DEFENDER COVER
                keyAttributesMapping.put(
                                FieldPosition.DCL.name() + Role.BALL_PLAYING_DEFENDER.name() + Duty.COVER.name(),
                                List.of(
                                                TechnicalAttributes.MARKING,
                                                TechnicalAttributes.PASSING,
                                                TechnicalAttributes.TACKLING, MentalAttributes.ANTICIPATION,
                                                MentalAttributes.COMPOSURE, MentalAttributes.CONCENTRATION,
                                                MentalAttributes.DECISIONS,
                                                MentalAttributes.POSITIONING,
                                                PhysicalAttributes.PACE));

                preferableAttributesMapping.put(
                                FieldPosition.DCL.name() + Role.BALL_PLAYING_DEFENDER.name() + Duty.COVER.name(),
                                List.of(
                                                TechnicalAttributes.FIRST_TOUCH, TechnicalAttributes.HEADING,
                                                TechnicalAttributes.TECHNIQUE,
                                                MentalAttributes.BRAVERY,
                                                MentalAttributes.VISION, PhysicalAttributes.JUMPING_REACH,
                                                PhysicalAttributes.STRENGTH));

                // DCR BALL PLAYING DEFENDER COVER
                keyAttributesMapping.put(
                                FieldPosition.DCR.name() + Role.BALL_PLAYING_DEFENDER.name() + Duty.COVER.name(),
                                List.of(
                                                TechnicalAttributes.MARKING,
                                                TechnicalAttributes.PASSING,
                                                TechnicalAttributes.TACKLING, MentalAttributes.ANTICIPATION,
                                                MentalAttributes.COMPOSURE, MentalAttributes.CONCENTRATION,
                                                MentalAttributes.DECISIONS,
                                                MentalAttributes.POSITIONING,
                                                PhysicalAttributes.PACE));

                preferableAttributesMapping.put(
                                FieldPosition.DCR.name() + Role.BALL_PLAYING_DEFENDER.name() + Duty.COVER.name(),
                                List.of(
                                                TechnicalAttributes.FIRST_TOUCH, TechnicalAttributes.HEADING,
                                                TechnicalAttributes.TECHNIQUE,
                                                MentalAttributes.BRAVERY,
                                                MentalAttributes.VISION, PhysicalAttributes.JUMPING_REACH,
                                                PhysicalAttributes.STRENGTH));

                // DC BALL PLAYING DEFENDER COVER
                keyAttributesMapping.put(
                                FieldPosition.DC.name() + Role.BALL_PLAYING_DEFENDER.name() + Duty.COVER.name(),
                                List.of(
                                                TechnicalAttributes.MARKING,
                                                TechnicalAttributes.PASSING,
                                                TechnicalAttributes.TACKLING, MentalAttributes.ANTICIPATION,
                                                MentalAttributes.COMPOSURE, MentalAttributes.CONCENTRATION,
                                                MentalAttributes.DECISIONS,
                                                MentalAttributes.POSITIONING,
                                                PhysicalAttributes.PACE));

                preferableAttributesMapping.put(
                                FieldPosition.DC.name() + Role.BALL_PLAYING_DEFENDER.name() + Duty.COVER.name(),
                                List.of(
                                                TechnicalAttributes.FIRST_TOUCH, TechnicalAttributes.HEADING,
                                                TechnicalAttributes.TECHNIQUE,
                                                MentalAttributes.BRAVERY,
                                                MentalAttributes.VISION, PhysicalAttributes.JUMPING_REACH,
                                                PhysicalAttributes.STRENGTH));

                // DCL NO NONSENSE CENTRE BACK DEFEND
                keyAttributesMapping.put(
                                FieldPosition.DCL.name() + Role.NO_NONSENSE_CENTRE_BACK.name() + Duty.DEFEND.name(),
                                List.of(
                                                TechnicalAttributes.HEADING, TechnicalAttributes.MARKING,
                                                TechnicalAttributes.TACKLING, MentalAttributes.POSITIONING,
                                                PhysicalAttributes.JUMPING_REACH, PhysicalAttributes.STRENGTH));

                preferableAttributesMapping.put(
                                FieldPosition.DCL.name() + Role.NO_NONSENSE_CENTRE_BACK.name() + Duty.DEFEND.name(),
                                List.of(
                                                MentalAttributes.AGGRESSION, MentalAttributes.ANTICIPATION,
                                                MentalAttributes.BRAVERY,
                                                MentalAttributes.CONCENTRATION,
                                                PhysicalAttributes.PACE));

                // DCR NO NONSENSE CENTRE BACK DEFEND
                keyAttributesMapping.put(
                                FieldPosition.DCR.name() + Role.NO_NONSENSE_CENTRE_BACK.name() + Duty.DEFEND.name(),
                                List.of(
                                                TechnicalAttributes.HEADING, TechnicalAttributes.MARKING,
                                                TechnicalAttributes.TACKLING, MentalAttributes.POSITIONING,
                                                PhysicalAttributes.JUMPING_REACH, PhysicalAttributes.STRENGTH));

                preferableAttributesMapping.put(
                                FieldPosition.DCR.name() + Role.NO_NONSENSE_CENTRE_BACK.name() + Duty.DEFEND.name(),
                                List.of(
                                                MentalAttributes.AGGRESSION, MentalAttributes.ANTICIPATION,
                                                MentalAttributes.BRAVERY,
                                                MentalAttributes.CONCENTRATION,
                                                PhysicalAttributes.PACE));

                // DC NO NONSENSE CENTRE BACK DEFEND
                keyAttributesMapping.put(
                                FieldPosition.DC.name() + Role.NO_NONSENSE_CENTRE_BACK.name() + Duty.DEFEND.name(),
                                List.of(
                                                TechnicalAttributes.HEADING, TechnicalAttributes.MARKING,
                                                TechnicalAttributes.TACKLING, MentalAttributes.POSITIONING,
                                                PhysicalAttributes.JUMPING_REACH, PhysicalAttributes.STRENGTH));

                preferableAttributesMapping.put(
                                FieldPosition.DC.name() + Role.NO_NONSENSE_CENTRE_BACK.name() + Duty.DEFEND.name(),
                                List.of(
                                                MentalAttributes.AGGRESSION, MentalAttributes.ANTICIPATION,
                                                MentalAttributes.BRAVERY,
                                                MentalAttributes.CONCENTRATION,
                                                PhysicalAttributes.PACE));

                // DCL NO NONSENSE CENTRE BACK STOPPER
                keyAttributesMapping.put(
                                FieldPosition.DCL.name() + Role.NO_NONSENSE_CENTRE_BACK.name() + Duty.STOPPER.name(),
                                List.of(
                                                TechnicalAttributes.HEADING, TechnicalAttributes.TACKLING,
                                                MentalAttributes.AGGRESSION, MentalAttributes.BRAVERY,
                                                MentalAttributes.POSITIONING,
                                                PhysicalAttributes.JUMPING_REACH, PhysicalAttributes.STRENGTH));

                preferableAttributesMapping.put(
                                FieldPosition.DCL.name() + Role.NO_NONSENSE_CENTRE_BACK.name() + Duty.STOPPER.name(),
                                List.of(
                                                TechnicalAttributes.MARKING, MentalAttributes.ANTICIPATION,
                                                MentalAttributes.CONCENTRATION));

                // DCR NO NONSENSE CENTRE BACK STOPPER
                keyAttributesMapping.put(
                                FieldPosition.DCR.name() + Role.NO_NONSENSE_CENTRE_BACK.name() + Duty.STOPPER.name(),
                                List.of(
                                                TechnicalAttributes.HEADING, TechnicalAttributes.TACKLING,
                                                MentalAttributes.AGGRESSION, MentalAttributes.BRAVERY,
                                                MentalAttributes.POSITIONING,
                                                PhysicalAttributes.JUMPING_REACH, PhysicalAttributes.STRENGTH));

                preferableAttributesMapping.put(
                                FieldPosition.DCR.name() + Role.NO_NONSENSE_CENTRE_BACK.name() + Duty.STOPPER.name(),
                                List.of(
                                                TechnicalAttributes.MARKING, MentalAttributes.ANTICIPATION,
                                                MentalAttributes.CONCENTRATION));

                // DC NO NONSENSE CENTRE BACK STOPPER
                keyAttributesMapping.put(
                                FieldPosition.DC.name() + Role.NO_NONSENSE_CENTRE_BACK.name() + Duty.STOPPER.name(),
                                List.of(
                                                TechnicalAttributes.HEADING, TechnicalAttributes.TACKLING,
                                                MentalAttributes.AGGRESSION, MentalAttributes.BRAVERY,
                                                MentalAttributes.POSITIONING,
                                                PhysicalAttributes.JUMPING_REACH, PhysicalAttributes.STRENGTH));

                preferableAttributesMapping.put(
                                FieldPosition.DC.name() + Role.NO_NONSENSE_CENTRE_BACK.name() + Duty.STOPPER.name(),
                                List.of(
                                                TechnicalAttributes.MARKING, MentalAttributes.ANTICIPATION,
                                                MentalAttributes.CONCENTRATION));

                // DCL NO NONSENSE CENTRE BACK COVER
                keyAttributesMapping.put(
                                FieldPosition.DCL.name() + Role.NO_NONSENSE_CENTRE_BACK.name() + Duty.COVER.name(),
                                List.of(
                                                TechnicalAttributes.MARKING, TechnicalAttributes.TACKLING,
                                                MentalAttributes.ANTICIPATION, MentalAttributes.CONCENTRATION,
                                                MentalAttributes.POSITIONING,
                                                PhysicalAttributes.PACE));

                preferableAttributesMapping.put(
                                FieldPosition.DCL.name() + Role.NO_NONSENSE_CENTRE_BACK.name() + Duty.COVER.name(),
                                List.of(
                                                TechnicalAttributes.HEADING, MentalAttributes.BRAVERY,
                                                PhysicalAttributes.JUMPING_REACH, PhysicalAttributes.STRENGTH));

                // DCR NO NONSENSE CENTRE BACK COVER
                keyAttributesMapping.put(
                                FieldPosition.DCR.name() + Role.NO_NONSENSE_CENTRE_BACK.name() + Duty.COVER.name(),
                                List.of(
                                                TechnicalAttributes.MARKING, TechnicalAttributes.TACKLING,
                                                MentalAttributes.ANTICIPATION, MentalAttributes.CONCENTRATION,
                                                MentalAttributes.POSITIONING,
                                                PhysicalAttributes.PACE));

                preferableAttributesMapping.put(
                                FieldPosition.DCR.name() + Role.NO_NONSENSE_CENTRE_BACK.name() + Duty.COVER.name(),
                                List.of(
                                                TechnicalAttributes.HEADING, MentalAttributes.BRAVERY,
                                                PhysicalAttributes.JUMPING_REACH, PhysicalAttributes.STRENGTH));

                // DC NO NONSENSE CENTRE BACK COVER
                keyAttributesMapping.put(
                                FieldPosition.DC.name() + Role.NO_NONSENSE_CENTRE_BACK.name() + Duty.COVER.name(),
                                List.of(
                                                TechnicalAttributes.MARKING, TechnicalAttributes.TACKLING,
                                                MentalAttributes.ANTICIPATION, MentalAttributes.CONCENTRATION,
                                                MentalAttributes.POSITIONING,
                                                PhysicalAttributes.PACE));

                preferableAttributesMapping.put(
                                FieldPosition.DC.name() + Role.NO_NONSENSE_CENTRE_BACK.name() + Duty.COVER.name(),
                                List.of(
                                                TechnicalAttributes.HEADING, MentalAttributes.BRAVERY,
                                                PhysicalAttributes.JUMPING_REACH, PhysicalAttributes.STRENGTH));

                // DCL WIDE CENTRE BACK DEFEND
                keyAttributesMapping.put(
                                FieldPosition.DCL.name() + Role.WIDE_CENTRE_BACK.name() + Duty.DEFEND.name(),
                                List.of(
                                                TechnicalAttributes.CROSSING, TechnicalAttributes.HEADING,
                                                TechnicalAttributes.MARKING, TechnicalAttributes.TACKLING,
                                                MentalAttributes.POSITIONING, PhysicalAttributes.JUMPING_REACH,
                                                PhysicalAttributes.STAMINA, PhysicalAttributes.STRENGTH));

                preferableAttributesMapping.put(
                                FieldPosition.DCL.name() + Role.WIDE_CENTRE_BACK.name() + Duty.DEFEND.name(),
                                List.of(
                                                TechnicalAttributes.DRIBBLING, MentalAttributes.AGGRESSION,
                                                MentalAttributes.ANTICIPATION, MentalAttributes.BRAVERY,
                                                MentalAttributes.COMPOSURE, MentalAttributes.CONCENTRATION,
                                                MentalAttributes.DECISIONS, MentalAttributes.WORK_RATE,
                                                PhysicalAttributes.PACE));

                // DCR WIDE CENTRE BACK DEFEND
                keyAttributesMapping.put(
                                FieldPosition.DCR.name() + Role.WIDE_CENTRE_BACK.name() + Duty.DEFEND.name(),
                                List.of(
                                                TechnicalAttributes.CROSSING, TechnicalAttributes.HEADING,
                                                TechnicalAttributes.MARKING, TechnicalAttributes.TACKLING,
                                                MentalAttributes.POSITIONING, PhysicalAttributes.JUMPING_REACH,
                                                PhysicalAttributes.STAMINA, PhysicalAttributes.STRENGTH));

                preferableAttributesMapping.put(
                                FieldPosition.DCR.name() + Role.WIDE_CENTRE_BACK.name() + Duty.DEFEND.name(),
                                List.of(
                                                TechnicalAttributes.DRIBBLING, MentalAttributes.AGGRESSION,
                                                MentalAttributes.ANTICIPATION, MentalAttributes.BRAVERY,
                                                MentalAttributes.COMPOSURE, MentalAttributes.CONCENTRATION,
                                                MentalAttributes.DECISIONS, MentalAttributes.WORK_RATE,
                                                PhysicalAttributes.PACE));

                // DCL WIDE CENTRE BACK SUPPORT
                keyAttributesMapping.put(
                                FieldPosition.DCL.name() + Role.WIDE_CENTRE_BACK.name() + Duty.SUPPORT.name(),
                                List.of(
                                                TechnicalAttributes.CROSSING, TechnicalAttributes.DRIBBLING,
                                                TechnicalAttributes.HEADING,
                                                TechnicalAttributes.MARKING, TechnicalAttributes.TACKLING,
                                                MentalAttributes.POSITIONING, PhysicalAttributes.JUMPING_REACH,
                                                PhysicalAttributes.PACE, PhysicalAttributes.STAMINA,
                                                PhysicalAttributes.STRENGTH));

                preferableAttributesMapping.put(
                                FieldPosition.DCL.name() + Role.WIDE_CENTRE_BACK.name() + Duty.SUPPORT.name(),
                                List.of(
                                                MentalAttributes.AGGRESSION,
                                                MentalAttributes.ANTICIPATION, MentalAttributes.BRAVERY,
                                                MentalAttributes.COMPOSURE, MentalAttributes.CONCENTRATION,
                                                MentalAttributes.DECISIONS, MentalAttributes.OFF_THE_BALL,
                                                MentalAttributes.WORK_RATE));

                // DCR WIDE CENTRE BACK SUPPORT
                keyAttributesMapping.put(
                                FieldPosition.DCR.name() + Role.WIDE_CENTRE_BACK.name() + Duty.SUPPORT.name(),
                                List.of(
                                                TechnicalAttributes.CROSSING, TechnicalAttributes.DRIBBLING,
                                                TechnicalAttributes.HEADING,
                                                TechnicalAttributes.MARKING, TechnicalAttributes.TACKLING,
                                                MentalAttributes.POSITIONING, PhysicalAttributes.JUMPING_REACH,
                                                PhysicalAttributes.PACE, PhysicalAttributes.STAMINA,
                                                PhysicalAttributes.STRENGTH));

                preferableAttributesMapping.put(
                                FieldPosition.DCR.name() + Role.WIDE_CENTRE_BACK.name() + Duty.SUPPORT.name(),
                                List.of(
                                                MentalAttributes.AGGRESSION,
                                                MentalAttributes.ANTICIPATION, MentalAttributes.BRAVERY,
                                                MentalAttributes.COMPOSURE, MentalAttributes.CONCENTRATION,
                                                MentalAttributes.DECISIONS, MentalAttributes.OFF_THE_BALL,
                                                MentalAttributes.WORK_RATE));

                // DCL WIDE CENTRE BACK ATTACK
                keyAttributesMapping.put(
                                FieldPosition.DCL.name() + Role.WIDE_CENTRE_BACK.name() + Duty.ATTACK.name(),
                                List.of(
                                                TechnicalAttributes.CROSSING, TechnicalAttributes.DRIBBLING,
                                                TechnicalAttributes.HEADING,
                                                TechnicalAttributes.MARKING, TechnicalAttributes.TACKLING,
                                                MentalAttributes.OFF_THE_BALL, PhysicalAttributes.JUMPING_REACH,
                                                PhysicalAttributes.PACE, PhysicalAttributes.STAMINA,
                                                PhysicalAttributes.STRENGTH));

                preferableAttributesMapping.put(
                                FieldPosition.DCL.name() + Role.WIDE_CENTRE_BACK.name() + Duty.ATTACK.name(),
                                List.of(
                                                MentalAttributes.AGGRESSION,
                                                MentalAttributes.ANTICIPATION, MentalAttributes.BRAVERY,
                                                MentalAttributes.COMPOSURE, MentalAttributes.CONCENTRATION,
                                                MentalAttributes.DECISIONS, MentalAttributes.POSITIONING,
                                                MentalAttributes.WORK_RATE));

                // DCR WIDE CENTRE BACK ATTACK
                keyAttributesMapping.put(
                                FieldPosition.DCR.name() + Role.WIDE_CENTRE_BACK.name() + Duty.ATTACK.name(),
                                List.of(
                                                TechnicalAttributes.CROSSING, TechnicalAttributes.DRIBBLING,
                                                TechnicalAttributes.HEADING,
                                                TechnicalAttributes.MARKING, TechnicalAttributes.TACKLING,
                                                MentalAttributes.OFF_THE_BALL, PhysicalAttributes.JUMPING_REACH,
                                                PhysicalAttributes.PACE, PhysicalAttributes.STAMINA,
                                                PhysicalAttributes.STRENGTH));

                preferableAttributesMapping.put(
                                FieldPosition.DCR.name() + Role.WIDE_CENTRE_BACK.name() + Duty.ATTACK.name(),
                                List.of(
                                                MentalAttributes.AGGRESSION,
                                                MentalAttributes.ANTICIPATION, MentalAttributes.BRAVERY,
                                                MentalAttributes.COMPOSURE, MentalAttributes.CONCENTRATION,
                                                MentalAttributes.DECISIONS, MentalAttributes.POSITIONING,
                                                MentalAttributes.WORK_RATE));
        }
}
