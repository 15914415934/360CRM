package com.example.test;




public class FunctionItem {
    public String name;
    public boolean isSelect = false;
    public String imageUrl = "";
    public String background ="";
    public FunctionItem(String name, boolean isSelect, String imageUrl, String background) {
        this.name = name;
        this.isSelect = isSelect;
        this.imageUrl = imageUrl;
        this.background = background;
    }

    public FunctionItem(String name, boolean isSelect, String background){
        this.name = name;
        this.isSelect = isSelect;
        this.background = background;
    }

    public FunctionItem(String name, boolean isSelect){
        this.name = name;
        this.isSelect = isSelect;
    }


}
