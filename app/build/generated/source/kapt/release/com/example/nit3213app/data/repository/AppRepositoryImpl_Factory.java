package com.example.nit3213app.data.repository;

import com.example.nit3213app.data.api.ApiService;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.processing.Generated;
import javax.inject.Provider;

@ScopeMetadata
@QualifierMetadata
@DaggerGenerated
@Generated(
    value = "dagger.internal.codegen.ComponentProcessor",
    comments = "https://dagger.dev"
)
@SuppressWarnings({
    "unchecked",
    "rawtypes",
    "KotlinInternal",
    "KotlinInternalInJava"
})
public final class AppRepositoryImpl_Factory implements Factory<AppRepositoryImpl> {
  private final Provider<ApiService> apiServiceProvider;

  public AppRepositoryImpl_Factory(Provider<ApiService> apiServiceProvider) {
    this.apiServiceProvider = apiServiceProvider;
  }

  @Override
  public AppRepositoryImpl get() {
    return newInstance(apiServiceProvider.get());
  }

  public static AppRepositoryImpl_Factory create(Provider<ApiService> apiServiceProvider) {
    return new AppRepositoryImpl_Factory(apiServiceProvider);
  }

  public static AppRepositoryImpl newInstance(ApiService apiService) {
    return new AppRepositoryImpl(apiService);
  }
}
