# HQL_Operations

Hibernate Query Language
By using Hibernate we can make CRUD operations.
HQL is possible to use only to dump one table data to another table. Not possible to insert user data using HQL, this is only for insert operations, for remaining update, delete, get there is no limitation.

Difference between SQL vs HQL
SQL is related to hibernate, HQL is related to Hibernate.
SQL is table queries, HQL is object queries

To create HQL we have Query Object , to create Query object use session.createQuery(HQL_String); then it creates a query object. For this query we have executeUpdate(), uniqueResult(), list() methods are presented on the Query Object.

executeUpdate() - this method useful for to execute insert,update,delete operations. This method returns integer value it represents how many values are affected.

-> by using HQL we can update primary keys too.
Example: String query = “update Student set id=124 where id=123”

Here Student is object name.
When compare to hibernate update or merge method no single column updations and primary key updations are not possible, but using HQL it is possible.

To select total from table using HQL, the statement is 
String HQL_Query = “From Student”
It will return total data from table, for selecting only one row
String HQL_Query = “from student where where id=123”

UniqueResult - if the select statement returns only one object or one record go with this method. other wise list method.
	Ex: Object obj = query.uniqueObject(HQL_Query);
	Ex: List<Object> list = query.list(HQL_Query);



 

