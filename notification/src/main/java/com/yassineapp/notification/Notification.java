package com.yassineapp.notification;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.time.LocalDateTime;
@Data
@Builder
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
public class Notification {


    @Id
    @GeneratedValue
    private Integer notificationId;
    private Integer toCustomerId;
    private String toCustomerEmail;
    private String sender;
    private String message;
    private LocalDateTime sentAt;

    public void setId(Integer id) {
        this.notificationId = id;
    }

    public Integer getId() {
        return notificationId;
    }


}
