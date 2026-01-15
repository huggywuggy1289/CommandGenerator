package com.command_generator.entity.enums;

public enum MonsterType {

    ZOMBIE("minecraft:zombie"),
    SKELETON("minecraft:skeleton"),
    CREEPER("minecraft:creeper"),
    SPIDER("minecraft:spider"),
    VINDICATOR("minecraft:vindicator"),
    PILLAGER("minecraft:pillager"),
    ITEM("minecraft:item");

    private final String minecraftId;

    MonsterType(String minecraftId) {
        this.minecraftId = minecraftId;
    }

    public String getMinecraftId() {
        return minecraftId;
    }
}
