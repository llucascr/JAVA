INSERT INTO ESTADO 
    (id, nome, sigla, regiao, populacao)
VALUES
    (1000, 'Novo', 'NV', 'Sul', 2.54);

SELECT * FROM ESTADO;

INSERT INTO ESTADO 
    (nome, sigla, regiao, populacao)
VALUES
    ( 'MaisNovo', 'MN', 'Norte', 2.51);
-- Pega o ultimo ID e acrecenta mais 1
    