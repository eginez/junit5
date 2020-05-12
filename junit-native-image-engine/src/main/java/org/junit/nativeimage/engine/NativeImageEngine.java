package org.junit.nativeimage.engine;

import org.junit.platform.engine.EngineDiscoveryRequest;
import org.junit.platform.engine.ExecutionRequest;
import org.junit.platform.engine.TestDescriptor;
import org.junit.platform.engine.UniqueId;
import org.junit.platform.engine.support.hierarchical.HierarchicalTestEngine;

class NativeImageEngine extends HierarchicalTestEngine<NativeImageExecutionContext> {

    @Override
    protected NativeImageExecutionContext createExecutionContext(ExecutionRequest request) {
        return null;
    }

    @Override
    public String getId() {
        return null;
    }

    @Override
    public TestDescriptor discover(EngineDiscoveryRequest discoveryRequest, UniqueId uniqueId) {
        return null;
    }
}