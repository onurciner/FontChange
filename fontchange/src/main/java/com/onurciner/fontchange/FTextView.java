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

    public FTextView(Context context, AttributeSet attrs) {
        super(context, attrs);

        TypedArray a = context.getTheme().obtainStyledAttributes(attrs, R.styleable.FTextView, 0, 0);

        try {
            font = a.getString(R.styleable.FTextView_fontTextView);
            style = a.getInteger(R.styleable.FTextView_fontStyleTextView, 0);
        } finally {
            a.recycle();
        }

        if (font != null) {
            Typeface tf = Typeface.createFromAsset(context.getAssets(), font);
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

}
