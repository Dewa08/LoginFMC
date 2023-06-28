package com.dewa202102309.login;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class CuacaRootModel {
    @SerializedName("list")
    private List<CuacaListModel> listModelList;

    public CuacaRootModel() {
    }

    public List<CuacaListModel> getListModelList() { return listModelList; }

    public void setListModelList(List<CuacaListModel> ListModel) {
        this.listModelList = listModelList;
    }
}
