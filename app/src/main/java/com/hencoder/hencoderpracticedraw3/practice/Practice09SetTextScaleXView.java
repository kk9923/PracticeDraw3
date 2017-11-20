package com.hencoder.hencoderpracticedraw3.practice;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.support.annotation.Nullable;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.util.AttributeSet;
import android.view.View;

public class Practice09SetTextScaleXView extends View {
    TextPaint paint = new TextPaint(Paint.ANTI_ALIAS_FLAG);
    String text = "Hello HenCoder";
    private StaticLayout staticLayout;

    public Practice09SetTextScaleXView(Context context) {
        super(context);
    }

    public Practice09SetTextScaleXView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public Practice09SetTextScaleXView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    {
        paint.setTextSize(60);

        // 使用 Paint.setTextScaleX() 来改变文字宽度
        paint.setTextScaleX(0.5f);
        staticLayout = new StaticLayout(text,paint,50, Layout.Alignment.ALIGN_NORMAL,1,0,true);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

     //   canvas.drawText(text, 50, 100, paint);
        staticLayout.draw(canvas);
    }
}
