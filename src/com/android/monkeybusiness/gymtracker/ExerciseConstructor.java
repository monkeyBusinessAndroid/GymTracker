package com.android.monkeybusiness.gymtracker;

import java.util.ArrayList;

//TODO make this an xml 
public class ExerciseConstructor {

	private static ArrayList<Exercise> exercises;

	public static ArrayList<Exercise> createExercises() {
		if (exercises == null) {
			exercises = new ArrayList<Exercise>();
			Exercise exercise = new Exercise("Press Pecho", "sdjaskdjaskl", android.R.drawable.gallery_thumb,
					MuscleGroup.CHEST);
			Exercise exercise1 = new Exercise("Biceps", "sdjaskdjaskl", android.R.drawable.ic_btn_speak_now,
					MuscleGroup.BICEPS);
			Exercise exercise2 = new Exercise("Triceps", "sdjaskdjaskl", android.R.drawable.btn_default,
					MuscleGroup.TRICEPS);
			Exercise exercise3 = new Exercise("Espalda", "sdjaskdjaskl", android.R.drawable.btn_plus,
					MuscleGroup.BACK);
			Exercise exercise4 = new Exercise("Hombro", "sdjaskdjaskl", android.R.drawable.btn_radio,
					MuscleGroup.SHOULDERS);

			exercises.add(exercise);
			exercises.add(exercise1);
			exercises.add(exercise2);
			exercises.add(exercise3);
			exercises.add(exercise4);
			exercises.add(new Exercise(null, null, null, null));
			exercises.add(new Exercise(null, null, null, null));
			exercises.add(new Exercise(null, null, null, null));
			exercises.add(new Exercise(null, null, null, null));
			exercises.add(new Exercise(null, null, null, null));

		}

		return exercises;

	}
}
