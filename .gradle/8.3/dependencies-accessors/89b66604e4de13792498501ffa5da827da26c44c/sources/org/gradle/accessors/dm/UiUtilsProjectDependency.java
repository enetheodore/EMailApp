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
public class UiUtilsProjectDependency extends DelegatingProjectDependency {

    @Inject
    public UiUtilsProjectDependency(TypeSafeProjectDependencyFactory factory, ProjectDependencyInternal delegate) {
        super(factory, delegate);
    }

    /**
     * Creates a project dependency on the project at path ":ui-utils:ItemTouchHelper"
     */
    public UiUtils_ItemTouchHelperProjectDependency getItemTouchHelper() { return new UiUtils_ItemTouchHelperProjectDependency(getFactory(), create(":ui-utils:ItemTouchHelper")); }

    /**
     * Creates a project dependency on the project at path ":ui-utils:LinearLayoutManager"
     */
    public UiUtils_LinearLayoutManagerProjectDependency getLinearLayoutManager() { return new UiUtils_LinearLayoutManagerProjectDependency(getFactory(), create(":ui-utils:LinearLayoutManager")); }

    /**
     * Creates a project dependency on the project at path ":ui-utils:ToolbarBottomSheet"
     */
    public UiUtils_ToolbarBottomSheetProjectDependency getToolbarBottomSheet() { return new UiUtils_ToolbarBottomSheetProjectDependency(getFactory(), create(":ui-utils:ToolbarBottomSheet")); }

}
