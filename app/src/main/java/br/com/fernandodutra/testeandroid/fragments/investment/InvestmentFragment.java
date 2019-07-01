package br.com.fernandodutra.testeandroid.fragments.investment;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import br.com.fernandodutra.testeandroid.R;

/**
 * Created by Fernando Dutra
 * User: Fernando Dutra
 * Date: 26/06/2019
 * Time: 15:21
 * TesteAndroid
 */
public class InvestmentFragment extends Fragment implements InvestmentContract.View {

    View view;

    public InvestmentFragment() {
        
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.fragment_investiment, container, false);
        return view;
    }
}
