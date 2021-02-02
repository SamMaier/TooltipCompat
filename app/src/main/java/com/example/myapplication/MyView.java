package com.example.myapplication;

import android.content.Context;
import android.graphics.Color;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import androidx.appcompat.widget.TooltipCompat;
import java.util.Random;

public class MyView extends View {
  public MyView(Context context, AttributeSet attrs, int defStyle) {
    super(context, attrs, defStyle);
  }

  public MyView(Context context, AttributeSet attrs) {
    super(context, attrs);
  }

  public MyView(Context context) {
    super(context);
  }

}
