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
public class BackendProjectDependency extends DelegatingProjectDependency {

    @Inject
    public BackendProjectDependency(TypeSafeProjectDependencyFactory factory, ProjectDependencyInternal delegate) {
        super(factory, delegate);
    }

    /**
     * Creates a project dependency on the project at path ":backend:api"
     */
    public Backend_ApiProjectDependency getApi() { return new Backend_ApiProjectDependency(getFactory(), create(":backend:api")); }

    /**
     * Creates a project dependency on the project at path ":backend:demo"
     */
    public Backend_DemoProjectDependency getDemo() { return new Backend_DemoProjectDependency(getFactory(), create(":backend:demo")); }

    /**
     * Creates a project dependency on the project at path ":backend:imap"
     */
    public Backend_ImapProjectDependency getImap() { return new Backend_ImapProjectDependency(getFactory(), create(":backend:imap")); }

    /**
     * Creates a project dependency on the project at path ":backend:jmap"
     */
    public Backend_JmapProjectDependency getJmap() { return new Backend_JmapProjectDependency(getFactory(), create(":backend:jmap")); }

    /**
     * Creates a project dependency on the project at path ":backend:pop3"
     */
    public Backend_Pop3ProjectDependency getPop3() { return new Backend_Pop3ProjectDependency(getFactory(), create(":backend:pop3")); }

    /**
     * Creates a project dependency on the project at path ":backend:testing"
     */
    public Backend_TestingProjectDependency getTesting() { return new Backend_TestingProjectDependency(getFactory(), create(":backend:testing")); }

}
