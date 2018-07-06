package com.greenfoxacademy.reddit.services;

import com.greenfoxacademy.reddit.models.Post;
import com.greenfoxacademy.reddit.repositories.PostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class PostServiceImpl implements PostService{

  PostRepository postRepository;

  @Autowired
  public PostServiceImpl(PostRepository postRepository) {
    this.postRepository = postRepository;
  }

  @Override
  public void save(Post post) {
    postRepository.save(post);
  }

  @Override
  public void saveAll() {
    postRepository.saveAll(postRepository.findAll());
  }

  @Override
  public Post getPost(Long id) {
    return postRepository.findById(id).get();
  }

  @Override
  public List<Post> getPosts() {
    List<Post> posts = new ArrayList<>();
    postRepository.findAll().forEach(posts::add);
    return posts;
  }

  @Override
  public void deletePost(Post post) {
    postRepository.delete(post);
  }

  @Override
  public void getVote(Long id, int vote) {
    Post post = postRepository.findById(id).get();
    post.setLike(post.getLike() + vote);
  }
}
