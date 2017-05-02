package ru;

import javax.persistence.PrePersist;
import javax.persistence.PreUpdate;

/**
 * Created by vlad on 23.04.17.
 */
public class DataValidationListener {
    @PrePersist
    @PreUpdate
    private void validate(Customer customer) {
        if (customer.getFirstName() == null || "".equals(customer.getFirstName()))
            throw new IllegalArgumentException("Неверное имя");
        if (customer.getLastName() == null || "".equals(customer.getLastName()))
            throw new IllegalArgumentException("Неверная фамилия");
    }

    public DataValidationListener() {
    }
}
