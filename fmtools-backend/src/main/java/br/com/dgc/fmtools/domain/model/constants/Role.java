package br.com.dgc.fmtools.domain.model.constants;

import java.util.List;

public enum Role {
        GOALKEEPER(List.of(FieldPosition.GK)),
        SWEEPER_KEEPER(List.of(FieldPosition.GK)),
        FULL_BACK(List.of(FieldPosition.DL, FieldPosition.DR)),
        WING_BACK(List.of(FieldPosition.DL, FieldPosition.DR, FieldPosition.WBL, FieldPosition.WBR)),
        NO_NONSENSE_FULL_BACK(List.of(FieldPosition.DL, FieldPosition.DR)),
        COMPLETE_WING_BACK(List.of(FieldPosition.DL, FieldPosition.DR, FieldPosition.WBL, FieldPosition.WBR)),
        INVERTED_WING_BACK(List.of(FieldPosition.DL, FieldPosition.DR, FieldPosition.WBL, FieldPosition.WBR)),
        CENTRAL_DEFENDER(List.of(FieldPosition.DC, FieldPosition.DCL, FieldPosition.DCR)),
        LIBERO(List.of(FieldPosition.DC)),
        BALL_PLAYING_DEFENDER(List.of(FieldPosition.DC, FieldPosition.DCL, FieldPosition.DCR)),
        NO_NONSENSE_CENTRE_BACK(List.of(FieldPosition.DC, FieldPosition.DCL, FieldPosition.DCR)),
        WIDE_CENTRE_BACK(List.of(FieldPosition.DCL, FieldPosition.DCR)),
        DEFENSIVE_MIDFIELDER(List.of(FieldPosition.DM, FieldPosition.DMCL, FieldPosition.DMCR)),
        DEEP_LYING_PLAYMAKER(List.of(FieldPosition.DM, FieldPosition.DMCL, FieldPosition.DMCR, FieldPosition.MCL,
                        FieldPosition.MC, FieldPosition.MCR)),
        BALL_WINNING_MIDFIELDER(List.of(FieldPosition.DM, FieldPosition.DMCL, FieldPosition.DMCR, FieldPosition.MCL,
                        FieldPosition.MC, FieldPosition.MCR)),
        ANCHOR(List.of(FieldPosition.DM, FieldPosition.DMCL, FieldPosition.DMCR)),
        HALF_BACK(List.of(FieldPosition.DM, FieldPosition.DMCL, FieldPosition.DMCR)),
        REGISTA(List.of(FieldPosition.DM, FieldPosition.DMCL, FieldPosition.DMCR)),
        ROAMING_PLAYMAKER(List.of(FieldPosition.DM, FieldPosition.DMCL, FieldPosition.DMCR, FieldPosition.MCL,
                        FieldPosition.MC, FieldPosition.MCR)),
        SEGUNDO_VOLANTE(List.of(FieldPosition.DMCL, FieldPosition.DMCR)),
        WIDE_MIDFIELDER(List.of(FieldPosition.ML, FieldPosition.MR)),
        WINGER(List.of(FieldPosition.ML, FieldPosition.MR, FieldPosition.AML, FieldPosition.AMR)),
        DEFENSIVE_WINGER(List.of(FieldPosition.ML, FieldPosition.MR)),
        WIDE_PLAYMAKER(List.of(FieldPosition.ML, FieldPosition.MR)),
        INVERTED_WINGER(List.of(FieldPosition.ML, FieldPosition.MR, FieldPosition.AML, FieldPosition.AMR)),
        CENTRAL_MIDFIELDER(List.of(FieldPosition.MCL, FieldPosition.MC, FieldPosition.MCR)),
        BOX_TO_BOX_MIDFIELDER(List.of(FieldPosition.MCL, FieldPosition.MC, FieldPosition.MCR)),
        ADVANCED_PLAYMAKER(List.of(FieldPosition.MCL, FieldPosition.MC, FieldPosition.MCR, FieldPosition.AML,
                        FieldPosition.AMCL, FieldPosition.AMC, FieldPosition.AMCR, FieldPosition.AMR)),
        MEZZALA(List.of(FieldPosition.MCL, FieldPosition.MCR)),
        CARRILERO(List.of(FieldPosition.MCL, FieldPosition.MCR)),
        INSIDE_FORWARD(List.of(FieldPosition.AML, FieldPosition.AMR)),
        TREQUARTISTA(
                        List.of(FieldPosition.AML, FieldPosition.AMCL, FieldPosition.AMC, FieldPosition.AMCR,
                                        FieldPosition.AMR,
                                        FieldPosition.STCL, FieldPosition.STC, FieldPosition.STCR)),
        WIDE_TARGET_FORWARD(List.of(FieldPosition.AML, FieldPosition.AMR)),
        RAUMDEUTER(List.of(FieldPosition.AML, FieldPosition.AMR)),
        ATTACKING_MIDFIELDER(List.of(FieldPosition.AMCL, FieldPosition.AMC, FieldPosition.AMCR)),
        ENGANCHE(List.of(FieldPosition.AMCL, FieldPosition.AMC, FieldPosition.AMCR)),
        SHADOW_STRIKER(List.of(FieldPosition.AMCL, FieldPosition.AMC, FieldPosition.AMCR)),
        DEEP_LYING_FORWARD(List.of(FieldPosition.STCL, FieldPosition.STC, FieldPosition.STCR)),
        ADVANCED_FORWARD(List.of(FieldPosition.STCL, FieldPosition.STC, FieldPosition.STCR)),
        TARGET_FORWARD(List.of(FieldPosition.STCL, FieldPosition.STC, FieldPosition.STCR)),
        POACHER(List.of(FieldPosition.STCL, FieldPosition.STC, FieldPosition.STCR)),
        COMPLETE_FORWARD(List.of(FieldPosition.STCL, FieldPosition.STC, FieldPosition.STCR)),
        PRESSING_FORWARD(List.of(FieldPosition.STCL, FieldPosition.STC, FieldPosition.STCR)),
        FALSE_NINE(List.of(FieldPosition.STCL, FieldPosition.STC, FieldPosition.STCR));

        private List<FieldPosition> validPositions;

        Role(List<FieldPosition> validPositions) {
                this.validPositions = validPositions;
        }

        public List<FieldPosition> getValidPositions() {
                return validPositions;
        }
}
