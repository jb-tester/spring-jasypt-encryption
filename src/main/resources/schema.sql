drop table if exists bar;
CREATE TABLE if not exists bar (
                       `id` int NOT NULL AUTO_INCREMENT,
                       `version` int DEFAULT NULL,
                       `name` varchar(30) DEFAULT NULL,
                       `comment` varchar(255) DEFAULT NULL,
                       PRIMARY KEY (`id`)
);
insert into bar (name, comment) values ('bar1', 'bar1 comment');
insert into bar (name, comment) values ('bar2', 'bar2 comment');
insert into bar (name, comment) values ('bar3', 'bar3 comment');

