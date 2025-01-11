package com.command_generator.dto;

// 날카로움 sharpness
// 강타 smite
// 살충 bane_of_arthropods
// 밀치기 knockback
// 발화 fire_aspect
// 약탈 looting
// 휩쓸기 sweeping_edge
// 내구성 unbreaking
public class EnchantmentRequest {
    private Integer sharpness;
    private Integer smite;
    private Integer baneOfArthropods;
    private Integer knockback;
    private Integer fireAspect;
    private Integer looting;
    private Integer sweepingEdge;
    private Integer unbreaking;

    // 날카로움
    public Integer getSharpness(){
        return sharpness;
    }
    public void setSharpness(Integer sharpness){
        this.sharpness = sharpness;
    }
    // 강타
    public Integer getSmite(){
        return smite;
    }
    public void setSmite(Integer smite){
        this.smite = smite;
    }
    // 살충
    public Integer getBaneOfArthropods() { return baneOfArthropods; }
    public void setBaneOfArthropods(Integer baneOfArthropods) { this.baneOfArthropods = baneOfArthropods; }
    // 밀치기
    public Integer getKnockback() { return knockback; }
    public void setKnockback(Integer knockback) { this.knockback = knockback; }
    // 발화
    public Integer getFireAspect() { return fireAspect; }
    public void setFireAspect(Integer fireAspect) { this.fireAspect = fireAspect; }
    // 약탈
    public Integer getLooting() { return looting; }
    public void setLooting(Integer looting) { this.looting = looting; }
    // 휩쓸기 
    public Integer getSweepingEdge() { return sweepingEdge; }
    public void setSweepingEdge(Integer sweepingEdge) { this.sweepingEdge = sweepingEdge; }
    // 내구성
    public Integer getUnbreaking() { return unbreaking; }
    public void setUnbreaking(Integer unbreaking) { this.unbreaking = unbreaking; }

}
