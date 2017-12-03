package ua.work.api.novaposhta.view;

import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import ua.work.api.novaposhta.R;
import ua.work.api.novaposhta.view.main.FragmentMain;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getFragment();
    }

    private void getFragment() {
        FragmentManager manager = getSupportFragmentManager();
        FragmentMain fragment = FragmentMain.newInstance();
        manager.beginTransaction()
                .add(R.id.container, fragment, FragmentMain.class.getSimpleName())
                .commit();
    }
}
