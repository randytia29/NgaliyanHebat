package com.example.user.ngaliyanhebat;

import android.support.annotation.IdRes;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;

import com.example.user.ngaliyanhebat.Fragment.FragmentKuliner;
import com.example.user.ngaliyanhebat.Fragment.FragmentProfil;
import com.example.user.ngaliyanhebat.Fragment.FragmentTematik;
import com.example.user.ngaliyanhebat.Fragment.FragmentWisata;
import com.roughike.bottombar.BottomBar;
import com.roughike.bottombar.OnMenuTabClickListener;

public class MainActivity extends AppCompatActivity {

    BottomBar mBottomBar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mBottomBar = BottomBar.attach(this, savedInstanceState);
        mBottomBar.setItemsFromMenu(R.menu.menu_main, new OnMenuTabClickListener() {
            @Override
            public void onMenuTabSelected(@IdRes int i) {
                if (i == R.id.bottomBarItemOne) {
                    FragmentProfil f = new FragmentProfil();
                    getSupportFragmentManager().beginTransaction().replace(R.id.frame, f).commit();
                } else if (i == R.id.bottomBarItemTwo) {
                    FragmentTematik f = new FragmentTematik();
                    getSupportFragmentManager().beginTransaction().replace(R.id.frame, f).commit();
                } else if (i == R.id.bottomBarItemThree) {
                    FragmentWisata f = new FragmentWisata();
                    getSupportFragmentManager().beginTransaction().replace(R.id.frame, f).commit();
                } else if (i == R.id.bottomBarItemFour) {
                    FragmentKuliner f = new FragmentKuliner();
                    getSupportFragmentManager().beginTransaction().replace(R.id.frame, f).commit();
                }
            }

            @Override
            public void onMenuTabReSelected(int menuItemId) {

            }
        });

        mBottomBar.mapColorForTab(0, "#E53935");
        mBottomBar.mapColorForTab(1, "#5E35B1");
        mBottomBar.mapColorForTab(2, "#039BE5");
        mBottomBar.mapColorForTab(3, "#43A047");
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }
}
