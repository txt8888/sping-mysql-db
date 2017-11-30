package org.phan.lesson.repository;

import org.phan.lesson.entity.Office;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by tphan27 on 11/30/2017.
 */
public interface OfficeRepository extends JpaRepository<Office, Long> {
}
