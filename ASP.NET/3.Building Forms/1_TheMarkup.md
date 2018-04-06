# ASP.NET MVC 5 Tutorial - The Markup
##### The Form
+ To create a form to add a customer we need an action that returns a view that includes the form.
+ A form in Html is like a container that we can add various elements to.
##### Creating a Form
+ The `@Html.BeginForm()` method renders the beginning form tag.
+ The method returns a disposable object, so wrapping it in a using block will dispose of the object returned at the end of the block.
+ When the Razor View Engine renders the view, it will look at the name property and use it as the value for the Html label.
```
@model VidlyTwo.Models.Customer

@using (Html.BeginForm("Create", "Customers"))
{
    <div class="form-group">
        @Html.LabelFor(m => m.Name)
        @Html.TextBoxFor(m => m.Name, new { @class = "form-control" })
    </div>
}
```
##### Tick Boxes in Forms
+ Other forms of fields can be used when creating a complete form.
+ The Html syntax below demonstrates how to create a tick box field for users to interact with.
```
@model VidlyTwo.Models.Customer

@using (Html.BeginForm("Create", "Customers"))
{
    <div class="checkbox">
        <label>
            @Html.CheckBoxFor(m => m.IsSubscribedToNewsletter) Subscribed to Newsletter?
        </label>
}
```
