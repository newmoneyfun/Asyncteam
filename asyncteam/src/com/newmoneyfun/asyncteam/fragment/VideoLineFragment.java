package com.newmoneyfun.asyncteam.fragment;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.newmoneyfun.asyncteam.R;

public class VideoLineFragment extends Fragment {
	
	public VideoLineFragment(){}
	
	@Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
            Bundle savedInstanceState) {
 
        View rootView = inflater.inflate(R.layout.fragment_video_line, container, false);
         
        return rootView;
    }
}
