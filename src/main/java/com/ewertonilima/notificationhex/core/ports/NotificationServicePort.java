package com.ewertonilima.notificationhex.core.ports;

import com.ewertonilima.notificationhex.core.domain.NotificationDomain;
import com.ewertonilima.notificationhex.core.domain.PageInfo;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

public interface NotificationServicePort {

    void saveNotification(NotificationDomain notificationDomain);

    List<NotificationDomain> findAllNotificationByUser(UUID userid, PageInfo pageInfo);

    Optional<NotificationDomain> findByNotificationIdAndUserId(UUID notificationId, UUID userId);
}
