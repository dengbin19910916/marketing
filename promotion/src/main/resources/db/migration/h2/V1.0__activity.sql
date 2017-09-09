CREATE TABLE Activity (
  id     VARCHAR2(64) PRIMARY KEY,
  name   VARCHAR2(50) NOT NULL,
  number VARCHAR2(50) NOT NULL
);

CREATE TABLE Shop (
  id   VARCHAR2(64) PRIMARY KEY,
  name VARCHAR2(50) NOT NULL,
  number VARCHAR2(50) NOT NULL
);

CREATE TABLE Activity_Shop_Relation (
  id          VARCHAR2(64) PRIMARY KEY,
  activity_id VARCHAR2(64) NOT NULL REFERENCES Activity(id),
  shop_id     VARCHAR2(64) NOT NULL REFERENCES Shop(id),
);

-- ALTER TABLE Activity_Shop_Relation
--   ADD CONSTRAINT FK_Activity_Shop FOREIGN KEY (activity_id) REFERENCES Activity (id);

INSERT INTO Activity (id, name, number) VALUES ('1', '双11活动1', '100001');
INSERT INTO Activity (id, name, number) VALUES ('2', '双11活动2', '100002');
INSERT INTO Activity (id, name, number) VALUES ('3', '双11活动3', '100003');

INSERT INTO Shop (id, name, number) VALUES ('1', '店铺1', '630001');
INSERT INTO Shop (id, name, number) VALUES ('2', '店铺2', '230001');
INSERT INTO Shop (id, name, number) VALUES ('3', '店铺3', '630004');
INSERT INTO Shop (id, name, number) VALUES ('4', '店铺4', '130001');
INSERT INTO Shop (id, name, number) VALUES ('5', '店铺5', '110001');