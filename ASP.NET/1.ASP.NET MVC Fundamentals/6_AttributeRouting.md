# ASP.NET MVC 5 Tutorial - Attribute Routing
##### Attribute Routing
+ In ASP.NET MVC 5 Microsoft introduced a cleaner and better way to creat a custom route.
+ Instead of creating the custom route in RouteConfig.cs, you can apply it using an attribute to the corresponding action.
##### Using Attribute Routing
+ In order to use Attribute Routing you need to first enable it.
+ To do so, you must type the following in RouteConfig.cs on top of the default route: `routes.MapMvcAttributeRoutes();`
+ You can then apply the route attribute and pass url template to the action.
+ This essentially does the same job as custom routes, but is more flexable, readable, and expandable.
```
[Route("movies/released/{year}/{month}")]
public ActionResult ByReleaseDate(int year, int month)
{
    return Content(year+" / "+month);
}
```
##### Adding Constraints 
+ You can use regex to apply regular a expression.
+ In parentheses you can pass the actual regular expression.
+ Note that this regular expression is not a string, meaning you must repeat backslash twice.
+ the month parameter is now contraint to only being the size of 2 numbers and can only be a number between 1-12
```
[Route("movies/released/{year}/{month:regex(\\d{2}):range(1, 12)}")]
public ActionResult ByReleaseDate(int year, int month)
{
    return Content(year+" / "+month);
}
```
##### More Constraints
+ min
+ max
+ minlength
+ maxlength
+ int
+ float 
+ guid
