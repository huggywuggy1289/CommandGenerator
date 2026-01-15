package com.command_generator.dto;

import com.command_generator.entity.enums.MonsterType;
import com.command_generator.entity.enums.SwordType;

public class SwordRequest {
    private SwordType swordType;

    public SwordType getSwordType() {
        return swordType;
    }

    public void setSwordType(SwordType swordType) {
        this.swordType = swordType;
    }
}
