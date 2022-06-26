package Activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.home.R;

public class New_resident extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new_resident);
    }

    public void onclick3(View view) {
        Intent intent = new Intent(New_resident.this,homepage.class);
        startActivity(intent);
    }

    public void onclick4(View view) {
    }
}