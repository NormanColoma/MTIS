create table Member(
code int primary key auto_increment,
email varchar(50) not null,
name varchar(25) not null,
surname varchar(50),
NIF varchar(9) not null unique key,
province varchar(25),
city varchar(25),
VIP int
);

create table SportCenter(
id int primary key auto_increment,
name varchar(50) not null, 
description varchar(2000), 
img varchar(500)
);

create table Sport(
id int primary key auto_increment,
id_sp int,
name varchar(50) not null, 
foreign key(id_sp) references sportCenter(id)
);

create table Tournament(
id int primary key auto_increment,
sport varchar(25) not null,
name varchar(50) not null,
info varchar(250),
startData varchar(10),
endData varchar(10),
playing int
);

create table Team(
id int primary key auto_increment,
name varchar(50) not null unique key,
sport varchar(25) not null
);

create table Field(
id int primary key auto_increment,
id_sport int,
name varchar(50) not null,
startDate varchar(10),
endDate varchar(10),
sportCenter int not null,
foreign key(sportCenter) references sportCenter(id),
foreign key(id_sport) references Sport(id)
);

create table Boocking(
code int auto_increment,
total float not null default 0,
payMethodSelect varchar(25),
sport varchar(25),
date varchar(16),
userNumber int not null references Member(code),
idField int not null references Field(id),
primary key(code,date),
unique(code,date)
);

create table SportCenterTournament(
SportCenter int references SportCenter(id),
Tournament int references Tournament(id),
primary key(SportCenter, Tournament)
);

create table TournamentTeam(
tournament int references Tournament(id),
team int references Team(id),
primary key(tournament, team)
);

create table Game(
id int primary key auto_increment,
date varchar(10),
confirmed int,
sportCenter int not null references sportCenter(id)
);

create table TeamMember(
member int not null references Member(code),
team int not null references Team(id),
primary key(member,team)
);

create table TeamGame(
team int not null references Team(id),
game int not null references Game(id),
primary key(team,game)
);

insert into Member(email,name,surname,NIF,province,city,VIP) values("jose@hola.com","jose","garcia","74443222L","Alicante","San Vicente",1);
insert into Member(email,name,surname,NIF,province,city,VIP) values("mario@hola.com","mario","garcia","54434311G","Alicante","San Vicente",0);
insert into Member(email,name,surname,NIF,province,city,VIP) values("miguel@hola.com","miguel","lopez","75755543Y","Madrid","Vallecas",0);

insert into sportCenter(name) values ("Ciudad Deportiva");
insert into sportCenter(name) values ("Tiro Pichon");
insert into sportCenter(name) values ("Arena");

insert into Sport (name,id_sp) values ("Fútbol 11",1);  /*id=1*/
insert into Sport (name,id_sp) values ("Fútbol sala",1); /*id=2*/
insert into Sport (name,id_sp) values ("Baloncesto",1); /*id=3*/
insert into Sport (name,id_sp) values ("Padel",1);      /*id=4*/
insert into Sport (name,id_sp) values ("Tenis",1); 		/*id=5*/
insert into Sport (name,id_sp) values ("Natación",2);	/*id=6*/
insert into Sport (name,id_sp) values ("Voleibol",2);	/*id=7*/
insert into Sport (name,id_sp) values ("Tenis",2);      /*id=8*/
insert into Sport (name,id_sp) values ("Baloncesto",3);      /*id=9*/
insert into Sport (name,id_sp) values ("Natación",3);      /*id=10*/
insert into Sport (name,id_sp) values ("Padel",3);      /*id=11*/

insert into Field(name, startDate, endDate, sportCenter,id_sport) values ("Pista padel", "08:00","21:00",1,4);
insert into Field(name, startDate, endDate, sportCenter,id_sport) values ("Fútbol sala", "08:00","21:00",1,2);
insert into Field(name, startDate, endDate, sportCenter,id_sport) values ("Pista tenis", "08:00","21:00",1,5);
insert into Field(name, startDate, endDate, sportCenter,id_sport) values ("Piscina", "08:00","20:00",2,6);
insert into Field(name, startDate, endDate, sportCenter,id_sport) values ("Spa", "08:00","20:00",2,6);
insert into Field(name, startDate, endDate, sportCenter,id_sport) values ("Pista tenis", "08:00","20:00",2,8);
insert into Field(name,startDate,endDate,sportCenter,id_sport) values ("Pista Voleibol","08:00","20:00",2,7);
insert into Field(name, startDate, endDate, sportCenter,id_sport) values ("Pista padel", "08:00","21:30",3,11);
insert into Field(name, startDate, endDate, sportCenter,id_sport) values ("Pista Baloncesto", "08:00","21:30",3,9);
insert into Field(name, startDate, endDate, sportCenter,id_sport) values ("Piscina Cubierta", "08:00","21:30",3,10);

insert into Tournament(name,sport,info,startData,endData,playing) values ("Campeonato Futbol Sala 24h", "Futbol", 
"Campeonato con multiples equipos en los cuales pueden jugar las 24horas del dia", "24-05-2015","30-05-2015", 0);
insert into Tournament(name,sport,info,startData,endData,playing) values ("Campeonato de España Voleibol", "Voleibol", 
"Campeonato con multiples equipos donde se juegan ser el mejor equipo de españa en dicha disciplina", "17-05-2015","24-05-2015", 1);
insert into Tournament(name,sport,info,startData,endData,playing) values ("Torneo Waterpolo Vega Baja", "Futbol", 
"Torneo de diversidad de equipos compitiendo por ser el mejor de la Vega Baja", "30-05-2015","17-06-2015", 0);

insert into Boocking(payMethodSelect,sport,date,userNumber,idField) values ("tarjeta","Futbol","20-05-2015",1,2);
insert into Boocking(payMethodSelect,sport,date,userNumber,idField) values ("tarjeta","Padel","26-05-2015",1,1);
insert into Boocking(payMethodSelect,sport,date,userNumber,idField) values ("tarjeta","Natacion","22-05-2015",2,4);
insert into Boocking(payMethodSelect,sport,date,userNumber,idField) values ("efectivo","Padel","27-05-2015",1,7);
insert into Boocking(payMethodSelect,sport,date,userNumber,idField) values ("tarjeta","Tenis","25-05-2015",3,6);
insert into Boocking(payMethodSelect,sport,date,userNumber,idField) values ("efectivo","Baloncesto","24-05-2015",2,8);

insert into SportCenterTournament(sportCenter,tournament) values (1,1);
insert into SportCenterTournament(sportCenter,tournament) values (2,2);
insert into SportCenterTournament(sportCenter,tournament) values (3,3);

alter table Member add img varchar(100);
alter table Team add img varchar(100);

update boocking set date="20-05-2015 14:00" where code=1;
update boocking set date="25-05-2015 14:30" where code=2;
update boocking set date="22-05-2015 17:00"where code=3;
update boocking set date="27-05-2015 11:30" where code=4;
update boocking set date="25-05-2015 14:30" where code=5;
update boocking set date="24-05-2015 19:00" where code=6;
