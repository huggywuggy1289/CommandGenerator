package com.command_generator.dto;

import com.command_generator.entity.enums.SwordType;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

// 날카로움 sharpness
// 강타 smite
// 살충 bane_of_arthropods
// 밀치기 knockback
// 발화 fire_aspect
// 약탈 looting
// 휩쓸기 sweeping_edge
// 내구성 unbreaking
@Getter
@Setter
@NoArgsConstructor //스프링 form 바인딩(@ModelAttribute) 때문에 필수
public class EnchantmentRequest {

    private SwordType swordType;

    private Integer sharpness;
    private Integer smite;
    private Integer baneOfArthropods;
    private Integer knockback;
    private Integer fireAspect;
    private Integer looting;
    private Integer sweepingEdge;
    private Integer unbreaking;
}
