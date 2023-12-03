CREATE
DATABASE example_spring_data_jpa;

create table tb_favorite
(
    product_id bigint not null,
    user_id    bigint not null
)

create table tb_order
(
    order_status     integer,
    address_id       bigint,
    create_date_time timestamp(6),
    id               bigserial not null,
    user_id          bigint,
    primary key (id)
)


create table tb_order_product
(
    num        integer,
    id         bigserial not null,
    order_id   bigint,
    product_id bigint unique,
    primary key (id)
)

create table tb_product
(
    deleted      boolean,
    id           bigserial not null,
    product_name varchar(32),
    primary key (id)
)

create table tb_user
(
    deleted   boolean,
    id        bigserial not null,
    nick_name varchar(32),
    primary key (id)
)

alter table if exists tb_favorite add constraint FKk5voim8j1g8tdf6jh4x747l54 foreign key (product_id) references tb_product
alter table if exists tb_favorite add constraint FKocl6y1rtb18v72g7510dd86ss foreign key (user_id) references tb_user
alter table if exists tb_order add constraint FK2p4n9ciui39792tk5qdpcxq1w foreign key (user_id) references tb_user
alter table if exists tb_order_product add constraint FK40anaevs16kmc2tbh7wc511fq foreign key (order_id) references tb_order
alter table if exists tb_order_product add constraint FKsu03ywlcvyqg5y78qey2q25lc foreign key (product_id) references tb_product
