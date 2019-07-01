package br.com.fernandodutra.testeandroid.api;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by Fernando Dutra
 * User: Fernando Dutra
 * Date: 25/06/2019
 * Time: 12:08
 * TesteAndroid
 */
public class ClientApi {

    public static final String URL_BASE = "https://floating-mountain-50292.herokuapp.com";
    private static Retrofit retrofit = null;

    public static Retrofit getClientApi() {
        if (retrofit == null) {
            retrofit = new Retrofit.Builder()
                    .baseUrl(URL_BASE)
                    .addConverterFactory(GsonConverterFactory.create())
                    .build();
        }
        return retrofit;
    }

}
