package com.boraji.tutorial.spring.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;

public class ArrayListImageModel {

    @JsonProperty("wallpapers")
    private ArrayList<ImageModel> mArrayListImageModel;

    public ArrayListImageModel(){
        this.mArrayListImageModel = new ArrayList<>();
    }

    public ArrayList<ImageModel> getmArrayListImageModel() {
        return mArrayListImageModel;
    }

    public void setmArrayListImageModel(ArrayList<ImageModel> mArrayListImageModel) {
        this.mArrayListImageModel = mArrayListImageModel;
    }

    public void addItem(ImageModel imageModel){
        this.mArrayListImageModel.add(imageModel);
    }
}
