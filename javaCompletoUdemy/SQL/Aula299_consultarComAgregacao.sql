SELECT 
    regiao AS 'Região',
    SUM(populacao) AS Total
FROM `ESTADO`
GROUP BY regiao
ORDER BY Total DESC;

SELECT 
    AVG(populacao) AS Total
FROM `ESTADO`;