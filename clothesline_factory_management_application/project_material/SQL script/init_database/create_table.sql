
create table IF NOT EXISTS EMPLOYEE (
EMP_ID  INTEGER  auto_increment NOT NULL UNIQUE,
EMP_PERSON_ID VARCHAR (20) NOT NULL,
EMP_FNAME VARCHAR (40) NOT NULL,
EMP_LNAME VARCHAR (40) NOT NULL,
EMP_GENDER CHAR (1) NOT NULL,
EMP_POSITION VARCHAR (30) NOT NULL,
EMP_RANK VARCHAR (30) NOT NULL,
EMP_TELEPHONE VARCHAR (15) NOT NULL,
EMP_ADDRESS VARCHAR (300) NOT NULL,
EMP_CHG_HOUR DECIMAL(4,2) NOT NULL,
EMP_START_DATE DATE NOT NULL,
EMP_QUIT_DATE DATE ,
PRIMARY KEY (EMP_ID),
CONSTRAINT EMP_CON UNIQUE(EMP_FNAME, EMP_LNAME));


create table IF NOT EXISTS TIME_WORK (
TW_ID INT auto_increment,
TW_DATE DATE NOT NULL,
TW_START_TIME TIME NOT NULL,
TW_QUIT_TIME TIME,
TW_DURATION decimal(4, 2) UNSIGNED,
EMP_ID  INTEGER  NOT NULL,
PRIMARY KEY (TW_ID),
FOREIGN KEY (EMP_ID) REFERENCES EMPLOYEE(EMP_ID) ON DELETE CASCADE ON UPDATE CASCADE );

create table IF NOT EXISTS PAY_SALARY (
EMP_ID  INTEGER  NOT NULL,
PAY_DATE DATE NOT NULL,
PAY_MONTH_COST DECIMAL(7,2) NOT NULL,
PAY_OT_COST DECIMAL(7,2) NOT NULL,
PRIMARY KEY (EMP_ID,PAY_DATE),
FOREIGN KEY (EMP_ID) REFERENCES EMPLOYEE(EMP_ID) ON DELETE CASCADE ON UPDATE CASCADE);

create table IF NOT EXISTS OVER_TIME (
OT_ID INT auto_increment,
OT_DATE DATE NOT NULL,
OT_START_TIME TIME NOT NULL,
OT_QUIT_TIME TIME,
OT_DURATION decimal(4, 2) UNSIGNED,
EMP_ID INTEGER  NOT NULL,
PRIMARY KEY (OT_ID),
FOREIGN KEY (EMP_ID) REFERENCES EMPLOYEE(EMP_ID) ON DELETE CASCADE ON UPDATE CASCADE);
    
CREATE TABLE IF NOT EXISTS MATERIAL(
	MAT_ID INTEGER auto_increment NOT NULL UNIQUE,
    MAT_NAME VARCHAR(30) NOT NULL,
    MAT_DESCRIPTION VARCHAR(60),
    MAT_AMOUNT MEDIUMINT UNSIGNED NOT NULL,
    MAT_UNIT_COST DECIMAL(10, 2) NOT NULL,
    MAT_MIN mediumint ,
    MAT_ORDER mediumint ,
    MAT_UNIT VARCHAR(30) NOT NULL,
	PRIMARY KEY (MAT_ID));

CREATE TABLE IF NOT EXISTS VENDOR(
	V_ID INTEGER  auto_increment NOT NULL UNIQUE,
    V_NAME VARCHAR(60) NOT NULL,
    V_PHONE VARCHAR(15) NOT NULL,
    V_ADDRESS VARCHAR(300) NOT NULL,
    V_CONTACT VARCHAR(60) NOT NULL,
	PRIMARY KEY(V_ID));
    
