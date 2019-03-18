-- auto Generated on 2019-03-18 21:05:31 
-- DROP TABLE IF EXISTS `usertimes_pojo`; 
CREATE TABLE usertimes_pojo(
    `id` INTEGER(20) UNSIGNED NOT NULL AUTO_INCREMENT COMMENT 'id',
    `username` VARCHAR(50) NOT NULL DEFAULT '' COMMENT 'username',
    `event_ts` VARCHAR(50) NOT NULL DEFAULT '' COMMENT 'event_ts',
    `insert_ts` VARCHAR(50) NOT NULL DEFAULT '' COMMENT 'insert_ts',
    `daytimes` INTEGER(12) NOT NULL DEFAULT -1 COMMENT 'daytimes',
    `flag` VARCHAR(50) NOT NULL DEFAULT '' COMMENT 'flag',
    PRIMARY KEY (`id`)
)ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COMMENT 'usertimes_pojo';
