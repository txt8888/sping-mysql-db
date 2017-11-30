DROP TABLE IF EXISTS employee;
DROP TABLE IF EXISTS office;
DROP TABLE IF EXISTS department;

CREATE TABLE IF NOT EXISTS office(
    office_id int(16) NOT NULL AUTO_INCREMENT,
    office_name varchar(32) NOT NULL,
    PRIMARY KEY (office_id)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

CREATE TABLE IF NOT EXISTS department (
    department_id int(16) NOT NULL AUTO_INCREMENT,
    department_name varchar(32) NOT NULL,
    PRIMARY KEY (department_id)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

CREATE TABLE IF NOT EXISTS employee (
    employee_id int(16) NOT NULL AUTO_INCREMENT,
    employee_name varchar(32) NOT NULL,
    department_id int(16) NOT NULL, -- FK
    office_id int(16) NOT NULL, -- FK

    PRIMARY KEY (employee_id),
    KEY department_id (department_id),
    CONSTRAINT fk_department_id
     FOREIGN KEY (department_id)
     REFERENCES department (department_id) ON DELETE CASCADE
)  ENGINE=InnoDB DEFAULT CHARSET=utf8;

INSERT into office (office_name) values('frisco');
INSERT into department (department_name) values('engineer');
INSERT into employee (employee_name, department_id, office_id) values('Tim', 1, 1);

--    FOREIGN KEY (department_id) REFERENCES department(department_id) ON DELETE CASCADE,
--    FOREIGN KEY (office_id) REFERENCES office(office_id) ON DELETE CASCADE
--    ,
--    KEY department_id (department_id) CONSTRAINT
--        fk_department_id FOREIGN KEY (department_id) REFERENCES department (department_id) ON DELETE CASCADE,
--    KEY office_id (office_id) CONSTRAINT
--        fk_office_id FOREIGN KEY (office_id) REFERENCES office (office_id) ON DELETE CASCADE
