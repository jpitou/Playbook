# --- Created by Ebean DDL
# To stop Ebean DDL generation, remove this comment and start using Evolutions

# --- !Ups

create table User (
  last_name                 varchar(255),
  first_name                varchar(255),
  birth_date                timestamp,
  email                     varchar(255),
  password                  varchar(255),
  phone_number              integer)
;




# --- !Downs

SET REFERENTIAL_INTEGRITY FALSE;

drop table if exists User;

SET REFERENTIAL_INTEGRITY TRUE;

