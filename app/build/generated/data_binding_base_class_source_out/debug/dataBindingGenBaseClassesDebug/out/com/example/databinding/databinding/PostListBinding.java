package com.example.databinding.databinding;

import android.databinding.Bindable;
import android.databinding.DataBindingComponent;
import android.databinding.DataBindingUtil;
import android.databinding.ViewDataBinding;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.example.databinding.Post;

public abstract class PostListBinding extends ViewDataBinding {
  @NonNull
  public final TextView postBody;

  @NonNull
  public final TextView postTitle;

  @NonNull
  public final TextView userId;

  @Bindable
  protected Post mPost;

  protected PostListBinding(DataBindingComponent _bindingComponent, View _root,
      int _localFieldCount, TextView postBody, TextView postTitle, TextView userId) {
    super(_bindingComponent, _root, _localFieldCount);
    this.postBody = postBody;
    this.postTitle = postTitle;
    this.userId = userId;
  }

  public abstract void setPost(@Nullable Post post);

  @Nullable
  public Post getPost() {
    return mPost;
  }

  @NonNull
  public static PostListBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup root,
      boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  @NonNull
  public static PostListBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup root,
      boolean attachToRoot, @Nullable DataBindingComponent component) {
    return DataBindingUtil.<PostListBinding>inflate(inflater, com.example.databinding.R.layout.post_list, root, attachToRoot, component);
  }

  @NonNull
  public static PostListBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  @NonNull
  public static PostListBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable DataBindingComponent component) {
    return DataBindingUtil.<PostListBinding>inflate(inflater, com.example.databinding.R.layout.post_list, null, false, component);
  }

  public static PostListBinding bind(@NonNull View view) {
    return bind(view, DataBindingUtil.getDefaultComponent());
  }

  public static PostListBinding bind(@NonNull View view, @Nullable DataBindingComponent component) {
    return (PostListBinding)bind(component, view, com.example.databinding.R.layout.post_list);
  }
}
