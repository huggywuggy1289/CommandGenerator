package com.command_generator.service;

import com.command_generator.dto.EnchantmentRequest;
import com.command_generator.dto.MonsterRequest;
import org.springframework.stereotype.Service;

@Service
public class CommandGenerator {

    public String generate(EnchantmentRequest request) {
        StringBuilder enchantments = new StringBuilder();

        // 0이 아닌 값만 추가하도록 조건 처리
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

        // 마지막 ',' 제거
        if (enchantments.length() > 0) {
            enchantments.deleteCharAt(enchantments.length() - 1); // 끝의 쉼표 제거
        }

        // 최종 명령어 문자열 생성 (형식 수정)
        return String.format("/give @p diamond_sword[enchantments={levels:{%s}}]", enchantments.toString());
    }

    // 몬스터 죽이는 명령어 생성
    public String generateMonsterCommand(MonsterRequest monsterRequest) {
        StringBuilder monsters = new StringBuilder();

        if (monsterRequest.getZombie() != null && monsterRequest.getZombie() > 0) {
            monsters.append("minecraft:zombie,");
        }
        if (monsterRequest.getSkeleton() != null && monsterRequest.getSkeleton() > 0) {
            monsters.append("minecraft:skeleton,");
        }
        if (monsterRequest.getCreeper() != null && monsterRequest.getCreeper() > 0) {
            monsters.append("minecraft:creeper,");
        }
        if (monsterRequest.getSpider() != null && monsterRequest.getSpider() > 0) {
            monsters.append("minecraft:spider,");
        }
        if (monsterRequest.getVindicator() != null && monsterRequest.getVindicator() > 0) {
            monsters.append("minecraft:vindicator,");
        }
        if (monsterRequest.getPillager() != null && monsterRequest.getPillager() > 0) {
            monsters.append("minecraft:pillager,");
        }

        // 마지막 ',' 제거
        if (monsters.length() > 0) {
            monsters.deleteCharAt(monsters.length() - 1); // 끝의 쉼표 제거
        }

        // 몬스터 이름이 추가된 명령어 생성
        return String.format("/kill @e[type=%s]", monsters.toString());
    }

}


