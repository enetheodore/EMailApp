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
public class PluginsProjectDependency extends DelegatingProjectDependency {

    @Inject
    public PluginsProjectDependency(TypeSafeProjectDependencyFactory factory, ProjectDependencyInternal delegate) {
        super(factory, delegate);
    }

    /**
     * Creates a project dependency on the project at path ":plugins:openpgp-api-lib"
     */
    public Plugins_OpenpgpApiLibProjectDependency getOpenpgpApiLib() { return new Plugins_OpenpgpApiLibProjectDependency(getFactory(), create(":plugins:openpgp-api-lib")); }

}
