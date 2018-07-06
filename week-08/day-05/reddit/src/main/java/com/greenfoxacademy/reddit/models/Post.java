package com.greenfoxacademy.reddit.models;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Post {

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private long id;
  private int likes;
  private String title;
  private String url;

  public Post() {
  }

    public Post(int likes, String title, String url) {
    this.likes = likes;
    this.title = title;
    this.url = url;
  }

  public void getUpvoted() {
    likes += 1;
  }

  public void getDownvoted() {
    likes -= 1;
  }

  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }

  public int getLikes() {
    return likes;
  }

  public void setLikes(int likes) {
    this.likes = likes;
  }

  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public String getUrl() {
    return url;
  }

  public void setUrl(String url) {
    this.url = url;
  }

}
