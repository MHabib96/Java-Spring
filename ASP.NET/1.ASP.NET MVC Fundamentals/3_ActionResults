# ASP.NET MVC 5 Tutorial - Action Results
##### Action Results
+ Action results are the output of our actions
+ This action is the base class for all action results in ASP.NET MVC.
+ Depending on what an action does it would return an instance of one of the classes that derive from action result.
##### Random Action
+ The random action is calling the *View* method which is a helper method inherited from the base controller class.
+ This method allows you to quickly create a view result.
```
// GET: Movies/Random
        public ActionResult Random()
        {
            var movie = new Movie() { Name = "Shrek!" };
            return View(movie);
        }
```
##### Different Action Results
+ PartialViewResult returns a partial view.
+ ContentResult to return simple text. 
+ RedirectResult to redirect a user to a url.
+ RedirectToRouteResult to redirect to an action instead of a url.
+ JsonResult to return a serialized Json object.
+ FileResult to return a File.
+ HttpNotFoundResult to return a not found or 404 error.
+ EmptyResult which is used when an action doesn't need to return any values (like void).

| Type        | Helper Method   | 
| ------------- |:-------------:|
| ViewResult            | View()         |
| PartialViewResult     | PartialView()  |  
| ContentResult         | Content()      |
| RedirectResult        | Redirect()     |
| RedirectToRouteResult | Redirect()     |
| JsonResult            | Json()         |
| FileResult            | File()         |
| HttpNotFoundResult    | HttpNotFound() |
| EmptyResult           | *void*         |
