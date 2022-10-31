package startedLearningJava;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class Trainer {

	String name;
	String department;
	String email;
	int id;

	public Trainer(String trainerName, String trainerDepartment, String trainerEmail, int trainerID) {

		name = trainerName;
		department = trainerDepartment;
		email = trainerEmail;
		id = trainerID;

	}

	public static void main(String[] args) {
		String[] name = { "Mukesh", "Hitesh", "Mukesh" };
		String[] dep = { "Testing", "Dev", "DevOps" };
		String[] email = { "mukesh@gmail.com", "mukesh@gmail.com", "mukesh@gmail.com" };
		int[] id = { 1, 2, 3 };

		Trainer Trainer1 = new Trainer(name[0], dep[0], email[0], id[0]);
		Trainer Trainer2 = new Trainer(name[1], dep[1], email[1], id[1]);
		Trainer Trainer3 = new Trainer(name[2], dep[2], email[2], id[2]);

		Trainer1.Selenium();
		Trainer2.WebDev();
		Trainer3.Devops();
	}

	public void Selenium() {

		System.out.println("Trainer 1 can teach Selenium");

	}

	public void WebDev() {

		System.out.println("Trainer 2 can teach Web Development");

	}

	public void Devops() {

		System.out.println("Trainer 3 can teach DevOps");

	}
}
