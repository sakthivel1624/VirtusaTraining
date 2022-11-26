SELECT
    customer_id,
    COUNT( order_id )
FROM
    orders
GROUP BY
    customer_id
ORDER BY
    customer_id;
