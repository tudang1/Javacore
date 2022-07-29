use classicmodels;

-- Liệt kê tên các văn phòng theo tên thành phố và số lượng nhân viên thuộc các văn phòng đó
SELECT o.city,COUNT(e.employeeNumBer) AS SoNhanVien
FROM offices o INNER JOIN employees e ON o.officeCode = e.officeCode
GROUP BY city
ORDER BY SoNhanVien DESC;

-- Liệt kê nước nào có số lượng văn phòng nhiều nhất
CREATE OR REPLACE VIEW offices_of_country AS
SELECT country,COUNT(city) AS count
FROM offices
GROUP BY country
ORDER BY count DESC;

SELECT country
FROM offices_of_country
WHERE count = (
	SELECT MAX(count)
    FROM offices_of_country
);

-- Liệt kê tình trạng các đơn hàng và số lượng đơn hàng thuộc tình trạng đó
SELECT status,COUNT(orderNumber) AS count
FROM orders
GROUP BY status
ORDER BY count DESC;

-- Liệt kê productLine và số lượng sản phẩm thuộc các line đó
SELECT productLine,COUNT(productName) AS count
FROM products
GROUP BY productLine
ORDER BY count DESC;

-- Liệt kê thông tin những đơn hàng bị hủy gồm: id đơn hàng,
-- id khách hàng, tên khách hàng, orderDate, requireDate, nguyên nhân đơn hàng bị hủy (comment)
SElECT o.orderNumber,o.customerNumber,c.customerName,o.orderDate,o.requiredDate,o.comments
FROM orders o INNER JOIN customers c ON o.customerNumber = c.customerNumber
WHERE status = 'Cancelled';

-- Liệt kê id đơn hàng, id khách hàng, tên khách hàng, orderDate,
-- requireDate, sản phẩm (id, tên, số lượng) , comment của đơn hàng có id 10165
SELECT o.orderNumber,o.customerNumber,c.customerName,o.orderDate,o.requiredDate,odd.productCode,
p.productName,odd.quantityOrdered,o.comments
FROM orders o 
INNER JOIN customers c ON o.customerNumber = c.customerNumber
INNER JOIN orderdetails odd ON o.orderNumber = odd.orderNumber
INNER JOIN products p ON odd.productCode = p.productCode
WHERE o.orderNumber = 10165;

-- Liệt kê thông tin các nhân viên thực hiện công việc Sales Rep làm việc ở văn phòng San Francisco
SELECT *
FROM employees e INNER JOIN offices o ON e.officeCode = o.officeCode
WHERE o.city = 'San Francisco';

-- Liệt kê thông 5 khách hàng order nhiều nhất
SELECT c.customerName , COUNT(o.orderNumber) AS count
FROM customers c INNER JOIN orders o ON o.customerNumber = c.customerNumber
GROUP BY c.customerName 
ORDER BY count DESC
LIMIT 5;

-- Tạo store procedure lấy ra thông tin id đơn hàng, id khách hàng, tên khách hàng,
-- orderDate, requireDate, shippedDate, sản phẩm (id, tên, số lượng), comment, với tham số truyền vào là status
DROP PROCEDURE IF EXISTS informations;
DELIMITER $$
CREATE PROCEDURE informations(
	IN status_input TEXT
)
BEGIN
	SELECT o.orderNumber,o.customerNumber,c.customerName,o.orderDate,o.requiredDate,o.shippedDate,odd.productCode,
			p.productName,odd.quantityOrdered,o.comments
    FROM orders o 
    INNER JOIN customers c ON o.customerNumber = c.customerNumber
	INNER JOIN orderdetails odd ON o.orderNumber = odd.orderNumber
	INNER JOIN products p ON odd.productCode = p.productCode
    WHERE status = status_input;
END $$
DELIMITER ;

CALL informations('shipped');