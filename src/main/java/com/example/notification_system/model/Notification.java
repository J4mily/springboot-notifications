package com.example.notification_system.model;

import jakarta.persistence.*;
import lombok.Data;
import java.time.LocalDateTime;

@Data
@Entity
@Table(name = "notifications")
public class Notification {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String title;
    private String body;

    @Column(name = "user_id")
    private Long userId;

    @Enumerated(EnumType.STRING)
    private NotificationType type;

    @Column(name = "created_at")
    private LocalDateTime createdAt = LocalDateTime.now();

    private boolean read = false;

    public enum NotificationType {
        INFORMATIVO, PROMOCAO, ALERTA
    }
}
