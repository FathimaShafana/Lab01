insert into Employee (empid,name,address,gender,value,position,salary) values(101,'David Silva', 'Bay View, Sri Lanka', 'Male' ,12325.00, 1, 120000.00);
insert into Employee (empid,name,address,gender,value,position,salary) values(210,'William Smith', 'Kyoto Park, USA', 'Male' ,12150.00, 2, 110000.00);
insert into Employee (empid,name,address,gender,value,position,salary) values(130,'Shin Tin', 'Kare Part, Myanmar', 'Female' ,56205.00, 2, 25400.00);

ALTER table Employee add column netvalue decimal(10,2) as (salary-value);