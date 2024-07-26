-- 코드를 입력하세요
SELECT product_code, sum(sales_amount)*price as sales
from product inner join offline_sale using(product_id)
group by product_code
order by sales desc, product_code;