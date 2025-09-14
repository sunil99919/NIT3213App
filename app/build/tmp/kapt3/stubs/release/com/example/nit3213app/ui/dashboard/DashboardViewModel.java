package com.example.nit3213app.ui.dashboard;

import androidx.lifecycle.ViewModel;
import com.example.nit3213app.data.api.models.Entity;
import com.example.nit3213app.data.repository.AppRepository;
import dagger.hilt.android.lifecycle.HiltViewModel;
import kotlinx.coroutines.flow.StateFlow;
import javax.inject.Inject;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fJ\u0006\u0010\u0010\u001a\u00020\rR\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\t\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0011"}, d2 = {"Lcom/example/nit3213app/ui/dashboard/DashboardViewModel;", "Landroidx/lifecycle/ViewModel;", "repository", "Lcom/example/nit3213app/data/repository/AppRepository;", "(Lcom/example/nit3213app/data/repository/AppRepository;)V", "_dashboardState", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Lcom/example/nit3213app/ui/dashboard/DashboardState;", "dashboardState", "Lkotlinx/coroutines/flow/StateFlow;", "getDashboardState", "()Lkotlinx/coroutines/flow/StateFlow;", "loadEntities", "", "keypass", "", "resetState", "app_release"})
@dagger.hilt.android.lifecycle.HiltViewModel()
public final class DashboardViewModel extends androidx.lifecycle.ViewModel {
    @org.jetbrains.annotations.NotNull()
    private final com.example.nit3213app.data.repository.AppRepository repository = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.flow.MutableStateFlow<com.example.nit3213app.ui.dashboard.DashboardState> _dashboardState = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.flow.StateFlow<com.example.nit3213app.ui.dashboard.DashboardState> dashboardState = null;
    
    @javax.inject.Inject()
    public DashboardViewModel(@org.jetbrains.annotations.NotNull()
    com.example.nit3213app.data.repository.AppRepository repository) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.flow.StateFlow<com.example.nit3213app.ui.dashboard.DashboardState> getDashboardState() {
        return null;
    }
    
    public final void loadEntities(@org.jetbrains.annotations.NotNull()
    java.lang.String keypass) {
    }
    
    public final void resetState() {
    }
}