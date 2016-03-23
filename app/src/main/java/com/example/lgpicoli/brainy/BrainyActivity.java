package com.example.lgpicoli.brainy;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.Rect;
import android.view.Display;
import android.view.View;
import android.view.WindowManager;

import java.util.Random;

/**
 * Created by lgpicoli on 3/23/16.
 */
public class BrainyActivity extends View {

    private int screenWidth, screenHeight;
    private Bitmap brainyBm;

    public BrainyActivity(Context context) {
        super(context);

        this.syncDimensions(context);

    }

    private void syncDimensions(Context context) {
        WindowManager wm = (WindowManager) context.getSystemService(Context.WINDOW_SERVICE);
        Display display = wm.getDefaultDisplay();
        Point size = new Point();
        display.getSize(size);

        this.screenWidth = size.x;
        this.screenHeight = size.y;
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

        Paint blackRectPaintBrush = new Paint();
        blackRectPaintBrush.setColor(Color.BLACK);
        blackRectPaintBrush.setStyle(Paint.Style.FILL);

        Rect rect = new Rect();
        rect.set(0, 0, this.screenWidth, this.screenHeight);

        canvas.drawRect(rect, blackRectPaintBrush);

        Paint whitePaintbrushFill = new Paint();
            whitePaintbrushFill.setColor(Color.WHITE);
        whitePaintbrushFill.setStyle(Paint.Style.FILL);

        canvas.drawCircle(screenWidth/2, screenHeight/2, 100, whitePaintbrushFill);

        Bitmap sourceBm = BitmapFactory.decodeResource(getResources(), R.mipmap.brainies);
        brainyBm = Bitmap.createBitmap(sourceBm, 100, 100, 100, 100);
        canvas.drawBitmap(brainyBm, 100, 100, null);
    }
}
