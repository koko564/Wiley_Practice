show databases;
use group2;

drop table order_data;
drop table customer_data;
drop table agent_data;

CREATE TABLE  agent_data (	
	agent_id VARCHAR(6), 
	agent_name VARCHAR(40) NOT NULL, 
	location VARCHAR(35), 
	commision DEC(10,2) NOT NULL, 
	phone_no VARCHAR(15) UNIQUE, 
	country_name VARCHAR(25),
    PRIMARY KEY(agent_id)
 );
 
 CREATE TABLE customer_data (	
	customer_id VARCHAR(6), 
	customer_name VARCHAR(40) NOT NULL, 
	customer_city CHAR(35), 
	location VARCHAR(35) NOT NULL, 
	customer_country VARCHAR(20) NOT NULL, 
	grade INT, 
	opening_amt DEC(10,2) NOT NULL, 
	receive_amt DEC(10,2) NOT NULL, 
	payment_amt DEC(10,2) NOT NULL, 
	outstanding_amt DEC(10,2) NOT NULL, 
	phone_no VARCHAR(17) NOT NULL UNIQUE, 
    agent_id VARCHAR(6),
    PRIMARY KEY(customer_id),
	FOREIGN KEY (agent_id) REFERENCES agent_data(agent_id)
);  

CREATE TABLE order_data (
	order_id INT, 
	order_amt DEC(10,2) NOT NULL, 
	advance_amt DEC(10,2) NOT NULL, 
	order_date DATE NOT NULL, 
	customer_id VARCHAR(6), 
	agent_id VARCHAR(6), 
	order_description VARCHAR(60) NOT NULL,
    PRIMARY KEY(order_id),
    FOREIGN KEY(customer_id) REFERENCES customer_data(customer_id),
    FOREIGN KEY(agent_id) REFERENCES agent_data(agent_id)
);

INSERT INTO `agent_data` VALUES
('A007', 'Ramasundar', 'Bangalore', '0.15', '077-25814763', 'IND'),
('A003', 'Alex', 'London', '0.13', '075-12458969', 'UK'),
('A008', 'Alford', 'New York', '0.12', '044-25874365', 'USA'),
('A011', 'Ravi Kumar', 'Bangalore', '0.15', '077-45625874', 'IND'),
('A010', 'Santakumar', 'Chennai', '0.14', '007-22388644', 'IND'),
('A012', 'Lucida', 'San Jose', '0.12', '044-52981425', 'USA'),
('A005', 'Anderson', 'Brisban', '0.13', '045-21447739', 'AUS'),
('A001', 'Subbarao', 'Bangalore', '0.14', '077-12346674', 'IND'),
('A002', 'Mukesh', 'Mumbai', '0.11', '029-12358964', 'IND'),
('A006', 'McDen', 'London', '0.15', '078-22255588', 'UK'),
('A004', 'Ivan', 'Torento', '0.15', '008-22544166', 'CAN'),
('A009', 'Benjamin', 'Hampshair', '0.11', '008-22536178', 'UK'),
('A013', 'Joe', 'Sydney', '0.10', '022-39223442', 'AUS');


