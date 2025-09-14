package com.example.nit3213app.ui.details;

import androidx.lifecycle.ViewModel;
import com.example.nit3213app.data.api.models.Entity;
import dagger.hilt.android.lifecycle.HiltViewModel;
import javax.inject.Inject;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u0007\b\u0007\u00a2\u0006\u0002\u0010\u0002R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\b\u00a8\u0006\t"}, d2 = {"Lcom/example/nit3213app/ui/details/DetailsViewModel;", "Landroidx/lifecycle/ViewModel;", "()V", "entity", "Lcom/example/nit3213app/data/api/models/Entity;", "getEntity", "()Lcom/example/nit3213app/data/api/models/Entity;", "setEntity", "(Lcom/example/nit3213app/data/api/models/Entity;)V", "app_debug"})
@dagger.hilt.android.lifecycle.HiltViewModel()
public final class DetailsViewModel extends androidx.lifecycle.ViewModel {
    public com.example.nit3213app.data.api.models.Entity entity;
    
    @javax.inject.Inject()
    public DetailsViewModel() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.nit3213app.data.api.models.Entity getEntity() {
        return null;
    }
    
    public final void setEntity(@org.jetbrains.annotations.NotNull()
    com.example.nit3213app.data.api.models.Entity p0) {
    }
}