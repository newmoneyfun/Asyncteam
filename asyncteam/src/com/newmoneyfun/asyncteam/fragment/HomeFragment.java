package com.newmoneyfun.asyncteam.fragment;

import java.util.ArrayList;
import java.util.List;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.view.PagerTabStrip;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.newmoneyfun.asyncteam.R;
import com.newmoneyfun.asyncteam.adapter.ContentFragmentPagerAdapter;
import com.newmoneyfun.asyncteam.entity.ContentBean;

public class HomeFragment extends Fragment {
	
	private ViewPager mViewPager;
	private static final String[] titles = {"One","Two","Three","Four","Five"};
	private List<ContentBean> list = new ArrayList<ContentBean>();
	private ContentFragmentPagerAdapter mAdapter;
	
	public HomeFragment(){}
	
	@Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
            Bundle savedInstanceState) {
 
        View rootView = inflater.inflate(R.layout.fragment_home, container, false);
        
        initData();
        findView(rootView);
        
        return rootView;
    }

	private void initData() {
		
		for(int i=0;i<titles.length;i++){
			
			ContentBean cb = new ContentBean();
			cb.setTitle(titles[i]);
			cb.setContent(titles[i]+"_"+(i+1));
			
			list.add(cb);
		}
	}

	private void findView(View rootView) {
		
		mViewPager = (ViewPager) rootView.findViewById(R.id.mViewPager);
		
		PagerTabStrip mPagerTabStrip = (PagerTabStrip) rootView.findViewById(R.id.mPagerTabStrip);
		mPagerTabStrip.setTabIndicatorColor(getResources().getColor(R.color.select_text_color)); 
		
		mAdapter = new ContentFragmentPagerAdapter(getChildFragmentManager(),list);
		mViewPager.setAdapter(mAdapter);
	}

	
	
	@Override
	public void onStart() {
		
		if(mAdapter!=null){
			mAdapter.notifyDataSetChanged();
		}
		
		super.onStart();
	}
}
