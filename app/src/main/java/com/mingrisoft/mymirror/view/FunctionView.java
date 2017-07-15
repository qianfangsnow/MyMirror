package com.mingrisoft.mymirror.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.LinearLayout;
import android.view.View;

import com.mingrisoft.mymirror.R;

/**
 * Created by Administrator on 2017/7/14 0014.
 */

public class FunctionView extends LinearLayout implements View.OnClickListener {
    private LayoutInflater mInflater;
    private onFunctionViewItemClickListener listener;
    public interface onFunctionViewItemClickListener{
        void hint();
        void choose();
        void down();
        void up();
    }
    public FunctionView(Context context) {
        super(context);
    }

    public FunctionView(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public FunctionView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        mInflater=LayoutInflater.from(context);
    }
    private void init(){
        View view=mInflater.inflate(R.layout.view_function,this);
    }

    @Override
    public void onClick(View view) {

    }
}
