package roman.com.popularmoviesapp;

import android.net.Uri;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity implements BlankFragment.OnFragmentInteractionListener{

    private static final String KEY_FRAGMENT = "FRAGMENT";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Fragment fragment = new BlankFragment();

        getSupportFragmentManager()
                .beginTransaction()
                .replace(R.id.fragment_container, fragment, KEY_FRAGMENT)
                .commit();

    }

    @Override
    public void onFragmentInteraction(Uri uri) {
//        do stuff on fragment interaction
    }
}
