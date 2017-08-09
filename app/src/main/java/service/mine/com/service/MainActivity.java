package service.mine.com.service;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private Button btnStart, btnStop;
    private TextView tvStart;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnStart = (Button) findViewById(R.id.btnStart);
        btnStop = (Button) findViewById(R.id.btnStop);
        tvStart = (TextView) findViewById(R.id.tvStart);
        btnStart.setOnClickListener(onAction_click);
        btnStop.setOnClickListener(onAction_click);
    }

    private View.OnClickListener onAction_click = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            switch (v.getId()) {
                case R.id.btnStart:
                    startSV();
                    break;
                case R.id.btnStop:
                    stopSV();
                    break;
            }

        }
    };

    private void startSV() {
        Intent intentSV = new Intent(this,CounterService.class);
        startService(intentSV);
    }

    private void stopSV() {
        Intent intentSV = new Intent(this,CounterService.class);
        stopService(intentSV);
    }
}