CREATE TABLE IF NOT EXISTS PRODUCE(
	P_ID INTEGER auto_increment ,
    V_ID INTEGER  NOT NULL,
    MAT_ID INTEGER  NOT NULL ,
    PRODUCE_PRICE DECIMAL(6,2) NOT NULL,
	PRIMARY KEY(P_ID),
    FOREIGN KEY (V_ID) REFERENCES VENDOR(V_ID) ON DELETE CASCADE ON UPDATE CASCADE,
    FOREIGN KEY (MAT_ID) REFERENCES MATERIAL(MAT_ID) ON DELETE CASCADE ON UPDATE CASCADE);
     
CREATE TABLE IF NOT EXISTS MATERIAL_PRICE_CHANGE(
	MPC_ID INTEGER auto_increment NOT NULL UNIQUE,
    MPC_DATE DATE NOT NULL,
    MPC_PRICE DECIMAL(6, 2) NOT NULL,
    P_ID INTEGER NOT NULL,
    PRIMARY KEY(MPC_ID),
	FOREIGN KEY (P_ID) REFERENCES PRODUCE(P_ID) ON DELETE CASCADE ON UPDATE CASCADE);

CREATE TABLE IF NOT EXISTS CUSTOMER (
    CUS_ID INT NOT NULL AUTO_INCREMENT,
    CUS_NAME VARCHAR(60) NOT NULL,
    CUS_ADDRESS VARCHAR(300) NOT NULL,
    CUS_TELEPHONE VARCHAR(15) NOT NULL,
    PRIMARY KEY (CUS_ID)
);

CREATE TABLE IF NOT EXISTS BILLS(
	BILL_ID  INTEGER auto_increment,
	BILL_STATUS boolean,
	BILL_DATE DATE,
	BILL_REM_DATE DATE,
    BILL_PRICE DECIMAL(8,2) NOT NULL,
	PRIMARY KEY (BILL_ID)
);
    
create table IF NOT EXISTS PRODUCT(
	PROD_ID INTEGER auto_increment, 
	PROD_NAME varchar(60) not null unique,
    PROD_SALE_PRICE decimal(5, 2),
    PROD_CAPITAL_COST decimal(5, 2) not null,
    PROD_DESCRIPT varchar(60) not null,
    PROD_AMOUNT smallint unsigned not null,
    PROD_MIN smallint unsigned,
    PROD_MANU smallint unsigned,
    primary key (PROD_ID)
);

create table IF NOT EXISTS DELIVERY(
	DELI_ID integer auto_increment,
    DELI_DATE date not null unique, 
    DELI_COST decimal(6, 2) not null,
    DELI_AMOUNT smallint unsigned not null,
    primary key(DELI_ID)
);

create table IF NOT EXISTS PRODUCT_ORDER(
	PORDER_ID int auto_increment, 
	PORDER_DATE date not null,  
	PORDER_DOWN_PAYMENT decimal(8, 2) not null,
	PORDER_BILL_TYPE char(1) not null,
    CUS_ID int,
    EMP_ID int,
    primary key (PORDER_ID),
    foreign key (CUS_ID) references CUSTOMER(CUS_ID) ON UPDATE CASCADE ON DELETE CASCADE,
    foreign key (EMP_ID) references EMPLOYEE(EMP_ID) ON UPDATE CASCADE ON DELETE SET NULL
);

create table IF NOT EXISTS INSTANCE(
	INSTANCE_ID int auto_increment,
	INSTANCE_TOTAL_AMOUNT smallint unsigned not null,
	INSTANCE_TOTAL_PRICE decimal(8, 2) not null,
	INSTANCE_DELI_DATE date not null,
	PORDER_ID int not null,
	BILL_ID int,
    primary key(INSTANCE_ID),
    foreign key(PORDER_ID) references PRODUCT_ORDER(PORDER_ID) ON DELETE CASCADE ON UPDATE CASCADE,
    foreign key(BILL_ID) references BILLS(BILL_ID) ON DELETE SET NULL ON UPDATE CASCADE,
	CONSTRAINT INSTANCE_CON UNIQUE(INSTANCE_DELI_DATE, PORDER_ID)
);


