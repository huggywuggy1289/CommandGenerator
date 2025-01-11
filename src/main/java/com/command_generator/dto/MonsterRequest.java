package com.command_generator.dto;

// 좀비, 스켈레톤, 크리퍼, 거미, 변명자, 약탈자
public class MonsterRequest {
    private Integer zombie;
    private Integer skeleton;
    private Integer creeper;
    private Integer spider;
    private Integer vindicator;
    private Integer pillager;

    public Integer getZombie(){
        return zombie;
    }
    public void setZombie(Integer zombie){
        this.zombie = zombie;
    }
    public Integer getSkeleton(){
        return skeleton;
    }
    public void setSkeleton(Integer skeleton){
        this.skeleton = skeleton;
    }
    public Integer getCreeper(){
        return creeper;
    }
    public void setCreeper(Integer creeper){
        this.creeper = creeper;
    }
    public Integer getSpider(){
        return spider;
    }
    public void setSpider(Integer spider){
        this.spider = spider;
    }
    public Integer getVindicator(){
        return vindicator;
    }
    public void setVindicator(Integer vindicator){
        this.vindicator = vindicator;
    }
    public Integer getPillager(){
        return pillager;
    }
    public void setPillager(Integer pillager){
        this.pillager = pillager;
    }

}
