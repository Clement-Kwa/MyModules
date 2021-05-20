package sg.edu.rp.c346.id20002694.mymodules;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class ModuleDetailActivity extends AppCompatActivity {

    TextView tvAns;
    Button back;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_module_detail);

        tvAns = findViewById(R.id. tvAns);
        back = findViewById(R.id. buttonBack);

        Intent intentReceived=getIntent();

        String mod1 = intentReceived.getStringExtra("android");
        String mod2 = intentReceived.getStringExtra("ipad");

        if(mod1!=null){
            tvAns.setText(mod1);
        }
        else if(mod2!=null){
            tvAns.setText(mod2);
        }

        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                finish();
            }
        });
    }
}