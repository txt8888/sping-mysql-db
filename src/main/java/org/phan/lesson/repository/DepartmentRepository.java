package org.phan.lesson.repository;

import org.phan.lesson.entity.Department;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

/**
 * Created by SMahabo1 on 5/10/2017.
 * <p>
 * JPA Repo
 */
@RepositoryRestResource
public interface DepartmentRepository extends JpaRepository<Department, Long> {
}
