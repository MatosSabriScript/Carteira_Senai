# AGENTS.md

## Project snapshot
- Single-module Android app in `app/` using Jetpack Compose + Material 3.
- Root launcher is `app/src/main/java/com/example/carteiradigitalsenaiapp/app/MainActivity.kt`, which calls `App()`.
- Navigation is centralized in `core/designsystem/navigation/` and the UI is split by feature (`feature/auth`, `feature/home`).

## Architecture to follow
- Keep app startup thin: `MainActivity -> App() -> CarteiraDigitalTheme -> AppNavHost`.
- Put routes in `core/designsystem/navigation/Routes.kt`; current routes are `login` and `carteirinha`.
- `AppNavHost.kt` owns the Compose navigation graph and passes the shared `NavController` into screens that navigate.
- Compose state is currently local and simple: `LoginScreen.kt` holds `login`/`senha` with `remember`, while `CarteiraView.kt` passes a fixed QR payload to `CarteirinhaContent`.

## UI/convention patterns already used
- Screens are split into `*Screen.kt` wrappers plus `*Content.kt` composables for previews and layout.
- Previews are duplicated for light/dark theme using `CarteiraDigitalTheme(darkTheme = false/true)`.
- Shared styling lives in `core/designsystem/theme/` (`Theme.kt`, `Color.kt`, `Type.kt`); use that instead of ad hoc Material theming.
- Google Fonts are configured through `Type.kt` and `R.array.com_google_android_gms_fonts_certs`.
- Most visible strings are still hardcoded in composables; only `app_name` is in `res/values/strings.xml`.

## Feature-specific details
- `feature/auth/presentation/screen/LoginContent.kt` is the login UI; the button currently navigates directly to `Routes.Carteirinha.route`.
- `feature/home/presentation/screen/CarteiraContent.kt` renders the digital card with `R.drawable.universe`, `R.drawable.senai_logo`, `PerfilAluno`, and `QrCode`.
- `feature/home/presentation/component/QrCode.kt` uses ZXing (`com.google.zxing:core`) and builds a bitmap pixel-by-pixel.
- `CarteirinhaContent` uses `safeDrawingPadding()` and a full-screen `Box`/`Column` layout; preserve that pattern when adding more overlays.

## Dependencies and integration points
- Navigation: `androidx.navigation:navigation-compose:2.8.3`.
- QR generation: `com.google.zxing:core:3.5.4`.
- Compose BOM and AndroidX versions are managed in `gradle/libs.versions.toml`; prefer adding new versions there when possible.
- Manifest entry point is `.app.MainActivity` in `app/src/main/AndroidManifest.xml`.

## Workflow
- Use the Gradle wrapper from the repo root on Windows: `./gradlew.bat`.
- Common checks: `./gradlew.bat assembleDebug`, `./gradlew.bat testDebugUnitTest`, `./gradlew.bat connectedDebugAndroidTest`.
- If you touch Compose UI, prefer validating previews/screens through `assembleDebug` at minimum.

## Codebase guardrails
- Keep package structure aligned with feature boundaries; new UI should live under `feature/<area>/presentation/...`.
- Avoid introducing extra project-level repositories/settings in module Gradle files; repository declarations are centralized in `settings.gradle.kts` with `FAIL_ON_PROJECT_REPOS`.
- Preserve existing naming conventions (`LoginContent`, `CarteiraView`, `AppNavHost`, `Routes`).
- This repo currently has no checked-in repo-specific AI instructions or README, so rely on the patterns above and the linked source files as the source of truth.


