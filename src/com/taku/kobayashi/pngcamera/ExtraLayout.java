//  Created by 拓 小林
//  Copyright (c) 2013年 All rights reserved.

package com.taku.kobayashi.pngcamera;

import android.view.WindowManager;
import android.content.Context;
import android.util.DisplayMetrics;

public class ExtraLayout {

	//define
	private static final String TAG = "PNGCamera_ExtraLayout";
	private static final float LIST_BASE_CELL_HEIGHT = 42f;
	private static final float LIST_CELL_HEIGHT_PADDING = 10f;

	//---------------------------------------------------------------------------------------------------------------------------------------------------------------

	private static DisplayMetrics getDisplayMetrics(Context context){
		DisplayMetrics displayMetrics = new DisplayMetrics();
		((WindowManager) context.getSystemService(Context.WINDOW_SERVICE)).getDefaultDisplay().getMetrics(displayMetrics);
		return displayMetrics;
	}

	//---------------------------------------------------------------------------------------------------------------------------------------------------------------

	//端末の解像度を取得
	public static CGSize getDisplaySize(Context context){
		DisplayMetrics displayMetrics = getDisplayMetrics(context);
		return new CGSize(displayMetrics.widthPixels,displayMetrics.heightPixels);
	}

	//---------------------------------------------------------------------------------------------------------------------------------------------------------------

	public static int getListCellMinHeight(Context context){
		DisplayMetrics displayMetrics = getDisplayMetrics(context);
		int minHeight = (int)(LIST_BASE_CELL_HEIGHT * displayMetrics.density);
		return minHeight;
	}

	//---------------------------------------------------------------------------------------------------------------------------------------------------------------

	public static int getListCellHeightPadding(Context context){
		DisplayMetrics displayMetrics = getDisplayMetrics(context);
		int paddingHeight = (int)(LIST_CELL_HEIGHT_PADDING * displayMetrics.density);
		return paddingHeight;
	}

	//---------------------------------------------------------------------------------------------------------------------------------------------------------------

}