package com.newmoneyfun.asyncteam.view;


import android.app.Activity;
import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnTouchListener;
import android.view.ViewGroup.LayoutParams;
import android.widget.Button;
import android.widget.PopupWindow;

import com.newmoneyfun.asyncteam.R;

public class SelectPicPopupWindow extends PopupWindow {


	private Button  btn_cancel;
	private View mMenuView;

	public SelectPicPopupWindow(final Activity context,OnClickListener itemsOnClick) {
		super(context);
		LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
		mMenuView = inflater.inflate(R.layout.bottomdialog, null);
		
		int h = context.getWindowManager().getDefaultDisplay().getHeight();
		int w = context.getWindowManager().getDefaultDisplay().getWidth();
		btn_cancel = (Button) mMenuView.findViewById(R.id.btn_cancel);
		btn_cancel.setOnClickListener(new OnClickListener() {

			public void onClick(View v) {
//				SaveDate.saveDate(context, new OAuthV2()); 
				context.finish();
			}
		});
		this.setContentView(mMenuView);
		this.setWidth(w/2+50);
		this.setHeight(LayoutParams.WRAP_CONTENT);
		this.setFocusable(true);
//		this.setAnimationStyle(R.style.mystyle);
		ColorDrawable dw = new ColorDrawable(0000000000);
		this.setBackgroundDrawable(dw);
		mMenuView.setOnTouchListener(new OnTouchListener() {
			
			public boolean onTouch(View v, MotionEvent event) {
				
				int height = mMenuView.findViewById(R.id.pop_layout).getTop();
				int y=(int) event.getY();
				if(event.getAction()==MotionEvent.ACTION_UP){
					if(y<height){
						dismiss();
					}
				}				
				return true;
			}
		});

	}
	public interface IInter{
		
		
	}
	public interface IInter1 extends IInter{
		public void ll();
		
	}
	
	private class Mc implements IInter1{

		private void f(){
			IInter fsd=new IInter1() {
				
				@Override
				public void ll() {
					// TODO Auto-generated method stub
					
				}
			};
		}
		
		
		@Override
		public void ll() {
			// TODO Auto-generated method stub
			
		}
		
	}

}
