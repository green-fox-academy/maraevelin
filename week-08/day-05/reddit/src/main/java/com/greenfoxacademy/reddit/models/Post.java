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
//  private int like;
//  private String title;
//  private String url;

  public Post() {
  }

  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }

  //  public Post(int like, String title, String url) {
//    this.like = like;
//    this.title = title;
//    this.url = url;
//  }
//
//  public long getId() {
//    return id;
//  }
//
//  public void setId(long id) {
//    this.id = id;
//  }
//
//  public int getLike() {
//    return like;
//  }
//
//  public void setLike(int like) {
//    this.like = like;
//  }
//
//  public String getTitle() {
//    return title;
//  }
//
//  public void setTitle(String title) {
//    this.title = title;
//  }
//
//  public String getUrl() {
//    return url;
//  }
//
//  public void setUrl(String url) {
//    this.url = url;
//  }

}
