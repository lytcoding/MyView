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
            paint.setAntiAlias(true);//抗锯齿
            /**
             * Paint.Style.FILL 填充内部
             * Paint.Style.FILL_AND_STROKE 填充内部和描边
             * Paint.Style.STROKE 描边
             * */
            paint.setStyle(Paint.Style.FILL_AND_STROKE); //设置填充样式
            paint.setStrokeWidth(50); //设置画笔宽度


            //画圆
            //canvas.drawCircle(175,200,150,paint);
            //设置第二种颜色，画圆
            //paint.setColor(0x7EFFFF00);
            //canvas.drawCircle(190,200,100,paint);

            //Canvas使用
            //设置画布背景  三种方式
            canvas.drawRGB(255,0,255);
            //canvas.drawColor(Color.RED);
            //canvas.drawARGB(0xFF,0xFF,0,0xFF);

            //画直线  --直线粗细与style无关,
            canvas.drawLine(100,100,200,200,paint);
            //画多条直线
            paint.setStrokeWidth(5);//设置画笔粗细
            float[] pts = {10,10,100,100,200,200,500,500};
            canvas.drawLines(pts,paint);//每两个点连接一条线

        }
    }
