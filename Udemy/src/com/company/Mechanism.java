package com.company;

import java.util.ArrayList;

public class Mechanism {

    private String WeedName;
    private ArrayList<Weed> WeedList;

    public Mechanism(String weedName) {
        WeedName = weedName;
        this.WeedList = new ArrayList<Weed>();
    }

    public boolean addNewWeedType(Weed weed){
        if(findWeed(weed.getName()) >= 0){
            System.out.println("Weed Type is in the list, you can't add new");
            return false;
        } else {
            WeedList.add(weed);
            return true;
        }
    }

    private int findWeed(String weedName){
        for(int i =0; i<WeedList.size(); i++){
            Weed weed = this.WeedList.get(i);
            if(weed.getName().equals(weedName)){
                return i;
            }
        }
        return -1;
    }


    public void printWeedTypes(){
        System.out.println("Weed List:");
        for (int i =0; i<WeedList.size(); i++){
            System.out.println(this.WeedList.get(i).getName() + " for pice: " + this.WeedList.get(i).getPrice_1g());
        }
    }
}
