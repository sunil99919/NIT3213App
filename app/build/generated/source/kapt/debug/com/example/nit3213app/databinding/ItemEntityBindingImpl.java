package com.example.nit3213app.databinding;
import com.example.nit3213app.R;
import com.example.nit3213app.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class ItemEntityBindingImpl extends ItemEntityBinding  {

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
    private final androidx.cardview.widget.CardView mboundView0;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public ItemEntityBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 4, sIncludes, sViewsWithIds));
    }
    private ItemEntityBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (android.widget.TextView) bindings[2]
            , (android.widget.TextView) bindings[3]
            , (android.widget.TextView) bindings[1]
            );
        this.entityArchitect.setTag(null);
        this.entityLocation.setTag(null);
        this.entityName.setTag(null);
        this.mboundView0 = (androidx.cardview.widget.CardView) bindings[0];
        this.mboundView0.setTag(null);
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
        java.lang.String EntityArchitect1 = null;
        java.lang.String javaLangStringLocationEntityLocation = null;
        java.lang.String EntityName1 = null;
        com.example.nit3213app.data.api.models.Entity entity = mEntity;
        java.lang.String javaLangStringArchitectEntityArchitect = null;
        java.lang.String EntityLocation1 = null;

        if ((dirtyFlags & 0x3L) != 0) {



                if (entity != null) {
                    // read entity.architect
                    EntityArchitect1 = entity.getArchitect();
                    // read entity.name
                    EntityName1 = entity.getName();
                    // read entity.location
                    EntityLocation1 = entity.getLocation();
                }


                // read ("Architect: ") + (entity.architect)
                javaLangStringArchitectEntityArchitect = ("Architect: ") + (EntityArchitect1);
                // read ("Location: ") + (entity.location)
                javaLangStringLocationEntityLocation = ("Location: ") + (EntityLocation1);
        }
        // batch finished
        if ((dirtyFlags & 0x3L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.entityArchitect, javaLangStringArchitectEntityArchitect);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.entityLocation, javaLangStringLocationEntityLocation);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.entityName, EntityName1);
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