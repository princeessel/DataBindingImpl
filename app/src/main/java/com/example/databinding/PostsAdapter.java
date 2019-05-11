package com.example.databinding;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.example.databinding.databinding.PostListBinding;
import java.util.List;

public class PostsAdapter extends RecyclerView.Adapter<PostsAdapter.ViewHolder> {
    private List<Post> postList;

    @NonNull
    @Override
    public PostsAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        LayoutInflater layoutInflater = LayoutInflater.from(viewGroup.getContext());
        PostListBinding postListBinding= PostListBinding.inflate(layoutInflater,viewGroup, false);
      return new ViewHolder(postListBinding);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder viewHolder, int i) {
        Post post = postList.get(i);
        viewHolder.bind(post);
    }

    @Override
    public int getItemCount() {
        if (postList == null) {
            return 0;
        }
        return postList.size();
    }

    public void setPost(List<Post> posts) {
        this.postList = posts;
    }


    public class ViewHolder extends RecyclerView.ViewHolder {
        private final PostListBinding postListBinding;

        public ViewHolder(PostListBinding postListBinding) {
            super(postListBinding.getRoot());
           this.postListBinding=postListBinding;
        }

        public void bind(Post post) {
            postListBinding.setPost(post);
            postListBinding.executePendingBindings();
            }
        }
    }
