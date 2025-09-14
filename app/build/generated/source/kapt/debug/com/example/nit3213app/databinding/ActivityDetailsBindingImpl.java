package com.example.nit3213app.databinding;
import com.example.nit3213app.R;
import com.example.nit3213app.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class ActivityDetailsBindingImpl extends ActivityDetailsBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = null;
    }
    // views
    @NonNull
    private final androidx.core.widget.NestedScrollView mboundView0;
    @NonNull
    private final android.widget.TextView mboundView1;
    @NonNull
    private final android.widget.TextView mboundView2;
    @NonNull
    private final android.widget.TextView mboundView3;
    @NonNull
    private final android.widget.TextView mboundView4;
    @NonNull
    private final android.widget.TextView mboundView5;
    @NonNull
    private final android.widget.TextView mboundView6;
    @NonNull
    private final android.widget.TextView mboundView7;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public ActivityDetailsBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 8, sIncludes, sViewsWithIds));
    }
    private ActivityDetailsBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            );
        this.mboundView0 = (androidx.core.widget.NestedScrollView) bindings[0];
        this.mboundView0.setTag(null);
        this.mboundView1 = (android.widget.TextView) bindings[1];
        this.mboundView1.setTag(null);
        this.mboundView2 = (android.widget.TextView) bindings[2];
        this.mboundView2.setTag(null);
        this.mboundView3 = (android.widget.TextView) bindings[3];
        this.mboundView3.setTag(null);
        this.mboundView4 = (android.widget.TextView) bindings[4];
        this.mboundView4.setTag(null);
        this.mboundView5 = (android.widget.TextView) bindings[5];
        this.mboundView5.setTag(null);
        this.mboundView6 = (android.widget.TextView) bindings[6];
        this.mboundView6.setTag(null);
        this.mboundView7 = (android.widget.TextView) bindings[7];
        this.mboundView7.setTag(null);
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
        if (BR.entity == variableId) {
            setEntity((com.example.nit3213app.data.api.models.Entity) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setEntity(@Nullable com.example.nit3213app.data.api.models.Entity Entity) {
        this.mEntity = Entity;
        synchronized(this) {
            mDirtyFlags |= 0x1L;
        }
        notifyPropertyChanged(BR.entity);
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
        int entityYearCompleted = 0;
        java.lang.String entityArchitect = null;
        java.lang.String integerToStringEntityHeight = null;
        java.lang.String entityDescription = null;
        java.lang.String integerToStringEntityYearCompleted = null;
        int entityHeight = 0;
        java.lang.String entityName = null;
        java.lang.String entityStyle = null;
        com.example.nit3213app.data.api.models.Entity entity = mEntity;
        java.lang.String entityLocation = null;

        if ((dirtyFlags & 0x3L) != 0) {



                if (entity != null) {
                    // read entity.yearCompleted
                    entityYearCompleted = entity.getYearCompleted();
                    // read entity.architect
                    entityArchitect = entity.getArchitect();
                    // read entity.description
                    entityDescription = entity.getDescription();
                    // read entity.height
                    entityHeight = entity.getHeight();
                    // read entity.name
                    entityName = entity.getName();
                    // read entity.style
                    entityStyle = entity.getStyle();
                    // read entity.location
                    entityLocation = entity.getLocation();
                }


                // read Integer.toString(entity.yearCompleted)
                integerToStringEntityYearCompleted = java.lang.Integer.toString(entityYearCompleted);
                // read Integer.toString(entity.height)
                integerToStringEntityHeight = java.lang.Integer.toString(entityHeight);
        }
        // batch finished
        if ((dirtyFlags & 0x3L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView1, entityName);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView2, entityArchitect);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView3, entityLocation);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView4, integerToStringEntityYearCompleted);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView5, entityStyle);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView6, integerToStringEntityHeight);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView7, entityDescription);
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): entity
        flag 1 (0x2L): null
    flag mapping end*/
    //end
}