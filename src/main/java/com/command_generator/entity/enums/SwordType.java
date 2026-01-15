package com.command_generator.entity.enums;

public enum SwordType {
    WOODEN_SWORD("minecraft:wooden_sword"),
    STONE_SWORD("minecraft:stone_sword"),
    IRON_SWORD("minecraft:iron_sword"),
    GOLDEN_SWORD("minecraft:golden_sword"),
    DIAMOND_SWORD("minecraft:diamond_sword"),
    NETHERITE_SWORD("minecraft:netherite_sword");

    private final String minecraftId;

    SwordType(String minecraftId) {
        this.minecraftId = minecraftId;
    }

    public String getMinecraftId() {
        return minecraftId;
    }
}
