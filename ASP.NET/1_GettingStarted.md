# ASP.NET MVC 5 Tutorial

##### Create Project with Visual Studio
+ File -> New -> Project -> ASP.NET Web Application -> Select MVC
##### App_Data
+ This folder will store the applications database.
##### App_Start
+ Includes classes that are called when the application is started.
##### App_Start -> RouteConfig.cs
+ This is the configuration of the routing rules.
+ Contains a route with the name "Default" and a given url pattern.
+ If a url matches the pattern then the first part is assumed to be the name of the controller.
+ The second part of the url will be assumed to be the name of the action.
+ The third part is an ID we can pass to that action.
```
routes.MapRoute(
                name: "Default",
                url: "{controller}/{action}/{id}",
                defaults: new { controller = "Home", action = "Index", id = UrlParameter.Optional }
```
##### Concept Example
If you send a request to `/movies/popular` ASP.NET runtime will call a method or an *action* called "popular" in the movies controller.

If you send a request to `/movies/edit/1` ASP.NET runtime wil call the edit *action* of the movies controller and will pass 1 as the id to the action. The Edit action will look like this `Edit(int id)`
