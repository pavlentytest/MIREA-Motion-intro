package ru.samsung.itschool.mdev.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.graphics.drawable.GradientDrawable;
import android.os.Bundle;
import android.view.View;


public class MainActivity2 extends AppCompatActivity {

    View root2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        root2 = findViewById(R.id.root2);
        GradientDrawable gd = new GradientDrawable(
                GradientDrawable.Orientation.TOP_BOTTOM,
                new int[] {0xFF616261,0xFF131313});
        //gd.setCornerRadius(0f);
        root2.setBackground(gd);
    }
}