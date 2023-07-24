CREATE TABLE users
(
    id           uuid         not null
        primary key,
    first_name   varchar(30)  not null,
    last_name    varchar(100) not null,
    middle_name  varchar(100),
    date_birth   date         not null,
    email        varchar(100) not null,
    phone_number varchar(30)
);

INSERT INTO users (id, first_name, last_name, middle_name, date_birth, email, phone_number)
values ('570c4a43-b931-4bb5-826b-4b7787c54d85', 'Ivan', 'Ivanov', 'Ivanovich', '2000-04-04', 'ivan@mail.ru', '82938184721'),
       ('bb2a5daf-2bf0-489d-bd15-7a59cad38c70', 'Irina', 'Sergeeva', 'Sergeevna', '1997-06-07', 'irina@mail.ru', '89837462742'),
       ('b5e8d203-1e8f-43ff-a949-86cac53c4735', 'Pavel', 'Gribov', 'Vasilievich', '1999-07-20', 'pavel@mail.ru', '86473857487'),
       ('10a1b2a9-4184-4349-8013-965573760dae', 'Marina', 'Vlasova', 'Vladimirovna', '1980-05-13', 'marina@mail.ru', '86453788446'),
       ('0b4614e1-756a-44b5-871e-656b7afef791', 'Kirill', 'Tonich', 'Fedorovich', '1985-11-11', 'kirill@mail.ru', '81193005784');