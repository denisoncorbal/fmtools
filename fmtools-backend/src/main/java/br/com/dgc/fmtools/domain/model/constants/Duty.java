package br.com.dgc.fmtools.domain.model.constants;

import java.util.List;

public enum Duty {
        SUPPORT(List.of(
                        Role.SWEEPER_KEEPER, Role.FULL_BACK, Role.WING_BACK, Role.COMPLETE_WING_BACK,
                        Role.INVERTED_WING_BACK,
                        Role.LIBERO, Role.WIDE_CENTRE_BACK, Role.DEFENSIVE_MIDFIELDER, Role.DEEP_LYING_PLAYMAKER,
                        Role.BALL_WINNING_MIDFIELDER, Role.REGISTA, Role.ROAMING_PLAYMAKER, Role.SEGUNDO_VOLANTE,
                        Role.WIDE_MIDFIELDER, Role.WINGER, Role.DEFENSIVE_WINGER, Role.WIDE_PLAYMAKER,
                        Role.INVERTED_WINGER, Role.CENTRAL_MIDFIELDER, Role.BOX_TO_BOX_MIDFIELDER,
                        Role.ADVANCED_PLAYMAKER, Role.MEZZALA, Role.CARRILERO, Role.INSIDE_FORWARD,
                        Role.WIDE_TARGET_FORWARD,
                        Role.ATTACKING_MIDFIELDER, Role.ENGANCHE, Role.DEEP_LYING_FORWARD, Role.TARGET_FORWARD,
                        Role.COMPLETE_FORWARD, Role.PRESSING_FORWARD, Role.FALSE_NINE)),
        ATTACK(List.of(
                        Role.SWEEPER_KEEPER, Role.FULL_BACK, Role.WING_BACK, Role.COMPLETE_WING_BACK,
                        Role.INVERTED_WING_BACK,
                        Role.LIBERO, Role.WIDE_CENTRE_BACK, Role.WIDE_MIDFIELDER, Role.WINGER, Role.WIDE_PLAYMAKER,
                        Role.INVERTED_WINGER, Role.CENTRAL_MIDFIELDER, Role.ADVANCED_PLAYMAKER, Role.MEZZALA,
                        Role.INSIDE_FORWARD, Role.TREQUARTISTA, Role.WIDE_TARGET_FORWARD, Role.RAUMDEUTER,
                        Role.ATTACKING_MIDFIELDER, Role.SHADOW_STRIKER, Role.DEEP_LYING_FORWARD, Role.ADVANCED_FORWARD,
                        Role.TARGET_FORWARD, Role.POACHER, Role.COMPLETE_FORWARD, Role.PRESSING_FORWARD)),
        COVER(List.of(
                        Role.CENTRAL_DEFENDER, Role.BALL_PLAYING_DEFENDER, Role.NO_NONSENSE_CENTRE_BACK)),
        DEFEND(List.of(
                        Role.GOALKEEPER, Role.SWEEPER_KEEPER,
                        Role.FULL_BACK, Role.WING_BACK, Role.NO_NONSENSE_FULL_BACK, Role.INVERTED_WING_BACK,
                        Role.CENTRAL_DEFENDER, Role.BALL_PLAYING_DEFENDER, Role.NO_NONSENSE_CENTRE_BACK,
                        Role.WIDE_CENTRE_BACK, Role.DEFENSIVE_MIDFIELDER, Role.DEEP_LYING_PLAYMAKER,
                        Role.BALL_WINNING_MIDFIELDER, Role.ANCHOR, Role.HALF_BACK,
                        Role.WIDE_MIDFIELDER, Role.DEFENSIVE_WINGER, Role.CENTRAL_MIDFIELDER, Role.PRESSING_FORWARD)),
        STOPPER(List.of(
                        Role.CENTRAL_DEFENDER, Role.BALL_PLAYING_DEFENDER, Role.NO_NONSENSE_CENTRE_BACK)),
        AUTOMATIC(List.of(
                        Role.FULL_BACK, Role.WING_BACK, Role.INVERTED_WING_BACK, Role.WIDE_MIDFIELDER,
                        Role.CENTRAL_MIDFIELDER));

        private List<Role> validRoles;

        Duty(List<Role> validRoles) {
                this.validRoles = validRoles;
        }

        public List<Role> getValidRoles() {
                return validRoles;
        }
}
