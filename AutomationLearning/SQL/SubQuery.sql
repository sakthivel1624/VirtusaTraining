SELECT
    product_id,
    product_name,
    list_price
FROM
    products
WHERE
    list_price = (SELECT MAX( list_price ) FROM products)
