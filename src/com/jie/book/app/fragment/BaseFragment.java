package com.jie.book.app.fragment;

import android.app.Dialog;
import android.os.Bundle;
import android.support.v4.app.Fragment;

import com.jie.book.app.activity.BaseActivity;
import com.jie.book.app.read.BookCatchManager;

public abstract class BaseFragment extends Fragment {
	public BookCatchManager chatchManager;
	public BaseActivity activity;
	protected Dialog dialog;

	protected abstract void initUI();

	protected abstract void initData();

	public void onActivityCreated(Bundle paramBundle) {
		super.onActivityCreated(paramBundle);
		initUI();
		initData();
	}

	public void onCreate(Bundle paramBundle) {
		super.onCreate(paramBundle);
		this.activity = (BaseActivity) getActivity();
		this.chatchManager = new BookCatchManager(activity);
	}

	/**
	 * 默认时间LENGTH_LONG
	 */
	public void showToast(String msg) {
		activity.showToast(msg);
	}

	/**
	 * @param msg
	 * @param length
	 *            显示时间
	 */
	public void showToastLong(String msg) {
		activity.showToastLong(msg);
	}
}