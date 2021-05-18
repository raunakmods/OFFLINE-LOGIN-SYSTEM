package com.RaunakMods.login;

import android.animation.ArgbEvaluator;
import android.animation.ObjectAnimator;
import android.animation.TimeAnimator;
import android.animation.ValueAnimator;
import android.app.AlertDialog;
import android.app.ProgressDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.SharedPreferences;
import android.graphics.Color;
import android.graphics.drawable.GradientDrawable;
import android.os.Handler;
import android.text.Html;
import android.app.Activity;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Typeface;
import android.os.Bundle;
import android.widget.ImageView;
import android.text.InputType;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.Toast;

import android.widget.TextView;

import android.view.Gravity;
import android.graphics.drawable.Drawable;

public class Raunak {

    public static native boolean Check(String str, String str2);

    public static native String Login();

    public static native String Login2();

    public static void Start(final Context context) {

        System.loadLibrary("RaunakMod");

        //Create shared preferences to remember user and pass
        final SharedPreferences sharedPreferences = context.getSharedPreferences("SavePref", 0);

        String string2 = sharedPreferences.getString("Pass", null);

        //Create LinearLayout
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setLayoutParams(new LinearLayout.LayoutParams(-1, -1));
        linearLayout.setOrientation(LinearLayout.VERTICAL);

        GradientDrawable gradientdrawable = new GradientDrawable();

        gradientdrawable.setCornerRadius(0); //Set corner
        gradientdrawable.setColor(Color.parseColor("#FFFFFF")); //Set background color
        gradientdrawable.setStroke(4, Color.parseColor("#00Ff0000")); //Set

        linearLayout.setBackground(gradientdrawable);

        //   linearLayout.setPadding(convertDipToPixels(15.0f), convertDipToPixels(15.0f), convertDipToPixels(15.0f), convertDipToPixels(15.0f));
        final TextView name = new TextView(context);
        name.setText("          RAUNAK MODs");
        name.setTextSize(30.0f);
        name.setBackgroundColor(Color.parseColor("#000000"));
        LinearLayout.LayoutParams name1 = new LinearLayout.LayoutParams(-1, -1);
        name1.gravity = 17;
        android.graphics.drawable.GradientDrawable RAUNAKk1 = new android.graphics.drawable.GradientDrawable();
        RAUNAKk1.setColor(Color.parseColor("#000000"));
        RAUNAKk1.setCornerRadius(0);
        RAUNAKk1.setStroke(5, Color.parseColor("#FFFFFF"));
        name.setBackground(RAUNAKk1);
        name.setLayoutParams(name1);


        final ArgbEvaluator evaluator = new ArgbEvaluator();
        ValueAnimator animator = new ValueAnimator();
        //animator.setIntValues(Color.rgb(200,0,0), Color.rgb(0,255,0),Color.rgb(200,0,0), Color.rgb(0,200,0),Color.rgb(0,0,255), Color.rgb(255,0,0), Color.rgb(0,255,0),Color.rgb(200,0,0), Color.rgb(0,200,0),Color.rgb(0,0,255));
        animator.setIntValues(Color.parseColor("#FFFF0000"), Color.parseColor("#FFFF0000"), Color.parseColor("#FF00CD65"), Color.parseColor("#FF00FF48"), Color.parseColor("#FF576DFF"), Color.parseColor("#FF576DFF"), Color.parseColor("#FFFF91FF"), Color.parseColor("#FFFF91FF"), Color.parseColor("#FF000000"), Color.parseColor("#FF000000"), Color.parseColor("#FFFFFFFF"), Color.parseColor("#FFFFFFFF"), Color.parseColor("#FFFF0097"), Color.parseColor("#FFFF0097"), Color.parseColor("#FF00FFDA"), Color.parseColor("#FF00FFDA"));
        animator.setEvaluator(evaluator);
        animator.setDuration(10000); //5000 best
        animator.setRepeatCount(ValueAnimator.INFINITE);
        animator.setRepeatMode(ValueAnimator.REVERSE);
        animator.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {

            @Override
            public void onAnimationUpdate(ValueAnimator animator) {
                name.setTextColor((int) animator.getAnimatedValue());
            }

        });
        animator.start();

