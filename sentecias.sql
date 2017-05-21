use sysaulaBD;

LOAD DATA LOCAL INFILE 'Edificio.csv'
INTO TABLE edificio
FIELDS TERMINATED BY ',' OPTIONALLY ENCLOSED BY '"'
LINES TERMINATED BY '\n';


select count(*) from edificio;





