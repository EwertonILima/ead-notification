package com.ewertonilima.notification.services;

import com.ewertonilima.notification.models.NotificationModel;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.Optional;
import java.util.UUID;

public interface NotificationService {
    NotificationModel saveNotification(NotificationModel notificationModel);

    Page<NotificationModel> findAllNotificationByUser(UUID userid, Pageable pageable);

    Optional<NotificationModel> findByNotificationIdAndUserId(UUID notificationId, UUID userId);
}
