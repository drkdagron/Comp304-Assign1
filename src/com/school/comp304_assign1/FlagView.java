package com.school.comp304_assign1;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.view.View;

public class FlagView extends View {
	Paint paint;
	
	public FlagView(Context context) {
		super(context);
		paint = new Paint();
		paint.setColor(Color.RED);
		paint.setStrokeWidth(5);
	}

	@Override
	public void onDraw(Canvas canvas)
	{
		//canvas.drawRect(LEFT, TOP, RIGHT, BOTTOM, PAINT)
		canvas.drawRect(0,0,50,50, paint);
		canvas.drawRect(100, 0, 150, 50, paint);
		
		//canvas.drawLine(X1,Y1, X2,Y2, paint)
		canvas.drawLine(0, 0, 100, 100, paint);
		canvas.drawLine(100, 100, 0, 100, paint);
		canvas.drawLine(100, 100, 100,0, paint);
		
		
		
		//canvas.drawRect(new Rect(0,0,30,40), paint);
		//canvas.drawRect(new Rect(70,0,30,40), paint);
	}
}
