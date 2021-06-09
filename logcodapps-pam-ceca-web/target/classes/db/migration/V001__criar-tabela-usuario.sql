create table usuario(
chave bigint not null auto_increment,
nome varchar(200) not null,
contato varchar(150) not null unique,
login varchar(50) not null unique,
senha varchar(20) not null,
primary key(chave)
);