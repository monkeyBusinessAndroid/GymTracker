package com.android.monkeybusiness.gymtracker;

import java.util.ArrayList;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ArrayAdapter;
import android.widget.GridView;
import android.widget.ImageView;

public class WorkoutFragment extends Fragment {

	private static final boolean ATTACH_TO_ROOT = false;
	private GridView gridView;
	private ArrayList<WorkoutItem> workoutItems;

	// = ExerciseConstructor.createExercises();

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setHasOptionsMenu(true);
	};

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
		View view = inflater.inflate(R.layout.fragment_excersise_list, container, ATTACH_TO_ROOT);
		// TODO If i can make local
		gridView = getGridView(view);

		// TODO move this
		gridView.setOnItemClickListener(new OnItemClickListener() {

			@Override
			public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
				WorkoutItem workoutItem = workoutItems.get(position);
				Intent intent = new Intent(getActivity(), WorkoutItemActivity.class);
				startActivity(intent);
			}
		});
		setupAdapter();
		return view;

	}

	@Override
	public void onCreateOptionsMenu(Menu menu, MenuInflater inflater) {
		super.onCreateOptionsMenu(menu, inflater);
		inflater.inflate(R.menu.gym_tracker, menu);
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		boolean itemSelected = false;
		switch (item.getItemId()) {
		case R.id.add_workout_item_menu_item:
			Intent intent = new Intent(getActivity(), WorkoutItemActivity.class);
			startActivity(intent);
			itemSelected = true;
			break;

		default:
			itemSelected = false;
			break;
		}
		return itemSelected;
	}

	private GridView getGridView(View view) {
		return (GridView) view.findViewById(R.id.gridView);
	}

	private void setupAdapter() {
		if (getActivity() != null || gridView != null) {
			if (workoutItems != null) {
				WorkoutFragment.this.gridView.setAdapter(new ExerciseListAdapter(getActivity(), workoutItems));
			} else {
				WorkoutFragment.this.gridView.setAdapter(null);
			}
		}
	}

	// TODO Remove
	// TODO Change exercise to workoutItem
	private class ExerciseListAdapter extends ArrayAdapter<WorkoutItem> {

		public ExerciseListAdapter(Context context, ArrayList<WorkoutItem> workoutItems) {
			super(getActivity(), 0, workoutItems);
		}

		@Override
		public View getView(int position, View convertView, ViewGroup parent) {
			if (convertView == null) {
				convertView = getActivity().getLayoutInflater().inflate(R.layout.exercise_gallery_item, parent,
						false);
			}

			ImageView imageView = (ImageView) convertView.findViewById(R.id.gallery_item_imageView);

			imageView.setImageResource(android.R.drawable.ic_delete);
			WorkoutItem workoutItem = getItem(position);
			if (workoutItem.getExercise().getImage() != null) {
				imageView.setImageResource(workoutItem.getExercise().getImage());
			}

			return convertView;
		}
	}
}
