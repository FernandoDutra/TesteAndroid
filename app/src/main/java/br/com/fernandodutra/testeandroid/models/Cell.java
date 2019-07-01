package br.com.fernandodutra.testeandroid.models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 * Created by Fernando Dutra
 * User: Fernando Dutra
 * Date: 25/06/2019
 * Time: 12:03
 * TesteAndroid
 */
public class Cell {

    @SerializedName("id")
    @Expose
    private Integer id;
    @SerializedName("type")
    @Expose
    private Integer type;
    @SerializedName("message")
    @Expose
    private String message;
    @SerializedName("typefield")
    @Expose
    private Object typefield;
    @SerializedName("hidden")
    @Expose
    private Boolean hidden;
    @SerializedName("topSpacing")
    @Expose
    private Double topSpacing;
    @SerializedName("show")
    @Expose
    private Object show;
    @SerializedName("required")
    @Expose
    private Boolean required;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Object getTypefield() {
        return typefield;
    }

    public void setTypefield(Object typefield) {
        this.typefield = typefield;
    }

    public Boolean getHidden() {
        return hidden;
    }

    public void setHidden(Boolean hidden) {
        this.hidden = hidden;
    }

    public Double getTopSpacing() {
        return topSpacing;
    }

    public void setTopSpacing(Double topSpacing) {
        this.topSpacing = topSpacing;
    }

    public Object getShow() {
        return show;
    }

    public void setShow(Object show) {
        this.show = show;
    }

    public Boolean getRequired() {
        return required;
    }

    public void setRequired(Boolean required) {
        this.required = required;
    }
}
