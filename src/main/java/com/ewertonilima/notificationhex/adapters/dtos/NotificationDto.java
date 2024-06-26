package com.ewertonilima.notificationhex.adapters.dtos;

import com.ewertonilima.notificationhex.core.domain.enums.NotificationStatus;
import jakarta.validation.constraints.NotNull;

public class NotificationDto {

    @NotNull
    private NotificationStatus notificationStatus;

    public NotificationStatus getNotificationStatus() {
        return notificationStatus;
    }

    public void setNotificationStatus(NotificationStatus notificationStatus) {
        this.notificationStatus = notificationStatus;
    }
}