INSERT INTO `customer_data` VALUES
('C00013', 'Holmes', 'London', 'London', 'UK', '2', '6000.00', '5000.00', '7000.00', '4000.00', '1234567890', 'A003'),
('C00001', 'Micheal', 'New York', 'New York', 'USA', '2', '3000.00', '5000.00', '2000.00', '6000.00', '9876543210', 'A008'),
('C00020', 'Albert', 'New York', 'New York', 'USA', '3', '5000.00', '7000.00', '6000.00', '6000.00', '1029384746', 'A008'),
('C00025', 'Ravindran', 'Bangalore', 'Bangalore', 'India', '2', '5000.00', '7000.00', '4000.00', '8000.00', '90201948012', 'A011'),
('C00024', 'Cook', 'London', 'London', 'UK', '2', '4000.00', '9000.00', '7000.00', '6000.00', '999999229', 'A006'),
('C00015', 'Stuart', 'London', 'London', 'UK', '1', '6000.00', '8000.00', '3000.00', '11000.00', '9836910129', 'A003'),
('C00002', 'Bolt', 'New York', 'New York', 'USA', '3', '5000.00', '7000.00', '9000.00', '3000.00', '2903982842', 'A008'),
('C00018', 'Fleming', 'Brisban', 'Brisban', 'Australia', '2', '7000.00', '7000.00', '9000.00', '5000.00', '2323232323', 'A005'),
('C00021', 'Jacks', 'Brisban', 'Brisban', 'Australia', '1', '7000.00', '7000.00', '7000.00', '7000.00', '987610293', 'A005'),
('C00019', 'Yearannaidu', 'Chennai', 'Chennai', 'India', '1', '8000.00', '7000.00', '7000.00', '8000.00', '1002004006', 'A010'),
('C00005', 'Sasikant', 'Mumbai', 'Mumbai', 'India', '1', '7000.00', '11000.00', '7000.00', '11000.00', '9182736455', 'A002'),
('C00007', 'Ramanathan', 'Chennai', 'Chennai', 'India', '1', '7000.00', '11000.00', '9000.00', '9000.00', '5123513255', 'A010'),
('C00022', 'Avinash', 'Mumbai', 'Mumbai', 'India', '2', '7000.00', '11000.00', '9000.00', '9000.00', '113-4123232', 'A002'),
('C00004', 'Winston', 'Brisban', 'Brisban', 'Australia', '1', '5000.00', '8000.00', '7000.00', '6000.00', '5123513252', 'A005'),
('C00023', 'Karl', 'London', 'London', 'UK', '0', '4000.00', '6000.00', '7000.00', '3000.00', '9182736456', 'A006'),
('C00006', 'Shilton', 'Torento', 'Torento', 'Canada', '1', '10000.00', '7000.00', '6000.00', '11000.00', '9182736457', 'A004'),
('C00010', 'Charles', 'Hampshair', 'Hampshair', 'UK', '3', '6000.00', '4000.00', '5000.00', '5000.00', '9112736458', 'A009'),
('C00017', 'Srinivas', 'Bangalore', 'Bangalore', 'India', '2', '8000.00', '4000.00', '3000.00', '9000.00', '9182706459', 'A007'),
('C00012', 'Steven', 'San Jose', 'San Jose', 'USA', '1', '5000.00', '7000.00', '9000.00', '3000.00', '9183336460', 'A012'),
('C00008', 'Karolina', 'Torento', 'Torento', 'Canada', '1', '7000.00', '7000.00', '9000.00', '5000.00', '8273912938', 'A004'),
('C00003', 'Martin', 'Torento', 'Torento', 'Canada', '2', '8000.00', '7000.00', '7000.00', '8000.00', '8273912937', 'A004'),
('C00009', 'Ramesh', 'Mumbai', 'Mumbai', 'India', '3', '8000.00', '7000.00', '3000.00', '12000.00', '8273112936', 'A002'),
('C00014', 'Rangarappa', 'Bangalore', 'Bangalore', 'India', '2', '8000.00', '11000.00', '7000.00', '12000.00', '8273912939', 'A001'),
('C00016', 'Venkatpati', 'Bangalore', 'Bangalore', 'India', '2', '8000.00', '11000.00', '7000.00', '12000.00', '9102034005', 'A007'),
('C00011', 'Sundariya', 'Chennai', 'Chennai', 'India', '3', '7000.00', '11000.00', '7000.00', '11000.00', '827390000', 'A010');

INSERT INTO `order_data` VALUES
('200100', '1000.00', '600.00', '2008-01-08', 'C00015', 'A003', 'lorem ipsum'),
('200110', '3000.00', '500.00', '2008-04-15', 'C00019', 'A010', 'doakfokok of foakf'),
('200107', '4500.00', '900.00', '2008-08-30', 'C00007', 'A010', 'asfaa s fa sf  a'),
('200112', '2000.00', '400.00', '2008-05-30', 'C00016', 'A007', 'lorem ipsum dorol sit amet'),
('200113', '4000.00', '600.00', '2008-06-10', 'C00022', 'A002', 'Star'),
('200102', '2000.00', '300.00', '2008-05-25', 'C00012', 'A012', 'Red'),
('200114', '3500.00', '2000.00', '2008-08-15', 'C00002', 'A008', 'SOD\r'),
('200122', '2500.00', '400.00', '2008-09-16', 'C00003', 'A004', 'SOD\r'),
('200118', '500.00', '100.00', '2008-07-20', 'C00023', 'A006', 'SOD\r'),
('200119', '4000.00', '700.00', '2008-09-16', 'C00007', 'A010', 'SOD\r'),
('200121', '1500.00', '600.00', '2008-09-23', 'C00008', 'A004', 'SOD\r'),
('200130', '2500.00', '400.00', '2008-07-30', 'C00025', 'A011', 'SOD\r'),
('200134', '4200.00', '1800.00', '2008-09-25', 'C00004', 'A005', 'SOD\r'),
('200115', '2000.00', '1200.00', '2008-02-08', 'C00013', 'A013', 'SOD\r'),
('200108', '4000.00', '600.00', '2008-02-15', 'C00008', 'A004', 'SOD\r'),
('200103', '1500.00', '700.00', '2008-05-15', 'C00021', 'A005', 'SOD\r'),
('200105', '2500.00', '500.00', '2008-07-18', 'C00025', 'A011', 'SOD\r'),
('200109', '3500.00', '800.00', '2008-07-30', 'C00011', 'A010', 'SOD\r'),
('200101', '3000.00', '1000.00', '2008-07-15', 'C00001', 'A008', 'SOD\r'),
('200111', '1000.00', '300.00', '2008-07-10', 'C00020', 'A008', 'SOD\r'),
('200104', '1500.00', '500.00', '2008-03-13', 'C00006', 'A004', 'SOD\r'),
('200106', '2500.00', '700.00', '2008-04-20', 'C00005', 'A002', 'SOD\r'),
('200125', '2000.00', '600.00', '2008-10-10', 'C00018', 'A005', 'SOD\r'),
('200117', '800.00', '200.00', '2008-10-20', 'C00014', 'A001', 'SOD\r'),
('200123', '500.00', '100.00', '2008-09-16', 'C00022', 'A002', 'SOD\r'),
('200120', '500.00', '100.00', '2008-07-20', 'C00009', 'A002', 'SOD\r'),
('200116', '500.00', '100.00', '2008-07-13', 'C00010', 'A009', 'SOD\r'),
('200124', '500.00', '100.00', '2008-06-20', 'C00017', 'A007', 'SOD\r'),
('200126', '500.00', '100.00', '2008-06-24', 'C00022', 'A002', 'SOD\r'),
('200129', '2500.00', '500.00', '2008-07-20', 'C00024', 'A006', 'SOD\r'),
('200127', '2500.00', '400.00', '2008-07-20', 'C00015', 'A003', 'SOD\r'),
('200128', '3500.00', '1500.00', '2008-07-20', 'C00009', 'A002', 'SOD\r'),
('200135', '2000.00', '800.00', '2008-09-16', 'C00007', 'A010', 'SOD\r'),
('200131', '900.00', '150.00', '2008-08-26', 'C00012', 'A012', 'SOD\r'),
('200133', '1200.00', '400.00', '2008-06-29', 'C00009', 'A002', 'SOD\r'),
('200132', '4000.00', '2000.00', '2008-08-15', 'C00013', 'A003', 'SOD\r');

