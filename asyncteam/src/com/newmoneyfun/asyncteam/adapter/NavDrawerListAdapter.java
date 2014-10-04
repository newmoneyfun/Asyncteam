package com.newmoneyfun.asyncteam.adapter;

import java.util.List;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.newmoneyfun.asyncteam.R;
import com.newmoneyfun.asyncteam.entity.NavDrawerItem;

public class NavDrawerListAdapter extends BaseAdapter {
	
	private List<NavDrawerItem> navDrawerItems;
	LayoutInflater mInfalter = null;
	Context context;
	
	public NavDrawerListAdapter(Context context, List<NavDrawerItem> navDrawerItems){
		this.navDrawerItems = navDrawerItems;
		this.context=context;
		mInfalter = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
	}

	@Override
	public int getCount() {
		return navDrawerItems.size();
	}

	@Override
	public Object getItem(int position) {		
		return navDrawerItems.get(position);
	}

	@Override
	public long getItemId(int position) {
		return position;
	}

	@Override
	public View getView(int position, View convertView, ViewGroup parent) {
		
		Holder holder;
		View view;
		if (convertView == null) {
			view =mInfalter.inflate(R.layout.drawer_list_item, null);
			holder=new Holder(view);
			view.setTag(holder);
        }else{
        	view=convertView;
        	holder=(Holder) convertView.getTag();
        }
         
		holder.imgIcon.setBackgroundDrawable(context.getResources().getDrawable(navDrawerItems.get(position).getIcon()));        
		holder.txtTitle.setText(navDrawerItems.get(position).getTitle());
        
        // displaying count
        // check whether it set visible or not
        if(navDrawerItems.get(position).getCounterVisibility()){
        	holder.txtCount.setText(navDrawerItems.get(position).getCount());
        }else{
        	// hide the counter view
        	holder.txtCount.setVisibility(View.GONE);
        }
        
        return view;
	}
	
	
	private static class Holder{
		ImageView imgIcon;
		TextView txtTitle;
		TextView txtCount;
		public Holder(View convertView) {
			  imgIcon = (ImageView) convertView.findViewById(R.id.icon);
		      txtTitle = (TextView) convertView.findViewById(R.id.title);
		      txtCount = (TextView) convertView.findViewById(R.id.counter);
		}
	}

}
