package com.command_generator.service;

import com.command_generator.dto.EnchantmentRequest;
import com.command_generator.dto.MonsterRequest;
import com.command_generator.dto.SwordRequest;
import com.command_generator.entity.enums.MonsterType;
import com.command_generator.entity.enums.SwordType;
import com.fasterxml.jackson.databind.SequenceWriter;
import org.springframework.stereotype.Service;

@Service
public class CommandGenerator {

    public String generate(EnchantmentRequest request) {
        StringBuilder enchantments = new StringBuilder();

        SwordType swordType = request.getSwordType();
        if (swordType == null) {
            swordType = SwordType.DIAMOND_SWORD;
        }

        // 1.20.5+ 방식: "minecraft:인챈트ID":레벨 형식으로 구성
        if (request.getSharpness() != null && request.getSharpness() > 0) {
            enchantments.append("\"minecraft:sharpness\":").append(request.getSharpness()).append(",");
        }
        if (request.getSmite() != null && request.getSmite() > 0) {
            enchantments.append("\"minecraft:smite\":").append(request.getSmite()).append(",");
        }
        if (request.getBaneOfArthropods() != null && request.getBaneOfArthropods() > 0) {
            enchantments.append("\"minecraft:bane_of_arthropods\":").append(request.getBaneOfArthropods()).append(",");
        }
        if (request.getKnockback() != null && request.getKnockback() > 0) {
            enchantments.append("\"minecraft:knockback\":").append(request.getKnockback()).append(",");
        }
        if (request.getFireAspect() != null && request.getFireAspect() > 0) {
            enchantments.append("\"minecraft:fire_aspect\":").append(request.getFireAspect()).append(",");
        }
        if (request.getLooting() != null && request.getLooting() > 0) {
            enchantments.append("\"minecraft:looting\":").append(request.getLooting()).append(",");
        }
        if (request.getSweepingEdge() != null && request.getSweepingEdge() > 0) {
            enchantments.append("\"minecraft:sweeping_edge\":").append(request.getSweepingEdge()).append(",");
        }
        if (request.getUnbreaking() != null && request.getUnbreaking() > 0) {
            enchantments.append("\"minecraft:unbreaking\":").append(request.getUnbreaking()).append(",");
        }

        if (enchantments.length() > 0) {
            enchantments.deleteCharAt(enchantments.length() - 1); // 마지막 쉼표 제거
        }

        return String.format("/give @p " + swordType.getMinecraftId() + "[enchantments={%s}]", enchantments.toString());
    }

    // 몬스터 죽이는 명령어 생성
    public String generateMonsterCommand(MonsterRequest monsterRequest) {

        MonsterType type = monsterRequest.getMonsterType();
        if (type == null) {
            return "몬스터를 선택하세요.";
        }
        return "/kill @e[type=" + type.getMinecraftId() + "]";
    }

}


