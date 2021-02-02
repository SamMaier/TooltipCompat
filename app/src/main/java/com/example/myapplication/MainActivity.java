package com.example.myapplication;

import android.graphics.Color;
import android.view.MotionEvent;
import android.view.View;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import androidx.appcompat.widget.TooltipCompat;
import java.util.Random;

public class MainActivity extends AppCompatActivity {
  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);
    View vi = findViewById(R.id.helloworldid);
    vi.setOnLongClickListener(new View.OnLongClickListener() {
      @Override
      public boolean onLongClick(View v) {
        TooltipCompat.setTooltipText(v, "abcd");
        v.setBackgroundColor(Color.parseColor("#ffff"  + Integer.toString(new Random().nextInt(9))+ Integer.toString(new Random().nextInt(9))));
        return false;
      }
    });
  }
}