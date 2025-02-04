SELECT * FROM ESTADO WHERE id = 96;
SELECT * FROM ESTADO WHERE id = 90;

INSERT INTO CIDADE 
    (nome, area, estado_id)
VALUES
    ('Campinas', 795, 96);

INSERT INTO CIDADE (nome, area, estado_id) VALUES ('Niterói', 133.9, 90);

INSERT INTO CIDADE 
    (nome, area, estado_id) 
    VALUES 
        ('Caruaru', 
        920.6, 
        (SELECT id FROM ESTADO WHERE sigla = 'PE')
    );

INSERT INTO CIDADE (nome, area, estado_id) VALUES ('Juazeiro do Norte', 248.2, (SELECT id FROM ESTADO WHERE sigla = 'CE'));

SELECT * FROM CIDADE;