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
public class Core_Ui_ComposeProjectDependency extends DelegatingProjectDependency {

    @Inject
    public Core_Ui_ComposeProjectDependency(TypeSafeProjectDependencyFactory factory, ProjectDependencyInternal delegate) {
        super(factory, delegate);
    }

    /**
     * Creates a project dependency on the project at path ":core:ui:compose:common"
     */
    public Core_Ui_Compose_CommonProjectDependency getCommon() { return new Core_Ui_Compose_CommonProjectDependency(getFactory(), create(":core:ui:compose:common")); }

    /**
     * Creates a project dependency on the project at path ":core:ui:compose:designsystem"
     */
    public Core_Ui_Compose_DesignsystemProjectDependency getDesignsystem() { return new Core_Ui_Compose_DesignsystemProjectDependency(getFactory(), create(":core:ui:compose:designsystem")); }

    /**
     * Creates a project dependency on the project at path ":core:ui:compose:testing"
     */
    public Core_Ui_Compose_TestingProjectDependency getTesting() { return new Core_Ui_Compose_TestingProjectDependency(getFactory(), create(":core:ui:compose:testing")); }

    /**
     * Creates a project dependency on the project at path ":core:ui:compose:theme"
     */
    public Core_Ui_Compose_ThemeProjectDependency getTheme() { return new Core_Ui_Compose_ThemeProjectDependency(getFactory(), create(":core:ui:compose:theme")); }

}