        //Code for show loading
        AlertDialog RaunakMods = new AlertDialog.Builder(context).create();
        //RaunakMods.setTitle("RAUNAK MODs");

        RaunakMods.setMessage("CARROM POOL LONGLINE HACK");

        RaunakMods.setButton(AlertDialog.BUTTON_POSITIVE, "OK",
                new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.dismiss();
                    }
                });
        RaunakMods.show();
        // code end

        //Create password edittext field
        EditText editTextPass = new EditText(context);
        if (string2 != null && !string2.isEmpty()) {
            editTextPass.setText(string2);
        }
        editTextPass.setHint("KEY");

        editTextPass.setTextColor(Color.parseColor("#FF0000"));
        editTextPass.setGravity(17);
        editTextPass.setInputType(InputType.TYPE_CLASS_TEXT | InputType.TYPE_TEXT_VARIATION_WEB_PASSWORD);
        android.graphics.drawable.GradientDrawable RAUNAK1 = new android.graphics.drawable.GradientDrawable();
        RAUNAK1.setColor(Color.parseColor("#000000"));
        RAUNAK1.setCornerRadius(0);
        RAUNAK1.setStroke(5, Color.parseColor("#FFFFFF"));
        editTextPass.setBackground(RAUNAK1);
        //Create checkbox

        //Create button
        Button button = new Button(context);
        button.setTextColor(Color.parseColor("#32cb00"));
        android.graphics.drawable.GradientDrawable RAUNAK = new android.graphics.drawable.GradientDrawable();
        RAUNAK.setColor(Color.parseColor("#000000"));
        RAUNAK.setCornerRadius(0);
        RAUNAK.setStroke(5, Color.parseColor("#FFFFFF"));
        button.setBackground(RAUNAK);
        button.setText("Login");

        // CODE RAUNAK

        //Raunak
        linearLayout.addView(name);
        linearLayout.addView(editTextPass);

        linearLayout.addView(button);

        //Create alertdialog
        AlertDialog.Builder builder = new AlertDialog.Builder(context);

        builder.setCancelable(false);
        builder.setView(linearLayout);
        AlertDialog show = builder.show();

        final EditText editText4 = editTextPass;

        final AlertDialog alertDialog = show;

        button.setOnClickListener(new View.OnClickListener() {


            public void onClick(View view) {
                final ProgressDialog progress = new ProgressDialog(context, AlertDialog.THEME_HOLO_LIGHT);
                //	progress.setTitle("🥱");
                progress.setMessage("Connecting to Server...");
                progress.show();
                progress.setCancelable(false);
                Runnable progressRunnable = new Runnable() {

                    @Override
                    public void run() {
                        progress.cancel();
                    }
                };
                Handler pdCanceller = new Handler();
                pdCanceller.postDelayed(progressRunnable, 3000);

                String pass = editText4.getText().toString().trim();

                //Check if user and pass match in native lib
                if (Check(pass, pass)) {
                    alertDialog.dismiss();

                    new Handler().postDelayed(new Runnable() {
                        @Override
                        public void run() {
                            Toast.makeText(context, (Html.fromHtml("<font face='monospace'> <font color='#00FF1B'>LOGIN</font></font>")), Toast.LENGTH_LONG).show();

                        }
                    }, 3000);

                    //Here you can do something after login
                } else {

                    new Handler().postDelayed(new Runnable() {
                        @Override
                        public void run() {
                            //		Toast.makeText(context,(Html.fromHtml("<font face='monospace'> <font color='#FF0000'>SERVER ERROR</font></font>")), Toast.LENGTH_LONG).show();
                            Toast toast = Toast.makeText(context, (Html.fromHtml("<font face='monospace'> <font color='#FF0000'>SERVER ERROR</font></font>")), Toast.LENGTH_LONG);
                            toast.setGravity(Gravity.TOP, 0, 0); // last two args are X and Y are used for setting position
                            toast.setDuration(10);//you can even use milliseconds to display toast
                            toast.show();


                        }

                        private void setGravity(int cENTER_VERTICAL, int р1, int р2) {
                        }
                    }, 3000);

                }
            }
        });
    }
}