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
public class Feature_AccountProjectDependency extends DelegatingProjectDependency {

    @Inject
    public Feature_AccountProjectDependency(TypeSafeProjectDependencyFactory factory, ProjectDependencyInternal delegate) {
        super(factory, delegate);
    }

    /**
     * Creates a project dependency on the project at path ":feature:account:common"
     */
    public Feature_Account_CommonProjectDependency getCommon() { return new Feature_Account_CommonProjectDependency(getFactory(), create(":feature:account:common")); }

    /**
     * Creates a project dependency on the project at path ":feature:account:edit"
     */
    public Feature_Account_EditProjectDependency getEdit() { return new Feature_Account_EditProjectDependency(getFactory(), create(":feature:account:edit")); }

    /**
     * Creates a project dependency on the project at path ":feature:account:oauth"
     */
    public Feature_Account_OauthProjectDependency getOauth() { return new Feature_Account_OauthProjectDependency(getFactory(), create(":feature:account:oauth")); }

    /**
     * Creates a project dependency on the project at path ":feature:account:server"
     */
    public Feature_Account_ServerProjectDependency getServer() { return new Feature_Account_ServerProjectDependency(getFactory(), create(":feature:account:server")); }

    /**
     * Creates a project dependency on the project at path ":feature:account:setup"
     */
    public Feature_Account_SetupProjectDependency getSetup() { return new Feature_Account_SetupProjectDependency(getFactory(), create(":feature:account:setup")); }

}
