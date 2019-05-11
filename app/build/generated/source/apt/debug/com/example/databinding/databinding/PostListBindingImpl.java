package com.example.databinding.databinding;
import com.example.databinding.R;
import com.example.databinding.BR;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class PostListBindingImpl extends PostListBinding  {

    @Nullable
    private static final android.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = null;
    }
    // views
    @NonNull
    private final android.widget.LinearLayout mboundView0;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public PostListBindingImpl(@Nullable android.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 4, sIncludes, sViewsWithIds));
    }
    private PostListBindingImpl(android.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (android.widget.TextView) bindings[3]
            , (android.widget.TextView) bindings[2]
            , (android.widget.TextView) bindings[1]
            );
        this.mboundView0 = (android.widget.LinearLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.postBody.setTag(null);
        this.postTitle.setTag(null);
        this.userId.setTag(null);
        setRootTag(root);
        // listeners
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x2L;
        }
        requestRebind();
    }

    @Override
    public boolean hasPendingBindings() {
        synchronized(this) {
            if (mDirtyFlags != 0) {
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean setVariable(int variableId, @Nullable Object variable)  {
        boolean variableSet = true;
        if (BR.post == variableId) {
            setPost((com.example.databinding.Post) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setPost(@Nullable com.example.databinding.Post Post) {
        this.mPost = Post;
        synchronized(this) {
            mDirtyFlags |= 0x1L;
        }
        notifyPropertyChanged(BR.post);
        super.requestRebind();
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
        }
        return false;
    }

    @Override
    protected void executeBindings() {
        long dirtyFlags = 0;
        synchronized(this) {
            dirtyFlags = mDirtyFlags;
            mDirtyFlags = 0;
        }
        int androidDatabindingViewDataBindingSafeUnboxPostId = 0;
        java.lang.Integer postId = null;
        java.lang.String PostTitle1 = null;
        java.lang.String PostBody1 = null;
        com.example.databinding.Post post = mPost;
        java.lang.String integerToStringPostId = null;

        if ((dirtyFlags & 0x3L) != 0) {



                if (post != null) {
                    // read post.id
                    postId = post.getId();
                    // read post.title
                    PostTitle1 = post.getTitle();
                    // read post.body
                    PostBody1 = post.getBody();
                }


                // read android.databinding.ViewDataBinding.safeUnbox(post.id)
                androidDatabindingViewDataBindingSafeUnboxPostId = android.databinding.ViewDataBinding.safeUnbox(postId);


                // read Integer.toString(android.databinding.ViewDataBinding.safeUnbox(post.id))
                integerToStringPostId = java.lang.Integer.toString(androidDatabindingViewDataBindingSafeUnboxPostId);
        }
        // batch finished
        if ((dirtyFlags & 0x3L) != 0) {
            // api target 1

            this.postBody.setText(PostBody1);
            this.postTitle.setText(PostTitle1);
            this.userId.setText(integerToStringPostId);
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): post
        flag 1 (0x2L): null
    flag mapping end*/
    //end
}