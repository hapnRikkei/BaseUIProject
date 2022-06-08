package com.well.designsystem.databinding;
import com.well.designsystem.R;
import com.well.designsystem.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class ListItemButtonctaBindingImpl extends ListItemButtonctaBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.ivStartIcon, 1);
        sViewsWithIds.put(R.id.tvTitle, 2);
        sViewsWithIds.put(R.id.viewButton, 3);
        sViewsWithIds.put(R.id.ivEndIcon, 4);
        sViewsWithIds.put(R.id.btnSecondary, 5);
        sViewsWithIds.put(R.id.btnPrimary, 6);
        sViewsWithIds.put(R.id.btnPlain, 7);
    }
    // views
    @NonNull
    private final android.widget.RelativeLayout mboundView0;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public ListItemButtonctaBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 8, sIncludes, sViewsWithIds));
    }
    private ListItemButtonctaBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (com.well.designsystem.view.button.WellButton) bindings[7]
            , (com.well.designsystem.view.button.WellButton) bindings[6]
            , (com.well.designsystem.view.button.WellButton) bindings[5]
            , (androidx.appcompat.widget.AppCompatImageView) bindings[4]
            , (androidx.appcompat.widget.AppCompatImageView) bindings[1]
            , (com.well.designsystem.view.CustomTextView) bindings[2]
            , (android.widget.FrameLayout) bindings[3]
            );
        this.mboundView0 = (android.widget.RelativeLayout) bindings[0];
        this.mboundView0.setTag(null);
        setRootTag(root);
        // listeners
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x1L;
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
            return variableSet;
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
        // batch finished
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): null
    flag mapping end*/
    //end
}