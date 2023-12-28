package app.k9mail.feature.preview.auth

import app.k9mail.core.common.oauth.OAuthConfiguration
import app.k9mail.core.common.oauth.OAuthConfigurationFactory
import app.k9mail.feature.preview.BuildConfig

class AppOAuthConfigurationFactory : OAuthConfigurationFactory {
    override fun createConfigurations(): Map<List<String>, OAuthConfiguration> {
        return mapOf(
//            createAolConfiguration(),
//            createGmailConfiguration(),
//            createMicrosoftConfiguration(),
            createYahooConfiguration(),
        )
    }

//    private fun createAolConfiguration(): Pair<List<String>, OAuthConfiguration> {
//        return listOf("imap.aol.com", "smtp.aol.com") to OAuthConfiguration(
//            clientId = BuildConfig.OAUTH_AOL_CLIENT_ID,
//            scopes = listOf("mail-w"),
//            authorizationEndpoint = "https://api.login.aol.com/oauth2/request_auth",
//            tokenEndpoint = "https://api.login.aol.com/oauth2/get_token",
//            redirectUri = "${BuildConfig.APPLICATION_ID}://oauth2redirect",
//        )
//    }
//
//    private fun createGmailConfiguration(): Pair<List<String>, OAuthConfiguration> {
//        return listOf(
//            "imap.gmail.com",
//            "imap.googlemail.com",
//            "smtp.gmail.com",
//            "smtp.googlemail.com",
//        ) to OAuthConfiguration(
//            clientId = BuildConfig.OAUTH_GMAIL_CLIENT_ID,
//            scopes = listOf("https://mail.google.com/"),
//            authorizationEndpoint = "https://accounts.google.com/o/oauth2/v2/auth",
//            tokenEndpoint = "https://oauth2.googleapis.com/token",
//            redirectUri = "${BuildConfig.APPLICATION_ID}:/oauth2redirect",
//        )
//    }
//
//    private fun createMicrosoftConfiguration(): Pair<List<String>, OAuthConfiguration> {
//        return listOf(
//            "imap.mail.yahoo.com",
//            "smtp.mail.yahoo.com",
//        ) to OAuthConfiguration(
//            clientId = BuildConfig.OAUTH_MICROSOFT_CLIENT_ID,
//            scopes = listOf(
//                "https://outlook.office.com/IMAP.AccessAsUser.All",
//                "https://outlook.office.com/SMTP.Send",
//                "offline_access",
//            ),
//            authorizationEndpoint = "https://login.microsoftonline.com/common/oauth2/v2.0/authorize",
//            tokenEndpoint = "https://login.microsoftonline.com/common/oauth2/v2.0/token",
//            redirectUri = "msauth://${BuildConfig.APPLICATION_ID}://${BuildConfig.OAUTH_MICROSOFT_REDIRECT_URI_ID}",
//        )
//    }

    private fun createYahooConfiguration(): Pair<List<String>, OAuthConfiguration> {
        return listOf(
            "imap.insa.gov.et", "smtp.insa.gov.et",
        ) to OAuthConfiguration(
            clientId = BuildConfig.OAUTH_INSA_CLIENT_ID,
            client_secret = "d6I4U6a1OH8pWvRsjCo80fnfWB0PM1xB",
            scopes = listOf(":[\"openid\",\"roles\",\"phone\",\"offline_access\",\"web-origins\",\"acr\",\"openid\",\"profile\",\"microprofile-jwt\",\"address\",\"email\"],"),
            authorizationEndpoint = "https://accounts.insa.gov.et/realms/erga/protocol/openid-connect/auth",
            tokenEndpoint = "https://accounts.insa.gov.et/realms/erga/protocol/openid-connect/token",
            // redirectUri = "com.fsck.k9.debug:/oauth2redirect",

            redirectUri = "${BuildConfig.APPLICATION_ID}://oauth2redirect",
        )
    }
}
