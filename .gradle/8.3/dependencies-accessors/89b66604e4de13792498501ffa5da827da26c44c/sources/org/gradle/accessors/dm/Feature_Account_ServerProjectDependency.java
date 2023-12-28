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
public class Feature_Account_ServerProjectDependency extends DelegatingProjectDependency {

    @Inject
    public Feature_Account_ServerProjectDependency(TypeSafeProjectDependencyFactory factory, ProjectDependencyInternal delegate) {
        super(factory, delegate);
    }

    /**
     * Creates a project dependency on the project at path ":feature:account:server:certificate"
     */
    public Feature_Account_Server_CertificateProjectDependency getCertificate() { return new Feature_Account_Server_CertificateProjectDependency(getFactory(), create(":feature:account:server:certificate")); }

    /**
     * Creates a project dependency on the project at path ":feature:account:server:settings"
     */
    public Feature_Account_Server_SettingsProjectDependency getSettings() { return new Feature_Account_Server_SettingsProjectDependency(getFactory(), create(":feature:account:server:settings")); }

    /**
     * Creates a project dependency on the project at path ":feature:account:server:validation"
     */
    public Feature_Account_Server_ValidationProjectDependency getValidation() { return new Feature_Account_Server_ValidationProjectDependency(getFactory(), create(":feature:account:server:validation")); }

}
