package com.android.monkeybusiness.gymtracker;

public class WorkoutItem {

	private String photoId;
	private float weight;
	private String difficulty;
	private Exercise exercise;

	// private String
	// private String
	// private String
	// private String
	// private String

	public String getPhotoId() {
		return photoId;
	}

	public void setPhotoId(String photoId) {
		this.photoId = "@drawable/shoulder";
	}

	public float getWeight() {
		return weight;
	}

	public void setWeight(float weight) {
		this.weight = weight;
	}

	public String getDifficulty() {
		return difficulty;
	}

	public void setDifficulty(String difficulty) {
		this.difficulty = difficulty;
	}

	public Exercise getExercise() {
		return exercise;
	}

	public void setExercise(Exercise exercise) {
		this.exercise = exercise;
	}
}
