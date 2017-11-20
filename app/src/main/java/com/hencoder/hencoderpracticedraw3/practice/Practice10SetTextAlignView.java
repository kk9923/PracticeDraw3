package com.hencoder.hencoderpracticedraw3.practice;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;

public class Practice10SetTextAlignView extends View {
    Paint paint = new Paint(Paint.ANTI_ALIAS_FLAG);
    String text = "Hello HenCoder";

    public Practice10SetTextAlignView(Context context) {
        super(context);
    }

    public Practice10SetTextAlignView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public Practice10SetTextAlignView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    {
        paint.setTextSize(120);

        // 使用 Paint.setTextAlign() 来调整文字对齐方式
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
         int baseLineX = 100;
        int baseLineY = 200 ;
        // 使用 Paint.setTextAlign() 来调整文字对齐方式

        // 第一处：使用 Paint.Align.LEFT
       // canvas.drawText(text, getWidth() / 2, 100, paint);

        // 第二处：使用 Paint.Align.CENTER
        canvas.drawText(text, baseLineX, baseLineY, paint);

        //绘制基线
        paint.setColor(Color.RED);
        canvas.drawLine(10,baseLineY,6000,baseLineY,paint);



        Paint.FontMetrics fm = paint.getFontMetrics();
        float ascent = baseLineY + fm.ascent;
        float descent = baseLineY + fm.descent;
        float top = baseLineY + fm.top;
        float bottom = baseLineY + fm.bottom;

        //绘制top
        paint.setColor(Color.BLUE);
        canvas.drawLine(10,top,6000,top,paint);

        //ascent
        paint.setColor(Color.GREEN);
        canvas.drawLine(10,ascent,6000,ascent,paint);

        //descent
        paint.setColor(Color.GREEN);
        canvas.drawLine(10,descent,6000,descent,paint);

        //bottom
        paint.setColor(Color.YELLOW);
        canvas.drawLine(10,bottom,6000,bottom,paint);

        // 第三处：使用 Paint.Align.RIGHT
       // canvas.drawText(text, getWidth() / 2, 300, paint);
    }
}
