package com.greenfoxacademy.resttesting.models.yondu_models;

public class YonduArrow {
  private String distance;
  private String time;
  private String speed;

  public YonduArrow() {
  }

  public YonduArrow(Double distance, Double time) {
    this.distance = String.format("%.1f", distance);
    this.time = String.format("%.1f", time);
    this.speed = String.format("%.1f", distance / time);
  }

  public String getDistance() {
    return distance;
  }

  public void setDistance(String distance) {
    this.distance = distance;
  }

  public String getTime() {
    return time;
  }

  public void setTime(String time) {
    this.time = time;
  }

  public String getSpeed() {
    return speed;
  }

  public void setSpeed(String speed) {
    this.speed = speed;
  }
}