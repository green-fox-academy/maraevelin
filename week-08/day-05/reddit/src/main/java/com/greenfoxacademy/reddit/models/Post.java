package com.greenfoxacademy.reddit.models;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@Getter
@Setter
public class Post {

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private Long id;
  private int like = 0;
  private String title;
  private String url;

  public Post() {

  }

  public Post(String title, String url) {
    this.title = title;
    this.url = url;
  }

}
