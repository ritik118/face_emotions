package emosic.ritik.com.emosic;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import java.util.Timer;
import java.util.TimerTask;

public class Splash extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        getSupportActionBar().hide();
        TimerTask timerTask = new TimerTask() {

            @Override
            public void run() {

                Intent i = new Intent(Splash.this,Homeactivity.class);
                startActivity(i);
                finish();

            }

        };

        new Timer().schedule(timerTask,2000);

    }
}
