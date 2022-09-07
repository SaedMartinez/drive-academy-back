INSERT INTO lc_license (lc_type_name ) VALUES ('A1');
INSERT INTO lc_license (lc_type_name ) VALUES ('A2');
INSERT INTO lc_license (lc_type_name ) VALUES ('B1');
INSERT INTO lc_license (lc_type_name ) VALUES ('B2');
INSERT INTO lc_license (lc_type_name ) VALUES ('C1');
INSERT INTO lc_license (lc_type_name ) VALUES ('C2');

INSERT INTO cs_course (cs_level ) VALUES ('NIVEL 1');
INSERT INTO cs_course (cs_level ) VALUES ('NIVEL 2');

INSERT INTO st_student (st_name, st_age, st_dni, st_license_fk ) VALUES ('sami', '20', 'cc-111',3);
INSERT INTO st_student (st_name, st_age, st_dni, st_license_fk ) VALUES ('flofy', '21', 'cc-222',2);
INSERT INTO st_student (st_name, st_age, st_dni, st_license_fk ) VALUES ('flofy2', '21', 'cc-222',1);
INSERT INTO st_student (st_name, st_age, st_dni, st_license_fk ) VALUES ('flofy3', '21', 'cc-222',1);
INSERT INTO st_student (st_name, st_age, st_dni, st_license_fk ) VALUES ('flofy4', '21', 'cc-222',3);
INSERT INTO st_student (st_name, st_age, st_dni, st_license_fk ) VALUES ('flofy5', '21', 'cc-222',2);
INSERT INTO st_student (st_name, st_age, st_dni, st_license_fk ) VALUES ('flofy66', '21', 'cc-222',1);

INSERT INTO md_module (md_module_name, md_course_fk, md_module_status, md_student_fk ) VALUES ('Adaptacion', 1, 'TERMINADO', 1);
INSERT INTO md_module (md_module_name, md_course_fk, md_module_status, md_student_fk ) VALUES ('Etica', 1, 'TERMINADO', 1);
INSERT INTO md_module (md_module_name, md_course_fk, md_module_status, md_student_fk ) VALUES ('Etica', 2, 'ACTIVO', 1);
INSERT INTO md_module (md_module_name, md_course_fk, md_module_status, md_student_fk ) VALUES ('Marco Legal', 1, 'NO_INSCRITO', 1);