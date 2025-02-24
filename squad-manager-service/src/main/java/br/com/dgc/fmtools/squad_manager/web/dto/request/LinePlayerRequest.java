package br.com.dgc.fmtools.squad_manager.web.dto.request;

import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

public record LinePlayerRequest(
    @NotEmpty @NotBlank @Size(min = 3, max = 50) String name,
    @NotNull @Min(1) @Max(20) int aggression,
    @NotNull @Min(1) @Max(20) int anticipation,
    @NotNull @Min(1) @Max(20) int bravery,
    @NotNull @Min(1) @Max(20) int composure,
    @NotNull @Min(1) @Max(20) int concentration,
    @NotNull @Min(1) @Max(20) int decisions,
    @NotNull @Min(1) @Max(20) int determination,
    @NotNull @Min(1) @Max(20) int flair,
    @NotNull @Min(1) @Max(20) int leadership,
    @NotNull @Min(1) @Max(20) int offTheBall,
    @NotNull @Min(1) @Max(20) int positioning,
    @NotNull @Min(1) @Max(20) int teamwork,
    @NotNull @Min(1) @Max(20) int vision,
    @NotNull @Min(1) @Max(20) int workRate,
    @NotNull @Min(1) @Max(20) int acceleration,
    @NotNull @Min(1) @Max(20) int agility,
    @NotNull @Min(1) @Max(20) int balance,
    @NotNull @Min(1) @Max(20) int jumpingReach,
    @NotNull @Min(1) @Max(20) int naturalFitness,
    @NotNull @Min(1) @Max(20) int pace,
    @NotNull @Min(1) @Max(20) int stamina,
    @NotNull @Min(1) @Max(20) int strength,
    @NotNull @Min(1) @Max(20) int freeKickTaking,
    @NotNull @Min(1) @Max(20) int penaltyTaking,
    @NotNull @Min(1) @Max(20) int technique,
    @NotNull @Min(1) @Max(20) int firstTouch,
    @NotNull @Min(1) @Max(20) int passing,
    @NotNull @Min(1) @Max(20) int corners,
    @NotNull @Min(1) @Max(20) int crossing,
    @NotNull @Min(1) @Max(20) int dribbling,
    @NotNull @Min(1) @Max(20) int finishing,
    @NotNull @Min(1) @Max(20) int heading,
    @NotNull @Min(1) @Max(20) int longShots,
    @NotNull @Min(1) @Max(20) int longThrows,
    @NotNull @Min(1) @Max(20) int marking,
    @NotNull @Min(1) @Max(20) int tackling) {}
