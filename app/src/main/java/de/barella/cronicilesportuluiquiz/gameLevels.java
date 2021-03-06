package de.barella.cronicilesportuluiquiz;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class gameLevels extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.gamelevels);

        Window w = getWindow();
        w.setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);

        Button button_back = (Button) findViewById(R.id.button_back);
        button_back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //inceputul constructiei try
                try {
                    Intent intent = new Intent(gameLevels.this, MainActivity.class);
                    startActivity(intent);
                    finish();
                } catch (Exception e) {
                }
                //finalul constructiei catch
            }


        });
    }

    //inceputul butonului de sistem ce duce inapoi
    @Override
    public void onBackPressed() {
        //inceputul constructiei try
        try {
            Intent intent = new Intent(gameLevels.this, MainActivity.class);
            startActivity(intent);
            finish();
        } catch (Exception e) {
            //finalul constructiei catch
        }
        //sfarsitul butonului de sistem ce duce inapoi
    }
}