create table if not exists INSTANCE_DETAIL(
	INSTANCE_ID int, 
    PROD_ID int,
    INDE_AMOUNT smallint unsigned not null,
    INDE_UNITS_PRICE decimal(5, 2) not null,
    primary key(INSTANCE_ID, PROD_ID),
    foreign key(INSTANCE_ID) references INSTANCE(INSTANCE_ID) ON DELETE CASCADE ON UPDATE CASCADE,
    foreign key(PROD_ID) references PRODUCT(PROD_ID) ON DELETE CASCADE ON UPDATE CASCADE
);

create table if not exists DELI_TASK(
	DTASK_ID int auto_increment,
    DTASK_COST decimal(6, 2),
    DTASK_AMOUNT smallint unsigned not null,
    DTASK_TIME time not null,
	DELI_ID int not null,
    EMP_ID int,
    primary key(DTASK_ID),
    foreign key(DELI_ID) references DELIVERY(DELI_ID) ON DELETE CASCADE ON UPDATE CASCADE,
	foreign key(EMP_ID) references EMPLOYEE(EMP_ID) ON DELETE SET NULL ON UPDATE CASCADE
);

create table if not exists TASK_DETAIL(
	DTASK_ID int not null,
    INSTANCE_ID int,
    TD_AMOUNT smallint unsigned not null,
    primary key(DTASK_ID, INSTANCE_ID),
    foreign key(DTASK_ID) references DELI_TASK(DTASK_ID) ON DELETE CASCADE ON UPDATE CASCADE,
    foreign key(INSTANCE_ID) references INSTANCE(INSTANCE_ID) ON DELETE CASCADE ON UPDATE CASCADE
);


CREATE TABLE IF NOT EXISTS CLAIM(
	C_ID INTEGER  auto_increment NOT NULL UNIQUE,
    C_COST DECIMAL(8,2),
	C_STATUS CHAR(1) NOT NULL,
    C_DATE DATE NOT NULL,
    C_REPAIR boolean NOT NULL, 
    INSTANCE_ID INTEGER NOT NULL,
    PRIMARY KEY (C_ID),
	FOREIGN KEY (INSTANCE_ID) REFERENCES INSTANCE(INSTANCE_ID) ON DELETE CASCADE ON UPDATE CASCADE);
       
CREATE TABLE IF NOT EXISTS CLAIM_TYPE(
	CT_ID INTEGER auto_increment NOT NULL UNIQUE,
	CT_TYPE VARCHAR(60) NOT NULL,
    PRIMARY KEY (CT_ID));

CREATE TABLE IF NOT EXISTS CLAIM_DETAIL(
	C_ID INTEGER NOT NULL,
    CT_ID INTEGER NOT NULL,
    PROD_ID INTEGER NOT NULL,
    CD_AMOUNT SMALLINT UNSIGNED NOT NULL,
    CD_REPAIR SMALLINT UNSIGNED NOT NULL,
    CD_UNIT_COST DECIMAL(10, 2) NOT NULL,
    PRIMARY KEY (C_ID, CT_ID, PROD_ID),
	FOREIGN KEY (C_ID) REFERENCES CLAIM(C_ID) ON DELETE CASCADE ON UPDATE CASCADE,
    FOREIGN KEY (CT_ID) REFERENCES CLAIM_TYPE(CT_ID) ON DELETE CASCADE ON UPDATE CASCADE,
    FOREIGN KEY (PROD_ID) REFERENCES PRODUCT(PROD_ID) ON DELETE CASCADE ON UPDATE CASCADE);    

create table IF NOT EXISTS ORDER_MANUFACTURE(
	OMANU_ID int auto_increment, 
	OMANU_DATE date not null,
	OMANU_AMOUNT smallint unsigned not null,
	OMANU_STATUS boolean not null,
    OMANU_COST DECIMAL(8, 2), 
    OMANU_QC smallint unsigned, 
    PROD_ID int not null,
    primary key (OMANU_ID),
    foreign key (PROD_ID) references PRODUCT(PROD_ID) ON DELETE CASCADE ON UPDATE CASCADE,
	CONSTRAINT OMANU_CON UNIQUE(OMANU_DATE, PROD_ID)
);

