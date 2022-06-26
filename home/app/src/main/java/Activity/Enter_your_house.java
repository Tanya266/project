package Activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.home.R;

public class Enter_your_house extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_enter_your_house);
    }

    public void onclick1(View view) {
        Intent intent = new Intent(Enter_your_house.this,New_resident.class);
        startActivity(intent);
    }

    public void onclick2(View view) {
    }
}