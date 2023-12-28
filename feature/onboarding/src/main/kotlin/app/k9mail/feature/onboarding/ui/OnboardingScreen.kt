package app.k9mail.feature.onboarding.ui

import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview

@Composable
fun OnboardingScreen(
    onStartClick: () -> Unit,
    // onImportClick: () -> Unit,
) {
    OnboardingContent(
        onStartClick = onStartClick,
        // onImportClick = onImportClick,
    )
}

@Preview
@Composable
internal fun OnboardingScreenPreview() {
    OnboardingScreen(
        onStartClick = {},
       // onImportClick = {},
    )
}
