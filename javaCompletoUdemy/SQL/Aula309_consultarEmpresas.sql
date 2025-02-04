SELECT 
    e.nome, c.nome 
FROM EMPRESA e, EMPRESAS_UNIDADE eu, CIDADE c
WHERE e.id = eu.empresa_id
AND c.id = eu.cidade_id
AND sede;
