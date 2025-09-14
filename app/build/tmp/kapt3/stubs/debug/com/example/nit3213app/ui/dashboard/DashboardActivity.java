package com.example.nit3213app.ui.dashboard;

import android.content.Intent;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.example.nit3213app.databinding.ActivityDashboardBinding;
import com.example.nit3213app.ui.dashboard.adapter.EntityAdapter;
import com.example.nit3213app.ui.details.DetailsActivity;
import dagger.hilt.android.AndroidEntryPoint;

@dagger.hilt.android.AndroidEntryPoint()
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0012\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010H\u0014J\b\u0010\u0011\u001a\u00020\u000eH\u0014J\b\u0010\u0012\u001a\u00020\u000eH\u0002J\b\u0010\u0013\u001a\u00020\u000eH\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082.\u00a2\u0006\u0002\n\u0000R\u001b\u0010\u0007\u001a\u00020\b8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\t\u0010\n\u00a8\u0006\u0014"}, d2 = {"Lcom/example/nit3213app/ui/dashboard/DashboardActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "()V", "adapter", "Lcom/example/nit3213app/ui/dashboard/adapter/EntityAdapter;", "binding", "Lcom/example/nit3213app/databinding/ActivityDashboardBinding;", "viewModel", "Lcom/example/nit3213app/ui/dashboard/DashboardViewModel;", "getViewModel", "()Lcom/example/nit3213app/ui/dashboard/DashboardViewModel;", "viewModel$delegate", "Lkotlin/Lazy;", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "onResume", "setupObservers", "setupRecyclerView", "app_debug"})
public final class DashboardActivity extends androidx.appcompat.app.AppCompatActivity {
    private com.example.nit3213app.databinding.ActivityDashboardBinding binding;
    @org.jetbrains.annotations.NotNull()
    private final kotlin.Lazy viewModel$delegate = null;
    private com.example.nit3213app.ui.dashboard.adapter.EntityAdapter adapter;
    
    public DashboardActivity() {
        super();
    }
    
    private final com.example.nit3213app.ui.dashboard.DashboardViewModel getViewModel() {
        return null;
    }
    
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    private final void setupRecyclerView() {
    }
    
    private final void setupObservers() {
    }
    
    @java.lang.Override()
    protected void onResume() {
    }
}