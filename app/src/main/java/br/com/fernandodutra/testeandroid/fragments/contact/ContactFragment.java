package br.com.fernandodutra.testeandroid.fragments.contact;

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
 * Time: 12:43
 * TesteAndroid
 */
public class ContactFragment extends Fragment {

    View view;

    public ContactFragment() {

    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.fragment_contact, container, false);
        return view;
    }
    
}
