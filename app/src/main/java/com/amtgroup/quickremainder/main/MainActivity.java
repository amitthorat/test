package com.amtgroup.quickremainder.main;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.RelativeLayout;

import com.amtgroup.quickremainder.R;
import com.amtgroup.quickremainder.home.HomeActivity;

public class MainActivity extends HomeActivity {

    private View viewSearch;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        RelativeLayout relativeLayout = (RelativeLayout) findViewById(R.id.rl_container);

        LayoutInflater inflaterInstance = (LayoutInflater) getSystemService(Context.LAYOUT_INFLATER_SERVICE);

        viewSearch = inflaterInstance.inflate(R.layout.activity_main, null);

        relativeLayout.addView(viewSearch);
    }
}
