package ru;

import javax.persistence.PrePersist;
import javax.persistence.PreRemove;
import javax.persistence.PreUpdate;

/**
 * Created by vlad on 23.04.17.
 */
public class DebugListener {
    @PrePersist
    void prePersist(Object object) {
        System.out.println("prePersist");
    }
    @PreUpdate
    void preUpdate(Object object) {
        System.out.println("preUpdate");
    }
    @PreRemove
    void preRemove(Object object) {
        System.out.println("preRemove");
    }
}
