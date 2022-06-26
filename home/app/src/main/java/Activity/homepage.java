package Activity;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.MenuItem;

import com.example.home.HomeFragment;
import com.example.home.R;
import com.example.home.RoutinesFragment;
import com.example.home.SettingFragment;
import com.example.home.StaticsFragment;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.navigation.NavigationBarView;

public class homepage extends AppCompatActivity {

    BottomNavigationView bottomNavigationView;
    HomeFragment homeFragment = new HomeFragment();
    StaticsFragment staticsFragment = new StaticsFragment();
    RoutinesFragment routinesFragment = new RoutinesFragment();
    SettingFragment settingFragment = new SettingFragment();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_homepage);
        bottomNavigationView = findViewById(R.id.bottom_nav);

        getSupportFragmentManager().beginTransaction().replace(R.id.framelayout, homeFragment).commit();
        bottomNavigationView.setOnItemSelectedListener(new NavigationBarView.OnItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch (item.getItemId()) {
                    case R.id.home:
                        getSupportFragmentManager().beginTransaction().replace(R.id.framelayout,homeFragment).commit();
                        break;
                    case R.id.statics:
                        getSupportFragmentManager().beginTransaction().replace(R.id.framelayout,staticsFragment).commit();
                        break;
                    case R.id.routines:
                        getSupportFragmentManager().beginTransaction().replace(R.id.framelayout,routinesFragment).commit();
                        break;
                    case R.id.setting:
                        getSupportFragmentManager().beginTransaction().replace(R.id.framelayout,settingFragment).commit();
                        break;
                }
                return true;
            }
        });
    }
}