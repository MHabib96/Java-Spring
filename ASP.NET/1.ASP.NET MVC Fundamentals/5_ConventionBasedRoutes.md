# ASP.NET MVC 5 Tutorial - Convention-based Routes
##### Why use Custom Routes
+ Although the default route works for most scenarios, there are situations where we need a route with multiple parameters.
+ For example we may want to have a route like this: `/movies/released/2015/04`.
##### Custom Routes in RouteConfig.ca
+ The order of the routes matters, hence why the custom route is written before the default route.
+ The Routes need to be defined from the most specific to most generic otherwise the more generic route will be applied to a url.
##### Creating Custom Routes
+ In RouteConfig.cs before the default route, you can call `routes.MapRoute();`
+ The custom route must first be defined with a unique name.
+ A url pattern must also be given, patterns incased in `{}` dynamically change.
+ You also need to specify the defaults, you can use an anonymous object for this.
```
routes.MapRoute(
                name: "MoviesByReleaseDate",
                url: "movies/released/{year}/{month}",
                defaults: new { controller = "Movies", action = "ByReleaseDate"}
            );
```
##### The ByReleaseDate Action
+ This action can be called using the url `/movies/released/{year}/{month}` due to being specified in the custom route.
+ To be accessed outside the custom route, you must use the string query `/movies/ByReleaseDate?year=2015&month=04` providing values for year and month.
```
public ActionResult ByReleaseDate(int year, int month)
{
    return Content(year+" / "+month);
}
```
