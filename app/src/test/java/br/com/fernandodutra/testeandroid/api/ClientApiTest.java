package br.com.fernandodutra.testeandroid.api;

import org.junit.Before;
import org.junit.Test;

import java.util.concurrent.CountDownLatch;

import br.com.fernandodutra.testeandroid.models.Cells;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

import static org.junit.Assert.assertNotNull;

/**
 * Created by Fernando Dutra
 * User: Fernando Dutra
 * Date: 25/06/2019
 * Time: 12:16
 * TesteAndroid
 */
public class ClientApiTest {

    private final CountDownLatch latch = new CountDownLatch(1);
    private InterfaceApi interfaceApi;
    private Cells cells;

    @Before
    public void setUp() throws Exception {
        interfaceApi = ClientApi.getClientApi().create(InterfaceApi.class);
        cells = new Cells();
    }

    @Test
    public void clientApi_validAcess() throws InterruptedException {

        interfaceApi.getCells().enqueue(new Callback<Cells>() {
            @Override
            public void onResponse(Call<Cells> call, Response<Cells> response) {
                cells.setCells(response.body().getCells());
                latch.countDown();
            }

            @Override
            public void onFailure(Call<Cells> call, Throwable t) {
                cells.setCells(null);
            }
        });

        latch.await();
        assertNotNull(cells);
    }

}
