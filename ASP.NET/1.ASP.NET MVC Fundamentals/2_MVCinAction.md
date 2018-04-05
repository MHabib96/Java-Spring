# ASP.NET MVC 5 Tutorial - MVC in Action
##### Create a Models Class
+ Right Click *Models* folder -> Add -> Class... -> Class
##### POKO (Plain Old CLR Object)
+ A POKO represents the state and behaviour of the application.
+ Code snippet below is an example of a POKO.
+ Does not contain any behaviour or logic, just contains properties which we use for representing state.
```
namespace Vidly.Models
{
    public class Movie
    {
        public int Id { get; set; }
        public string Name { get; set; } 
    }
}
```
##### Create a Controller Class
+ Right Click *Controller* folder -> Add -> Controller... -> MVC 5 Controller - Empty
+ Different *Controller* templates are provided.
##### Controller Class
+ Controller naming convention is the Name+Controller, example: `MoviesController`.
+ The created MoviesController is a simple class that derives from the Controller class.
+ By default the MoviesController class has an *Action* called Index which returns *ActionResult*.
+ The Index *Action* will be called at `Movies/Index`.
```
namespace Vidly.Controllers
{
    public class MoviesController : Controller
    {
        // GET: Movies
        public ActionResult Index()
        {
            return View();
        }
    }
}
```
##### Adding a View
+ *Views* folder -> Right click folder -> Add -> Views... -> Add
+ A partial view is like a widget that can be reused on different views
+ A layout page is like a template or a master page (helpful to give all pages the same look and feel)
```
@{
    ViewBag.Title = "Random";
    Layout = "~/Views/Shared/_Layout.cshtml";
}

<h2>Random</h2>
```
##### Rendering Models in Views
+ You can pass *models* into Views by providing it as an argument in the return.
+ This puts the movie model into the view, making it possible to be rendered.
```
    var movie = new Movie() { Name = "Shrek!" };
    return View(movie);
```
+ The View that had a model Controller can now render that model using C# code.
+ Every view has the *Model* property that lets you access the model passed to it.
+ A directive needs to be provided to specify the type of the model for this view
+ The directive needs to be the `applicationName.Models.className` like the following `Vidly.Models.Movie`
+ Provided the correct directive allows you to access the models properties (Name and Id)
```
@model Vidly.Models.Movie

@{
    ViewBag.Title = "Random";
    Layout = "~/Views/Shared/_Layout.cshtml";
}

<h2>@Model.Name</h2>
```
