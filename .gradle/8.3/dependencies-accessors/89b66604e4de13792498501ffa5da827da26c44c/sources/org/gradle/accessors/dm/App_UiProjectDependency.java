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
public class App_UiProjectDependency extends DelegatingProjectDependency {

    @Inject
    public App_UiProjectDependency(TypeSafeProjectDependencyFactory factory, ProjectDependencyInternal delegate) {
        super(factory, delegate);
    }

    /**
     * Creates a project dependency on the project at path ":app:ui:base"
     */
    public App_Ui_BaseProjectDependency getBase() { return new App_Ui_BaseProjectDependency(getFactory(), create(":app:ui:base")); }

    /**
     * Creates a project dependency on the project at path ":app:ui:legacy"
     */
    public App_Ui_LegacyProjectDependency getLegacy() { return new App_Ui_LegacyProjectDependency(getFactory(), create(":app:ui:legacy")); }

    /**
     * Creates a project dependency on the project at path ":app:ui:message-list-widget"
     */
    public App_Ui_MessageListWidgetProjectDependency getMessageListWidget() { return new App_Ui_MessageListWidgetProjectDependency(getFactory(), create(":app:ui:message-list-widget")); }

}
