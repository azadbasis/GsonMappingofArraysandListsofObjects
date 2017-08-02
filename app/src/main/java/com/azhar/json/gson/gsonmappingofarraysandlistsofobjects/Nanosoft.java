package com.azhar.json.gson.gsonmappingofarraysandlistsofobjects;

import java.util.List;

/**
 * Created by Nanosoft-Android on 8/2/2017.
 */

public class Nanosoft {

    private String name;

    List<NanosoftProductItem> items;

    public Nanosoft(String name, List<NanosoftProductItem> items) {
        this.name = name;
        this.items = items;
    }

    public static class NanosoftProductItem {

        String name;
        float price;

        public NanosoftProductItem(String name, float price) {
            this.name = name;
            this.price = price;
        }
    }
}
