# ASP.NET MVC 5 Tutorial - Querying Objects
##### Accessing Database Content
+ Once data is stored into a database you may want to retrieve and use it through the application Views.
+ To do so you need to create an object of type `ApplicationDbContext` to access the database tables.
##### Database Object
+ To pass database data into a View, the object must be declared in the Controller class.
+ The syntax to create the object is as follows: `private ApplicationDbContext _context;`
+ The naming convention of the object is `_context`.
+ The database object must be initialised through the class constructor.
```
private ApplicationDbContext _context;

public MovieController()
{
    _context = new ApplicationDbContext();
}
```
##### Disposing the DbContext Object
+ The ApplicationDbContext object is a displosable object, so it must be properly disposed of.
+ The proper method to dispose of the object is to override the *Dispose* method of the base Controller class.
```
protected override void Dispose(bool disposing)
{
    _context.Dispose();
}
```
##### Passing Data to View
+ Initialising the customers object with `_context.Customers` passes all the Customers in the database.
+ The `.Customers` property is a DbSet but defined in the DbContext.
+ This passes all the customer data held in the database to the *Index* View
```
public ViewResult Index()
{
    var customers = _context.Customers;
    return View(customers);
}
```
##### Customer Details Page
+ Code below uses the id passed through the parameter to grab a specific customer through their unique Id.
+ If no customer with the Id provided exists in the database, then a HttpNotFound will be returned.
```
public ActionResult Details(int id)
{
    var customer = _context.Customers.SingleOrDefault(c => c.Id == id);

    if (customer == null)
        return HttpNotFound();

    return View(customer);
}
```
##### Accessing Data through View
+ The @model annotation needs be an *IEnumerable*, like so: `@model IEnumerable<VidlyTwo.Models.Customer>`.
+ The Customer name is turned into an *actionlink* that navigates to `/Customers/Details/{id}`.
```
@foreach (var customer in Model)
{
    <tr>
        <td>@Html.ActionLink(customer.Name, "Details", "Customers", new { id = customer.Id }, null)</td>
    </tr>
}
```
