package com.android.monkeybusiness.gymtracker;

import android.support.v4.app.Fragment;

public class WorkoutItemActivity extends SingleFragmentActtivity {

	@Override
	protected Fragment createFragment() {
		return new WorkoutItemFragment();
	}

}
