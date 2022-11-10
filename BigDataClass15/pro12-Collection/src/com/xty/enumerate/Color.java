package com.xty.enumerate;

public enum Color{
        RED("红色"),  GREEN("绿色"),BlUE("蓝色");
        private String name;
        Color(String name){
                this.name = name;
        }

        @Override
        public String toString() {
                return this.name;
        }
}
