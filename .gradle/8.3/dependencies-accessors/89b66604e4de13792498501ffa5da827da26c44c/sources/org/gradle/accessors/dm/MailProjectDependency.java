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
public class MailProjectDependency extends DelegatingProjectDependency {

    @Inject
    public MailProjectDependency(TypeSafeProjectDependencyFactory factory, ProjectDependencyInternal delegate) {
        super(factory, delegate);
    }

    /**
     * Creates a project dependency on the project at path ":mail:common"
     */
    public Mail_CommonProjectDependency getCommon() { return new Mail_CommonProjectDependency(getFactory(), create(":mail:common")); }

    /**
     * Creates a project dependency on the project at path ":mail:protocols"
     */
    public Mail_ProtocolsProjectDependency getProtocols() { return new Mail_ProtocolsProjectDependency(getFactory(), create(":mail:protocols")); }

    /**
     * Creates a project dependency on the project at path ":mail:testing"
     */
    public Mail_TestingProjectDependency getTesting() { return new Mail_TestingProjectDependency(getFactory(), create(":mail:testing")); }

}
