package com.onurciner.fontchange;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.widget.TextView;

/**
 * Created by Onur.Ciner on 4.01.2017.
 */

public class FTextView extends TextView {

    String font = null;
    Integer style = 0;
    Integer family = 0;

    public FTextView(Context context, AttributeSet attrs) {
        super(context, attrs);

        TypedArray a = context.getTheme().obtainStyledAttributes(attrs, R.styleable.FTextView, 0, 0);

        try {
            if(a!=null && a.getString(R.styleable.FTextView_xfont) != null)
                font = a.getString(R.styleable.FTextView_xfont);

            style = a.getInteger(R.styleable.FTextView_xfontStyle, 0);
            family = a.getInteger(R.styleable.FTextView_xfontFamily, 0);
        } finally {
            a.recycle();
        }

        Typeface tf = null;
        if(family == 1){
            tf = Typeface.createFromAsset(context.getAssets(), "alienencounters.ttf");
        }else if(family == 2){
            tf = Typeface.createFromAsset(context.getAssets(), "allages.ttf");
        }else if(family == 3){
            tf = Typeface.createFromAsset(context.getAssets(), "androidstyle.ttf");
        }else if(family == 4){
            tf = Typeface.createFromAsset(context.getAssets(), "blackandwhite.ttf");
        }else if(family == 5){
            tf = Typeface.createFromAsset(context.getAssets(), "brightlarch.ttf");
        }else if(family == 6){
            tf = Typeface.createFromAsset(context.getAssets(), "earthorbiter.ttf");
        }else if(family == 7){
            tf = Typeface.createFromAsset(context.getAssets(), "friday.ttf");
        }else if(family == 8){
            tf = Typeface.createFromAsset(context.getAssets(), "leddisplayst.ttf");
        }else if(family == 9){
            tf = Typeface.createFromAsset(context.getAssets(), "neuropol.ttf");
        }else if(family == 10){
            tf = Typeface.createFromAsset(context.getAssets(), "painter.ttf");
        }else if(family == 11){
            tf = Typeface.createFromAsset(context.getAssets(), "prismfont.ttf");
        }else if(family == 12){
            tf = Typeface.createFromAsset(context.getAssets(), "sheepingdogs.ttf");
        }else if(family == 13){
            tf = Typeface.createFromAsset(context.getAssets(), "starjedi.ttf");
        }else if(family == 14){
            tf = Typeface.createFromAsset(context.getAssets(), "topsecret.ttf");
        }else if(family == 15){
            tf = Typeface.createFromAsset(context.getAssets(), "caviardreams.ttf");
        }else if(family == 16){
            tf = Typeface.createFromAsset(context.getAssets(), "champagnelimousines.ttf");
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
