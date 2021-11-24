CREATE TABLE available (
  resource_id int(11)
,id int(11) NOT NULL AUTO_INCREMENT,
   start_date TIMESTAMP,
   end_date TIMESTAMP,
   customhours float,
   leave_count int,
   availableStatus varchar(15),
   create_date TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP,
   update_date TIMESTAMP DEFAULT NULL,
   is_deleted int(10) DEFAULT 0,
   PRIMARY KEY (id),
   FOREIGN KEY (resource_id) REFERENCES resource(resource_id)
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=utf8;