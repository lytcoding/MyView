    package com.example.myview;

    import android.content.Context;
    import android.graphics.Canvas;
    import android.graphics.Color;
    import android.graphics.Paint;
    import android.util.AttributeSet;
    import android.view.View;

    import androidx.annotation.Nullable;

    public class BasisView extends View {
        public BasisView(Context context) {
            super(context);
        }

        public BasisView(Context context, @Nullable AttributeSet attrs) {
            super(context, attrs);
        }

        public BasisView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
            super(context, attrs, defStyleAttr);
        }

        public BasisView(Context context, @Nullable AttributeSet attrs, int defStyleAttr, int defStyleRes) {
            super(context, attrs, defStyleAttr, defStyleRes);
        }

        @Override
        protected void onDraw(Canvas canvas) {
            super.onDraw(canvas);
            //设置画笔属性
            Paint paint = new Paint();
            paint.setColor(Color.RED); //设置颜色
            paint.setAntiAlias(true);
            paint.setStyle(Paint.Style.FILL_AND_STROKE); //设置填充样式
            paint.setStrokeWidth(50); //设置画笔宽度


            //画圆
            canvas.drawCircle(175,200,150,paint);

            paint.setColor(0x7EFFFF00);
            canvas.drawCircle(190,200,100,paint);
        }
    }
