package com.android.monkeybusiness.gymtracker;

public class Exercise {

	private String name;
	private String description;
	private Integer image;
	private Enum muscleGroup;

	public Exercise(String name, String description, Integer image, Enum muscleGroup) {
		this.name = name;
		this.description = description;
		this.image = image;
		this.muscleGroup = muscleGroup;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Integer getImage() {
		return image;
	}

	public void setImage(Integer image) {
		this.image = image;
	}

	public Enum getMuscleGroup() {
		return muscleGroup;
	}

	public void setMuscleGroup(Enum muscleGroup) {
		this.muscleGroup = muscleGroup;
	}

}
