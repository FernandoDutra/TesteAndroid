package br.com.fernandodutra.testeandroid.models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Fernando Dutra
 * User: Fernando Dutra
 * Date: 25/06/2019
 * Time: 12:03
 * TesteAndroid
 */
public class Cells {

    @SerializedName("cells")
    @Expose
    private List<Cell> cells = new ArrayList<Cell>();

    public List<Cell> getCells() {
        return cells;
    }

    public void setCells(List<Cell> cells) {
        if (cells != null) {
            this.cells = cells;
        }
    }
}
