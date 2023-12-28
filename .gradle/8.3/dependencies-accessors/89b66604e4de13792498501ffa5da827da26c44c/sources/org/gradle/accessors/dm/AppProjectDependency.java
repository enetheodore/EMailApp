package org.gradle.accessors.dm;

import org.gradle.api.NonNullApi;
import org.gradle.api.artifacts.ProjectDependency;
import org.gradle.api.internal.artifacts.dependencies.ProjectDependencyInternal;
import org.gradle.api.internal.artifacts.DefaultProjectDependencyFactory;
import org.gradle.api.internal.artifacts.dsl.dependencies.ProjectFinder;
import org.gradle.api.internal.catalog.DelegatingProjectDependency;
import org.gradle.api.internal.catalog.TypeSafeProjectDependencyFactory;
import javax.inject.Inject;

@NonNullApi
public class AppProjectDependency extends DelegatingProjectDependency {

    @Inject
    public AppProjectDependency(TypeSafeProjectDependencyFactory factory, ProjectDependencyInternal delegate) {
        super(factory, delegate);
    }

    /**
     * Creates a project dependency on the project at path ":app:core"
     */
    public App_CoreProjectDependency getCore() { return new App_CoreProjectDependency(getFactory(), create(":app:core")); }

    /**
     * Creates a project dependency on the project at path ":app:crypto-openpgp"
     */
    public App_CryptoOpenpgpProjectDependency getCryptoOpenpgp() { return new App_CryptoOpenpgpProjectDependency(getFactory(), create(":app:crypto-openpgp")); }

    /**
     * Creates a project dependency on the project at path ":app:html-cleaner"
     */
    public App_HtmlCleanerProjectDependency getHtmlCleaner() { return new App_HtmlCleanerProjectDependency(getFactory(), create(":app:html-cleaner")); }

    /**
     * Creates a project dependency on the project at path ":app:k9mail"
     */
    public App_K9mailProjectDependency getK9mail() { return new App_K9mailProjectDependency(getFactory(), create(":app:k9mail")); }

    /**
     * Creates a project dependency on the project at path ":app:storage"
     */
    public App_StorageProjectDependency getStorage() { return new App_StorageProjectDependency(getFactory(), create(":app:storage")); }

    /**
     * Creates a project dependency on the project at path ":app:testing"
     */
    public App_TestingProjectDependency getTesting() { return new App_TestingProjectDependency(getFactory(), create(":app:testing")); }

    /**
     * Creates a project dependency on the project at path ":app:ui"
     */
    public App_UiProjectDependency getUi() { return new App_UiProjectDependency(getFactory(), create(":app:ui")); }

}
