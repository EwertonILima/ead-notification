package com.ewertonilima.notificationhex.core.ports;

import com.ewertonilima.notificationhex.core.domain.NotificationDomain;
import com.ewertonilima.notificationhex.core.domain.PageInfo;
import com.ewertonilima.notificationhex.core.domain.enums.NotificationStatus;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

public interface NotificationPersistencePort {

    void save(NotificationDomain notificationDomain);

    List<NotificationDomain> findAllByUserIdAndNotificationStatus(UUID userid, NotificationStatus notificationStatus, PageInfo pageInfo);

    Optional<NotificationDomain> findByNotificationIdAndUserId(UUID notificationId, UUID userId);
}
