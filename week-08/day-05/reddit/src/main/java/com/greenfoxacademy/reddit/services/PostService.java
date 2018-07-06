package com.greenfoxacademy.reddit.services;

import com.greenfoxacademy.reddit.models.Post;
import java.util.List;

public interface PostService {

  void save(Post post);

  void saveAll();

  Post getPost(long id);

  List<Post> getPosts();

  void deletePost(Post post);

  void getVote(long id, int vote);

}
