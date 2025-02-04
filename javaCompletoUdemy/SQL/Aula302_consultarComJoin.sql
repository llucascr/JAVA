SELECT * FROM ESTADO e, CIDADE c
WHERE e.id = c.estado_id;


SELECT 
    c.nome AS Cidade, 
    e.nome AS Estado, 
    regiao AS Região 
FROM ESTADO e, CIDADE c
WHERE e.id = c.estado_id;


SELECT 
    c.nome AS Cidade, 
    e.nome AS Estado, 
    regiao AS Região 
FROM ESTADO e
INNER JOIN CIDADE c ON e.id = c.estado_id;