package br.com.fernandodutra.testeandroid.activities.main;

import android.Manifest;
import android.content.Context;
import android.support.design.widget.AppBarLayout;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;

import android.os.Bundle;

import br.com.fernandodutra.testeandroid.R;
import br.com.fernandodutra.testeandroid.adapters.MainViewPagerAdapter;
import br.com.fernandodutra.testeandroid.fragments.contact.ContactFragment;
import br.com.fernandodutra.testeandroid.fragments.investment.InvestmentFragment;
import br.com.fernandodutra.testeandroid.utils.ToolPermissions;

public class MainActivity extends AppCompatActivity {

    private Context context;
    private TabLayout tl_main;
    private AppBarLayout abl_main;
    private ViewPager vp_main;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        setupPermissions();
        setupComponents();
        setupActions();
    }

    private void setupActions() {

    }

    private void setupComponents() {
        context = MainActivity.this;
        tl_main = findViewById(R.id.activity_main_tl_main);
        abl_main = findViewById(R.id.activity_main_abl_main);
        vp_main = findViewById(R.id.activity_main_vp_main);

        MainViewPagerAdapter mainViewPagerAdapter = new MainViewPagerAdapter(getSupportFragmentManager());
        mainViewPagerAdapter.addFragment(new ContactFragment(), "Contact");
        mainViewPagerAdapter.addFragment(new InvestmentFragment(), "Investment");

        vp_main.setAdapter(mainViewPagerAdapter);

        tl_main.setupWithViewPager(vp_main);
    }

    private void setupPermissions() {
        // Request Permissions
        String[] permissoes = new String[]{
                Manifest.permission.INTERNET,
                Manifest.permission.ACCESS_NETWORK_STATE,
                Manifest.permission.WRITE_EXTERNAL_STORAGE,
                Manifest.permission.READ_EXTERNAL_STORAGE};
        ToolPermissions.validate(this, 0, permissoes);
    }

}
