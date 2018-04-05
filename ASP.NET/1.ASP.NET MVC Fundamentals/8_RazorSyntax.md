# ASP.NET MVC 5 Tutorial - Razor Syntax
##### Writing C# in a View
+ You can write C# code by prefixing it with an @ sign.
+ Razor View engine knows how to parse the html and C# syntax, allowing you to combine html elements with C# code.
+ The code block is compulsory in ASP.NET MVC Views, even if the block is 1 line of code.
```
@if (Model.Customers.Count == 0)
{
    <p>No one has rented this movie before</p>
}
else
{
    <ul>
        @foreach (var customer in Model.Customers)
        {
            <li>@customer.Name</li>
        }
    </ul>
}
```
##### Conditionally Adding a Class
+ You may want to have dynamically changing html values in some areas of the View.
+ You can do so through the Razer View engine by using if statements or ternary conditional operators.
+ The class name of the h2 element is dynamically set depending by the size of the Customer List.
```
@{ 
    var className = Model.Customers.Count > 5 ? "popular" : null;
}

<h2 class="@className">@Model.Movie.Name</h2>
```
