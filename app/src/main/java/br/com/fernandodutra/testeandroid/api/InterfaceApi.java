package br.com.fernandodutra.testeandroid.api;

import com.google.gson.JsonObject;

import br.com.fernandodutra.testeandroid.models.Cells;
import retrofit2.Call;
import retrofit2.http.GET;

/**
 * Created by Fernando Dutra
 * User: Fernando Dutra
 * Date: 25/06/2019
 * Time: 12:08
 * TesteAndroid
 */
public interface InterfaceApi {

    @GET("/cells.json")
    Call<Cells> getCells();

}
