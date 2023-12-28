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
public class RootProjectAccessor extends TypeSafeProjectDependencyFactory {


    @Inject
    public RootProjectAccessor(DefaultProjectDependencyFactory factory, ProjectFinder finder) {
        super(factory, finder);
    }

    /**
     * Creates a project dependency on the project at path ":"
     */
    public K9ProjectDependency getK9() { return new K9ProjectDependency(getFactory(), create(":")); }

    /**
     * Creates a project dependency on the project at path ":app"
     */
    public AppProjectDependency getApp() { return new AppProjectDependency(getFactory(), create(":app")); }

    /**
     * Creates a project dependency on the project at path ":app-feature-preview"
     */
    public AppFeaturePreviewProjectDependency getAppFeaturePreview() { return new AppFeaturePreviewProjectDependency(getFactory(), create(":app-feature-preview")); }

    /**
     * Creates a project dependency on the project at path ":app-ui-catalog"
     */
    public AppUiCatalogProjectDependency getAppUiCatalog() { return new AppUiCatalogProjectDependency(getFactory(), create(":app-ui-catalog")); }

    /**
     * Creates a project dependency on the project at path ":backend"
     */
    public BackendProjectDependency getBackend() { return new BackendProjectDependency(getFactory(), create(":backend")); }

    /**
     * Creates a project dependency on the project at path ":cli"
     */
    public CliProjectDependency getCli() { return new CliProjectDependency(getFactory(), create(":cli")); }

    /**
     * Creates a project dependency on the project at path ":core"
     */
    public CoreProjectDependency getCore() { return new CoreProjectDependency(getFactory(), create(":core")); }

    /**
     * Creates a project dependency on the project at path ":feature"
     */
    public FeatureProjectDependency getFeature() { return new FeatureProjectDependency(getFactory(), create(":feature")); }

    /**
     * Creates a project dependency on the project at path ":mail"
     */
    public MailProjectDependency getMail() { return new MailProjectDependency(getFactory(), create(":mail")); }

    /**
     * Creates a project dependency on the project at path ":plugins"
     */
    public PluginsProjectDependency getPlugins() { return new PluginsProjectDependency(getFactory(), create(":plugins")); }

    /**
     * Creates a project dependency on the project at path ":ui-utils"
     */
    public UiUtilsProjectDependency getUiUtils() { return new UiUtilsProjectDependency(getFactory(), create(":ui-utils")); }

}
