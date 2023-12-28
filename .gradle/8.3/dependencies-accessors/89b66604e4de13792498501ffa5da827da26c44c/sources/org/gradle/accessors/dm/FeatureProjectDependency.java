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
public class FeatureProjectDependency extends DelegatingProjectDependency {

    @Inject
    public FeatureProjectDependency(TypeSafeProjectDependencyFactory factory, ProjectDependencyInternal delegate) {
        super(factory, delegate);
    }

    /**
     * Creates a project dependency on the project at path ":feature:account"
     */
    public Feature_AccountProjectDependency getAccount() { return new Feature_AccountProjectDependency(getFactory(), create(":feature:account")); }

    /**
     * Creates a project dependency on the project at path ":feature:autodiscovery"
     */
    public Feature_AutodiscoveryProjectDependency getAutodiscovery() { return new Feature_AutodiscoveryProjectDependency(getFactory(), create(":feature:autodiscovery")); }

    /**
     * Creates a project dependency on the project at path ":feature:launcher"
     */
    public Feature_LauncherProjectDependency getLauncher() { return new Feature_LauncherProjectDependency(getFactory(), create(":feature:launcher")); }

    /**
     * Creates a project dependency on the project at path ":feature:onboarding"
     */
    public Feature_OnboardingProjectDependency getOnboarding() { return new Feature_OnboardingProjectDependency(getFactory(), create(":feature:onboarding")); }

}
