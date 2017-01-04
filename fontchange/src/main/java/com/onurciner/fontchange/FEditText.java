package com.onurciner.fontchange;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.widget.EditText;

/**
 * Created by Onur.Ciner on 4.01.2017.
 */

public class FEditText extends EditText {

    String font = null;
    Integer style = 0;
    Integer family = 0;

    public FEditText(Context context, AttributeSet attrs) {
        super(context, attrs);

        TypedArray a = context.getTheme().obtainStyledAttributes(attrs, R.styleable.FEditText, 0, 0);

        try {
            font = a.getString(R.styleable.FEditText_fontEditText);
            style = a.getInteger(R.styleable.FEditText_fontStyleEditText, 0);
            family = a.getInteger(R.styleable.FEditText_fontFamilyEditText, 0);
        } finally {
            a.recycle();
        }

        Typeface tf = null;
        if(family == 1){
            tf = Typeface.createFromAsset(context.getAssets(), "alien_encounters.ttf");
        }else if(family == 2){
            tf = Typeface.createFromAsset(context.getAssets(), "all_ages.ttf");
        }else if(family == 3){
            tf = Typeface.createFromAsset(context.getAssets(), "android_style.ttf");
        }else if(family == 4){
            tf = Typeface.createFromAsset(context.getAssets(), "black_and_white.ttf");
        }else if(family == 5){
            tf = Typeface.createFromAsset(context.getAssets(), "bright_larch.ttf");
        }else if(family == 6){
            tf = Typeface.createFromAsset(context.getAssets(), "earth_orbiter.ttf");
        }else if(family == 7){
            tf = Typeface.createFromAsset(context.getAssets(), "friday13.ttf");
        }else if(family == 8){
            tf = Typeface.createFromAsset(context.getAssets(), "led_display_st.ttf");
        }else if(family == 9){
            tf = Typeface.createFromAsset(context.getAssets(), "neuropol.ttf");
        }else if(family == 10){
            tf = Typeface.createFromAsset(context.getAssets(), "painter.ttf");
        }else if(family == 11){
            tf = Typeface.createFromAsset(context.getAssets(), "prismfont.ttf");
        }else if(family == 12){
            tf = Typeface.createFromAsset(context.getAssets(), "sheeping_dogs.ttf");
        }else if(family == 13){
            tf = Typeface.createFromAsset(context.getAssets(), "star_jedi.ttf");
        }else if(family == 14){
            tf = Typeface.createFromAsset(context.getAssets(), "top_secret.ttf");
        }else if(family == 15){
            tf = Typeface.createFromAsset(context.getAssets(), "caviar_dreams.ttf");
        }else if(family == 16){
            tf = Typeface.createFromAsset(context.getAssets(), "champagne_limousines.ttf");
        }else{
            tf = Typeface.createFromAsset(context.getAssets(), "champagne_limousines.ttf");
        }


        if (font != null) {
            tf = Typeface.createFromAsset(context.getAssets(), font);
        }

        if (style == 0)
            this.setTypeface(tf, Typeface.NORMAL);
        else if (style == 1)
            this.setTypeface(tf, Typeface.ITALIC);
        else if (style == 2)
            this.setTypeface(tf, Typeface.BOLD);
        else if (style == 3)
            this.setTypeface(tf, Typeface.BOLD_ITALIC);
        else
            this.setTypeface(tf);

    }
}
