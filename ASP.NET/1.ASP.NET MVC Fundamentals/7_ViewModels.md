# ASP.NET MVC 5 Tutorial - View Models
##### Passing two different Models
+ Sometimes we may want to pass two different models to the View.
+ An example is displaying a movie along with all the customers who have rented it, in this case the *Movie* and *Customer* model must be passed to the View.
+ You can pass more then one model to the View using a *ViewModel*.
##### Using a ViewModel
+ A ViewModel is a model specifically built for a View. It includes any data and rules specific to that View.
+ Create a new folder called ViewModels to store all the projects *ViewModels*.
+ In a ViewModel class, you must include all properties that you wish to be accessible through the view.
+ The `RandomMovieViewModel` includes the Movie and Customer models. Where it carries 1 movie and a List of Customers.
```
public class RandomMovieViewModel
{
    public Movie Movie { get; set; }
    public List<Customer> Customers { get; set; }
}
```
##### Passing ViewModel to View
+ A ViewModel object must first be created with its properties initialised.
+ The `viewModel` object is initialised with a Movie and a List of Customers.
+ The ViewModel object is then passed to the View.
```
// GET: Movies/Random
public ActionResult Random()
{
    var movie = new Movie() { Name = "Shrek!" };
    var customers = new List<Customer>
    {
        new Customer { Name = "Customer1" },
        new Customer { Name = "Customer2" }
    };

    var viewModel = new RandomMovieViewModel
    {
        Movie = movie,
        Customers = customers
    };

    return View(viewModel);
    }
```
##### Accessing the ViewModel in the View
+ The `@model` annotation must be changed to direct at the correct ViewModel class.
+ Model can now access both the Movie object and the List of Customers through the `@Model` tag.
```
@model Vidly.ViewModels.RandomMovieViewModel

@{
    ViewBag.Title = "Random";
    Layout = "~/Views/Shared/_Layout.cshtml";
}

<h2>@Model.Movie.Name</h2>
```
