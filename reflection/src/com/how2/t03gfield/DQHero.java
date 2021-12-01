package com.how2.t03gfield;

import java.util.ArrayList;
import java.util.List;

public class DQHero extends Hero{
    public String level;
    private List<String> gfs;

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

    @Override
    public String toString() {
        return "DQHero{" +
                "level='" + level + '\'' +
                ", gf=" + gfs +
                '}';
    }
}
