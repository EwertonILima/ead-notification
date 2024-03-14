package com.ewertonilima.notification.services.impl;

import com.ewertonilima.notification.models.NotificationModel;
import com.ewertonilima.notification.repositories.NotificationRepository;
import com.ewertonilima.notification.services.NotificationService;
import org.springframework.stereotype.Service;

@Service
public class NotificationServiceImpl implements NotificationService {

    final NotificationRepository notificationRepository;

    public NotificationServiceImpl(NotificationRepository notificationRepository) {
        this.notificationRepository = notificationRepository;
    }

    @Override
    public NotificationModel saveNotification(NotificationModel notificationModel) {
        return notificationRepository.save(notificationModel);
    }
}
