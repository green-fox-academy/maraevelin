package com.greenfoxacademy.resttesting.models.yondu_models;

public class Arrow {
  private float distance;
  private float time;
  private float speed = distance / time;

  public Arrow() {
  }

  public Arrow(float distance, float time) {
    this.distance = distance;
    this.time = time;
  }

  public float getDistance() {
    return distance;
  }

  public void setDistance(float distance) {
    this.distance = distance;
  }

  public float getTime() {
    return time;
  }

  public void setTime(float time) {
    this.time = time;
  }

  public float getSpeed() {
    return speed;
  }

  public void setSpeed(float speed) {
    this.speed = speed;
  }
}
