package org.junit.nativeimage.engine;

import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.junit.platform.engine.ExecutionRequest;
import org.junit.platform.engine.TestDescriptor;
import org.junit.platform.launcher.LauncherDiscoveryRequest;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.platform.engine.discovery.DiscoverySelectors.selectClass;
import static org.junit.platform.launcher.core.LauncherDiscoveryRequestBuilder.request;

public class EngineSimpleTest extends AbstractNativeImageTestEngineTests {

    @Test
    void testDiscovery() {
/*
        LauncherDiscoveryRequest request = request().selectors(selectClass(TestSimple.class)).build();
        TestDescriptor engineDescriptor = discoverTests(request);
        assertEquals(1 */
/*class*//*
 + 6 */
/*methods*//*
, engineDescriptor.getDescendants().size(),
                "# resolved test descriptors");
*/
        executeTestsForClass(TestSimple.class);
    }


    static class TestSimple {
        @Test
        void testOne() {
            Assert.assertTrue(true);
        }
    }
}
