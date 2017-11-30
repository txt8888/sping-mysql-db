package org.phan.lesson.repository;

import org.phan.lesson.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

/**
 * Created by SMahabo1 on 5/10/2017.
 * <p>
 * JPA repo
 */

@RepositoryRestResource
public interface EmployeeRepository extends JpaRepository<Employee, Long> {
}
