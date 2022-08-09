package com.lucascalderon1.aprendaingles;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;

import com.lucascalderon1.aprendaingles.fragments.BichosFragment;
import com.lucascalderon1.aprendaingles.fragments.NumerosFragment;
import com.lucascalderon1.aprendaingles.fragments.VogaisFragment;
import com.ogaclejapan.smarttablayout.SmartTabLayout;
import com.ogaclejapan.smarttablayout.utils.v4.FragmentPagerItemAdapter;
import com.ogaclejapan.smarttablayout.utils.v4.FragmentPagerItems;

public class MainActivity extends AppCompatActivity {

    private SmartTabLayout smartTabLayout;
    private ViewPager viewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getSupportActionBar().hide();


        smartTabLayout = findViewById(R.id.smartTabLayout);
        viewPager = findViewById(R.id.viewPager);

        FragmentPagerItemAdapter adapter = new FragmentPagerItemAdapter(
                getSupportFragmentManager(),
                FragmentPagerItems.with(this)
                        .add("Bichos", BichosFragment.class)
                        .add("Números", NumerosFragment.class)
                        .add("Vogais", VogaisFragment.class)
                        .create()
        );

        viewPager.setAdapter(adapter);
        smartTabLayout.setViewPager(viewPager);




    }
}