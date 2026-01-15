package com.command_generator.dto;

import com.command_generator.entity.enums.MonsterType;

public class MonsterRequest {
    private MonsterType monsterType;

    public MonsterType getMonsterType() {
        return monsterType;
    }

    public void setMonsterType(MonsterType monsterType) {
        this.monsterType = monsterType;
    }
}