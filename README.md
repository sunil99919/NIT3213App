# NIT3213 Android Application

An Android application developed for the **NIT3213 Final Assignment**.  
This project demonstrates **API integration**, **UI design**, and **Android development best practices** using a modern **MVVM architecture**.

---

## Features

- **Login Screen**
   - Authenticate with `username = first name` and `password = student ID (without 's')`
   - Handles invalid credentials with error messages
   - Navigates to the Dashboard on successful login

- **Dashboard Screen**
   - Fetches list of entities from `/dashboard/{keypass}`
   - Displays results in a RecyclerView with card-based layout
   - Each item shows summary only (Name, Architect, Location)
   - Tap on an item → navigates to the Details screen

- **Details Screen**
   - Displays **all fields** of the entity:
      - Name
      - Architect
      - Location
      - Year Completed
      - Style
      - Height
      - Description
   - Presented in a clean scrollable UI

- **Error & Loading States**
   - Progress bar while loading
   - Error messages shown on login or data load failure
   - Toast message feedback

---

## API Integration

**Base URL:**  
`https://nit3213api.onrender.com/`

### Login Endpoint

- **POST** `/br/auth` (or `/footscray/auth`, `/sydney/auth` depending on campus)
- **Request body:**

```json
{
  "username": "YourFirstName",
  "password": "StudentIDWithoutS"
}
```

- **Success response:**

```json
{
  "keypass": "architecture"
}
```

### Dashboard Endpoint

- **GET** `/dashboard/{keypass}`
- **Success response example:**

```json
{
  "entities": [
    {
      "name": "Eiffel Tower",
      "architect": "Gustave Eiffel",
      "location": "Paris, France",
      "yearCompleted": 1889,
      "style": "Structural Expressionism",
      "height": 324,
      "description": "An iron lattice tower on the Champ de Mars in Paris..."
    }
  ],
  "entityTotal": 7
}
```

---

## Tech Stack

- **Language**: Kotlin
- **Architecture**: MVVM (Model-View-ViewModel)
- **Networking**: Retrofit + OkHttp + Gson
- **Dependency Injection**: Hilt
- **Concurrency**: Coroutines + StateFlow
- **UI**: ConstraintLayout, RecyclerView, CardView, ViewBinding, DataBinding
- **Testing**: JUnit, Mockito, Coroutine Test framework
- **Parcelization**: Kotlin @Parcelize for entity passing between activities

---

## Project Structure

```
NIT3213App/
├── app/
│   ├── src/
│   │   ├── main/
│   │   │   ├── java/com/example/nit3213app/
│   │   │   │   ├── data/
│   │   │   │   │   ├── api/
│   │   │   │   │   │   ├── ApiService.kt
│   │   │   │   │   │   ├── models/
│   │   │   │   │   │   │   ├── LoginRequest.kt
│   │   │   │   │   │   │   ├── LoginResponse.kt
│   │   │   │   │   │   │   ├── DashboardResponse.kt
│   │   │   │   │   │   │   └── Entity.kt
│   │   │   │   │   │   └── RetrofitInstance.kt
│   │   │   │   │   ├── repository/
│   │   │   │   │   │   └── AppRepository.kt
│   │   │   │   │   └── di/
│   │   │   │   │       ├── AppModule.kt
│   │   │   │   │       └── NetworkModule.kt
│   │   │   │   ├── ui/
│   │   │   │   │   ├── login/
│   │   │   │   │   │   ├── LoginActivity.kt
│   │   │   │   │   │   ├── LoginViewModel.kt
│   │   │   │   │   │   └── LoginViewModelFactory.kt
│   │   │   │   │   ├── dashboard/
│   │   │   │   │   │   ├── DashboardActivity.kt
│   │   │   │   │   │   ├── DashboardViewModel.kt
│   │   │   │   │   │   ├── DashboardViewModelFactory.kt
│   │   │   │   │   │   └── adapter/
│   │   │   │   │   │       ├── EntityAdapter.kt
│   │   │   │   │   │       └── EntityViewHolder.kt
│   │   │   │   │   └── details/
│   │   │   │   │       ├── DetailsActivity.kt
│   │   │   │   │       └── DetailsViewModel.kt
│   │   │   │   ├── utils/
│   │   │   │   │   ├── Constants.kt
│   │   │   │   │   └── Extensions.kt
│   │   │   │   └── App.kt
│   │   │   ├── res/
│   │   │   │   ├── layout/
│   │   │   │   │   ├── activity_login.xml
│   │   │   │   │   ├── activity_dashboard.xml
│   │   │   │   │   ├── activity_details.xml
│   │   │   │   │   ├── item_entity.xml
│   │   │   │   │   └── layout_error.xml
│   │   │   │   ├── values/
│   │   │   │   │   ├── strings.xml
│   │   │   │   │   ├── colors.xml
│   │   │   │   │   └── themes.xml
│   │   │   └── AndroidManifest.xml
│   │   ├── test/
│   │   │   └── java/com/example/nit3213app/
│   │   │       ├── LoginViewModelTest.kt
│   │   │       └── DashboardViewModelTest.kt
│   │   └── androidTest/
│   │       └── java/com/example/nit3213app/
│   │           ├── LoginActivityTest.kt
│   │           └── DashboardActivityTest.kt
│   └── build.gradle
├── build.gradle
├── settings.gradle
└── README.md
```

---

## Testing

Unit tests are provided for major ViewModels:

- `LoginViewModelTest` → tests empty, valid, and invalid login states
- `DashboardViewModelTest` → tests success and error states for data loading

Instrumented tests for UI flows:

- `LoginActivityTest` → tests UI interactions and navigation
- `DashboardActivityTest` → tests RecyclerView and item clicks

**Run unit tests:**

```bash
./gradlew test
```

**Run instrumented tests:**

```bash
./gradlew connectedAndroidTest
```

**Expected:** All tests pass with coverage for Success and Error states

---

## Git & Commit Practices

- Incremental commits with clear messages
---

## Author

- **Name**: Sunil Sevda
- **Student ID**: S8110082
- **Campus**: Brisbane

---

## License

This project was created as part of the NIT3213 coursework.  
It is for educational purposes only and not intended for production use.
