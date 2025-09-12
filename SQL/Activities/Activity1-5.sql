--Activity1
CREATE TABLE salesman(Salesman_ID int PRIMARY KEY, Salesman_name varchar (10) NOT NULL, salesman_city varchar (10), commission int );
Describe Salesman;
Drop table salesman;
--ACtivity2
INSERT ALL 
    INTO salesman values(5001, 'James Hoog', 'New York', 15)
    INTO salesman values(5002, 'Nail Knite', 'Paris', 13)
    INTO salesman values(5005, 'Pit Alex', 'London', 11)
    INTO salesman values(5006, 'McLyon', 'Paris', 14)
    INTO salesman values(5007, 'Paul Adam', 'Rome', 13)
    INTO salesman values(5003, 'Lauson Hen', 'San Jose', 12)
Select 1 from DUAL;
Select * from Salesman;
--for (String temp: list)
--Activity3
-- Show data from the salesman_id and city columns
SELECT salesman_id, salesman_city FROM salesman;

-- Show data of salesman from Paris
SELECT * FROM salesman WHERE salesman_city='Paris';

-- Show salesman_id and commission of Paul Adam
SELECT salesman_id, commission FROM salesman WHERE salesman_name='Paul Adam';

--Activity4
Alter Table salesman add (Grade int );
Describe Salesman;
update salesman set grade = 100;
Select * from salesman;
--Activity5
-- Update the grade score of salesmen from Rome to 200.
UPDATE salesman SET grade=200 WHERE salesman_city='Rome';

-- Update the grade score of James Hoog to 300.
UPDATE salesman SET grade=300 WHERE salesman_name='James Hoog';
-- Update the name McLyon to Pierre.
UPDATE salesman SET salesman_name='Pierre' WHERE salesman_name='McLyon';
---SELECT the tbale 
SELECT * FROM salesman;

