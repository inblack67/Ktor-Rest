create table if not exists "user"(
    id serial primary key unique not null,
    username varchar(50) not null unique
)