package org.acme;

import org.togglz.core.Feature;
import org.togglz.core.annotation.Label;
import org.togglz.core.context.FeatureContext;

public enum MyFeatures implements Feature {
    @Label("say-my-name")
    FEATURE_SAY_MY_NAME;
}
