# ASP.NET MVC 5 Tutorial - Code-first Migrations
##### Code-first Workflow
+ When using code-first workflow we start with the code.
+ Everytime we modify our domain model by adding a class or modifying an existing one, we create a migration and then run it on the database.
##### Working with Migrations
+ The first time you want to use migrations you need to enable them.
+ Tools -> NuGet Package Manager -> Package Manager Console.
+ typing `enable-migrate` into the console will enable the functionality.
##### Migrations folder
+ enabling migrations through the console will create the Migrations folder in solution explorer.
+ This folder will store all the migrations of the project.
##### Creating a Migration
+ Adding migrations must be done through the Package Manager Console through command.
+ To add a migration, type `add-migration ModelName` with ModelName being what you want to call your migration.
+ Created migrations are added to the *Migrations* folder.
##### Adding Tables in Database
+ Adding a DbSet of type *Customer* will add a Customer table in the database.
+ The DbSet created on line 3 represents the Customer table in the database.
```
public class ApplicationDbContext : IdentityDbContext<ApplicationUser>
{
    public DbSet<Customer> Customers { get; set; } //Represents Customer table in database.
    public ApplicationDbContext()
        : base("DefaultConnection", throwIfV1Schema: false)
    {
    }
    public static ApplicationDbContext Create()
    {
        return new ApplicationDbContext();
    }
}
```
##### Recreate Migration
+ Typing `cls` into the Package Manager Console will clean the Console.
+ To overwrite an already existing migration, type `add-migration ModelName -force`.
+ This will recreate the migration with any updated code.
##### Generate Database
+ To generate the applications database, you must run the migration.
+ To do so you must type `update-database` into the Package Manager Console.
+ Once complete, click *Show All Files*. All information about the database is located in the App_Data folder.
##### Database Table Content
+ The `AspNet` Tables are for controlling authentication and authorisation.
+ The `Customers` table, which was included into the ApplicationDbContext class. (Id and Name properties included)
+ `_MigrationHistory` table keeps track of the migrations run on the database.
