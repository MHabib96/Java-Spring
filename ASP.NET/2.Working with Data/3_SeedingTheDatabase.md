# ASP.NET MVC 5 Tutorial - Seeding the Database
##### The Database
+ If you are using code-first workflow you should not need to touch the database.
+ Every change in the database should go through a migration.
##### Adding Records through Migration
+ First you must add an empty migration through the Package Manager Console.
+ In the empty migration, you can then call the *Sql* method to pass an SQL statement in the *Up* method.
+ You can use the *Sql* method to run any SQL statements.
+ Once the SQL commands are typed, you must update the database using `update-database`.
```
public override void Up()
{
    Sql("INSERT INTO MembershipTypes (Id, SignUpFee, DurationInMonths, DiscountRate) VALUES (1, 0, 0, 0)");
    Sql("INSERT INTO MembershipTypes (Id, SignUpFee, DurationInMonths, DiscountRate) VALUES (2, 30, 1, 10)");
    Sql("INSERT INTO MembershipTypes (Id, SignUpFee, DurationInMonths, DiscountRate) VALUES (3, 90, 3, 15)");
    Sql("INSERT INTO MembershipTypes (Id, SignUpFee, DurationInMonths, DiscountRate) VALUES (4, 300, 12, 20)");
}
```
##### Adding Data through the Database
+ You can directly input data into the database tables, however it is not recommended to do so.
+ You can access the database tables through the Server Explorer in the *Tables* folder.
+ Right click the selected table and click *Show Table Data*.
+ Individual rows can be selected and values can be inputted manually.