SELECT * FROM customer_data;
SELECT * FROM order_data;
SELECT * FROM agent_data;

DESC order_data;

-- Write a query to get order_id, order_date, customer_id, customer_name where customer_country is INDIA and agent commision > 14%
SELECT 
    o.order_id,
    o.order_date,
    c.customer_id,
    c.customer_name,
    c.customer_country
FROM
    order_data AS o
        INNER JOIN
    customer_data c ON o.customer_id = c.customer_id
WHERE
    c.agent_id IN (SELECT 
            c.agent_id
        FROM
            agent_data AS a
                INNER JOIN
            customer_data c ON a.agent_id = c.agent_id
        WHERE
            c.customer_country = 'INDIA'
                AND a.commision > 0.14);


-- Query customer names of customers ending with 't' and agent names starting with 'a' for orders where advance amount is more than 50% of order amt order by advance amt
SELECT 
   a.agent_name, c.customer_name
FROM
    customer_data c,
    agent_data a,
    order_data o
WHERE
    c.agent_id = o.agent_id
        AND c.agent_id = a.agent_id
        AND o.advance_amt > (0.5 * order_amt)
		AND c.customer_name LIKE "%t"
        AND a.agent_name LIKE "a%";

SELECT 
    a.agent_name, c.customer_name
FROM
    customer_data c,
    agent_data a
WHERE
    c.agent_id = a.agent_id
        AND c.customer_name LIKE '%t'
        AND a.agent_name LIKE 'a%'
        AND a.agent_id IN (SELECT 
            a1.agent_id
        FROM
            agent_data a1,
            order_data o1
        WHERE
            o1.advance_amt > (0.5 * o1.order_amt)
                AND a1.agent_id = o1.agent_id);


-- Query all details of all grade 1 customers with average receive amounts, average payment amounts and average outstanding amounts all above their average.
SELECT 
    *
FROM
    customer_data
WHERE
    outstanding_amt > (SELECT 
            AVG(outstanding_amt)
        FROM
            customer_data)
        AND payment_amt > (SELECT 
            AVG(payment_amt)
        FROM
            customer_data)
        AND receive_amt > (SELECT 
            AVG(receive_amt)
        FROM
            customer_data)
        AND grade = 1;



-- Query the date on which maximum orders were received
SELECT 
    MAX(counter.c), counter.order_date
FROM
    (SELECT 
        COUNT(order_date) AS c, order_date
    FROM
        order_data
    GROUP BY order_date) AS counter;

-- write a query to get customer_id,customer_name,customer_location,customer_country ,order_amt,order_description,  count countries As totalCountOfCountry having  totalcountofcountry greater than 5  and customerid=c00015 and agent_ID=A003
SELECT 
    c.customer_id,
    c.customer_name,
    c.location,
    o.order_amt,
    o.order_description,
    COUNT(customer_country) AS totalcountofcountry,
    c.customer_country
FROM
    customer_data AS c
        INNER JOIN
    order_data AS o ON c.customer_id = o.customer_id
WHERE
    c.agent_id IN (SELECT 
            a.agent_id
        FROM
            agent_data AS a
                INNER JOIN
            order_data AS o1 ON a.agent_id = o1.agent_id
        WHERE
            o1.customer_id = 'C00015'
                AND a.agent_id = 'A003')
GROUP BY c.customer_country;
