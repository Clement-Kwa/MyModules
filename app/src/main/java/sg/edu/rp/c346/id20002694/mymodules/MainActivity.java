package sg.edu.rp.c346.id20002694.mymodules;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView tv1;
    TextView tv2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tv1 = findViewById(R.id.tv1);
        tv2 = findViewById(R.id. tv2);

        tv1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, ModuleDetailActivity.class);
                intent.putExtra("android", "Module Code: C346 \nModule Name: Android Programming \nAcademic Year:2020 \nSemester: 1 \nModule Credit: 4 \nVenue: W66M");
                startActivity(intent);
            }
        });

        tv2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent2 = new Intent(MainActivity.this, ModuleDetailActivity.class);
                intent2.putExtra("ipad", "Module Code: C349 \nModule Name: iPad Programming \nAcademic Year:2020 \nSemester: 1 \nModule Credit: 2 \nVenue: W22M");
                startActivity(intent2);
            }
        });
    }
}