package com.xty.map.palying;

import java.util.HashMap;

/**
 * 本来用于表示一张扑克牌
 */
public class Card {
    // 点数 A~K
    private String points;
    // 表示这张牌的整数大小
    private int size;
    // 花色 ♠ ♥ ♣ ♦
    private char color;

    private String toStr;

    public String getPoints() {
        return points;
    }

    public void setPoints(String points) {
        this.points = points;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public char getColor() {
        return color;
    }

    public void setColor(char color) {
        this.color = color;
    }

    public String getToStr() {
        return toStr;
    }

    public void setToStr(String toStr) {
        this.toStr = toStr;
    }

    public Card(String points, char color) {
        // 点数和大小的一个映射Map
        HashMap<String, Integer> hm = new HashMap<>();
        hm.put("A",1);
        hm.put("2",2);
        hm.put("3",3);
        hm.put("4",4);
        hm.put("5",5);
        hm.put("6",6);
        hm.put("7",7);
        hm.put("8",8);
        hm.put("9",9);
        hm.put("10",10);
        hm.put("J",11);
        hm.put("Q",12);
        hm.put("K",13);
        hm.put("😺",14);
        hm.put("🐯",15);

        this.points = points;
        this.size = hm.get(points);
        this.color = color;
        this.toStr= "——————\n"+
                "| "+this.points+"  |\n"+
                "| "+this.color+" |\n"+
                "——————";
    }

    @Override
    public String toString() {
        return toStr;
    }
}
