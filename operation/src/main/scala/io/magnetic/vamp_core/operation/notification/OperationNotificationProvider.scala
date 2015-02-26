package io.magnetic.vamp_core.operation.notification

import io.magnetic.vamp_common.notification.{DefaultPackageMessageResolverProvider, LoggingNotificationProvider}

trait OperationNotificationProvider extends LoggingNotificationProvider with DefaultPackageMessageResolverProvider