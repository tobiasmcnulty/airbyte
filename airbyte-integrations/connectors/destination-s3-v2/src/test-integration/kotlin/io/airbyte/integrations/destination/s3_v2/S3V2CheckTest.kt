/*
 * Copyright (c) 2024 Airbyte, Inc., all rights reserved.
 */

package io.airbyte.integrations.destination.s3_v2

import io.airbyte.cdk.command.FeatureFlag
import io.airbyte.cdk.load.check.CheckIntegrationTest
import io.airbyte.cdk.load.check.CheckTestConfig
import org.junit.jupiter.api.Test

class S3V2CheckTest :
    CheckIntegrationTest<S3V2Specification>(
        S3V2Specification::class.java,
        successConfigFilenames =
            listOf(
                CheckTestConfig(
                    S3V2TestUtils.MINIMAL_CONFIG_PATH,
                    setOf(FeatureFlag.AIRBYTE_CLOUD_DEPLOYMENT)
                )
            ),
        failConfigFilenamesAndFailureReasons = emptyMap()
    ) {
    @Test
    override fun testSuccessConfigs() {
        super.testSuccessConfigs()
    }
}
