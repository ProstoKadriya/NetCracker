CREATE TABLE public.Student
(
    Student SERIAL PRIMARY KEY NOT NULL,
    Data VARCHAR(255),
    Name VARCHAR(255),
);
COMMENT ON TABLE public.Groups IS 'Table of Students';

CREATE TABLE public.Subject
(
    ID_Discipline SERIAL PRIMARY KEY NOT NULL,
    Subject VARCHAR(255)
);
COMMENT ON TABLE public.Disciplines IS 'Table of Subjects';

CREATE TABLE public.Subject_Student
(
    ID int PRIMARY KEY NOT NULL,
    ID_Subject int NOT NULL,
    ID_Student int NOT NULL,
    Mark int NOT NULL
);
COMMENT ON TABLE public.Subjects IS 'Table of the connection of the Subject with the Student';

ALTER TABLE public.Subject_Student ADD CONSTRAINT Student_id_constraint UNIQUE (ID_Student);
ALTER TABLE public.Subject_Student ADD CONSTRAINT ID_Subject_constraint UNIQUE (ID_Subject);

ALTER TABLE Students
    ADD CONSTRAINT st_id_nm_dt_constraint
FOREIGN KEY (ID_Student) REFERENCES Subject_Student (ID_Student)
ON UPDATE CASCADE ON DELETE CASCADE;

ALTER TABLE Subjects
    ADD CONSTRAINT sbj_id_fk_constraint
FOREIGN KEY (ID_Subject) REFERENCES Subject_Student (ID_Subject)
ON UPDATE CASCADE ON DELETE CASCADE;