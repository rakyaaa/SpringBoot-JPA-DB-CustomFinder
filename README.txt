# SpringBoot-JPA-DB-CustomFinder
In this Project, We have used the Custom Finders using the Entity Variables

GO TO THE src/main/resources/application.properties
Update/Add the username and password of the Database
Please use the Postgres DB.

OPEN THE POSTMAN AND USE THE FOLLOWING METHODS

ADD EMPLOYEE: localhost:8100/addEmployee
Set content type as application/json
{
    "empId": 5,
    "empName": "Sumit",
    "salary": 240000,
    "deptId": 32,
    "role": "Digital Marketer"
}
LIST EMPLOYEE BY NAME : localhost:8100/listByName/{name}
LIST EMPLOYEE BY ROLE : localhost:8100/listByRole/{role}
LIST EMPLOYEE BY SALARY : localhost:8100/listBySalary/{salary}
LIST EMPLOYEE BY DEPTID : localhost:8100/listByDeptId/{deptId}

Status code as 2xx indicates as successful operations performed.
