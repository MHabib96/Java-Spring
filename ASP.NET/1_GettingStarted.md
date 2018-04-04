# ASP.NET MVC 5 Tutorial - Getting Started
##### Create Project with Visual Studio
+ File -> New -> Project -> ASP.NET Web Application -> Select MVC
##### Content
+ Used to store the CSS files, images, and any other client side assets.
##### Models
+ Where all the domain classes are contained.
+ Classes containing the application logic are contained in this folder.
##### Controllers
+ Used to store the Controller classes of the application.
+ HomeController is created by default.
##### Views
+ Contains all the views of the application such as HTML files.
+ Folders within the Views folder are created for each Controller
+ A Home folder within the Views folder holds the HomeController's views.
+ When we use a view in a controller, ASP.NET will for that view in a folder with the same name as the controller.
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
##### MapRoute defaults
+ default values are given if a section is not provided
+ if only `/movies` is provided, then the MapRoute default will assign *Index* as the action like so `/movies/Index`.
+ if no controller is given then the default would be `/Home/Index` from the HomeController
+ id is optional since not every action needs an id.
##### Concept Example
If you send a request to `/movies/popular` ASP.NET runtime will call a method or an *action* called "popular" in the movies controller.

If you send a request to `/movies/edit/1` ASP.NET runtime wil call the edit *action* of the movies controller and will pass 1 as the id to the action. The Edit action will look like this `Edit(int id)`
