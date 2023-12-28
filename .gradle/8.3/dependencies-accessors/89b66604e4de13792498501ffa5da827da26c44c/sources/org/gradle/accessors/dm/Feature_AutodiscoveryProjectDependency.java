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
public class Feature_AutodiscoveryProjectDependency extends DelegatingProjectDependency {

    @Inject
    public Feature_AutodiscoveryProjectDependency(TypeSafeProjectDependencyFactory factory, ProjectDependencyInternal delegate) {
        super(factory, delegate);
    }

    /**
     * Creates a project dependency on the project at path ":feature:autodiscovery:api"
     */
    public Feature_Autodiscovery_ApiProjectDependency getApi() { return new Feature_Autodiscovery_ApiProjectDependency(getFactory(), create(":feature:autodiscovery:api")); }

    /**
     * Creates a project dependency on the project at path ":feature:autodiscovery:autoconfig"
     */
    public Feature_Autodiscovery_AutoconfigProjectDependency getAutoconfig() { return new Feature_Autodiscovery_AutoconfigProjectDependency(getFactory(), create(":feature:autodiscovery:autoconfig")); }

    /**
     * Creates a project dependency on the project at path ":feature:autodiscovery:service"
     */
    public Feature_Autodiscovery_ServiceProjectDependency getService() { return new Feature_Autodiscovery_ServiceProjectDependency(getFactory(), create(":feature:autodiscovery:service")); }

    /**
     * Creates a project dependency on the project at path ":feature:autodiscovery:srvrecords"
     */
    public Feature_Autodiscovery_SrvrecordsProjectDependency getSrvrecords() { return new Feature_Autodiscovery_SrvrecordsProjectDependency(getFactory(), create(":feature:autodiscovery:srvrecords")); }

}
