package com.azhar.json.gson.gsonmappingofarraysandlistsofobjects;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Nanosoft-Android on 8/2/2017.
 */

public class Main {

    public static void main(String[] args) {

        System.out.print("here is azhar");

        serializedUsernested();
        deserializedUserNested();
    }

    private static void deserializedUserNested() {

        String productString = "[{\"name\":\"Azharul Islam\",\"price\":9679876.0},{\"name\":\"Ariful Islam\",\"price\":556266.0},{\"name\":\"Shah kutub\",\"price\":516516.0}]";
      ProductItem[] productItem=  new Gson().fromJson(productString,ProductItem[].class);

        
        Type productType = new TypeToken<ArrayList<ProductItem>>(){}.getType();
        List<ProductItem> productItems = new Gson().fromJson(productString,productType);

    }

    private static void serializedUsernested() {

        List<Nanosoft.NanosoftProductItem> productItems = new ArrayList<>();
        productItems.add(new Nanosoft.NanosoftProductItem("Azharul Islam",9679876));
        productItems.add(new Nanosoft.NanosoftProductItem("Ariful Islam",556266));
        productItems.add(new Nanosoft.NanosoftProductItem("Shah kutub",516516));


        Nanosoft nanosoft = new Nanosoft("Nano Information Technology",productItems);
        String nanosoftJson = new Gson().toJson(nanosoft);
        String nanosoftJsons = new Gson().toJson(productItems);
    }

}
