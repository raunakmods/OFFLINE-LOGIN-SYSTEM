package com.RaunakMods.main;
import android.animation.ArgbEvaluator;
import android.animation.ObjectAnimator;
import android.animation.TimeAnimator;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.app.ProgressDialog;
import android.os.Build;
import android.os.Bundle;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Point;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.view.View;
import android.os.Handler;
import android.provider.Settings;
import android.widget.Toast;
import com.RaunakMods.login.Raunak;
import android.graphics.drawable.GradientDrawable;
public class MainActivity extends Activity {
	private GradientDrawable gdAnimation = new GradientDrawable();
	public String GameActivity = "com.xy.punchboxing.MainAcitivity";
	public boolean hasLaunched = false;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
		Raunak.Start(this);
        startAnimation();
		if (!hasLaunched) {
            try {
                //Start service
                //MainActivity.this.startActivity(new Intent(MainActivity.this, Class.forName(MainActivity.this.GameActivity)));
                MainActivity.this.startActivity(new Intent(MainActivity.this, Class.forName(MainActivity.this.GameActivity)));
            } catch (ClassNotFoundException e) {
                //Uncomment this if you are following METHOD 2 of CHANGING FILES
                //Toast.makeText(MainActivity.this, "Error. Game's main activity does not exist", Toast.LENGTH_LONG).show();
                e.printStackTrace();
                return;
	
            }}
	}

	public void startAnimation() {
		final int start = Color.parseColor("#dd00820d");
		final int end = Color.parseColor("#dd000282");

		final ArgbEvaluator evaluator = new ArgbEvaluator();
		gdAnimation.setCornerRadius(0);
		gdAnimation.setOrientation(GradientDrawable.Orientation.TL_BR);
		final GradientDrawable gradient = gdAnimation;

		ValueAnimator animator = TimeAnimator.ofFloat(0.0f, 1.0f);
		animator.setDuration(10000);
		animator.setRepeatCount(ValueAnimator.INFINITE);
		animator.setRepeatMode(ValueAnimator.REVERSE);
		animator.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
				@Override
				public void onAnimationUpdate(ValueAnimator valueAnimator) {
					Float fraction = valueAnimator.getAnimatedFraction();
					int newStrat = (int) evaluator.evaluate(fraction, start, end);
					int newEnd = (int) evaluator.evaluate(fraction, end, start);
					int[] newArray = {newStrat, newEnd};
					gradient.setColors(newArray);
				}
			});

		animator.start();
	}
	}
	
        
    
	
	
	
	
		
    

    
