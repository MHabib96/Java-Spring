# ASP.NET MVC 5 Tutorial - Action Parameters
##### Action Parameters
+ Just like how Action Results are the output of our actions, Action Parameters are the inputs of our actions.
+ When a request comes into the application ASP.NET MVC automatically maps request data to parameter values for action methods.
+ If an action method takes a parameter, the ASP.NET framework looks for a parameter with the same name in the request data.
+ If a parameter with that same name exists the framework will automatically pass the value of that parameter to the target action.
##### Parameter Sources
+ Parameter values can be embedded in the url: `/movies/edit/1`.
+ It can be in the query string: `/movies/edit?id=1`.
+ Or in the data posted using a form `id=1`.
##### Embedded Parameters
+ This is an example of an embedded parameter, the action takes an `int id` through the url.
+ Example url `/movies/edit/25` This will load the page printing `id = 25`.
+ Can also pass the parameter in the query string `/movies/edit?id=1`.
```
// GET: Movies/Edit/id
        public ActionResult Edit(int id)
        {
            return Content("id = " + id);
        }
```
##### Optional Parameters
+ This action will be called when we navigate to `/movies` due to the default route.
+ To make a parameter optional you must make it nullable.
+ The question mark in `int? pageIndex` makes the int parameter a nullable integer.
+ The string type in C# is a reference type and is nullable by default, no additional code needs to be added.
+ Code below initialises values for the optional parameters if none is provided.
+ Default parameter values can be overridden through query string: `/movies?pageIndex=21&sortBy="Hello"`
+ These parameters cannot be embedded into the url because that would require a custom route that includes two parameters.
```
// GET: Movies
        public ActionResult Index(int? pageIndex, string sortBy)
        {
            if (!pageIndex.HasValue)
                pageIndex = 1;

            if (String.IsNullOrWhiteSpace(sortBy))
                sortBy = "Name";

            return Content(String.Format("pageIndex={0} & sortBy={1}", pageIndex, sortBy));
        }
```
