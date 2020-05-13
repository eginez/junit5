package org.junit.nativeimage.engine;

import org.apiguardian.api.API;
import org.junit.jupiter.engine.JupiterTestEngine;
import org.junit.jupiter.engine.execution.JupiterEngineExecutionContext;
import org.junit.platform.commons.util.ReflectionUtils;
import org.junit.platform.engine.EngineDiscoveryRequest;
import org.junit.platform.engine.ExecutionRequest;
import org.junit.platform.engine.TestDescriptor;
import org.junit.platform.engine.TestEngine;
import org.junit.platform.engine.UniqueId;
import org.junit.platform.engine.support.hierarchical.HierarchicalTestEngine;
import org.junit.platform.engine.support.hierarchical.HierarchicalTestExecutorService;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Optional;

@API(status = API.Status.INTERNAL, since = "5.3")
class NativeImageTestEngine implements TestEngine {
    private final JupiterTestEngine jupiterTestEngine;

    public NativeImageTestEngine() {
        super();
        jupiterTestEngine = new JupiterTestEngine();
    }

    @Override
    public String getId() {
        return "junit-nativeimage";
    }

    @Override
    public Optional<String> getArtifactId() {
        return Optional.of("junit-nativeimage-engine");
    }

    @Override
    public Optional<String> getGroupId() {
        return Optional.of("org.junit.nativeimage");
    }

    @Override
    public TestDescriptor discover(EngineDiscoveryRequest discoveryRequest, UniqueId uniqueId) {
        final TestDescriptor testDescriptor = jupiterTestEngine.discover(discoveryRequest, uniqueId);
        return testDescriptor;
    }

    @Override
    public void execute(ExecutionRequest request) {
        System.out.println(request.getRootTestDescriptor().toString());
    }
}