package Activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

import com.example.home.R;

public class MainActivity extends AppCompatActivity {
    ImageView imageView;
    Animation animation;
    private final int SPLASH_DISPLAY_LENGHT = 3000;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imageView = findViewById(R.id.iv_home);
        animation();
    }

    private void animation() {
        animation = AnimationUtils.loadAnimation(this,R.anim.rotate);
        imageView.startAnimation(animation);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent = new Intent(MainActivity.this, Enter_your_house.class);
                MainActivity.this.startActivity(intent);
            }
        },SPLASH_DISPLAY_LENGHT);
    }
}