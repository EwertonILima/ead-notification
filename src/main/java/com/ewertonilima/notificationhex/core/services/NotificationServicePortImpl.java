package com.ewertonilima.notificationhex.core.services;

import com.ewertonilima.notificationhex.core.domain.NotificationDomain;
import com.ewertonilima.notificationhex.core.domain.PageInfo;
import com.ewertonilima.notificationhex.core.domain.enums.NotificationStatus;
import com.ewertonilima.notificationhex.core.ports.NotificationPersistencePort;
import com.ewertonilima.notificationhex.core.ports.NotificationServicePort;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

public class NotificationServicePortImpl implements NotificationServicePort {

    final NotificationPersistencePort notificationPersistencePort;

    public NotificationServicePortImpl(NotificationPersistencePort notificationPersistencePort) {
        this.notificationPersistencePort = notificationPersistencePort;
    }

    @Override
    public void saveNotification(NotificationDomain notificationDomain) {
        notificationPersistencePort.save(notificationDomain);
    }

    @Override
    public List<NotificationDomain> findAllNotificationByUser(UUID userId, PageInfo pageInfo) {
        return notificationPersistencePort.findAllByUserIdAndNotificationStatus(userId, NotificationStatus.CREATED, pageInfo);
    }

    @Override
    public Optional<NotificationDomain> findByNotificationIdAndUserId(UUID notificationId, UUID userId) {
        return notificationPersistencePort.findByNotificationIdAndUserId(notificationId, userId);
    }
}
