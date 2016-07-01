package com.passion.padc_totalapp.activities;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.NavigationView;
import android.support.design.widget.Snackbar;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;

import com.passion.padc_totalapp.R;
import com.passion.padc_totalapp.fragments.JobSearchFragment;
import com.passion.padc_totalapp.fragments.LinkedInFragment;
import com.passion.padc_totalapp.fragments.PulseFragment;
import com.passion.padc_totalapp.fragments.WunZinnFragment;
import com.passion.padc_totalapp.fragments.YoteSinFragment;
import com.passion.padc_totalapp.utils.MMFontUtils;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {

    private FloatingActionButton fab;
    private DrawerLayout drawerLayout;
    private NavigationView navigationView;
    private TextView tvScreenTitle;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        final ActionBar actionBar = getSupportActionBar();
        if (actionBar != null) {
            actionBar.setDisplayShowTitleEnabled(false);
            actionBar.setHomeAsUpIndicator(R.drawable.ic_menu_black_24dp);
            actionBar.setDisplayHomeAsUpEnabled(true);
        }

        tvScreenTitle = (TextView) findViewById(R.id.tv_screen_title);

        drawerLayout = (DrawerLayout) findViewById(R.id.drawer_layout);

        navigationView = (NavigationView) findViewById(R.id.navigation_view);
        Menu leftMenu = navigationView.getMenu();
        MMFontUtils.applyMMFontToMenu(leftMenu);
        navigationView.setNavigationItemSelectedListener(this);

        fab = (FloatingActionButton) findViewById(R.id.fab);
        if (fab != null)
            fab.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                            .setAction("Action", null).show();
                }
            });

        if (savedInstanceState == null) {
            navigateToLinkedIn();
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        switch (id) {
            case android.R.id.home:
                drawerLayout.openDrawer(GravityCompat.START);
                return true;
            case R.id.action_settings:
                return true;
        }

        return super.onOptionsItemSelected(item);
    }


    //region Navigation
    @Override
    public boolean onNavigationItemSelected(final MenuItem menuItem) {
        menuItem.setChecked(true);
        drawerLayout.closeDrawers();

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                switch (menuItem.getItemId()) {
                    case R.id.left_menu_linkedin:
                        navigateToLinkedIn();
                        break;
                    case R.id.left_menu_job_search:
                        navigateToJobSearch();
                        break;
                    case R.id.left_menu_pulse:
                        navigateToPulse();
                        break;
                    case R.id.left_menu_yote_sin:
                        navigateToYoteSin();
                        break;
                    case R.id.left_menu_wunn_zinn:
                        navigateToWunZinn();
                        break;
                }
            }
        }, 100); //to close drawer smoothly.

        return true;
    }

    private void navigateToLinkedIn() {
        LinkedInFragment fragment = LinkedInFragment.newInstance();
        this.tvScreenTitle.setText("PADC - LinkedIn");
        this.fab.setVisibility(View.VISIBLE);
        getSupportFragmentManager().beginTransaction()
                .replace(R.id.fl_container, fragment)
                .commit();
    }

    private void navigateToJobSearch() {
        JobSearchFragment fragment = JobSearchFragment.newInstance();
        this.tvScreenTitle.setText("PADC - Job Search");
        this.fab.setVisibility(View.GONE);
        getSupportFragmentManager().beginTransaction()
                .replace(R.id.fl_container, fragment)
                .commit();
    }

    private void navigateToPulse() {
        PulseFragment fragment = PulseFragment.newInstance();
        this.tvScreenTitle.setText("PADC - Pulse");
        this.fab.setVisibility(View.VISIBLE);
        getSupportFragmentManager().beginTransaction()
                .replace(R.id.fl_container, fragment)
                .commit();
    }

    private void navigateToYoteSin() {
        YoteSinFragment fragment = YoteSinFragment.newInstance();
        this.tvScreenTitle.setText("PADC - ရုပ္ရွင္");
        this.fab.setVisibility(View.GONE);
        getSupportFragmentManager().beginTransaction()
                .replace(R.id.fl_container, fragment)
                .commit();
    }

    private void navigateToWunZinn() {
        WunZinnFragment fragment = WunZinnFragment.newInstance();
        this.tvScreenTitle.setText("PADC - ဝန္ဇင္း");
        this.fab.setVisibility(View.GONE);
        getSupportFragmentManager().beginTransaction()
                .replace(R.id.fl_container, fragment)
                .commit();
    }
    //endregion
}
