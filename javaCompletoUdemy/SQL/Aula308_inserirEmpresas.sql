insert into EMPRESA 
	(nome, cnpj)
values
	('Bradesco', 15383898000100),
    ('Valeo', 76859218000168),
    ('Cielo', 86924883000141);

alter table EMPRESA modify cnpj varchar(14);

INSERT INTO EMPRESAS_UNIDADE 
    (empresa_id, cidade_id, sede)
VALUES
    (1, 1, 1),
    (1, 2, 0),
    (2, 1, 0),
    (2, 2, 1);
