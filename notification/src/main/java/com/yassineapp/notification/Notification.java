package com.yassineapp.notification;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.time.LocalDateTime;
@Data
@Builder
@Entity
@AllArgsConstructor
@NoArgsConstructor
public class Notification {


    @Id
    @GeneratedValue
    private Integer id;
    private Integer customerId;
    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    private String message;
    private LocalDateTime createAt;
}
