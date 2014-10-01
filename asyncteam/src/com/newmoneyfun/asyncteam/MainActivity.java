package com.newmoneyfun.asyncteam;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageView;

import com.jeremyfeinstein.slidingmenu.lib.SlidingMenu;
import com.jeremyfeinstein.slidingmenu.lib.app.SlidingFragmentActivity;
import com.newmoneyfun.asyncteam.fragment.CommunityFragment;
import com.newmoneyfun.asyncteam.fragment.FindPeopleFragment;
import com.newmoneyfun.asyncteam.fragment.HomeFragment;
import com.newmoneyfun.asyncteam.fragment.MenuFragment;
import com.newmoneyfun.asyncteam.fragment.MenuFragment.SLMenuListOnItemClickListener;
import com.newmoneyfun.asyncteam.fragment.PagesFragment;
import com.newmoneyfun.asyncteam.fragment.PhotosFragment;
import com.newmoneyfun.asyncteam.fragment.WhatsHotFragment;

public class MainActivity extends SlidingFragmentActivity implements SLMenuListOnItemClickListener{
	
	private SlidingMenu mSlidingMenu;
	private ImageView iv_title_logo;
	
	@SuppressLint("NewApi")
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		
		setTitle("Home");
//		setTitle(R.string.sliding_title);
        setContentView(R.layout.frame_content);

        //set the Behind View
        setBehindContentView(R.layout.frame_left_menu);
        
        // customize the SlidingMenu
        mSlidingMenu = getSlidingMenu();
        mSlidingMenu.setMode(SlidingMenu.LEFT);//设置左右都可以划出SlidingMenu菜单
//        mSlidingMenu.setSecondaryMenu(R.layout.frame_right_menu);	//设置右侧菜单的布局文件
        mSlidingMenu.setSecondaryShadowDrawable(R.drawable.drawer_shadow);
        
//      mSlidingMenu.setShadowWidth(5);
//      mSlidingMenu.setBehindOffset(100);
        mSlidingMenu.setShadowDrawable(R.drawable.drawer_shadow);//设置阴影图片
        mSlidingMenu.setShadowWidthRes(R.dimen.shadow_width); //设置阴影图片的宽度
        mSlidingMenu.setBehindOffsetRes(R.dimen.slidingmenu_offset); //SlidingMenu划出时主页面显示的剩余宽度
        mSlidingMenu.setFadeDegree(0.35f);
        //设置SlidingMenu 的手势模式
        //TOUCHMODE_FULLSCREEN 全屏模式，在整个content页面中，滑动，可以打开SlidingMenu
        //TOUCHMODE_MARGIN 边缘模式，在content页面中，如果想打开SlidingMenu,你需要在屏幕边缘滑动才可以打开SlidingMenu
        //TOUCHMODE_NONE 不能通过手势打开SlidingMenu
        mSlidingMenu.setTouchModeAbove(SlidingMenu.TOUCHMODE_MARGIN);
        
        //设置 SlidingMenu 内容
        FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
        fragmentTransaction.replace(R.id.left_menu, new MenuFragment());
//        fragmentTransaction.replace(R.id.right_menu, new RightMenuFragment());
        fragmentTransaction.replace(R.id.content, new HomeFragment());
        
        fragmentTransaction.commit();
        
        iv_title_logo=(ImageView) findViewById(R.id.imgv_title_logo);
        iv_title_logo.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				 toggle();
			}
		});
        
        //使用左上方icon可点，这样在onOptionsItemSelected里面才可以监听到R.id.home
//        getActionBar().setDisplayHomeAsUpEnabled(true);
//        getActionBar().setLogo(R.drawable.ic_logo);
	}
	
	
//
//    @Override
//    public boolean onCreateOptionsMenu(Menu menu) {
//        // Inflate the menu; this adds items to the action bar if it is present.
//        getMenuInflater().inflate(R.menu.main, menu);
//        return true;
//    }
//    
//    @Override
//    public boolean onOptionsItemSelected(MenuItem item) {
//        switch (item.getItemId()) {
//        case android.R.id.home:
//            
//            toggle(); //动态判断自动关闭或开启SlidingMenu
////          getSlidingMenu().showMenu();//显示SlidingMenu
////          getSlidingMenu().showContent();//显示内容
//            return true;
//        case R.id.action_refresh:
//            
//        	Toast.makeText(getApplicationContext(), R.string.refresh, Toast.LENGTH_SHORT).show();
//            
//            return true;
//        case R.id.action_person:
//            
////        	if(mSlidingMenu.isSecondaryMenuShowing()){
////        		mSlidingMenu.showContent();
////        	}else{
////        		mSlidingMenu.showSecondaryMenu();
////        	}
//            return true;
//        default:
//            return super.onOptionsItemSelected(item);
//        }
//        
//    }

	@SuppressLint("NewApi")
	@Override
	public void selectItem(int position, String title) {
		// update the main content by replacing fragments  
	    Fragment fragment = null;  
	    switch (position) {  
	    case 0:  
	        fragment = new HomeFragment();  
	        break;  
	    case 1:  
	        fragment = new FindPeopleFragment();  
	        break;  
	    case 2:  
	        fragment = new PhotosFragment();  
	        break;  
	    case 3:  
	        fragment = new CommunityFragment();  
	        break;  
	    case 4:  
	        fragment = new PagesFragment();  
	        break;  
	    case 5:  
	        fragment = new WhatsHotFragment();  
	        break;  
	    default:  
	        break;  
	    }  
	  
	    if (fragment != null) {  
	        FragmentManager fragmentManager =getSupportFragmentManager();
	        fragmentManager.beginTransaction()  
	                .replace(R.id.content, fragment).commit();  
	        // update selected item and title, then close the drawer  
	        setTitle(title);
	        mSlidingMenu.showContent();
	    } else {  
	        // error in creating fragment  
	        Log.e("MainActivity", "Error in creating fragment");  
	    }  
	}
}
