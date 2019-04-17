# --- Created by Ebean DDL
# To stop Ebean DDL generation, remove this comment and start using Evolutions

# --- !Ups

create table widget (
  id                            bigserial not null,
  name                          varchar(255),
  age                           integer not null,
  branch                        varchar(255),
  marks                         integer not null,
  constraint pk_widget primary key (id)
);


# --- !Downs

drop table if exists widget cascade;

