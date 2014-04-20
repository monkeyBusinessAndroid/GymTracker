package com.android.monkeybusiness.gymtracker;

public enum MuscleGroup {
	// TODO Add missing groups
	SHOULDERS("Shoulders"), BACK("Back"), CHEST("Chest"), BICEPS("Biceps"), TRICEPS("Triceps");

	private String muscleGroup;

	private MuscleGroup(String s) {
		muscleGroup = s;
	}

	public String getStatusCode() {
		return muscleGroup;
	}

}