create table IF NOT EXISTS MANUFACTURING(
	MAFAC_ID int auto_increment, 
    MAFAC_DATE date not null,
    MAFAC_AMOUNT smallint unsigned,
    MAFAC_COST DECIMAL(8, 2),
    MAFAC_QC smallint unsigned,
    OMANU_ID int not null,
    primary key(MAFAC_ID),
    foreign key(OMANU_ID) references ORDER_MANUFACTURE(OMANU_ID) ON DELETE CASCADE ON UPDATE CASCADE
);

create table IF NOT EXISTS BRING_MATERIAL
(
	BR_ID int auto_increment,
	BR_COST DECIMAL(8, 2) NOT NULL ,
	BR_DATE_TIME datetime not null ,
	EMP_ID int,
	MAFAC_ID INT,

	primary key (BR_ID),
	foreign key (EMP_ID) references EMPLOYEE(EMP_ID) ON DELETE SET NULL ON UPDATE CASCADE,
	foreign key (MAFAC_ID) references MANUFACTURING(MAFAC_ID) ON DELETE CASCADE ON UPDATE CASCADE
);

create table IF NOT EXISTS BRING_MAT_DETAIL
(
	BR_ID int not null,
	MAT_ID INT NOT NULL ,
	BMD_AMOUNT SMALLINT not null ,
	BMD_UNIT_COST DECIMAL(6, 2) not null,

	primary key (BR_ID, MAT_ID),
	foreign key (MAT_ID) references MATERIAL(MAT_ID) ON DELETE CASCADE ON UPDATE CASCADE,
	foreign key (BR_ID) references BRING_MATERIAL(BR_ID) ON DELETE CASCADE ON UPDATE CASCADE
);

create table IF NOT EXISTS RETURN_MATERIAL
(
	MR_ID int not null auto_increment,
	MR_COST DECIMAL(8, 2) not null,
	MR_DATE_TIME DATETIME NOT NULL,
    EMP_ID INT,
	MAFAC_ID INT,

	primary key (MR_ID),
	foreign key (EMP_ID) references EMPLOYEE(EMP_ID) ON DELETE SET NULL ON UPDATE CASCADE,
	foreign key (MAFAC_ID) references MANUFACTURING(MAFAC_ID) ON DELETE CASCADE ON UPDATE CASCADE
);
    
  create table IF NOT EXISTS RETURN_MAT_DETAIL
(
	MR_ID int not null,
	MAT_ID INT not null ,
	RMD_AMOUNT SMALLINT NOT NULL,
	RMD_UNIT_COST DECIMAL(6, 2) NOT NULL,

	primary key (MR_ID, MAT_ID),
	foreign key (MAT_ID) references MATERIAL(MAT_ID) ON DELETE CASCADE ON UPDATE CASCADE,
	foreign key (MR_ID) references RETURN_MATERIAL(MR_ID) ON DELETE CASCADE ON UPDATE CASCADE
);

create table IF NOT EXISTS MATERIAL_ORDER(
	MOR_ID int not null auto_increment,
	MOR_DATE date not null,
	MOR_COST decimal(10, 2) not null,
	EMP_ID INT,

	primary key (MOR_ID),
	foreign key (EMP_ID) references EMPLOYEE(EMP_ID) ON DELETE SET NULL ON UPDATE CASCADE
);   
    
create table IF NOT EXISTS MAT_ORDER_DETAIL(
	MOR_ID int not null,
	P_ID INT NOT NULL,
	MOD_AMOUNT MEDIUMINT UNSIGNED not null ,
	MOD_UNIT_COST decimal(6, 2) not null,
    MOD_REC_DATE DATE NOT NULL,

	primary key (MOR_ID, P_ID),
	foreign key (MOR_ID) references MATERIAL_ORDER(MOR_ID) ON DELETE CASCADE ON UPDATE CASCADE,
	foreign key (P_ID) references PRODUCE(P_ID) ON DELETE CASCADE ON UPDATE CASCADE
);
    
    

    
    
    

