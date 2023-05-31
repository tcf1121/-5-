package lsp;

public class Main {
	public static void main(String[] args) {
		LecturerNomal lect01 = new LecturerNomal();
		lect01.Lecturer();
		LecturerNight lect02 = new LecturerNight();
		lect02.Lecturer();
		LecturerAtGS lect03 = new LecturerAtGS();
		lect03.Lecturer();
		LecturerWithWork lect04 = new LecturerWithWork();
		lect04.Lecturer();
	}
}
