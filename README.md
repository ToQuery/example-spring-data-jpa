# example-spring-data-jpa



|       表名       | 名称       |
| :--------------: | ---------- |
|    tb_product    | 产品表     |
|     tb_user      | 用户表     |
|   tb_favorite    | 用户收藏表 |
|     tb_order     | 主订单表   |
| tb_order_product | 子订单表   |





| 主:辅（纵:横）   | tb_product | tb_user | tb_favorite | tb_order | tb_order_product |
| :--------------- | ---------- | ------- | ----------- | -------- | ---------------- |
| tb_product       | -          | -       | -           | -        | 1:1              |
| tb_user          | -          | -       | 1:n         | 1:n      |                  |
| tb_favorite      | 1:1        | n:1     | -           | -        |                  |
| tb_order         | 1:n        | n:1     | -           | -        | 1:n              |
| tb_order_product | 1:1        | -       | -           | n:1      |                  |

