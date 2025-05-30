CREATE TABLE IF NOT EXISTS EMPRESA (
	id int unsigned not null auto_increment,
    nome varchar(255) not null,
    cnpj int unsigned,
    primary key(id),
    unique key (cnpj)
);

-- N:N

create table if not exists EMPRESAS_UNIDADE (
	empresa_id int unsigned not null,
    cidade_id int unsigned not null,
    sede tinyint(1) not null,
    primary key(empresa_id, cidade_id)
);