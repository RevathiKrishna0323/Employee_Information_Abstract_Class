/*
 * Author Name: Revathi
 * Date: 13-10-2022
 * Created With: IntelliJ IDEA Community Edition
 */

package com.io.github;

public class Manager extends Employee {
    private int teamSize;
    private int teamRatings;

    public Manager(int teamSize, int teamRatings) {
        this.teamSize = teamSize;
        this.teamRatings = teamRatings;
    }

    public Manager(String employeeName, String code, String dateOfBirth, String age, String salary, int teamSize, int teamRatings) {
        super(employeeName, code, dateOfBirth, age, salary);
        this.teamSize = teamSize;
        this.teamRatings = teamRatings;
    }

    public int getTeamSize() {
        return teamSize;
    }

    public void setTeamSize(int teamSize) {
        this.teamSize = teamSize;
    }

    public int getTeamRatings() {
        return teamRatings;
    }

    public void setTeamRatings(int teamRatings) {
        this.teamRatings = teamRatings;
    }
}
