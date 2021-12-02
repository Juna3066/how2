package com.how2.t03gfield;

import java.util.ArrayList;
import java.util.List;

public class DQHero extends Hero{
    public static String desc;

    public String level;
    private List<String> gfs;

    static {
        desc = "斗气大陆诞生强者";
        System.out.println("desc = " + desc);
    }

    public DQHero(){
        gfs = new ArrayList<>();
    }

    public void addGf(String gf){
        this.gfs.add(gf);
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public List<String> getGfs() {
        return gfs;
    }

    public void setGfs(List<String> gfs) {
        this.gfs = gfs;
    }

    /*关于继承 继承公有属性*/
    @Override
    public String toString() {
        return "DQHero{" +
                "level='" + level + '\'' +
                ", gfs=" + gfs +
                ", name='" + name + '\'' +
                ", damage=" + damage +
                ", id=" + id +
                '}';
    }
}
